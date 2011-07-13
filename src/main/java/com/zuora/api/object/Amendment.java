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
public class Amendment extends org.mule.modules.zuora.zobject.StaticZObject {

  /**
   * Constructor
   */
  public Amendment() {
  }
    
  
  /**
   * element  : AutoRenew of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo AutoRenew__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","AutoRenew","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean AutoRenew__is_set = false;

  private java.lang.Boolean AutoRenew;

  public java.lang.Boolean getAutoRenew() {
    return AutoRenew;
  }

  

  public void setAutoRenew(java.lang.Boolean AutoRenew) {
    this.AutoRenew = AutoRenew;
    AutoRenew__is_set = true;
  }
  
  /**
   * element  : Code of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Code__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","Code","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Code__is_set = false;

  private java.lang.String Code;

  public java.lang.String getCode() {
    return Code;
  }

  

  public void setCode(java.lang.String Code) {
    this.Code = Code;
    Code__is_set = true;
  }
  
  /**
   * element  : ContractEffectiveDate of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo ContractEffectiveDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","ContractEffectiveDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean ContractEffectiveDate__is_set = false;

  private java.util.Calendar ContractEffectiveDate;

  public java.util.Calendar getContractEffectiveDate() {
    return ContractEffectiveDate;
  }

  

  public void setContractEffectiveDate(java.util.Calendar ContractEffectiveDate) {
    this.ContractEffectiveDate = ContractEffectiveDate;
    ContractEffectiveDate__is_set = true;
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
   * element  : CustomerAcceptanceDate of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo CustomerAcceptanceDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","CustomerAcceptanceDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean CustomerAcceptanceDate__is_set = false;

  private java.util.Calendar CustomerAcceptanceDate;

  public java.util.Calendar getCustomerAcceptanceDate() {
    return CustomerAcceptanceDate;
  }

  

  public void setCustomerAcceptanceDate(java.util.Calendar CustomerAcceptanceDate) {
    this.CustomerAcceptanceDate = CustomerAcceptanceDate;
    CustomerAcceptanceDate__is_set = true;
  }
  
  /**
   * element  : Description of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Description__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","Description","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Description__is_set = false;

  private java.lang.String Description;

  public java.lang.String getDescription() {
    return Description;
  }

  

  public void setDescription(java.lang.String Description) {
    this.Description = Description;
    Description__is_set = true;
  }
  
  /**
   * element  : DestinationAccountId of type {http://api.zuora.com/}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo DestinationAccountId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","DestinationAccountId","http://api.zuora.com/","ID",0,1,true);

  private boolean DestinationAccountId__is_set = false;

  private java.lang.String DestinationAccountId;

  public java.lang.String getDestinationAccountId() {
    return DestinationAccountId;
  }

  

  public void setDestinationAccountId(java.lang.String DestinationAccountId) {
    this.DestinationAccountId = DestinationAccountId;
    DestinationAccountId__is_set = true;
  }
  
  /**
   * element  : EffectiveDate of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo EffectiveDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","EffectiveDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean EffectiveDate__is_set = false;

  private java.util.Calendar EffectiveDate;

  public java.util.Calendar getEffectiveDate() {
    return EffectiveDate;
  }

  

  public void setEffectiveDate(java.util.Calendar EffectiveDate) {
    this.EffectiveDate = EffectiveDate;
    EffectiveDate__is_set = true;
  }
  
  /**
   * element  : InitialTerm of type {http://www.w3.org/2001/XMLSchema}long
   * java type: java.lang.Long
   */
  private static final com.sforce.ws.bind.TypeInfo InitialTerm__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","InitialTerm","http://www.w3.org/2001/XMLSchema","long",0,1,true);

  private boolean InitialTerm__is_set = false;

  private java.lang.Long InitialTerm;

  public java.lang.Long getInitialTerm() {
    return InitialTerm;
  }

  

  public void setInitialTerm(java.lang.Long InitialTerm) {
    this.InitialTerm = InitialTerm;
    InitialTerm__is_set = true;
  }
  
  /**
   * element  : Name of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Name__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","Name","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Name__is_set = false;

  private java.lang.String Name;

  public java.lang.String getName() {
    return Name;
  }

  

  public void setName(java.lang.String Name) {
    this.Name = Name;
    Name__is_set = true;
  }
  
  /**
   * element  : RatePlanData of type {http://api.zuora.com/}RatePlanData
   * java type: com.sforce.soap.RatePlanData
   */
  private static final com.sforce.ws.bind.TypeInfo RatePlanData__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","RatePlanData","http://api.zuora.com/","RatePlanData",0,1,true);

  private boolean RatePlanData__is_set = false;

  private com.zuora.api.object.RatePlanData RatePlanData;

  public com.zuora.api.object.RatePlanData getRatePlanData() {
    return RatePlanData;
  }

  

  public void setRatePlanData(com.zuora.api.object.RatePlanData RatePlanData) {
    this.RatePlanData = RatePlanData;
    RatePlanData__is_set = true;
  }
  
  /**
   * element  : RenewalTerm of type {http://www.w3.org/2001/XMLSchema}long
   * java type: java.lang.Long
   */
  private static final com.sforce.ws.bind.TypeInfo RenewalTerm__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","RenewalTerm","http://www.w3.org/2001/XMLSchema","long",0,1,true);

  private boolean RenewalTerm__is_set = false;

  private java.lang.Long RenewalTerm;

  public java.lang.Long getRenewalTerm() {
    return RenewalTerm;
  }

  

  public void setRenewalTerm(java.lang.Long RenewalTerm) {
    this.RenewalTerm = RenewalTerm;
    RenewalTerm__is_set = true;
  }
  
  /**
   * element  : ServiceActivationDate of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo ServiceActivationDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","ServiceActivationDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean ServiceActivationDate__is_set = false;

  private java.util.Calendar ServiceActivationDate;

  public java.util.Calendar getServiceActivationDate() {
    return ServiceActivationDate;
  }

  

  public void setServiceActivationDate(java.util.Calendar ServiceActivationDate) {
    this.ServiceActivationDate = ServiceActivationDate;
    ServiceActivationDate__is_set = true;
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
   * element  : SubscriptionId of type {http://api.zuora.com/}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo SubscriptionId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","SubscriptionId","http://api.zuora.com/","ID",0,1,true);

  private boolean SubscriptionId__is_set = false;

  private java.lang.String SubscriptionId;

  public java.lang.String getSubscriptionId() {
    return SubscriptionId;
  }

  

  public void setSubscriptionId(java.lang.String SubscriptionId) {
    this.SubscriptionId = SubscriptionId;
    SubscriptionId__is_set = true;
  }
  
  /**
   * element  : TermStartDate of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo TermStartDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","TermStartDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean TermStartDate__is_set = false;

  private java.util.Calendar TermStartDate;

  public java.util.Calendar getTermStartDate() {
    return TermStartDate;
  }

  

  public void setTermStartDate(java.util.Calendar TermStartDate) {
    this.TermStartDate = TermStartDate;
    TermStartDate__is_set = true;
  }
  
  /**
   * element  : TermType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo TermType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","TermType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean TermType__is_set = false;

  private java.lang.String TermType;

  public java.lang.String getTermType() {
    return TermType;
  }

  

  public void setTermType(java.lang.String TermType) {
    this.TermType = TermType;
    TermType__is_set = true;
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
  public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "http://object.api.zuora.com/", "Amendment");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, AutoRenew__typeInfo, AutoRenew, AutoRenew__is_set);
    __typeMapper.writeString(__out, Code__typeInfo, Code, Code__is_set);
    __typeMapper.writeObject(__out, ContractEffectiveDate__typeInfo, ContractEffectiveDate, ContractEffectiveDate__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeObject(__out, CustomerAcceptanceDate__typeInfo, CustomerAcceptanceDate, CustomerAcceptanceDate__is_set);
    __typeMapper.writeString(__out, Description__typeInfo, Description, Description__is_set);
    __typeMapper.writeString(__out, DestinationAccountId__typeInfo, DestinationAccountId, DestinationAccountId__is_set);
    __typeMapper.writeObject(__out, EffectiveDate__typeInfo, EffectiveDate, EffectiveDate__is_set);
    __typeMapper.writeObject(__out, InitialTerm__typeInfo, InitialTerm, InitialTerm__is_set);
    __typeMapper.writeString(__out, Name__typeInfo, Name, Name__is_set);
    __typeMapper.writeObject(__out, RatePlanData__typeInfo, RatePlanData, RatePlanData__is_set);
    __typeMapper.writeObject(__out, RenewalTerm__typeInfo, RenewalTerm, RenewalTerm__is_set);
    __typeMapper.writeObject(__out, ServiceActivationDate__typeInfo, ServiceActivationDate, ServiceActivationDate__is_set);
    __typeMapper.writeString(__out, Status__typeInfo, Status, Status__is_set);
    __typeMapper.writeString(__out, SubscriptionId__typeInfo, SubscriptionId, SubscriptionId__is_set);
    __typeMapper.writeObject(__out, TermStartDate__typeInfo, TermStartDate, TermStartDate__is_set);
    __typeMapper.writeString(__out, TermType__typeInfo, TermType, TermType__is_set);
    __typeMapper.writeString(__out, Type__typeInfo, Type, Type__is_set);
    __typeMapper.writeString(__out, UpdatedById__typeInfo, UpdatedById, UpdatedById__is_set);
    __typeMapper.writeObject(__out, UpdatedDate__typeInfo, UpdatedDate, UpdatedDate__is_set);
  }


  public void load(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
    __typeMapper.consumeStartTag(__in);
    loadFields(__in, __typeMapper);
    __typeMapper.consumeEndTag(__in);
  }

  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
   super.loadFields(__in, __typeMapper);
    __in.peekTag();
    if (__typeMapper.isElement(__in, AutoRenew__typeInfo)) {
      setAutoRenew((java.lang.Boolean)__typeMapper.readObject(__in, AutoRenew__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Code__typeInfo)) {
      setCode(__typeMapper.readString(__in, Code__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ContractEffectiveDate__typeInfo)) {
      setContractEffectiveDate((java.util.Calendar)__typeMapper.readObject(__in, ContractEffectiveDate__typeInfo, java.util.Calendar.class));
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
    if (__typeMapper.isElement(__in, CustomerAcceptanceDate__typeInfo)) {
      setCustomerAcceptanceDate((java.util.Calendar)__typeMapper.readObject(__in, CustomerAcceptanceDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Description__typeInfo)) {
      setDescription(__typeMapper.readString(__in, Description__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, DestinationAccountId__typeInfo)) {
      setDestinationAccountId(__typeMapper.readString(__in, DestinationAccountId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, EffectiveDate__typeInfo)) {
      setEffectiveDate((java.util.Calendar)__typeMapper.readObject(__in, EffectiveDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, InitialTerm__typeInfo)) {
      setInitialTerm((java.lang.Long)__typeMapper.readObject(__in, InitialTerm__typeInfo, java.lang.Long.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Name__typeInfo)) {
      setName(__typeMapper.readString(__in, Name__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RatePlanData__typeInfo)) {
      setRatePlanData((com.zuora.api.object.RatePlanData)__typeMapper.readObject(__in, RatePlanData__typeInfo, com.zuora.api.object.RatePlanData.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RenewalTerm__typeInfo)) {
      setRenewalTerm((java.lang.Long)__typeMapper.readObject(__in, RenewalTerm__typeInfo, java.lang.Long.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ServiceActivationDate__typeInfo)) {
      setServiceActivationDate((java.util.Calendar)__typeMapper.readObject(__in, ServiceActivationDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Status__typeInfo)) {
      setStatus(__typeMapper.readString(__in, Status__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SubscriptionId__typeInfo)) {
      setSubscriptionId(__typeMapper.readString(__in, SubscriptionId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TermStartDate__typeInfo)) {
      setTermStartDate((java.util.Calendar)__typeMapper.readObject(__in, TermStartDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TermType__typeInfo)) {
      setTermType(__typeMapper.readString(__in, TermType__typeInfo, java.lang.String.class));
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
    sb.append("[Amendment ");
    sb.append(super.toString());
    sb.append(" AutoRenew=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AutoRenew)+"'\n");
    sb.append(" Code=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Code)+"'\n");
    sb.append(" ContractEffectiveDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ContractEffectiveDate)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" CustomerAcceptanceDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CustomerAcceptanceDate)+"'\n");
    sb.append(" Description=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Description)+"'\n");
    sb.append(" DestinationAccountId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DestinationAccountId)+"'\n");
    sb.append(" EffectiveDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EffectiveDate)+"'\n");
    sb.append(" InitialTerm=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(InitialTerm)+"'\n");
    sb.append(" Name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Name)+"'\n");
    sb.append(" RatePlanData=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RatePlanData)+"'\n");
    sb.append(" RenewalTerm=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RenewalTerm)+"'\n");
    sb.append(" ServiceActivationDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ServiceActivationDate)+"'\n");
    sb.append(" Status=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Status)+"'\n");
    sb.append(" SubscriptionId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SubscriptionId)+"'\n");
    sb.append(" TermStartDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TermStartDate)+"'\n");
    sb.append(" TermType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TermType)+"'\n");
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