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

import com.zuora.api.object.ProductRatePlan;

public class ProductRatePlanProfile
{
    private ProductRatePlan productRatePlan;
    private List<ProductRatePlanChargeProfile> productRatePlanChargeProfiles;
    
    public ProductRatePlan getProductRatePlan()
    {
        return productRatePlan;
    }
    public void setProductRatePlan(ProductRatePlan productRatePlan)
    {
        this.productRatePlan = productRatePlan;
    }
    public List<ProductRatePlanChargeProfile> getProductRatePlanChargeProfiles()
    {
        return productRatePlanChargeProfiles;
    }
    public void setProductRatePlanChargeProfiles(List<ProductRatePlanChargeProfile> productRatePlanChargeProfiles)
    {
        this.productRatePlanChargeProfiles = productRatePlanChargeProfiles;
    }
    
}
