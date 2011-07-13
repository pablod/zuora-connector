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

import com.sforce.soap.AmendRequest;
import com.sforce.soap.AmendResult;
import com.sforce.soap.DeleteResult;
import com.sforce.soap.SaveResult;
import com.sforce.soap.SubscribeRequest;
import com.sforce.soap.SubscribeResult;

import java.util.List;

import javax.validation.constraints.NotNull;

public interface ZuoraClient<E extends Throwable>
{
    List<SubscribeResult> subscribe(@NotNull List<SubscribeRequest> subscriptions) throws E;

    List<SaveResult> create(@NotNull List<ZObject> zobjects) throws E;

    List<SaveResult> generate(@NotNull List<ZObject> zobjects) throws E;

    List<SaveResult> update(@NotNull List<ZObject> zobjects) throws E;

    List<DeleteResult> delete(@NotNull String type, @NotNull List<String> ids) throws E;

    Iterable<ZObject> find(@NotNull String zquery) throws E;

    String getUserInfo() throws E;

    List<AmendResult> amend(@NotNull  List<AmendRequest> amendaments) throws E;

}
