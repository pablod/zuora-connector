/**
 * Mule Zuora Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.modules.zuora;

import java.util.List;

import com.zuora.api.object.InvoiceItem;
import com.zuora.api.object.TaxationItem;

public class InvoiceItemProfile
{
    private InvoiceItem invoiceItem;
    private List<TaxationItem> taxationItems;
    
    public InvoiceItem getInvoiceItem()
    {
        return invoiceItem;
    }
    public void setInvoiceItem(InvoiceItem invoiceItem)
    {
        this.invoiceItem = invoiceItem;
    }
    public List<TaxationItem> getTaxationItems()
    {
        return taxationItems;
    }
    public void setTaxationItems(List<TaxationItem> taxationItems)
    {
        this.taxationItems = taxationItems;
    }
    
}
