/**
 * Mule Zuora Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package com.zuora.api;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.5.1
 * 2012-08-28T17:54:23.523-03:00
 * Generated source version: 2.5.1
 */

@WebFault(name = "InvalidQueryLocatorFault", targetNamespace = "http://fault.api.zuora.com/")
public class InvalidQueryLocatorFault extends Exception {
    
    private com.zuora.api.fault.InvalidQueryLocatorFault invalidQueryLocatorFault;

    public InvalidQueryLocatorFault() {
        super();
    }
    
    public InvalidQueryLocatorFault(String message) {
        super(message);
    }
    
    public InvalidQueryLocatorFault(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidQueryLocatorFault(String message, com.zuora.api.fault.InvalidQueryLocatorFault invalidQueryLocatorFault) {
        super(message);
        this.invalidQueryLocatorFault = invalidQueryLocatorFault;
    }

    public InvalidQueryLocatorFault(String message, com.zuora.api.fault.InvalidQueryLocatorFault invalidQueryLocatorFault, Throwable cause) {
        super(message, cause);
        this.invalidQueryLocatorFault = invalidQueryLocatorFault;
    }

    public com.zuora.api.fault.InvalidQueryLocatorFault getFaultInfo() {
        return this.invalidQueryLocatorFault;
    }
}
