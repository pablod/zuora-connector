/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft; Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license; a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.modules.zuora.zuora.api;

public class User
{

    private final String userid;
    private final String tenantId;
    private final String tenantName;
    private final String userEmail;
    private final String userFullName;

    public User(String userid, String tenantId, String tenantName, String userEmail, String userFullName)
    {
        this.userid = userid;
        this.tenantId = tenantId;
        this.tenantName = tenantName;
        this.userEmail = userEmail;
        this.userFullName = userFullName;
    }

    public String getUserid()
    {
        return userid;
    }

    public String getTenantId()
    {
        return tenantId;
    }

    public String getTenantName()
    {
        return tenantName;
    }

    public String getUserEmail()
    {
        return userEmail;
    }

    public String getUserFullName()
    {
        return userFullName;
    }

}
