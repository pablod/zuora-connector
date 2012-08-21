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

import com.zuora.api.object.RatePlan;
import com.zuora.api.object.RatePlanCharge;

public class RatePlanProfile
{
    private RatePlan ratePlan;
    private List<RatePlanCharge> ratePlanCharge;
    
    public RatePlan getRatePlan()
    {
        return ratePlan;
    }
    public void setRatePlan(RatePlan ratePlan)
    {
        this.ratePlan = ratePlan;
    }
    public List<RatePlanCharge> getRatePlanCharge()
    {
        return ratePlanCharge;
    }
    public void setRatePlanCharge(List<RatePlanCharge> ratePlanCharge)
    {
        this.ratePlanCharge = ratePlanCharge;
    }
    
}
