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

import org.mule.modules.zuora.zuora.api.internal.ClientAdaptorInvocationHandler;

import java.lang.reflect.Proxy;

import org.slf4j.LoggerFactory;

public class ZuoraClientAdaptor
{
    @SuppressWarnings("unchecked")
    public static ZuoraClient<ZuoraException> adapt(ZuoraClient<?> client)
    {
        return (ZuoraClient<ZuoraException>) Proxy.newProxyInstance(
            ZuoraClientAdaptor.class.getClassLoader(), // 
            new Class[]{ZuoraClient.class}, //
            new ClientAdaptorInvocationHandler( //
                LoggerFactory.getLogger(ZuoraClient.class), client, ZuoraException.class));
    }
}
