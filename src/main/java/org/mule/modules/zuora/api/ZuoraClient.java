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

import com.zuora.api.SaveResult;
import com.zuora.api.object.ZObject;

import java.rmi.RemoteException;
import java.util.List;

public interface ZuoraClient<E extends Throwable>
{
    void subscribe(List<ZObject> subscriptions) throws E;

    List<SaveResult> create(List<ZObject> zobjects) throws E;

    List<SaveResult> generate(List<ZObject> zobjects) throws E;

    List<SaveResult> update(List<ZObject> zobjects) throws E;

    void delete(List<ZObject> zobjects) throws E;

    void find(String zquery) throws E;

    User getUserInfo(String userid) throws E;

    void amend(List<ZObject> amendaments) throws E;

}
