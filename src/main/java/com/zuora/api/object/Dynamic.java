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

import org.mule.modules.zuora.zobject.ElementBuilders;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.UnhandledException;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.w3c.dom.Element;

/**
 * Base class for Zuora objects that simplifies accessing customizable properties -
 * properties that may be defined by user
 * 
 * @author flbulgarelli
 */
public abstract class Dynamic
{
    public List<Element> getAny()
    {
        throw new UnsupportedOperationException("Instances of class " + this.getClass()
                                                + " are not dynamic. Use normal getters and setters instead");
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
        if (PropertyUtils.isWriteable(this, propertyName))
        {
            setProperty(value, propertyName);
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

    private void setProperty(Object value, String propertyName)
    {
        try
        {
            BeanUtils.setProperty(this, propertyName, value);
        }
        catch (Exception e)
        {
            throw new UnhandledException(e);
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
        Method readMethod = getReadMethod(propertyName);
        if(readMethod != null)
        {
            return getProperty(readMethod);
        }
        
        Element element = getElement(this, name);
        return element != null ? element.getTextContent() : null;
    }

    private Object getProperty(Method readMethod) throws AssertionError
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

    private Method getReadMethod(String propertyName)
    {
        try
        {
        return new PropertyDescriptor(propertyName, this.getClass()).getReadMethod();
        }
        catch (IntrospectionException e)
        {
            throw new AssertionError(e);
        }

    }

    
    private static Element getElement(Dynamic object, final String name)
    {
        return (Element) CollectionUtils.find(object.getAny(), new Predicate()
        {
            public boolean evaluate(Object object)
            {
                return (object instanceof Element && ((Element) object).getLocalName().equals(name));
            }
        });
    }
    
    @Override
    public String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }

}
