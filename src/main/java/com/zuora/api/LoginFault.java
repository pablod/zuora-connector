
package com.zuora.api;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.5.1
 * 2012-08-28T17:54:23.595-03:00
 * Generated source version: 2.5.1
 */

@WebFault(name = "LoginFault", targetNamespace = "http://fault.api.zuora.com/")
public class LoginFault extends Exception {
    
    private com.zuora.api.fault.LoginFault loginFault;

    public LoginFault() {
        super();
    }
    
    public LoginFault(String message) {
        super(message);
    }
    
    public LoginFault(String message, Throwable cause) {
        super(message, cause);
    }

    public LoginFault(String message, com.zuora.api.fault.LoginFault loginFault) {
        super(message);
        this.loginFault = loginFault;
    }

    public LoginFault(String message, com.zuora.api.fault.LoginFault loginFault, Throwable cause) {
        super(message, cause);
        this.loginFault = loginFault;
    }

    public com.zuora.api.fault.LoginFault getFaultInfo() {
        return this.loginFault;
    }
}