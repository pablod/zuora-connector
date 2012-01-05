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

import com.zuora.api.ProductRatePlanChargeTierData;
import com.zuora.api.object.Account;
import com.zuora.api.object.ProductRatePlanCharge;
import com.zuora.api.object.ProductRatePlanChargeTier;
import com.zuora.api.object.ZObject;

import java.util.Arrays;
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
        for (Entry<String, Object> e : accountMap.entrySet())
        {
            assertEquals(zObject.getAt(e.getKey()), e.getValue());
        }
    }

    @Test
    @SuppressWarnings("unchecked")
    public void toZObjectWithNestedZObject() throws Exception
    {
        final ProductRatePlanChargeTier tier = new ProductRatePlanChargeTier();
        tier.setId("456");

        ProductRatePlanCharge charge = (ProductRatePlanCharge) ZObjectMapper.toZObject(ZObjectType.ProductRatePlanCharge, new HashMap() { {
            put("AccountingCode", "AXD");
            put("ProductRatePlanChargeTierData", new ProductRatePlanChargeTierData() { {
                getProductRatePlanChargeTier().add(tier);
            } } );
        } });

        assertEquals("AXD", charge.getAccountingCode());
        assertEquals("456", charge.getProductRatePlanChargeTierData().getProductRatePlanChargeTier().get(0).getId());

    }

    @Test
    @SuppressWarnings("unchecked")
    public void toZObjectWithNestedMap() throws Exception
    {
        ProductRatePlanCharge charge = (ProductRatePlanCharge) ZObjectMapper.toZObject(ZObjectType.ProductRatePlanCharge, new HashMap() { {
            put("AccountingCode", "AXD");
            put("ProductRatePlanChargeTierData", new HashMap() { {
                put("ProductRatePlanChargeTier", Arrays.asList(new HashMap(){{
                    put("Id", "456");
                }}));
            } } );
        } });

        assertEquals("AXD", charge.getAccountingCode());
        assertEquals("456", charge.getProductRatePlanChargeTierData().getProductRatePlanChargeTier().get(0).getId());

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


