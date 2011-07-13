/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.modules.zuora.zuora.api;

import org.mule.modules.zuora.zobject.ZObject;
import org.mule.modules.zuora.zuora.api.internal.PaginatedIterable;

import com.sforce.ws.ConnectionException;
import com.sforce.ws.ConnectorConfig;
import com.zuora.api.object.AmendRequest;
import com.zuora.api.object.AmendResult;
import com.zuora.api.object.Connector;
import com.zuora.api.object.DeleteResult;
import com.zuora.api.object.LoginResult;
import com.zuora.api.object.QueryResult;
import com.zuora.api.object.SaveResult;
import com.zuora.api.object.SoapConnection;
import com.zuora.api.object.SubscribeRequest;
import com.zuora.api.object.SubscribeResult;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.Validate;

public class SfdcZuoraClient implements ZuoraClient<ConnectionException>
{
    private final String username;
    private final String password;
    private final String endpoint;

    public SfdcZuoraClient(String username, String password, String endpoint)
    {
        Validate.notNull(username);
        Validate.notNull(password);
        this.username = username;
        this.password = password;
        this.endpoint = endpoint;
    }

    @Override
    public List<AmendResult> amend(List<AmendRequest> amendaments) throws ConnectionException
    {
        Validate.notEmpty(amendaments);
        return Arrays.asList(getConnection().amend(amendaments.toArray(new AmendRequest[amendaments.size()])));
    }

    @Override
    public List<SaveResult> create(List<ZObject> zobjects) throws ConnectionException
    {
        Validate.notEmpty(zobjects);
        return Arrays.asList(getConnection().create(toArray(zobjects)));
    }

    @Override
    public List<DeleteResult> delete(String type, List<String> ids) throws ConnectionException
    {
        Validate.notEmpty(ids);
        Validate.notEmpty(type);
        return Arrays.asList(getConnection().delete(type, ids.toArray(new String[ids.size()])));
    }

    @Override
    public Iterable<ZObject> find(final String zquery) throws ConnectionException
    {
        Validate.notEmpty(zquery);
        return new PaginatedIterable<ZObject, QueryResult>()
        {
            @Override
            protected QueryResult firstPage()
            {
                try
                {
                    return getConnection().query(zquery);
                }
                catch (Exception e)
                {
                    throw new ZuoraException("Failed to get first result page", e);
                }
            }

            @Override
            protected boolean hasNextPage(QueryResult page)
            {
                return !page.isDone();
            }

            @Override
            protected QueryResult nextPage(QueryResult currentPage)
            {
                try
                {
                    return getConnection().queryMore(currentPage.getQueryLocator());
                }
                catch (Exception e)
                {
                    throw new ZuoraException("Failed to get more results", e);
                }
            }

            @Override
            protected Iterator<ZObject> pageIterator(QueryResult page)
            {
                return Arrays.asList(page.getRecords()).iterator();
            }
        };
    }

    @Override
    public List<SaveResult> generate(List<ZObject> zobjects) throws ConnectionException
    {
        Validate.notEmpty(zobjects);
        return Arrays.asList(getConnection().generate(toArray(zobjects)));
    }

    @Override
    public String getUserInfo() throws ConnectionException
    {
        return getConnection().getUserInfo();
    }

    @Override
    public List<SubscribeResult> subscribe(List<SubscribeRequest> subscriptions) throws ConnectionException
    {
        Validate.notEmpty(subscriptions);
        return Arrays.asList(getConnection().subscribe(
            subscriptions.toArray(new SubscribeRequest[subscriptions.size()])));
    }

    @Override
    public List<SaveResult> update(List<ZObject> zobjects) throws ConnectionException
    {
        Validate.notEmpty(zobjects);
        return Arrays.asList(getConnection().update(toArray(zobjects)));
    }

    private SoapConnection getConnection() throws ConnectionException
    {
        SoapConnection newConnection = Connector.newConnection(createConnectorConfig());
        LoginResult loginResult = newConnection.login(username, password);
        newConnection.getSessionHeader().setSession(loginResult.getSession());
        newConnection.getConfig().setServiceEndpoint(loginResult.getServerUrl());
        return newConnection;

    }

    private ZObject[] toArray(List<ZObject> zobjects)
    {
        return zobjects.toArray(new ZObject[zobjects.size()]);
    }



    private ConnectorConfig createConnectorConfig()
    {
        ConnectorConfig config = new ConnectorConfig();
        config.setUsername(username);
        config.setPassword(password);

        config.setAuthEndpoint(endpoint);
        config.setServiceEndpoint(endpoint);

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
