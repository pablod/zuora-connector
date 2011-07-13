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
public class RefundInvoicePayment extends com.zuora.api.object.StaticZObject {

  /**
   * Constructor
   */
  public RefundInvoicePayment() {
  }
    
  
  /**
   * element  : CreatedById of type {http://api.zuora.com/}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CreatedById__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","CreatedById","http://api.zuora.com/","ID",0,1,true);

  private boolean CreatedById__is_set = false;

  private java.lang.String CreatedById;

  public java.lang.String getCreatedById() {
    return CreatedById;
  }

  

  public void setCreatedById(java.lang.String CreatedById) {
    this.CreatedById = CreatedById;
    CreatedById__is_set = true;
  }
  
  /**
   * element  : CreatedDate of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo CreatedDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","CreatedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean CreatedDate__is_set = false;

  private java.util.Calendar CreatedDate;

  public java.util.Calendar getCreatedDate() {
    return CreatedDate;
  }

  

  public void setCreatedDate(java.util.Calendar CreatedDate) {
    this.CreatedDate = CreatedDate;
    CreatedDate__is_set = true;
  }
  
  /**
   * element  : InvoicePaymentId of type {http://api.zuora.com/}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo InvoicePaymentId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","InvoicePaymentId","http://api.zuora.com/","ID",0,1,true);

  private boolean InvoicePaymentId__is_set = false;

  private java.lang.String InvoicePaymentId;

  public java.lang.String getInvoicePaymentId() {
    return InvoicePaymentId;
  }

  

  public void setInvoicePaymentId(java.lang.String InvoicePaymentId) {
    this.InvoicePaymentId = InvoicePaymentId;
    InvoicePaymentId__is_set = true;
  }
  
  /**
   * element  : RefundAmount of type {http://www.w3.org/2001/XMLSchema}decimal
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo RefundAmount__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","RefundAmount","http://www.w3.org/2001/XMLSchema","decimal",0,1,true);

  private boolean RefundAmount__is_set = false;

  private java.lang.Double RefundAmount;

  public java.lang.Double getRefundAmount() {
    return RefundAmount;
  }

  

  public void setRefundAmount(java.lang.Double RefundAmount) {
    this.RefundAmount = RefundAmount;
    RefundAmount__is_set = true;
  }
  
  /**
   * element  : RefundId of type {http://api.zuora.com/}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo RefundId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","RefundId","http://api.zuora.com/","ID",0,1,true);

  private boolean RefundId__is_set = false;

  private java.lang.String RefundId;

  public java.lang.String getRefundId() {
    return RefundId;
  }

  

  public void setRefundId(java.lang.String RefundId) {
    this.RefundId = RefundId;
    RefundId__is_set = true;
  }
  
  /**
   * element  : UpdatedById of type {http://api.zuora.com/}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo UpdatedById__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","UpdatedById","http://api.zuora.com/","ID",0,1,true);

  private boolean UpdatedById__is_set = false;

  private java.lang.String UpdatedById;

  public java.lang.String getUpdatedById() {
    return UpdatedById;
  }

  

  public void setUpdatedById(java.lang.String UpdatedById) {
    this.UpdatedById = UpdatedById;
    UpdatedById__is_set = true;
  }
  
  /**
   * element  : UpdatedDate of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo UpdatedDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","UpdatedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean UpdatedDate__is_set = false;

  private java.util.Calendar UpdatedDate;

  public java.util.Calendar getUpdatedDate() {
    return UpdatedDate;
  }

  

  public void setUpdatedDate(java.util.Calendar UpdatedDate) {
    this.UpdatedDate = UpdatedDate;
    UpdatedDate__is_set = true;
  }
  

  /**
   */
  @Override
public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "http://object.api.zuora.com/", "RefundInvoicePayment");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  @Override
protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeString(__out, InvoicePaymentId__typeInfo, InvoicePaymentId, InvoicePaymentId__is_set);
    __typeMapper.writeObject(__out, RefundAmount__typeInfo, RefundAmount, RefundAmount__is_set);
    __typeMapper.writeString(__out, RefundId__typeInfo, RefundId, RefundId__is_set);
    __typeMapper.writeString(__out, UpdatedById__typeInfo, UpdatedById, UpdatedById__is_set);
    __typeMapper.writeObject(__out, UpdatedDate__typeInfo, UpdatedDate, UpdatedDate__is_set);
  }


  @Override
public void load(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
    __typeMapper.consumeStartTag(__in);
    loadFields(__in, __typeMapper);
    __typeMapper.consumeEndTag(__in);
  }

  @Override
protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
   super.loadFields(__in, __typeMapper);
    __in.peekTag();
    if (__typeMapper.isElement(__in, CreatedById__typeInfo)) {
      setCreatedById(__typeMapper.readString(__in, CreatedById__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CreatedDate__typeInfo)) {
      setCreatedDate((java.util.Calendar)__typeMapper.readObject(__in, CreatedDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, InvoicePaymentId__typeInfo)) {
      setInvoicePaymentId(__typeMapper.readString(__in, InvoicePaymentId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RefundAmount__typeInfo)) {
      setRefundAmount((java.lang.Double)__typeMapper.readObject(__in, RefundAmount__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RefundId__typeInfo)) {
      setRefundId(__typeMapper.readString(__in, RefundId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UpdatedById__typeInfo)) {
      setUpdatedById(__typeMapper.readString(__in, UpdatedById__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, UpdatedDate__typeInfo)) {
      setUpdatedDate((java.util.Calendar)__typeMapper.readObject(__in, UpdatedDate__typeInfo, java.util.Calendar.class));
    }
  }

  @Override
public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[RefundInvoicePayment ");
    sb.append(super.toString());
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" InvoicePaymentId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(InvoicePaymentId)+"'\n");
    sb.append(" RefundAmount=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RefundAmount)+"'\n");
    sb.append(" RefundId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RefundId)+"'\n");
    sb.append(" UpdatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UpdatedById)+"'\n");
    sb.append(" UpdatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UpdatedDate)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}