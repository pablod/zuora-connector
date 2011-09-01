/**
 * Mule Zuora Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.modules.zuora;

import org.mule.modules.zuora.zuora.api.CxfZuoraClient;
import org.mule.modules.zuora.zuora.api.ZuoraClient;
import org.mule.modules.zuora.zuora.api.ZuoraClientAdaptor;
import org.mule.modules.zuora.zuora.api.ZuoraException;

public class ZuoraSession {
    private ZuoraClient<ZuoraException> client;

    public ZuoraSession(ZuoraClient<ZuoraException> client) {
        this.client = client;
    }

    public ZuoraSession(String username, String password, String endpoint) {
        setClient(new CxfZuoraClient(username, password, endpoint));
    }

    public ZuoraClient<ZuoraException> getClient() {
        return client;
    }

    public void setClient(ZuoraClient<?> client) {
        this.client = ZuoraClientAdaptor.adapt(client);
    }


}
