/**
 * Mule Zuora Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package com.zuora.api.object;

import static org.apache.commons.collections.CollectionUtils.collect;

import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;
import org.apache.commons.collections.Transformer;
import org.apache.commons.collections.keyvalue.DefaultMapEntry;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.mule.modules.utils.MuleSoftException;
import org.mule.modules.utils.mom.CxfMapObjectMappers;
import org.mule.modules.zuora.zobject.ElementBuilders;
import org.w3c.dom.Element;

import ar.com.zauber.commons.mom.MapObjectMapper;
import ar.com.zauber.commons.mom.MapObjectMappers;
import ar.com.zauber.commons.mom.NaiveProperties;
import ar.com.zauber.commons.mom.PropertyModel;
import ar.com.zauber.commons.mom.StructureType;
import ar.com.zauber.commons.mom.style.impl.CXFStyle;

/**
 * Base class for Zuora objects that simplifies accessing customizable properties -
 * properties that may be defined by user
 *
 * @author flbulgarelli
 */
@SuppressWarnings("unchecked")
public abstract class Dynamic
{
    private static final HashSet<String> EXCLUDED_PROPERTY_NAMES = new HashSet<String>(Arrays.asList("any", "class", "fieldsToNull"));
    private static MapObjectMapper mom = MapObjectMappers.defaultWithPackage("com.zuora.api")
        .withConverter(CxfMapObjectMappers.muleStringToXmlGregorianCalendarConverter())
        .withPropertyModel(new PropertyModel()
        {
            public void setProperty(Object value, Object destination, String key, MapObjectMapper mom)
            {
                Dynamic dynamic = (Dynamic) destination;
                dynamic.setAt(key, value);
            }
        })
        .build();
    /**
     * Answers the dynamic property elements. Warning: this method is CXF specific and
     * its usage is discouraged
     * @return a collection of elements, if this object has true dynamic properties
     */
    public List<Element> getAny()
    {
        throw new UnsupportedOperationException("Instances of class " + this.getClass()
                                                + " have not dynamic properties. Use normal getters and setters instead");
    }

    /**
     * Answers the name and values of the dynamic properties of this object
     * @return the dynamic properties, as string-object pairs
     */
    public Collection<Entry<String,Object>> dynamicProperties() {
        return CollectionUtils.collect(getAny(), new Transformer() {
            public Object transform(Object input)
            {
                Element e = (Element) input;
                return new DefaultMapEntry(e.getLocalName(), e.getTextContent());
            }
        });
    }

    /**
     * Answers the name and values of the static properties of this object
     * @return the static properties, as string-object pairs
     */
    public Collection<Entry<String,Object>> staticProperties() {
        return CollectionUtils.select(propertyValues(), new Predicate() {
            public boolean evaluate(Object object)
            {
                Entry e = (Entry) object;
                return e.getValue() != null && !EXCLUDED_PROPERTY_NAMES.contains(e.getKey());
            }
        });
    }

    /**
     * Answers the name and values of the both static and dynamic properties of this object
     * @return this object's properties, as string-object pairs
     */
    private Collection<Entry<String, Object>> propertyValues()
    {
        try
        {
            return collect(Arrays.asList(Introspector.getBeanInfo(this.getClass()).getPropertyDescriptors()),
                new Transformer() {
                    public Object transform(Object input) {
                        PropertyDescriptor p = ((PropertyDescriptor) input);
                        return new DefaultMapEntry(p.getName(), NaiveProperties.get(Dynamic.this, p.getName()));
                    }
                });
        }
        catch (Exception e)
        {
            throw MuleSoftException.soften(e);
        }
    }

    public  Collection<Entry<String,Object>> properties() {
        return CollectionUtils.union(staticProperties(), dynamicProperties());
    }


    /**
     * Synonym of {@link #setField(String, String)} that lets groovy script users
     * to set dynamic properties with the indexed brackets [] syntax.
     *
     * @param name
     * @param value
     */
    public void setAt(String name, Object value)
    {
        setField(name, value);
    }

    public void setField(String name, Object value)
    {
        String propertyName = toPropertyName(name);
        if (NaiveProperties.getterOrNull(getClass(), propertyName) != null)
        {
            setStaticProperty(value, propertyName);
        }
        else
        {
            setDynamicProperty(name, value);
        }
    }

    private void setDynamicProperty(String name, Object value)
    {
        Element element = getElement(this, name);
        if (element != null)
        {
            element.setTextContent((String) value);
        }
        else
        {
            this.getAny().add(ElementBuilders.newElement(name, (String) value));
        }
    }

    private void setStaticProperty(Object value, String propertyName)
    {
        try
        {
            CXFStyle.STYLE.setValue(this, propertyName, mom.unmap(value, StructureType.getStructureType(this, propertyName)));
        }
        catch (Exception e)
        {
            throw MuleSoftException.soften(e);
        }
    }

    protected String toPropertyName(String name)
    {
        return StringUtils.uncapitalize(name);
    }

    /**
     * Synonym of {@link #getField(String)} that lets groovy script users
     * to access dynamic properties with the indexed brackets [] syntax.
     *
     * @param name
     * @return {@link #getField(String)}
     */
    public Object getAt(String name)
    {
        return getField(name);
    }

    public Object getField(final String name)
    {
        String propertyName = toPropertyName(name);
        Method readMethod = NaiveProperties.getterOrNull(getClass(), propertyName);
        if (readMethod != null)
        {
            return getProperty(readMethod);
        }

        Element element = getElement(this, name);
        return element != null ? element.getTextContent() : null;
    }

    private Object getProperty(Method readMethod)
    {
        try
        {
            return readMethod.invoke(this);
        }
        catch (Exception e)
        {
            throw new AssertionError(e);
        }
    }


    private static Element getElement(Dynamic object, final String name)
    {
        try
        {
            return (Element) CollectionUtils.find(object.getAny(), new Predicate()
            {
                public boolean evaluate(Object object)
                {
                    return (object instanceof Element && ((Element) object).getLocalName().equals(name));
                }
            });
        }
        catch (UnsupportedOperationException e)
        {
            throw new UnsupportedOperationException("There is no property " + name, e);
        }
    }

    @Override
    public String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }

}
