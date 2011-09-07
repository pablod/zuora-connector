/**
 * Mule Zuora Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.modules.zuora.zuora.api;

import static org.junit.Assert.assertEquals;

import com.zuora.api.object.Account;

import org.junit.Test;

/**
 * {@link ZObjectUnitTest}
 * 
 * @author flbulgarelli
 */
public class ZObjectUnitTest
{
    @Test
    public void accountIsDynamic()
    {
        Account a = new Account();
        assertEquals(0, a.getAny().size());
        
        a.setAt("Foo", "Bar");
        
        assertEquals(1, a.getAny().size());
        assertEquals("Bar", a.getField("Foo"));
    }

    @Test
    public void accountIsStatic() throws Exception
    {
        Account a = new Account();
        a.setAccountNumber("1590"); 
        assertEquals("1590", a.getAccountNumber());
    }
    
    @Test
    public void accountStaticPropertiesMayBeSetAsDynamicProperties() throws Exception
    {
        Account a = new Account();
        a.setAt("AccountNumber", "151");
        assertEquals("151", a.getAccountNumber());
    }
    
    @Test
    public void accountStaticPropertiesMayBeGetAsDynamicProperties() throws Exception
    {
        Account a = new Account();
        a.setAccountNumber("98");
        assertEquals("98", a.getAt("AccountNumber"));
    }
}
