
package com.zuora.api;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.5.1
 * 2012-08-28T17:54:23.502-03:00
 * Generated source version: 2.5.1
 */

@WebFault(name = "UnexpectedErrorFault", targetNamespace = "http://fault.api.zuora.com/")
public class UnexpectedErrorFault extends Exception {
    
    private com.zuora.api.fault.UnexpectedErrorFault unexpectedErrorFault;

    public UnexpectedErrorFault() {
        super();
    }
    
    public UnexpectedErrorFault(String message) {
        super(message);
    }
    
    public UnexpectedErrorFault(String message, Throwable cause) {
        super(message, cause);
    }

    public UnexpectedErrorFault(String message, com.zuora.api.fault.UnexpectedErrorFault unexpectedErrorFault) {
        super(message);
        this.unexpectedErrorFault = unexpectedErrorFault;
    }

    public UnexpectedErrorFault(String message, com.zuora.api.fault.UnexpectedErrorFault unexpectedErrorFault, Throwable cause) {
        super(message, cause);
        this.unexpectedErrorFault = unexpectedErrorFault;
    }

    public com.zuora.api.fault.UnexpectedErrorFault getFaultInfo() {
        return this.unexpectedErrorFault;
    }
}