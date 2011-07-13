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

import javax.xml.namespace.QName;

/**
 * Generated class, please do not edit.
 */
public class ApiFault extends com.sforce.ws.SoapFaultException implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public ApiFault() {
  }
    
  
  /**
   * element  : FaultCode of type {http://api.zuora.com/}ErrorCode
   * java type: com.sforce.soap.ErrorCode
   */
  private static final com.sforce.ws.bind.TypeInfo FaultCode__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://fault.api.zuora.com/","FaultCode","http://api.zuora.com/","ErrorCode",0,1,true);

  private boolean FaultCode__is_set = false;

  private com.zuora.api.object.ErrorCode FaultCode;

@Override
    public QName getFaultCode()
    {
        return new QName(FaultCode.name());
    }
  

  public void setFaultCode(com.zuora.api.object.ErrorCode FaultCode) {
    this.FaultCode = FaultCode;
    FaultCode__is_set = true;
  }
  
  /**
   * element  : FaultMessage of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo FaultMessage__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://fault.api.zuora.com/","FaultMessage","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean FaultMessage__is_set = false;

  private java.lang.String FaultMessage;

  public java.lang.String getFaultMessage() {
    return FaultMessage;
  }

  

  public void setFaultMessage(java.lang.String FaultMessage) {
    this.FaultMessage = FaultMessage;
    FaultMessage__is_set = true;
  }
  

  /**
   */
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   
    __typeMapper.writeObject(__out, FaultCode__typeInfo, FaultCode, FaultCode__is_set);
    __typeMapper.writeString(__out, FaultMessage__typeInfo, FaultMessage, FaultMessage__is_set);
  }


  public void load(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
    __typeMapper.consumeStartTag(__in);
    loadFields(__in, __typeMapper);
    __typeMapper.consumeEndTag(__in);
  }

  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
   
    __in.peekTag();
    if (__typeMapper.isElement(__in, FaultCode__typeInfo)) {
      setFaultCode((com.zuora.api.object.ErrorCode)__typeMapper.readObject(__in, FaultCode__typeInfo, com.zuora.api.object.ErrorCode.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, FaultMessage__typeInfo)) {
      setFaultMessage(__typeMapper.readString(__in, FaultMessage__typeInfo, java.lang.String.class));
    }
  }

  @Override
public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[ApiFault ");
    
    sb.append(" FaultCode=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FaultCode)+"'\n");
    sb.append(" FaultMessage=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(FaultMessage)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}