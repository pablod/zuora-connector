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

/**
 * Generated class, please do not edit.
 */
public class SaveResult implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public SaveResult() {
  }
    
  
  /**
   * element  : Errors of type {http://api.zuora.com/}Error
   * java type: com.sforce.soap.Error[]
   */
  private static final com.sforce.ws.bind.TypeInfo Errors__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","Errors","http://api.zuora.com/","Error",0,-1,true);

  private boolean Errors__is_set = false;

  private com.zuora.api.object.Error[] Errors = new com.zuora.api.object.Error[0];

  public com.zuora.api.object.Error[] getErrors() {
    return Errors;
  }

  

  public void setErrors(com.zuora.api.object.Error[] Errors) {
    this.Errors = Errors;
    Errors__is_set = true;
  }
  
  /**
   * element  : Id of type {http://api.zuora.com/}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Id__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","Id","http://api.zuora.com/","ID",0,1,true);

  private boolean Id__is_set = false;

  private java.lang.String Id;

  public java.lang.String getId() {
    return Id;
  }

  

  public void setId(java.lang.String Id) {
    this.Id = Id;
    Id__is_set = true;
  }
  
  /**
   * element  : Success of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo Success__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","Success","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean Success__is_set = false;

  private boolean Success;

  public boolean getSuccess() {
    return Success;
  }

  

  public boolean isSuccess() {
    return Success;
  }

  

  public void setSuccess(boolean Success) {
    this.Success = Success;
    Success__is_set = true;
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
   
    __typeMapper.writeObject(__out, Errors__typeInfo, Errors, Errors__is_set);
    __typeMapper.writeString(__out, Id__typeInfo, Id, Id__is_set);
    __typeMapper.writeBoolean(__out, Success__typeInfo, Success, Success__is_set);
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
    if (__typeMapper.isElement(__in, Errors__typeInfo)) {
      setErrors((com.zuora.api.object.Error[])__typeMapper.readObject(__in, Errors__typeInfo, com.zuora.api.object.Error[].class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Id__typeInfo)) {
      setId((java.lang.String)__typeMapper.readString(__in, Id__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Success__typeInfo)) {
      setSuccess((boolean)__typeMapper.readBoolean(__in, Success__typeInfo, boolean.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[SaveResult ");
    
    sb.append(" Errors=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Errors)+"'\n");
    sb.append(" Id=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Id)+"'\n");
    sb.append(" Success=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Success)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}