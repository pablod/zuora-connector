/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.modules.zuora.api;

import org.mule.modules.zuora.api.internal.PaginatedIterable;

import com.zuora.api.AmendRequest;
import com.zuora.api.AmendResult;
import com.zuora.api.DeleteResult;
import com.zuora.api.QueryResult;
import com.zuora.api.SaveResult;
import com.zuora.api.Soap;
import com.zuora.api.SubscribeRequest;
import com.zuora.api.SubscribeResult;
import com.zuora.api.ZuoraServiceLocator;
import com.zuora.api.object.ZObject;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.xml.rpc.ServiceException;
import javax.xml.rpc.holders.StringHolder;

import org.apache.commons.lang.Validate;

public class AxisZuoraClient implements ZuoraClient<RemoteException>
{
    private final String username;
    private final String password;

    public AxisZuoraClient(String username, String password)
    {
        Validate.notNull(username);
        Validate.notNull(password);
        this.username = username;
        this.password = password;
    }

    @Override
    public List<AmendResult> amend(List<AmendRequest> amendaments) throws RemoteException
    {   
        Validate.notEmpty(amendaments);
        return Arrays.asList(getPort().amend( amendaments.toArray(new AmendRequest[amendaments.size()]) ));
    }

    @Override
    public List<SaveResult> create(List<ZObject> zobjects) throws RemoteException
    {
        Validate.notEmpty(zobjects);
        return Arrays.asList(getPort().create(toArray(zobjects)));
    }

    @Override
    public List<DeleteResult> delete(String type, List<String> ids) throws RemoteException
    {
        Validate.notEmpty(ids);
        Validate.notEmpty(type);
        return Arrays.asList(getPort().delete(type, ids.toArray(new String[ids.size()])));
    }

    @Override
    public Iterable<ZObject> find(final String zquery) throws RemoteException
    {
        Validate.notEmpty(zquery);
        return new PaginatedIterable<ZObject, QueryResult>()
        {
            @Override
            protected QueryResult firstPage()
            {
                try
                {
                    return getPort().query(zquery);
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
                    return getPort().queryMore(currentPage.getQueryLocator());
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
    public List<SaveResult> generate(List<ZObject> zobjects) throws RemoteException
    {
        Validate.notEmpty(zobjects);
        return Arrays.asList(getPort().generate(toArray(zobjects)));
    }

    @Override
    public User getUserInfo(String userid) throws RemoteException
    {
        Validate.notEmpty(userid);
        StringHolder tenantId = new StringHolder();
        StringHolder tenantName = new StringHolder();
        StringHolder userEmail = new StringHolder();
        StringHolder userFullName = new StringHolder();
        StringHolder username = new StringHolder();
        getPort().getUserInfo(tenantId, tenantName, userEmail, userFullName,
            new StringHolder(userid), username);
        return new User(userid, tenantId.value, tenantName.value, userEmail.value, userFullName.value);
    }

    @Override
    public List<SubscribeResult> subscribe(List<SubscribeRequest> subscriptions) throws RemoteException
    {
        Validate.notEmpty(subscriptions);
        return Arrays.asList(getPort().subscribe(subscriptions.toArray(new SubscribeRequest[subscriptions.size()])));
    }

    @Override
    public List<SaveResult> update(List<ZObject> zobjects) throws RemoteException
    {
        Validate.notEmpty(zobjects);
        return Arrays.asList(getPort().update(toArray(zobjects)));
    }

    private ZObject[] toArray(List<ZObject> zobjects)
    {
        return zobjects.toArray(new ZObject[zobjects.size()]);
    }

    private Soap getPort() throws RemoteException
    {
        Soap port;
        try
        {
            port = getPortInternal();
        }
        catch (ServiceException e)
        {
            throw new RemoteException("Could not connecto to Zuora", e);
        }
        port.login(username, password);
        return port;
    }

    private Soap getPortInternal() throws ServiceException
    {
        return new ZuoraServiceLocator().getSoap();
    }
}
