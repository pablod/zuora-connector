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
public class AmendRequest implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public AmendRequest() {
  }
    
  
  /**
   * element  : Amendments of type {http://object.api.zuora.com/}Amendment
   * java type: com.sforce.soap.Amendment[]
   */
  private static final com.sforce.ws.bind.TypeInfo Amendments__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","Amendments","http://object.api.zuora.com/","Amendment",0,-1,true);

  private boolean Amendments__is_set = false;

  private com.zuora.api.object.Amendment[] Amendments = new com.zuora.api.object.Amendment[0];

  public com.zuora.api.object.Amendment[] getAmendments() {
    return Amendments;
  }

  

  public void setAmendments(com.zuora.api.object.Amendment[] Amendments) {
    this.Amendments = Amendments;
    Amendments__is_set = true;
  }
  
  /**
   * element  : AmendOptions of type {http://api.zuora.com/}AmendOptions
   * java type: com.sforce.soap.AmendOptions
   */
  private static final com.sforce.ws.bind.TypeInfo AmendOptions__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","AmendOptions","http://api.zuora.com/","AmendOptions",0,1,true);

  private boolean AmendOptions__is_set = false;

  private com.zuora.api.object.AmendOptions AmendOptions;

  public com.zuora.api.object.AmendOptions getAmendOptions() {
    return AmendOptions;
  }

  

  public void setAmendOptions(com.zuora.api.object.AmendOptions AmendOptions) {
    this.AmendOptions = AmendOptions;
    AmendOptions__is_set = true;
  }
  
  /**
   * element  : PreviewOptions of type {http://api.zuora.com/}PreviewOptions
   * java type: com.sforce.soap.PreviewOptions
   */
  private static final com.sforce.ws.bind.TypeInfo PreviewOptions__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","PreviewOptions","http://api.zuora.com/","PreviewOptions",0,1,true);

  private boolean PreviewOptions__is_set = false;

  private com.zuora.api.object.PreviewOptions PreviewOptions;

  public com.zuora.api.object.PreviewOptions getPreviewOptions() {
    return PreviewOptions;
  }

  

  public void setPreviewOptions(com.zuora.api.object.PreviewOptions PreviewOptions) {
    this.PreviewOptions = PreviewOptions;
    PreviewOptions__is_set = true;
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
   
    __typeMapper.writeObject(__out, Amendments__typeInfo, Amendments, Amendments__is_set);
    __typeMapper.writeObject(__out, AmendOptions__typeInfo, AmendOptions, AmendOptions__is_set);
    __typeMapper.writeObject(__out, PreviewOptions__typeInfo, PreviewOptions, PreviewOptions__is_set);
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
    if (__typeMapper.isElement(__in, Amendments__typeInfo)) {
      setAmendments((com.zuora.api.object.Amendment[])__typeMapper.readObject(__in, Amendments__typeInfo, com.zuora.api.object.Amendment[].class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AmendOptions__typeInfo)) {
      setAmendOptions((com.zuora.api.object.AmendOptions)__typeMapper.readObject(__in, AmendOptions__typeInfo, com.zuora.api.object.AmendOptions.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PreviewOptions__typeInfo)) {
      setPreviewOptions((com.zuora.api.object.PreviewOptions)__typeMapper.readObject(__in, PreviewOptions__typeInfo, com.zuora.api.object.PreviewOptions.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[AmendRequest ");
    
    sb.append(" Amendments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Amendments)+"'\n");
    sb.append(" AmendOptions=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AmendOptions)+"'\n");
    sb.append(" PreviewOptions=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PreviewOptions)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}