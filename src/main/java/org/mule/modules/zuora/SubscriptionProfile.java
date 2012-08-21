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

import com.zuora.api.object.Subscription;

public class SubscriptionProfile
{
    private Subscription subscription;
    private List<RatePlanProfile> ratePlanProfiles;
    
    public Subscription getSubscription()
    {
        return subscription;
    }
    public void setSubscription(Subscription subscription)
    {
        this.subscription = subscription;
    }
    public List<RatePlanProfile> getRatePlanProfiles()
    {
        return ratePlanProfiles;
    }
    public void setRatePlanProfiles(List<RatePlanProfile> ratePlanProfiles)
    {
        this.ratePlanProfiles = ratePlanProfiles;
    }
    
}

