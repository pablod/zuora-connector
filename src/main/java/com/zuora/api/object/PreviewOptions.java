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
public class PreviewOptions implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public PreviewOptions() {
  }
    
  
  /**
   * element  : EnablePreviewMode of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo EnablePreviewMode__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","EnablePreviewMode","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean EnablePreviewMode__is_set = false;

  private java.lang.Boolean EnablePreviewMode;

  public java.lang.Boolean getEnablePreviewMode() {
    return EnablePreviewMode;
  }

  

  public void setEnablePreviewMode(java.lang.Boolean EnablePreviewMode) {
    this.EnablePreviewMode = EnablePreviewMode;
    EnablePreviewMode__is_set = true;
  }
  
  /**
   * element  : NumberOfPeriods of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo NumberOfPeriods__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","NumberOfPeriods","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean NumberOfPeriods__is_set = false;

  private java.lang.Integer NumberOfPeriods;

  public java.lang.Integer getNumberOfPeriods() {
    return NumberOfPeriods;
  }

  

  public void setNumberOfPeriods(java.lang.Integer NumberOfPeriods) {
    this.NumberOfPeriods = NumberOfPeriods;
    NumberOfPeriods__is_set = true;
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
   
    __typeMapper.writeObject(__out, EnablePreviewMode__typeInfo, EnablePreviewMode, EnablePreviewMode__is_set);
    __typeMapper.writeObject(__out, NumberOfPeriods__typeInfo, NumberOfPeriods, NumberOfPeriods__is_set);
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
    if (__typeMapper.isElement(__in, EnablePreviewMode__typeInfo)) {
      setEnablePreviewMode((java.lang.Boolean)__typeMapper.readObject(__in, EnablePreviewMode__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, NumberOfPeriods__typeInfo)) {
      setNumberOfPeriods((java.lang.Integer)__typeMapper.readObject(__in, NumberOfPeriods__typeInfo, java.lang.Integer.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[PreviewOptions ");
    
    sb.append(" EnablePreviewMode=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EnablePreviewMode)+"'\n");
    sb.append(" NumberOfPeriods=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NumberOfPeriods)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}