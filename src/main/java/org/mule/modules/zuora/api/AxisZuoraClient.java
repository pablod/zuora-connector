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

import com.zuora.api.AmendRequest;
import com.zuora.api.SaveResult;
import com.zuora.api.Soap;
import com.zuora.api.ZuoraServiceLocator;
import com.zuora.api.fault.InvalidQueryLocatorFault;
import com.zuora.api.fault.InvalidTypeFault;
import com.zuora.api.fault.MalformedQueryFault;
import com.zuora.api.fault.UnexpectedErrorFault;
import com.zuora.api.object.ZObject;

import java.rmi.RemoteException;
import java.util.Arrays;
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
    public void amend(List<ZObject> amendaments)
    {
        // getPort().amend( new AmendRequest(toArray(amendaments), null, null));
        // TODO
    }

    @Override
    public List<SaveResult> create(List<ZObject> zobjects) throws RemoteException
    {
        return Arrays.asList(getPort().create(toArray(zobjects)));
    }

    @Override
    public void delete(List<ZObject> zobjects)
    {
        // TODO Auto-generated method stub
        // getPort().delete( type, ids)
    }

    @Override
    public void find(String zquery) throws RemoteException
    {
        // TODO iterable
        getPort().query(zquery);
    }

    @Override
    public List<SaveResult> generate(List<ZObject> zobjects) throws RemoteException
    {
        return Arrays.asList(getPort().generate(toArray(zobjects)));
    }

    @Override
    public User getUserInfo(String userid) throws RemoteException
    {
        getPort().getUserInfo(new StringHolder(), new StringHolder(), new StringHolder(), new StringHolder(),
            new StringHolder(userid), new StringHolder());
        // TODO return user data
        return new User();
    }

    @Override
    public void subscribe(List<ZObject> subscriptions)
    {
        // TODO Auto-generated method stub
        // getPort().subscribe(subscribes)
    }

    @Override
    public List<SaveResult> update(List<ZObject> zobjects) throws RemoteException
    {
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
