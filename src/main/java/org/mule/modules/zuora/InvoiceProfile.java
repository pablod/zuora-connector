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

import com.zuora.api.object.Account;
import com.zuora.api.object.Contact;
import com.zuora.api.object.Invoice;
import com.zuora.api.object.PaymentMethod;

public class InvoiceProfile
{
    private Invoice invoice;
    private Account account;
    private PaymentMethod paymentMethod;
    private Contact billTo;
    private Contact soldTo;
    private List<InvoiceItemProfile> invoiceItemProfiles;
    
    public Invoice getInvoice()
    {
        return invoice;
    }
    public void setInvoice(Invoice invoice)
    {
        this.invoice = invoice;
    }
    public Account getAccount()
    {
        return account;
    }
    public void setAccount(Account account)
    {
        this.account = account;
    }
    public PaymentMethod getPaymentMethod()
    {
        return paymentMethod;
    }
    public void setPaymentMethod(PaymentMethod paymentMethod)
    {
        this.paymentMethod = paymentMethod;
    }
    public Contact getBillTo()
    {
        return billTo;
    }
    public void setBillTo(Contact billTo)
    {
        this.billTo = billTo;
    }
    public Contact getSoldTo()
    {
        return soldTo;
    }
    public void setSoldTo(Contact soldTo)
    {
        this.soldTo = soldTo;
    }
    public List<InvoiceItemProfile> getInvoiceItemProfiles()
    {
        return invoiceItemProfiles;
    }
    public void setInvoiceItemProfiles(List<InvoiceItemProfile> invoiceItemProfiles)
    {
        this.invoiceItemProfiles = invoiceItemProfiles;
    }
    
}
