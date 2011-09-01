/**
 * Mule Zuora Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.modules.zuora.zuora.api;

import org.mule.modules.zuora.User;
import org.mule.modules.zuora.zuora.api.internal.PaginatedIterable;

import com.zuora.api.AmendRequest;
import com.zuora.api.AmendResult;
import com.zuora.api.DeleteResult;
import com.zuora.api.LoginResult;
import com.zuora.api.QueryResult;
import com.zuora.api.SaveResult;
import com.zuora.api.SessionHeader;
import com.zuora.api.Soap;
import com.zuora.api.SubscribeRequest;
import com.zuora.api.SubscribeResult;
import com.zuora.api.ZuoraService;
import com.zuora.api.object.ZObject;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;
import javax.xml.ws.handler.MessageContext;

import org.apache.commons.lang.Validate;
import org.apache.cxf.headers.Header;
import org.apache.cxf.jaxb.JAXBDataBinding;

/**
 * Implementation of {@link ZuoraClient} based on a slightly modified version of the
 * open-source <a href="http://code.google.com/p/sfdc-wsc/">fsdc-wsc</a>. Although
 * that client is sales-force specific, it works with with Zuora since both APIs have
 * very similar WSDL interfaces
 * 
 * @author flbulgarelli
 */
public class CxfZuoraClient implements ZuoraClient<Exception>
{
    private final String username;
    private final String password;
    private final String endpoint;
    private JAXBDataBinding jSessionDataBinding;

    public CxfZuoraClient(@NotNull String username,
                          @NotNull String password,
                          @NotNull String endpoint)
    {
        Validate.notNull(username);
        Validate.notNull(password);
        Validate.notNull(endpoint);
        this.username = username;
        this.password = password;
        this.endpoint = endpoint;
        try
        {
            jSessionDataBinding = new JAXBDataBinding(SessionHeader.class);
        }
        catch (JAXBException e)
        {
            throw new AssertionError(e);
        }
    }

    @Override
    public List<AmendResult> amend(List<AmendRequest> amendaments) throws Exception
    {
        Validate.notEmpty(amendaments);
        return getConnection().amend(amendaments);
    }

    @Override
    public List<SaveResult> create(List<ZObject> zobjects) throws Exception
    {
        Validate.notEmpty(zobjects);
        return getConnection().create(zobjects);
    }

    @Override
    public List<DeleteResult> delete(String type, List<String> ids) throws Exception
    {
        Validate.notEmpty(ids);
        Validate.notEmpty(type);
        return getConnection().delete(type, ids);
    }

    @Override
    public Iterable<ZObject> find(final String zquery) throws Exception
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
                // This is necessary since cxf is returning a list
                // with a null element instead of an empty list
                if (page.getSize() == 0)
                {
                    return Collections.<ZObject> emptyList().iterator();
                }
                return page.getRecords().iterator();
            }
        };
    }

    @Override
    public List<SaveResult> generate(List<ZObject> zobjects) throws Exception
    {
        Validate.notEmpty(zobjects);
        return getConnection().generate(zobjects);
    }

    @Override
    public User getUserInfo() throws Exception
    {
        Holder<String> userId = new Holder<String>();
        Holder<String> tenantId = new Holder<String>();
        Holder<String> tenantName = new Holder<String>();
        Holder<String> userEmail = new Holder<String>();
        Holder<String> userFullName = new Holder<String>();
        Holder<String> username = new Holder<String>();
        getConnection().getUserInfo(tenantId, tenantName, userEmail,
            userFullName, userId, username);
        // TODO
        return new User(userId.value, username.value, userEmail.value, userFullName.value, tenantId.value,
            tenantName.value);
    }

    @Override
    public List<SubscribeResult> subscribe(List<SubscribeRequest> subscriptions) throws Exception
    {
        Validate.notEmpty(subscriptions);
        return getConnection().subscribe(subscriptions);
    }

    @Override
    public List<SaveResult> update(List<ZObject> zobjects) throws Exception
    {
        Validate.notEmpty(zobjects);
        return getConnection().update(zobjects);
    }

    private Soap getConnection() throws Exception
    {
        ZuoraService serviceLocator = new ZuoraService(getClass().getResource("/zuora-29.wsdl"));
        Soap client = serviceLocator.getPort(Soap.class);
        
        BindingProvider bindingProvider = ((BindingProvider) client);
        bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endpoint);
        
        
        LoginResult loginResult;
        try
        {
            loginResult = client.login(username, password);
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }

        bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
            loginResult.getServerUrl());
        bindingProvider.getRequestContext().put(MessageContext.HTTP_REQUEST_HEADERS, new HashMap<String, List<String>>());

        SessionHeader sh = new SessionHeader();
        sh.setSession(loginResult.getSession());
        
        bindingProvider.getRequestContext().put(
            Header.HEADER_LIST,
            Arrays.asList(new Header(new QName("urn:partner.soap.sforce.com", "SessionHeader"), sh, jSessionDataBinding)));

        return client;
    }
}