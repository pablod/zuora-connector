/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.modules.zuora;

import org.mule.modules.zuora.zobject.ZObject;

import com.sforce.ws.ConnectorConfig;
import com.sforce.ws.bind.XMLizable;
import com.zuora.api.object.Account;
import com.zuora.api.object.Connector;
import com.zuora.api.object.LoginResult;
import com.zuora.api.object.QueryResult;
import com.zuora.api.object.SaveResult;
import com.zuora.api.object.SoapConnection;

import java.util.Arrays;

import org.junit.Test;

public class ZuoraConnectionTestDriver
{
    private static final String PASSWORD = System.getenv("zuoraPassword");
    private static final String USERNAME = System.getenv("zuoraUsername");

    @Test
    public void testname() throws Exception
    {
        SoapConnection newConnection = Connector.newConnection(createConnectorConfig());
        LoginResult loginResult = newConnection.login(USERNAME, PASSWORD);
        newConnection.getSessionHeader().setSession(loginResult.getSession());
        newConnection.getConfig().setServiceEndpoint(loginResult.getServerUrl());

        SaveResult[] create = newConnection.create(new XMLizable[]{new Account()
        {
            {
                setField("Name", "foo");
                setField("Currency", "USD");
                setField("BillCycleDay", 1);
                setField("AccountNumber", "501");
                setField("AllowInvoiceEdit", false);
                setField("AutoPay", false);
                setField("Notes", "foobar");
                setField("Status", "Draft");
            }
        }});

        System.out.println(Arrays.asList(create));
        QueryResult query = newConnection.query("SELECT Id FROM Account");
        System.out.println(Arrays.asList(query.getRecords()));
        System.out.println(Arrays.asList(newConnection.delete("Account", new String[]{create[0].getId()})));

    }

    private ConnectorConfig createConnectorConfig()
    {
        ConnectorConfig config = new ConnectorConfig();
        config.setUsername(USERNAME);
        config.setPassword(PASSWORD);

        config.setAuthEndpoint("https://apisandbox.zuora.com/apps/services/a/29.0");
        config.setServiceEndpoint("https://apisandbox.zuora.com/apps/services/a/29.0");

        config.setManualLogin(true);

        // if (this.proxyHost != null) {
        // config.setProxy(this.proxyHost, this.proxyPort);
        // if (this.proxyUsername != null) {
        // config.setProxyUsername(this.proxyUsername);
        // }
        // if (this.proxyPassword != null) {
        // config.setProxyPassword(this.proxyPassword);
        // }
        // }

        return config;
    }
    
}


