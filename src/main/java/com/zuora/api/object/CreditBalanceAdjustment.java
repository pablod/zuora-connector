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
public class CreditBalanceAdjustment extends com.zuora.api.object.StaticZObject {

  /**
   * Constructor
   */
  public CreditBalanceAdjustment() {
  }
    
  
  /**
   * element  : AccountId of type {http://api.zuora.com/}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo AccountId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","AccountId","http://api.zuora.com/","ID",0,1,true);

  private boolean AccountId__is_set = false;

  private java.lang.String AccountId;

  public java.lang.String getAccountId() {
    return AccountId;
  }

  

  public void setAccountId(java.lang.String AccountId) {
    this.AccountId = AccountId;
    AccountId__is_set = true;
  }
  
  /**
   * element  : AccountingCode of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo AccountingCode__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","AccountingCode","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean AccountingCode__is_set = false;

  private java.lang.String AccountingCode;

  public java.lang.String getAccountingCode() {
    return AccountingCode;
  }

  

  public void setAccountingCode(java.lang.String AccountingCode) {
    this.AccountingCode = AccountingCode;
    AccountingCode__is_set = true;
  }
  
  /**
   * element  : AdjustmentDate of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo AdjustmentDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","AdjustmentDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean AdjustmentDate__is_set = false;

  private java.util.Calendar AdjustmentDate;

  public java.util.Calendar getAdjustmentDate() {
    return AdjustmentDate;
  }

  

  public void setAdjustmentDate(java.util.Calendar AdjustmentDate) {
    this.AdjustmentDate = AdjustmentDate;
    AdjustmentDate__is_set = true;
  }
  
  /**
   * element  : Amount of type {http://www.w3.org/2001/XMLSchema}decimal
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Amount__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","Amount","http://www.w3.org/2001/XMLSchema","decimal",0,1,true);

  private boolean Amount__is_set = false;

  private java.lang.Double Amount;

  public java.lang.Double getAmount() {
    return Amount;
  }

  

  public void setAmount(java.lang.Double Amount) {
    this.Amount = Amount;
    Amount__is_set = true;
  }
  
  /**
   * element  : Comment of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Comment__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","Comment","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Comment__is_set = false;

  private java.lang.String Comment;

  public java.lang.String getComment() {
    return Comment;
  }

  

  public void setComment(java.lang.String Comment) {
    this.Comment = Comment;
    Comment__is_set = true;
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
   * element  : Number of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Number__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","Number","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Number__is_set = false;

  private java.lang.String Number;

  public java.lang.String getNumber() {
    return Number;
  }

  

  public void setNumber(java.lang.String Number) {
    this.Number = Number;
    Number__is_set = true;
  }
  
  /**
   * element  : ReferenceId of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ReferenceId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","ReferenceId","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean ReferenceId__is_set = false;

  private java.lang.String ReferenceId;

  public java.lang.String getReferenceId() {
    return ReferenceId;
  }

  

  public void setReferenceId(java.lang.String ReferenceId) {
    this.ReferenceId = ReferenceId;
    ReferenceId__is_set = true;
  }
  
  /**
   * element  : SourceTransactionId of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo SourceTransactionId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","SourceTransactionId","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean SourceTransactionId__is_set = false;

  private java.lang.String SourceTransactionId;

  public java.lang.String getSourceTransactionId() {
    return SourceTransactionId;
  }

  

  public void setSourceTransactionId(java.lang.String SourceTransactionId) {
    this.SourceTransactionId = SourceTransactionId;
    SourceTransactionId__is_set = true;
  }
  
  /**
   * element  : SourceTransactionNumber of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo SourceTransactionNumber__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","SourceTransactionNumber","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean SourceTransactionNumber__is_set = false;

  private java.lang.String SourceTransactionNumber;

  public java.lang.String getSourceTransactionNumber() {
    return SourceTransactionNumber;
  }

  

  public void setSourceTransactionNumber(java.lang.String SourceTransactionNumber) {
    this.SourceTransactionNumber = SourceTransactionNumber;
    SourceTransactionNumber__is_set = true;
  }
  
  /**
   * element  : SourceTransactionType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo SourceTransactionType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","SourceTransactionType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean SourceTransactionType__is_set = false;

  private java.lang.String SourceTransactionType;

  public java.lang.String getSourceTransactionType() {
    return SourceTransactionType;
  }

  

  public void setSourceTransactionType(java.lang.String SourceTransactionType) {
    this.SourceTransactionType = SourceTransactionType;
    SourceTransactionType__is_set = true;
  }
  
  /**
   * element  : Status of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Status__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","Status","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Status__is_set = false;

  private java.lang.String Status;

  public java.lang.String getStatus() {
    return Status;
  }

  

  public void setStatus(java.lang.String Status) {
    this.Status = Status;
    Status__is_set = true;
  }
  
  /**
   * element  : TransferredToAccounting of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo TransferredToAccounting__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","TransferredToAccounting","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean TransferredToAccounting__is_set = false;

  private java.lang.String TransferredToAccounting;

  public java.lang.String getTransferredToAccounting() {
    return TransferredToAccounting;
  }

  

  public void setTransferredToAccounting(java.lang.String TransferredToAccounting) {
    this.TransferredToAccounting = TransferredToAccounting;
    TransferredToAccounting__is_set = true;
  }
  
  /**
   * element  : Type of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Type__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","Type","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Type__is_set = false;

  private java.lang.String Type;

  public java.lang.String getType() {
    return Type;
  }

  

  public void setType(java.lang.String Type) {
    this.Type = Type;
    Type__is_set = true;
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
    __typeMapper.writeXsiType(__out, "http://object.api.zuora.com/", "CreditBalanceAdjustment");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  @Override
protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, AccountId__typeInfo, AccountId, AccountId__is_set);
    __typeMapper.writeString(__out, AccountingCode__typeInfo, AccountingCode, AccountingCode__is_set);
    __typeMapper.writeObject(__out, AdjustmentDate__typeInfo, AdjustmentDate, AdjustmentDate__is_set);
    __typeMapper.writeObject(__out, Amount__typeInfo, Amount, Amount__is_set);
    __typeMapper.writeString(__out, Comment__typeInfo, Comment, Comment__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeString(__out, Number__typeInfo, Number, Number__is_set);
    __typeMapper.writeString(__out, ReferenceId__typeInfo, ReferenceId, ReferenceId__is_set);
    __typeMapper.writeString(__out, SourceTransactionId__typeInfo, SourceTransactionId, SourceTransactionId__is_set);
    __typeMapper.writeString(__out, SourceTransactionNumber__typeInfo, SourceTransactionNumber, SourceTransactionNumber__is_set);
    __typeMapper.writeString(__out, SourceTransactionType__typeInfo, SourceTransactionType, SourceTransactionType__is_set);
    __typeMapper.writeString(__out, Status__typeInfo, Status, Status__is_set);
    __typeMapper.writeString(__out, TransferredToAccounting__typeInfo, TransferredToAccounting, TransferredToAccounting__is_set);
    __typeMapper.writeString(__out, Type__typeInfo, Type, Type__is_set);
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
    if (__typeMapper.isElement(__in, AccountId__typeInfo)) {
      setAccountId(__typeMapper.readString(__in, AccountId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AccountingCode__typeInfo)) {
      setAccountingCode(__typeMapper.readString(__in, AccountingCode__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AdjustmentDate__typeInfo)) {
      setAdjustmentDate((java.util.Calendar)__typeMapper.readObject(__in, AdjustmentDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Amount__typeInfo)) {
      setAmount((java.lang.Double)__typeMapper.readObject(__in, Amount__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Comment__typeInfo)) {
      setComment(__typeMapper.readString(__in, Comment__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, Number__typeInfo)) {
      setNumber(__typeMapper.readString(__in, Number__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ReferenceId__typeInfo)) {
      setReferenceId(__typeMapper.readString(__in, ReferenceId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SourceTransactionId__typeInfo)) {
      setSourceTransactionId(__typeMapper.readString(__in, SourceTransactionId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SourceTransactionNumber__typeInfo)) {
      setSourceTransactionNumber(__typeMapper.readString(__in, SourceTransactionNumber__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SourceTransactionType__typeInfo)) {
      setSourceTransactionType(__typeMapper.readString(__in, SourceTransactionType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Status__typeInfo)) {
      setStatus(__typeMapper.readString(__in, Status__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TransferredToAccounting__typeInfo)) {
      setTransferredToAccounting(__typeMapper.readString(__in, TransferredToAccounting__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Type__typeInfo)) {
      setType(__typeMapper.readString(__in, Type__typeInfo, java.lang.String.class));
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
    sb.append("[CreditBalanceAdjustment ");
    sb.append(super.toString());
    sb.append(" AccountId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AccountId)+"'\n");
    sb.append(" AccountingCode=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AccountingCode)+"'\n");
    sb.append(" AdjustmentDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AdjustmentDate)+"'\n");
    sb.append(" Amount=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Amount)+"'\n");
    sb.append(" Comment=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Comment)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" Number=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Number)+"'\n");
    sb.append(" ReferenceId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ReferenceId)+"'\n");
    sb.append(" SourceTransactionId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SourceTransactionId)+"'\n");
    sb.append(" SourceTransactionNumber=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SourceTransactionNumber)+"'\n");
    sb.append(" SourceTransactionType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SourceTransactionType)+"'\n");
    sb.append(" Status=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Status)+"'\n");
    sb.append(" TransferredToAccounting=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TransferredToAccounting)+"'\n");
    sb.append(" Type=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Type)+"'\n");
    sb.append(" UpdatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UpdatedById)+"'\n");
    sb.append(" UpdatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UpdatedDate)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}