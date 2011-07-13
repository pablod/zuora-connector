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

import com.sforce.ws.bind.XmlObject;

import javax.xml.namespace.QName;

public class DynamicZObject extends XmlObject implements ZObject
{
    /**
     * Constructor
     */
    public DynamicZObject()
    {
        setDefaultNamespace("http://object.api.zuora.com/");
        setXmlType(this.getClass().getSimpleName());
    }

    @Override
    public void setName(QName name)
    {
        throw new UnsupportedOperationException();
    }
}
