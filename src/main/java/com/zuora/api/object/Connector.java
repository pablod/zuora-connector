/**
 * Mule Zuora Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package com.zuora.api.object;

import com.sforce.ws.ConnectionException;
import com.sforce.ws.ConnectorConfig;


/**
 * Generated class, please do not edit.
 */
public class Connector {

  public static final String END_POINT = "https://apisandbox.zuora.com/apps/services/a/29.0";

  public static SoapConnection newConnection(String username, String password) throws ConnectionException {
    ConnectorConfig config = new ConnectorConfig();
    config.setUsername(username);
    config.setPassword(password);
    return newConnection(config);
  }

  public static SoapConnection newConnection(ConnectorConfig config) throws ConnectionException {
    if (config.getAuthEndpoint() == null) {
      config.setAuthEndpoint(END_POINT);
    }
    if (config.getServiceEndpoint() == null) {
      config.setServiceEndpoint(END_POINT);
    }
    return new SoapConnection(config);
  }
}