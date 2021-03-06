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

import com.zuora.api.*;
import com.zuora.api.object.ZObject;
import org.mule.modules.zuora.User;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;

public interface ZuoraClient<E extends Throwable>
{
    List<SubscribeResult> subscribe(@NotNull List<SubscribeRequest> subscriptions) throws E;

    List<SaveResult> create(@NotNull List<ZObject> zobjects) throws E;

    List<SaveResult> generate(@NotNull List<ZObject> zobjects) throws E;

    List<SaveResult> update(@NotNull List<ZObject> zobjects) throws E;

    List<DeleteResult> delete(@NotNull String type, @NotNull List<String> ids) throws E;

    Iterable<ZObject> find(@NotNull String zquery) throws E;

    User getUserInfo() throws E;

    List<AmendResult> amend(@NotNull  List<AmendRequest> amendaments) throws E;

    Map<String, Object> productProfile(@NotNull String productId) throws E;

    String getSessionId();

    Map<String, Object> accountProfile(@NotNull String accountId) throws E;

    Map<String, Object> getInvoice(@NotNull String accountId) throws E;
}
