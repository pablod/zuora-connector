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
public class GetUserInfoResponse_element implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public GetUserInfoResponse_element() {
  }
    
  
  /**
   * element  : TenantId of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo TenantId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","TenantId","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean TenantId__is_set = false;

  private java.lang.String TenantId;

  public java.lang.String getTenantId() {
    return TenantId;
  }

  

  public void setTenantId(java.lang.String TenantId) {
    this.TenantId = TenantId;
    TenantId__is_set = true;
  }
  
  /**
   * element  : TenantName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo TenantName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","TenantName","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean TenantName__is_set = false;

  private java.lang.String TenantName;

  public java.lang.String getTenantName() {
    return TenantName;
  }

  

  public void setTenantName(java.lang.String TenantName) {
    this.TenantName = TenantName;
    TenantName__is_set = true;
  }
  
  /**
   * element  : UserEmail of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo UserEmail__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","UserEmail","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean UserEmail__is_set = false;

  private java.lang.String UserEmail;

  public java.lang.String getUserEmail() {
    return UserEmail;
  }

  

  public void setUserEmail(java.lang.String UserEmail) {
    this.UserEmail = UserEmail;
    UserEmail__is_set = true;
  }
  
  /**
   * element  : UserFullName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo UserFullName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","UserFullName","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean UserFullName__is_set = false;

  private java.lang.String UserFullName;

  public java.lang.String getUserFullName() {
    return UserFullName;
  }

  

  public void setUserFullName(java.lang.String UserFullName) {
    this.UserFullName = UserFullName;
    UserFullName__is_set = true;
  }
  
  /**
   * element  : UserId of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo UserId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","UserId","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean UserId__is_set = false;

  private java.lang.String UserId;

  public java.lang.String getUserId() {
    return UserId;
  }

  

  public void setUserId(java.lang.String UserId) {
    this.UserId = UserId;
    UserId__is_set = true;
  }
  
  /**
   * element  : Username of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Username__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","Username","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean Username__is_set = false;

  private java.lang.String Username;

  public java.lang.String getUsername() {
    return Username;
  }

  

  public void setUsername(java.lang.String Username) {
    this.Username = Username;
    Username__is_set = true;
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
   
    __typeMapper.writeString(__out, TenantId__typeInfo, TenantId, TenantId__is_set);
    __typeMapper.writeString(__out, TenantName__typeInfo, TenantName, TenantName__is_set);
    __typeMapper.writeString(__out, UserEmail__typeInfo, UserEmail, UserEmail__is_set);
    __typeMapper.writeString(__out, UserFullName__typeInfo, UserFullName, UserFullName__is_set);
    __typeMapper.writeString(__out, UserId__typeInfo, UserId, UserId__is_set);
    __typeMapper.writeString(__out, Username__typeInfo, Username, Username__is_set);
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
    if (__typeMapper.verifyElement(__in, TenantId__typeInfo)) {
      setTenantId((java.lang.String)__typeMapper.readString(__in, TenantId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, TenantName__typeInfo)) {
      setTenantName((java.lang.String)__typeMapper.readString(__in, TenantName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, UserEmail__typeInfo)) {
      setUserEmail((java.lang.String)__typeMapper.readString(__in, UserEmail__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, UserFullName__typeInfo)) {
      setUserFullName((java.lang.String)__typeMapper.readString(__in, UserFullName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, UserId__typeInfo)) {
      setUserId((java.lang.String)__typeMapper.readString(__in, UserId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, Username__typeInfo)) {
      setUsername((java.lang.String)__typeMapper.readString(__in, Username__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[GetUserInfoResponse_element ");
    
    sb.append(" TenantId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TenantId)+"'\n");
    sb.append(" TenantName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TenantName)+"'\n");
    sb.append(" UserEmail=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserEmail)+"'\n");
    sb.append(" UserFullName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserFullName)+"'\n");
    sb.append(" UserId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UserId)+"'\n");
    sb.append(" Username=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Username)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}