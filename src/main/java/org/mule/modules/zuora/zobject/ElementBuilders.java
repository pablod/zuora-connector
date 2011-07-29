/**
 * Mule Zuora Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.modules.zuora.zobject;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Element;

public class ElementBuilders
{
    private static final DocumentBuilder builder;
    static
    {
        try
        {
            builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        }
        catch (ParserConfigurationException e)
        {
            throw new AssertionError(e);
        }
    }

    public static Element newElement(String name, String value)
    {
        Element element = builder.newDocument().createElementNS("http://object.api.zuora.com/", name);
        element.setTextContent(value);
        return element;
    }
}
