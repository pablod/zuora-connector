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

import com.sforce.ws.bind.XMLizable;


/**
 * Generated class, please do not edit.
 */
public class Create_element implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public Create_element() {
  }
    
  
  /**
   * element  : zObjects of type {http://object.api.zuora.com/}zObject
   * java type: com.sforce.soap.ZObject[]
   */
  private static final com.sforce.ws.bind.TypeInfo zObjects__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","zObjects","http://object.api.zuora.com/","zObject",0,-1,true);

  private boolean zObjects__is_set = false;

  private XMLizable[] dynamicZObjects = new XMLizable[0];

  public XMLizable[] getZObjects() {
    return dynamicZObjects;
  }

  

  public void setZObjects(XMLizable[] zObjects) {
    this.dynamicZObjects = zObjects;
    zObjects__is_set = true;
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
   
    __typeMapper.writeObject(__out, zObjects__typeInfo, dynamicZObjects, zObjects__is_set);
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
    if (__typeMapper.isElement(__in, zObjects__typeInfo)) {
      setZObjects((XMLizable[])__typeMapper.readObject(__in, zObjects__typeInfo, XMLizable[].class));
    }
  }

  @Override
public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[Create_element ");
    
    sb.append(" zObjects=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(dynamicZObjects)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}