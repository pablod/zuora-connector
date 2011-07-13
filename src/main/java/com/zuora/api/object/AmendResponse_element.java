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
public class AmendResponse_element implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public AmendResponse_element() {
  }
    
  
  /**
   * element  : results of type {http://api.zuora.com/}AmendResult
   * java type: com.sforce.soap.AmendResult[]
   */
  private static final com.sforce.ws.bind.TypeInfo results__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","results","http://api.zuora.com/","AmendResult",0,-1,true);

  private boolean results__is_set = false;

  private com.zuora.api.object.AmendResult[] results = new com.zuora.api.object.AmendResult[0];

  public com.zuora.api.object.AmendResult[] getResults() {
    return results;
  }

  

  public void setResults(com.zuora.api.object.AmendResult[] results) {
    this.results = results;
    results__is_set = true;
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
   
    __typeMapper.writeObject(__out, results__typeInfo, results, results__is_set);
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
    if (__typeMapper.isElement(__in, results__typeInfo)) {
      setResults((com.zuora.api.object.AmendResult[])__typeMapper.readObject(__in, results__typeInfo, com.zuora.api.object.AmendResult[].class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[AmendResponse_element ");
    
    sb.append(" results=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(results)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}