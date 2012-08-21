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
import com.zuora.api.object.Payment;
import com.zuora.api.object.PaymentMethod;

public class AccountProfile
{
    private Account account;
    private PaymentMethod paymentMethod;
    private List<Payment> payments;
    private Contact billTo;
    private List<SubscriptionProfile> subscriptionProfiles;
    
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
    public List<Payment> getPayments()
    {
        return payments;
    }
    public void setPayments(List<Payment> payments)
    {
        this.payments = payments;
    }
    public Contact getBillTo()
    {
        return billTo;
    }
    public void setBillTo(Contact billTo)
    {
        this.billTo = billTo;
    }
    public List<SubscriptionProfile> getSubscriptionProfiles()
    {
        return subscriptionProfiles;
    }
    public void setSubscriptionProfiles(List<SubscriptionProfile> subscriptionProfiles)
    {
        this.subscriptionProfiles = subscriptionProfiles;
    }
    
}
