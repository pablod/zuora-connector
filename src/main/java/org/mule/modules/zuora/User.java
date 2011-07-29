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

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * {@link User} A zuora user
 * 
 * @author flbulgarelli
 */
public final class User
{
    private final String userId;
    private final String username;
    private final String userEmail;
    private final String userFullname;
    private final String tenantId;
    private final String tenantName;

    public User(String userId,
                String username,
                String userEmail,
                String userFullname,
                String tenantId,
                String tenantName)
    {
        this.userId = userId;
        this.username = username;
        this.userEmail = userEmail;
        this.userFullname = userFullname;
        this.tenantId = tenantId;
        this.tenantName = tenantName;
    }

    public String getUserId()
    {
        return userId;
    }

    public String getUsername()
    {
        return username;
    }

    public String getUserEmail()
    {
        return userEmail;
    }

    public String getUserFullname()
    {
        return userFullname;
    }

    public String getTenantId()
    {
        return tenantId;
    }

    public String getTenantName()
    {
        return tenantName;
    }
    
    @Override
    public String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }

}
