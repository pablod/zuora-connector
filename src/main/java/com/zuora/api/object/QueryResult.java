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

import org.mule.modules.zuora.zobject.ZObject;

/**
 * Generated class, please do not edit.
 */
public class QueryResult implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public QueryResult() {
  }
    
  
  /**
   * element  : done of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo done__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","done","http://www.w3.org/2001/XMLSchema","boolean",1,1,true);

  private boolean done__is_set = false;

  private boolean done;

  public boolean getDone() {
    return done;
  }

  

  public boolean isDone() {
    return done;
  }

  

  public void setDone(boolean done) {
    this.done = done;
    done__is_set = true;
  }
  
  /**
   * element  : queryLocator of type {http://api.zuora.com/}QueryLocator
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo queryLocator__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","queryLocator","http://api.zuora.com/","QueryLocator",1,1,true);

  private boolean queryLocator__is_set = false;

  private java.lang.String queryLocator;

  public java.lang.String getQueryLocator() {
    return queryLocator;
  }

  

  public void setQueryLocator(java.lang.String queryLocator) {
    this.queryLocator = queryLocator;
    queryLocator__is_set = true;
  }
  
  /**
   * element  : records of type {http://object.api.zuora.com/}zObject
   * java type: com.sforce.soap.ZObject[]
   */
  private static final com.sforce.ws.bind.TypeInfo records__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","records","http://object.api.zuora.com/","zObject",0,-1,true);

  private boolean records__is_set = false;

  private ZObject[] records = new ZObject[0];

  public ZObject[] getRecords() {
    return records;
  }

  

  public void setRecords(ZObject[] records) {
    this.records = records;
    records__is_set = true;
  }
  
  /**
   * element  : size of type {http://www.w3.org/2001/XMLSchema}int
   * java type: int
   */
  private static final com.sforce.ws.bind.TypeInfo size__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","size","http://www.w3.org/2001/XMLSchema","int",1,1,true);

  private boolean size__is_set = false;

  private int size;

  public int getSize() {
    return size;
  }

  

  public void setSize(int size) {
    this.size = size;
    size__is_set = true;
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
   
    __typeMapper.writeBoolean(__out, done__typeInfo, done, done__is_set);
    __typeMapper.writeString(__out, queryLocator__typeInfo, queryLocator, queryLocator__is_set);
    __typeMapper.writeObject(__out, records__typeInfo, records, records__is_set);
    __typeMapper.writeInt(__out, size__typeInfo, size, size__is_set);
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
    if (__typeMapper.verifyElement(__in, done__typeInfo)) {
      setDone(__typeMapper.readBoolean(__in, done__typeInfo, boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, queryLocator__typeInfo)) {
      setQueryLocator(__typeMapper.readString(__in, queryLocator__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, records__typeInfo)) {
      setRecords((ZObject[])__typeMapper.readObject(__in, records__typeInfo, ZObject[].class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, size__typeInfo)) {
      setSize(__typeMapper.readInt(__in, size__typeInfo, int.class));
    }
  }

  @Override
public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[QueryResult ");
    
    sb.append(" done=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(done)+"'\n");
    sb.append(" queryLocator=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(queryLocator)+"'\n");
    sb.append(" records=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(records)+"'\n");
    sb.append(" size=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(size)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}