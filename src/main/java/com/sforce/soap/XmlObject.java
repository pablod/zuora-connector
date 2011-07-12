/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package com.sforce.soap;

import com.sforce.ws.ConnectionException;
import com.sforce.ws.bind.TypeInfo;
import com.sforce.ws.bind.TypeMapper;
import com.sforce.ws.bind.XMLizable;
import com.sforce.ws.bind.XmlTypeInfoProvider;
import com.sforce.ws.parser.XmlInputStream;
import com.sforce.ws.parser.XmlOutputStream;
import com.sforce.ws.wsdl.Constants;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.xml.namespace.QName;


public class XmlObject implements XMLizable {
    private QName name;
    private QName xmlType;
    private Object value;
    private String defaultNamespace;
    private ArrayList<XmlObject> children = new ArrayList<XmlObject>();

    public XmlObject() {
        this(null, null);
    }

    public XmlObject(QName name) {
        this(name, null);
    }

    public XmlObject(QName name, Object value) {
        this.name = name; 
        this.value = value;
    }

    public QName getName() {
        return name;
    }

    public void setName(QName name) {
        this.name = name;
    }

    public void setDefaultNamespace(String namespace) {
        this.defaultNamespace = namespace;
    }

    public QName getXmlType() {
        return xmlType;
    }
    
    public void setXmlType(String type)
    {
        this.xmlType =  new QName(type);
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public boolean hasChildren() {
        return children.size() != 0;
    }

    public XmlObject addField(String name, Object value) {
        return addOrSetField(name, value, false);
    }

    public XmlObject setField(String name, Object value) {
        return addOrSetField(name, value, true);
    }

    /**
     * evaluate the given xpath like expression.
     * eg xpath: "OpportunityContactRoles/records/Contact/LastName" this will list
     * all LastName
     *
     * @param xpath
     * @return
     */

    public Iterator<XmlObject> evaluate(String xpath) {
        if (xpath == null) throw new NullPointerException("xpath can not be null");

        ArrayList<XmlObject> parents = new ArrayList<XmlObject>();
        ArrayList<XmlObject> nodes = new ArrayList<XmlObject>();
        parents.add(this);

        String[] paths = xpath.split("/");
        for (String path : paths) {
            nodes = new ArrayList<XmlObject>();
            for (XmlObject parent : parents) {
                Iterator<XmlObject> it = parent.getChildren(path);
                while (it.hasNext()) nodes.add(it.next());
            }
            if (nodes.size() == 0) {
                break;
            } else {
                parents = nodes;
            }
        }

        return nodes.iterator();
    }

    private XmlObject addOrSetField(String n, Object value, boolean set) {
        XmlObject child = null;
        if (value instanceof XmlObject) {
            child = (XmlObject) value;
            child.name = getQNameFor(n);
            children.add(child);
        } else {
            if (set) {
                child = findField(n);
            }
            if (child == null) {
                child = new XmlObject(getQNameFor(n), value);
                children.add(child);
            } else {
                child.setValue(value);
            }
        }
        return child;
    }

    private QName getQNameFor(String n) {
        String namespace = defaultNamespace == null ? Constants.PARTNER_SOBJECT_NS : defaultNamespace;
        return name == null ? new QName(namespace, n) :  new QName(name.getNamespaceURI(), n);
    }

    public boolean removeField(String name) {
        XmlObject item = findField(name);
        return item != null && children.remove(item);
    }

    public Object getField(String name) {
        //TODO: optimize
        XmlObject item = findField(name);
        Object result = null;
        if (item != null) {
            if (item.hasChildren()) {
                result = item;
            } else {
                result = item.getValue();
            }
        }
        return result;
    }

    public XmlObject getChild(String name) {
        return findField(name);
    }

    private XmlObject findField(String name) {
        XmlObject item = null;

        for (XmlObject child : children) {
            if (child.getName().getLocalPart().equals(name)) {
                item = child;
            }
        }

        return item;
    }

    public Iterator<XmlObject> getChildren() {
        return children.iterator();
    }

    public Iterator<XmlObject> getChildren(String name) {
        ArrayList<XmlObject> result = new ArrayList<XmlObject>();
        for (XmlObject child : children) {
            if (child.getName().getLocalPart().equals(name)) {
                result.add(child);
            }
        }
        return result.iterator();
    }


    @Override
    public String toString() {
        return "XmlObject{" +
                "name=" + name +
                ", value=" + value +
                ", children=" + children +
                '}';
    }

    @Override
    public void write(QName element, XmlOutputStream out, TypeMapper typeMapper) throws IOException {
     //   typeMapper.writeFieldXsiType(true);
        if (hasChildren()) {
            out.writeStartTag(element.getNamespaceURI(), element.getLocalPart());
            out.writeAttribute(Constants.SCHEMA_INSTANCE_NS, "type", xmlType.getLocalPart());
            for (XmlObject child : children) {
                child.write(child.getName(), out, typeMapper);
            }
            out.writeEndTag(element.getNamespaceURI(), element.getLocalPart());
        } else {
            if (value != null) {
                TypeInfo info = null;
                if (value instanceof XmlTypeInfoProvider) {
                    info = ((XmlTypeInfoProvider)value).getTypeInfo(name.getNamespaceURI(), name.getLocalPart(), typeMapper);
                }
                if (info == null) {
                    QName xmlType = typeMapper.getXmlType(value.getClass().getName());
                    if (xmlType == null) {
                        //todo: throw right exception
                        throw new IOException("Unable to find xml type for :" + value.getClass().getName());
                    }
                    int max = value.getClass().isArray() ? -1 : 1;
                    if (value.getClass().getName().equals("[B")) {
                        //special case for byte[]
                        max = 1;
                    }
                    info = new TypeInfo(name.getNamespaceURI(), name.getLocalPart(),
                            xmlType.getNamespaceURI(), xmlType.getLocalPart(), 0, max, true);
                }
                typeMapper.writeObject(out, info, value, true);
            }
        }
       // typeMapper.writeFieldXsiType(false);
    }

    @Override
    public void load(XmlInputStream in, TypeMapper typeMapper) throws IOException, ConnectionException {
        loadStartTag(in, typeMapper);
        loadAfterStartTag(in, typeMapper);
    }

    protected void loadStartTag(XmlInputStream in, TypeMapper typeMapper) {
        in.consumePeeked();
        name = new QName(in.getNamespace(), in.getName());
        xmlType = typeMapper.getXsiType(in);
    }

    protected void loadAfterStartTag(XmlInputStream in, TypeMapper typeMapper) throws IOException, ConnectionException {
        StringBuilder text = new StringBuilder();
        boolean textFound = false;

        while (true) {
            int type = in.next();

            if (type == XmlInputStream.START_TAG) {
                XmlObject child = new XmlObject();
                child.load(in, typeMapper);
                children.add(child);
            } else if (type == XmlInputStream.TEXT) {
                text.append(in.getText());
                textFound = true;
            } else if (type == XmlInputStream.END_TAG) {
                String ns = in.getNamespace();
                String n = in.getName();
                if (name.getNamespaceURI().equals(ns) && name.getLocalPart().equals(n)) {
                    break;
                }
            } else {
                throw new ConnectionException("unknown tag:" + type + " at " + in);
            }
        }

        if (textFound) value = typeMapper.deserialize(text.toString(), xmlType);
    }
}