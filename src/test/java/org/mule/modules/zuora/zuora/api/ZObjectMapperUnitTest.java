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

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.mule.modules.zuora.zobject.ZObjectType;

import com.zuora.api.object.Account;
import com.zuora.api.object.ZObject;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;


public class ZObjectMapperUnitTest
{
    @Test
    public void toZobject() throws Exception
    {
        Map<String, Object> accountMap = testAccount();
        
        ZObject zObject = ZObjectMapper.toZObject(ZObjectType.Account, accountMap);
        assertThat(zObject, instanceOf(Account.class));
        for(Entry<String,Object> e : accountMap.entrySet())
        {
            assertEquals(zObject.getAt(e.getKey()), e.getValue());
        }
    }
    
    @SuppressWarnings("serial")
    private Map<String, Object> testAccount()
    {
        return new HashMap<String, Object>()
        {
            {
                put("Name", "foo");
                put("Currency", "USD");
                put("BillCycleDay", 1);
                put("AccountNumber", "7891");
                put("AllowInvoiceEdit", false);
                put("AutoPay", false);
                put("Notes", "foobar");
                put("Status", "Draft");
            }
        };
    }
}


