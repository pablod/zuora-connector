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

import com.zuora.api.object.Product;

public class ProductProfile
{
    private Product product;
    private List<ProductRatePlanProfile> productRatePlanProfiles;
    
    public Product getProduct()
    {
        return product;
    }
    public void setProduct(Product product)
    {
        this.product = product;
    }
    public List<ProductRatePlanProfile> getProductRatePlanProfiles()
    {
        return productRatePlanProfiles;
    }
    public void setProductRatePlanProfiles(List<ProductRatePlanProfile> productRatePlanProfiles)
    {
        this.productRatePlanProfiles = productRatePlanProfiles;
    }
    
}