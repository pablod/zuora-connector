/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.modules.zuora.zuora.api.internal;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.rmi.RemoteException;

import org.apache.axis.AxisFault;
import org.slf4j.Logger;

public class ClientAdaptorInvocationHandler implements InvocationHandler
{
    private final Logger log;
    private final Object client;
    private final Class<? extends RuntimeException> exceptionClass;

    public ClientAdaptorInvocationHandler(Logger log, Object client, Class<? extends RuntimeException> exceptionClass)
    {
        this.log = log;
        this.client = client;
        this.exceptionClass = exceptionClass;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    {
        try
        {
            if (log.isDebugEnabled())
            {
                log.debug("Entering {} with args {}", method.getName(), args);
            }
            Object ret = method.invoke(client, args);
            if (log.isDebugEnabled())
            {
                log.debug("Returning from {} with value {}", method.getName(), ret);
            }
            return ret;
        }
        catch (InvocationTargetException e)
        {
            if (log.isWarnEnabled())
            {
                log.warn("An exception was thrown while invoking {}: {}", method.getName(), e.getCause());
            }
            throw adaptException(e.getCause());
        }
    }

    private Throwable adaptException(Throwable e)
    {
        try
        {
            if (e instanceof AxisFault)
            {
                return exceptionClass.getConstructor(String.class, Throwable.class).newInstance(
                    ((AxisFault) e).getFaultString(), e);
            }
            if (e instanceof RemoteException)
            {
                return exceptionClass.getConstructor(Throwable.class).newInstance(e);
            }
            return e;
        }
        catch (Exception e1)
        {
            throw new AssertionError(e);
        }
    }
}
