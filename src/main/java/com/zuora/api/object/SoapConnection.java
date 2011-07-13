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
import com.sforce.ws.bind.TypeMapper;
import com.sforce.ws.bind.XMLizable;

import java.util.HashMap;

import javax.xml.namespace.QName;

/**
 * Generated class, please do not edit.
 */
public class SoapConnection {

  private TypeMapper __typeMapper = new TypeMapper();
  private ConnectorConfig __config;
  private HashMap<QName, XMLizable> __extraHeaders = new HashMap<QName, XMLizable>();

  public ConnectorConfig getConfig() {
    return __config;
  }

  
  private com.zuora.api.object.QueryOptions_element __QueryOptions;

  public void setQueryOptions(int batchSize,boolean caseSensitive) {
    __QueryOptions = new com.zuora.api.object.QueryOptions_element();
     
       __QueryOptions.setBatchSize(batchSize);
       __QueryOptions.setCaseSensitive(caseSensitive);
  }

  public void clearQueryOptions() {
    __QueryOptions = null;
  }

  public com.zuora.api.object.QueryOptions_element getQueryOptions() {
    return  __QueryOptions;
  }

  public void __setQueryOptions(com.zuora.api.object.QueryOptions_element __header) {
    __QueryOptions = __header ;
  }

  
  private com.zuora.api.object.CallOptions_element __CallOptions;

  public void setCallOptions(java.lang.Boolean useSingleTransaction) {
    __CallOptions = new com.zuora.api.object.CallOptions_element();
     
       __CallOptions.setUseSingleTransaction(useSingleTransaction);
  }

  public void clearCallOptions() {
    __CallOptions = null;
  }

  public com.zuora.api.object.CallOptions_element getCallOptions() {
    return  __CallOptions;
  }

  public void __setCallOptions(com.zuora.api.object.CallOptions_element __header) {
    __CallOptions = __header ;
  }

  
  private com.zuora.api.object.SessionHeader_element __SessionHeader;

  public void setSessionHeader(java.lang.String session) {
    __SessionHeader = new com.zuora.api.object.SessionHeader_element();
     
       __SessionHeader.setSession(session);
  }

  public void clearSessionHeader() {
    __SessionHeader = null;
  }

  public com.zuora.api.object.SessionHeader_element getSessionHeader() {
    return  __SessionHeader;
  }

  public void __setSessionHeader(com.zuora.api.object.SessionHeader_element __header) {
    __SessionHeader = __header ;
  }

  

  public SoapConnection(ConnectorConfig config) throws ConnectionException {
    this.__config = config;
    this.__typeMapper.setPackagePrefix(null);
    this.__typeMapper.setConfig(config);

    

    
      __SessionHeader = new SessionHeader_element();
      __SessionHeader.setSession(config.getSessionId());
    
  }

  private com.sforce.ws.transport.SoapConnection newConnection() {
      com.sforce.ws.transport.SoapConnection __c   = new com.sforce.ws.transport.SoapConnection(
           __config.getServiceEndpoint(), null, __typeMapper, __config);

      __c.setConnection(this);
      __c.setKnownHeaders(knownHeaders);
      return __c;
   }

  
  public com.zuora.api.object.QueryResult query(java.lang.String queryString)
       throws com.sforce.ws.ConnectionException {
    com.sforce.ws.transport.SoapConnection __connection = newConnection();
    com.zuora.api.object.Query_element __request = new com.zuora.api.object.Query_element();
    com.zuora.api.object.QueryResponse_element __response = new com.zuora.api.object.QueryResponse_element();

  
    __request.setQueryString(queryString);

    
    if (__QueryOptions != null) __connection.addHeader(QueryOptions_qname, __QueryOptions);
    
    if (__SessionHeader != null) __connection.addHeader(SessionHeader_qname, __SessionHeader);
    

    addHeaders(__connection);

    __response = (com.zuora.api.object.QueryResponse_element) __connection.send("",
       query_qname, __request, queryResponse_qname,
       com.zuora.api.object.QueryResponse_element.class);

    return __response.getResult();
  }
  
  public com.zuora.api.object.SaveResult[] generate(XMLizable[] zObjects)
       throws com.sforce.ws.ConnectionException {
    com.sforce.ws.transport.SoapConnection __connection = newConnection();
    com.zuora.api.object.Generate_element __request = new com.zuora.api.object.Generate_element();
    com.zuora.api.object.GenerateResponse_element __response = new com.zuora.api.object.GenerateResponse_element();

  
    __request.setZObjects(zObjects);

    
    if (__SessionHeader != null) __connection.addHeader(SessionHeader_qname, __SessionHeader);
    

    addHeaders(__connection);

    __response = (com.zuora.api.object.GenerateResponse_element) __connection.send("",
       generate_qname, __request, generateResponse_qname,
       com.zuora.api.object.GenerateResponse_element.class);

    return __response.getResult();
  }
  
  public com.zuora.api.object.SubscribeResult[] subscribe(com.zuora.api.object.SubscribeRequest[] subscribes)
       throws com.sforce.ws.ConnectionException {
    com.sforce.ws.transport.SoapConnection __connection = newConnection();
    com.zuora.api.object.Subscribe_element __request = new com.zuora.api.object.Subscribe_element();
    com.zuora.api.object.SubscribeResponse_element __response = new com.zuora.api.object.SubscribeResponse_element();

  
    __request.setSubscribes(subscribes);

    
    if (__SessionHeader != null) __connection.addHeader(SessionHeader_qname, __SessionHeader);
    

    addHeaders(__connection);

    __response = (com.zuora.api.object.SubscribeResponse_element) __connection.send("",
       subscribe_qname, __request, subscribeResponse_qname,
       com.zuora.api.object.SubscribeResponse_element.class);

    return __response.getResult();
  }
  
  public com.zuora.api.object.QueryResult queryMore(java.lang.String queryLocator)
       throws com.sforce.ws.ConnectionException {
    com.sforce.ws.transport.SoapConnection __connection = newConnection();
    com.zuora.api.object.QueryMore_element __request = new com.zuora.api.object.QueryMore_element();
    com.zuora.api.object.QueryMoreResponse_element __response = new com.zuora.api.object.QueryMoreResponse_element();

  
    __request.setQueryLocator(queryLocator);

    
    if (__QueryOptions != null) __connection.addHeader(QueryOptions_qname, __QueryOptions);
    
    if (__SessionHeader != null) __connection.addHeader(SessionHeader_qname, __SessionHeader);
    

    addHeaders(__connection);

    __response = (com.zuora.api.object.QueryMoreResponse_element) __connection.send("",
       queryMore_qname, __request, queryMoreResponse_qname,
       com.zuora.api.object.QueryMoreResponse_element.class);

    return __response.getResult();
  }
  
  public com.zuora.api.object.SaveResult[] update(XMLizable[] zObjects)
       throws com.sforce.ws.ConnectionException {
    com.sforce.ws.transport.SoapConnection __connection = newConnection();
    com.zuora.api.object.Update_element __request = new com.zuora.api.object.Update_element();
    com.zuora.api.object.UpdateResponse_element __response = new com.zuora.api.object.UpdateResponse_element();

  
    __request.setZObjects(zObjects);

    
    if (__SessionHeader != null) __connection.addHeader(SessionHeader_qname, __SessionHeader);
    

    addHeaders(__connection);

    __response = (com.zuora.api.object.UpdateResponse_element) __connection.send("",
       update_qname, __request, updateResponse_qname,
       com.zuora.api.object.UpdateResponse_element.class);

    return __response.getResult();
  }
  
  public com.zuora.api.object.AmendResult[] amend(com.zuora.api.object.AmendRequest[] requests)
       throws com.sforce.ws.ConnectionException {
    com.sforce.ws.transport.SoapConnection __connection = newConnection();
    com.zuora.api.object.Amend_element __request = new com.zuora.api.object.Amend_element();
    com.zuora.api.object.AmendResponse_element __response = new com.zuora.api.object.AmendResponse_element();

  
    __request.setRequests(requests);

    
    if (__SessionHeader != null) __connection.addHeader(SessionHeader_qname, __SessionHeader);
    

    addHeaders(__connection);

    __response = (com.zuora.api.object.AmendResponse_element) __connection.send("",
       amend_qname, __request, amendResponse_qname,
       com.zuora.api.object.AmendResponse_element.class);

    return __response.getResults();
  }
  
  public com.zuora.api.object.SaveResult[] create(XMLizable[] zObjects)
       throws com.sforce.ws.ConnectionException {
    com.sforce.ws.transport.SoapConnection __connection = newConnection();
    com.zuora.api.object.Create_element __request = new com.zuora.api.object.Create_element();
    com.zuora.api.object.CreateResponse_element __response = new com.zuora.api.object.CreateResponse_element();

  
    __request.setZObjects(zObjects);

    
    if (__CallOptions != null) __connection.addHeader(CallOptions_qname, __CallOptions);
    
    if (__SessionHeader != null) __connection.addHeader(SessionHeader_qname, __SessionHeader);
    

    addHeaders(__connection);

    __response = (com.zuora.api.object.CreateResponse_element) __connection.send("",
       create_qname, __request, createResponse_qname,
       com.zuora.api.object.CreateResponse_element.class);

    return __response.getResult();
  }
  
  public com.zuora.api.object.LoginResult login(java.lang.String username,java.lang.String password)
       throws com.sforce.ws.ConnectionException {
    com.sforce.ws.transport.SoapConnection __connection = newConnection();
    com.zuora.api.object.Login_element __request = new com.zuora.api.object.Login_element();
    com.zuora.api.object.LoginResponse_element __response = new com.zuora.api.object.LoginResponse_element();

  
    __request.setUsername(username);
    __request.setPassword(password);

    

    addHeaders(__connection);

    __response = (com.zuora.api.object.LoginResponse_element) __connection.send("",
       login_qname, __request, loginResponse_qname,
       com.zuora.api.object.LoginResponse_element.class);

    return __response.getResult();
  }
  
  public java.lang.String getUserInfo()
       throws com.sforce.ws.ConnectionException {
    com.sforce.ws.transport.SoapConnection __connection = newConnection();
    com.zuora.api.object.GetUserInfo_element __request = new com.zuora.api.object.GetUserInfo_element();
    com.zuora.api.object.GetUserInfoResponse_element __response = new com.zuora.api.object.GetUserInfoResponse_element();

  

    
    if (__SessionHeader != null) __connection.addHeader(SessionHeader_qname, __SessionHeader);
    

    addHeaders(__connection);

    __response = (com.zuora.api.object.GetUserInfoResponse_element) __connection.send("",
       getUserInfo_qname, __request, getUserInfoResponse_qname,
       com.zuora.api.object.GetUserInfoResponse_element.class);

    return __response.getTenantId();
  }
  
  public com.zuora.api.object.DeleteResult[] delete(java.lang.String type,java.lang.String[] ids)
       throws com.sforce.ws.ConnectionException {
    com.sforce.ws.transport.SoapConnection __connection = newConnection();
    com.zuora.api.object.Delete_element __request = new com.zuora.api.object.Delete_element();
    com.zuora.api.object.DeleteResponse_element __response = new com.zuora.api.object.DeleteResponse_element();

  
    __request.setType(type);
    __request.setIds(ids);

    
    if (__SessionHeader != null) __connection.addHeader(SessionHeader_qname, __SessionHeader);
    

    addHeaders(__connection);

    __response = (com.zuora.api.object.DeleteResponse_element) __connection.send("",
       delete_qname, __request, deleteResponse_qname,
       com.zuora.api.object.DeleteResponse_element.class);

    return __response.getResult();
  }
  


  private void addHeaders(com.sforce.ws.transport.SoapConnection __connection) {
    for(java.util.Map.Entry<QName, XMLizable> entry : __extraHeaders.entrySet()) {
      __connection.addHeader(entry.getKey(), entry.getValue());
    }
  }

  public void addExtraHeader(QName __headerName, XMLizable __value) {
    __extraHeaders.put(__headerName, __value);
  }

	public void removeExtraHeader(QName __headerName) {
		__extraHeaders.remove(__headerName);
	}

	public XMLizable getExtraHeader(QName __headerName) {
		return __extraHeaders.get(__headerName);
	}
	
	public void clearExtraHeaders() {
		__extraHeaders = new HashMap<QName, XMLizable>();
	}    private static final javax.xml.namespace.QName query_qname = new javax.xml.namespace.QName("http://api.zuora.com/", "query");
    private static final javax.xml.namespace.QName queryResponse_qname = new javax.xml.namespace.QName("http://api.zuora.com/", "queryResponse");
    private static final javax.xml.namespace.QName generate_qname = new javax.xml.namespace.QName("http://api.zuora.com/", "generate");
    private static final javax.xml.namespace.QName generateResponse_qname = new javax.xml.namespace.QName("http://api.zuora.com/", "generateResponse");
    private static final javax.xml.namespace.QName subscribe_qname = new javax.xml.namespace.QName("http://api.zuora.com/", "subscribe");
    private static final javax.xml.namespace.QName subscribeResponse_qname = new javax.xml.namespace.QName("http://api.zuora.com/", "subscribeResponse");
    private static final javax.xml.namespace.QName queryMore_qname = new javax.xml.namespace.QName("http://api.zuora.com/", "queryMore");
    private static final javax.xml.namespace.QName queryMoreResponse_qname = new javax.xml.namespace.QName("http://api.zuora.com/", "queryMoreResponse");
    private static final javax.xml.namespace.QName update_qname = new javax.xml.namespace.QName("http://api.zuora.com/", "update");
    private static final javax.xml.namespace.QName updateResponse_qname = new javax.xml.namespace.QName("http://api.zuora.com/", "updateResponse");
    private static final javax.xml.namespace.QName amend_qname = new javax.xml.namespace.QName("http://api.zuora.com/", "amend");
    private static final javax.xml.namespace.QName amendResponse_qname = new javax.xml.namespace.QName("http://api.zuora.com/", "amendResponse");
    private static final javax.xml.namespace.QName create_qname = new javax.xml.namespace.QName("http://api.zuora.com/", "create");
    private static final javax.xml.namespace.QName createResponse_qname = new javax.xml.namespace.QName("http://api.zuora.com/", "createResponse");
    private static final javax.xml.namespace.QName login_qname = new javax.xml.namespace.QName("http://api.zuora.com/", "login");
    private static final javax.xml.namespace.QName loginResponse_qname = new javax.xml.namespace.QName("http://api.zuora.com/", "loginResponse");
    private static final javax.xml.namespace.QName getUserInfo_qname = new javax.xml.namespace.QName("http://api.zuora.com/", "getUserInfo");
    private static final javax.xml.namespace.QName getUserInfoResponse_qname = new javax.xml.namespace.QName("http://api.zuora.com/", "getUserInfoResponse");
    private static final javax.xml.namespace.QName delete_qname = new javax.xml.namespace.QName("http://api.zuora.com/", "delete");
    private static final javax.xml.namespace.QName deleteResponse_qname = new javax.xml.namespace.QName("http://api.zuora.com/", "deleteResponse");
    private static final javax.xml.namespace.QName QueryOptions_qname = new javax.xml.namespace.QName("http://api.zuora.com/", "QueryOptions");
    private static final javax.xml.namespace.QName CallOptions_qname = new javax.xml.namespace.QName("http://api.zuora.com/", "CallOptions");
    private static final javax.xml.namespace.QName SessionHeader_qname = new javax.xml.namespace.QName("http://api.zuora.com/", "SessionHeader");


  private static HashMap<QName, java.lang.Class> knownHeaders = new HashMap<QName, java.lang.Class>();

  static {  knownHeaders.put(QueryOptions_qname,com.zuora.api.object.QueryOptions_element.class);
  knownHeaders.put(CallOptions_qname,com.zuora.api.object.CallOptions_element.class);
  knownHeaders.put(SessionHeader_qname,com.zuora.api.object.SessionHeader_element.class);

  }
}