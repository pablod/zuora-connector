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
public class AccountingRunAdjustmentSummary extends org.mule.modules.zuora.zobject.StaticZObject {

  /**
   * Constructor
   */
  public AccountingRunAdjustmentSummary() {
  }
    
  
  /**
   * element  : AccountingRunId of type {http://api.zuora.com/}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo AccountingRunId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","AccountingRunId","http://api.zuora.com/","ID",0,1,true);

  private boolean AccountingRunId__is_set = false;

  private java.lang.String AccountingRunId;

  public java.lang.String getAccountingRunId() {
    return AccountingRunId;
  }

  

  public void setAccountingRunId(java.lang.String AccountingRunId) {
    this.AccountingRunId = AccountingRunId;
    AccountingRunId__is_set = true;
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
   * element  : Currency of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Currency__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","Currency","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Currency__is_set = false;

  private java.lang.String Currency;

  public java.lang.String getCurrency() {
    return Currency;
  }

  

  public void setCurrency(java.lang.String Currency) {
    this.Currency = Currency;
    Currency__is_set = true;
  }
  
  /**
   * element  : IntegratedFailed of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo IntegratedFailed__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","IntegratedFailed","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean IntegratedFailed__is_set = false;

  private java.lang.Integer IntegratedFailed;

  public java.lang.Integer getIntegratedFailed() {
    return IntegratedFailed;
  }

  

  public void setIntegratedFailed(java.lang.Integer IntegratedFailed) {
    this.IntegratedFailed = IntegratedFailed;
    IntegratedFailed__is_set = true;
  }
  
  /**
   * element  : IntegratedFailedAmount of type {http://www.w3.org/2001/XMLSchema}decimal
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo IntegratedFailedAmount__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","IntegratedFailedAmount","http://www.w3.org/2001/XMLSchema","decimal",0,1,true);

  private boolean IntegratedFailedAmount__is_set = false;

  private java.lang.Double IntegratedFailedAmount;

  public java.lang.Double getIntegratedFailedAmount() {
    return IntegratedFailedAmount;
  }

  

  public void setIntegratedFailedAmount(java.lang.Double IntegratedFailedAmount) {
    this.IntegratedFailedAmount = IntegratedFailedAmount;
    IntegratedFailedAmount__is_set = true;
  }
  
  /**
   * element  : IntegratedSuccessful of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo IntegratedSuccessful__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","IntegratedSuccessful","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean IntegratedSuccessful__is_set = false;

  private java.lang.Integer IntegratedSuccessful;

  public java.lang.Integer getIntegratedSuccessful() {
    return IntegratedSuccessful;
  }

  

  public void setIntegratedSuccessful(java.lang.Integer IntegratedSuccessful) {
    this.IntegratedSuccessful = IntegratedSuccessful;
    IntegratedSuccessful__is_set = true;
  }
  
  /**
   * element  : IntegratedSuccessfulAmount of type {http://www.w3.org/2001/XMLSchema}decimal
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo IntegratedSuccessfulAmount__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","IntegratedSuccessfulAmount","http://www.w3.org/2001/XMLSchema","decimal",0,1,true);

  private boolean IntegratedSuccessfulAmount__is_set = false;

  private java.lang.Double IntegratedSuccessfulAmount;

  public java.lang.Double getIntegratedSuccessfulAmount() {
    return IntegratedSuccessfulAmount;
  }

  

  public void setIntegratedSuccessfulAmount(java.lang.Double IntegratedSuccessfulAmount) {
    this.IntegratedSuccessfulAmount = IntegratedSuccessfulAmount;
    IntegratedSuccessfulAmount__is_set = true;
  }
  
  /**
   * element  : IntegratedTotal of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo IntegratedTotal__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","IntegratedTotal","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean IntegratedTotal__is_set = false;

  private java.lang.Integer IntegratedTotal;

  public java.lang.Integer getIntegratedTotal() {
    return IntegratedTotal;
  }

  

  public void setIntegratedTotal(java.lang.Integer IntegratedTotal) {
    this.IntegratedTotal = IntegratedTotal;
    IntegratedTotal__is_set = true;
  }
  
  /**
   * element  : IntegratedTotalAmount of type {http://www.w3.org/2001/XMLSchema}decimal
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo IntegratedTotalAmount__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","IntegratedTotalAmount","http://www.w3.org/2001/XMLSchema","decimal",0,1,true);

  private boolean IntegratedTotalAmount__is_set = false;

  private java.lang.Double IntegratedTotalAmount;

  public java.lang.Double getIntegratedTotalAmount() {
    return IntegratedTotalAmount;
  }

  

  public void setIntegratedTotalAmount(java.lang.Double IntegratedTotalAmount) {
    this.IntegratedTotalAmount = IntegratedTotalAmount;
    IntegratedTotalAmount__is_set = true;
  }
  
  /**
   * element  : ReadTotal of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo ReadTotal__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","ReadTotal","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean ReadTotal__is_set = false;

  private java.lang.Integer ReadTotal;

  public java.lang.Integer getReadTotal() {
    return ReadTotal;
  }

  

  public void setReadTotal(java.lang.Integer ReadTotal) {
    this.ReadTotal = ReadTotal;
    ReadTotal__is_set = true;
  }
  
  /**
   * element  : ReadTotalAmount of type {http://www.w3.org/2001/XMLSchema}decimal
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo ReadTotalAmount__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","ReadTotalAmount","http://www.w3.org/2001/XMLSchema","decimal",0,1,true);

  private boolean ReadTotalAmount__is_set = false;

  private java.lang.Double ReadTotalAmount;

  public java.lang.Double getReadTotalAmount() {
    return ReadTotalAmount;
  }

  

  public void setReadTotalAmount(java.lang.Double ReadTotalAmount) {
    this.ReadTotalAmount = ReadTotalAmount;
    ReadTotalAmount__is_set = true;
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
    __typeMapper.writeXsiType(__out, "http://object.api.zuora.com/", "AccountingRunAdjustmentSummary");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  @Override
protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, AccountingRunId__typeInfo, AccountingRunId, AccountingRunId__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeString(__out, Currency__typeInfo, Currency, Currency__is_set);
    __typeMapper.writeObject(__out, IntegratedFailed__typeInfo, IntegratedFailed, IntegratedFailed__is_set);
    __typeMapper.writeObject(__out, IntegratedFailedAmount__typeInfo, IntegratedFailedAmount, IntegratedFailedAmount__is_set);
    __typeMapper.writeObject(__out, IntegratedSuccessful__typeInfo, IntegratedSuccessful, IntegratedSuccessful__is_set);
    __typeMapper.writeObject(__out, IntegratedSuccessfulAmount__typeInfo, IntegratedSuccessfulAmount, IntegratedSuccessfulAmount__is_set);
    __typeMapper.writeObject(__out, IntegratedTotal__typeInfo, IntegratedTotal, IntegratedTotal__is_set);
    __typeMapper.writeObject(__out, IntegratedTotalAmount__typeInfo, IntegratedTotalAmount, IntegratedTotalAmount__is_set);
    __typeMapper.writeObject(__out, ReadTotal__typeInfo, ReadTotal, ReadTotal__is_set);
    __typeMapper.writeObject(__out, ReadTotalAmount__typeInfo, ReadTotalAmount, ReadTotalAmount__is_set);
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
    if (__typeMapper.isElement(__in, AccountingRunId__typeInfo)) {
      setAccountingRunId(__typeMapper.readString(__in, AccountingRunId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CreatedById__typeInfo)) {
      setCreatedById(__typeMapper.readString(__in, CreatedById__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CreatedDate__typeInfo)) {
      setCreatedDate((java.util.Calendar)__typeMapper.readObject(__in, CreatedDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Currency__typeInfo)) {
      setCurrency(__typeMapper.readString(__in, Currency__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IntegratedFailed__typeInfo)) {
      setIntegratedFailed((java.lang.Integer)__typeMapper.readObject(__in, IntegratedFailed__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IntegratedFailedAmount__typeInfo)) {
      setIntegratedFailedAmount((java.lang.Double)__typeMapper.readObject(__in, IntegratedFailedAmount__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IntegratedSuccessful__typeInfo)) {
      setIntegratedSuccessful((java.lang.Integer)__typeMapper.readObject(__in, IntegratedSuccessful__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IntegratedSuccessfulAmount__typeInfo)) {
      setIntegratedSuccessfulAmount((java.lang.Double)__typeMapper.readObject(__in, IntegratedSuccessfulAmount__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IntegratedTotal__typeInfo)) {
      setIntegratedTotal((java.lang.Integer)__typeMapper.readObject(__in, IntegratedTotal__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IntegratedTotalAmount__typeInfo)) {
      setIntegratedTotalAmount((java.lang.Double)__typeMapper.readObject(__in, IntegratedTotalAmount__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ReadTotal__typeInfo)) {
      setReadTotal((java.lang.Integer)__typeMapper.readObject(__in, ReadTotal__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ReadTotalAmount__typeInfo)) {
      setReadTotalAmount((java.lang.Double)__typeMapper.readObject(__in, ReadTotalAmount__typeInfo, java.lang.Double.class));
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
    sb.append("[AccountingRunAdjustmentSummary ");
    sb.append(super.toString());
    sb.append(" AccountingRunId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AccountingRunId)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" Currency=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Currency)+"'\n");
    sb.append(" IntegratedFailed=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IntegratedFailed)+"'\n");
    sb.append(" IntegratedFailedAmount=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IntegratedFailedAmount)+"'\n");
    sb.append(" IntegratedSuccessful=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IntegratedSuccessful)+"'\n");
    sb.append(" IntegratedSuccessfulAmount=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IntegratedSuccessfulAmount)+"'\n");
    sb.append(" IntegratedTotal=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IntegratedTotal)+"'\n");
    sb.append(" IntegratedTotalAmount=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IntegratedTotalAmount)+"'\n");
    sb.append(" ReadTotal=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ReadTotal)+"'\n");
    sb.append(" ReadTotalAmount=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ReadTotalAmount)+"'\n");
    sb.append(" UpdatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UpdatedById)+"'\n");
    sb.append(" UpdatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UpdatedDate)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}