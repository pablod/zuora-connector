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

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;
import org.w3c.dom.Element;

/**
 * Base class for Zuora objects that simplifies accessing customizable properties -
 * properties that may be defined by user
 * 
 * @author flbulgarelli
 */
public abstract class Dynamic
{
    public List<Object> getAny()
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
    public void setAt(String name, String value)
    {
        setField(name, value);
    }

    public void setField(String name, String value)
    {
        Element element = getElement(this, name);
        if (element != null)
        {
            element.setTextContent(value);
        }
        else
        {
            this.getAny().add(ElementBuilders.newElement(name, value));
        }
    }

    /**
     * Synonym of {@link #getField(String)} that lets groovy script users
     * to access dynamic properties with the indexed brackets [] syntax.
     * 
     * @param name
     * @return {@link #getField(String)}
     */
    public String getAt(String name)
    {
        return getField(name);
    }

    public String getField(final String name)
    {
        Element element = getElement(this, name);
        return element != null ? element.getTextContent() : null;
    }
    
    private static Element getElement(Dynamic object, final String name)
    {
        return (Element) CollectionUtils.find(object.getAny(), new Predicate()
        {
            public boolean evaluate(Object object)
            {
                return (object instanceof Element && ((Element) object).getTagName().equals(name));
            }
        });
    }

}
