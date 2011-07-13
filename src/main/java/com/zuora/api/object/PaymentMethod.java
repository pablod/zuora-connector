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
public class PaymentMethod extends org.mule.modules.zuora.zobject.StaticZObject {

  /**
   * Constructor
   */
  public PaymentMethod() {
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
   * element  : AchAbaCode of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo AchAbaCode__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","AchAbaCode","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean AchAbaCode__is_set = false;

  private java.lang.String AchAbaCode;

  public java.lang.String getAchAbaCode() {
    return AchAbaCode;
  }

  

  public void setAchAbaCode(java.lang.String AchAbaCode) {
    this.AchAbaCode = AchAbaCode;
    AchAbaCode__is_set = true;
  }
  
  /**
   * element  : AchAccountName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo AchAccountName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","AchAccountName","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean AchAccountName__is_set = false;

  private java.lang.String AchAccountName;

  public java.lang.String getAchAccountName() {
    return AchAccountName;
  }

  

  public void setAchAccountName(java.lang.String AchAccountName) {
    this.AchAccountName = AchAccountName;
    AchAccountName__is_set = true;
  }
  
  /**
   * element  : AchAccountNumber of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo AchAccountNumber__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","AchAccountNumber","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean AchAccountNumber__is_set = false;

  private java.lang.String AchAccountNumber;

  public java.lang.String getAchAccountNumber() {
    return AchAccountNumber;
  }

  

  public void setAchAccountNumber(java.lang.String AchAccountNumber) {
    this.AchAccountNumber = AchAccountNumber;
    AchAccountNumber__is_set = true;
  }
  
  /**
   * element  : AchAccountNumberMask of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo AchAccountNumberMask__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","AchAccountNumberMask","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean AchAccountNumberMask__is_set = false;

  private java.lang.String AchAccountNumberMask;

  public java.lang.String getAchAccountNumberMask() {
    return AchAccountNumberMask;
  }

  

  public void setAchAccountNumberMask(java.lang.String AchAccountNumberMask) {
    this.AchAccountNumberMask = AchAccountNumberMask;
    AchAccountNumberMask__is_set = true;
  }
  
  /**
   * element  : AchAccountType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo AchAccountType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","AchAccountType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean AchAccountType__is_set = false;

  private java.lang.String AchAccountType;

  public java.lang.String getAchAccountType() {
    return AchAccountType;
  }

  

  public void setAchAccountType(java.lang.String AchAccountType) {
    this.AchAccountType = AchAccountType;
    AchAccountType__is_set = true;
  }
  
  /**
   * element  : AchBankName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo AchBankName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","AchBankName","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean AchBankName__is_set = false;

  private java.lang.String AchBankName;

  public java.lang.String getAchBankName() {
    return AchBankName;
  }

  

  public void setAchBankName(java.lang.String AchBankName) {
    this.AchBankName = AchBankName;
    AchBankName__is_set = true;
  }
  
  /**
   * element  : Active of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo Active__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","Active","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean Active__is_set = false;

  private java.lang.Boolean Active;

  public java.lang.Boolean getActive() {
    return Active;
  }

  

  public void setActive(java.lang.Boolean Active) {
    this.Active = Active;
    Active__is_set = true;
  }
  
  /**
   * element  : BankIdentificationNumber of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo BankIdentificationNumber__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","BankIdentificationNumber","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean BankIdentificationNumber__is_set = false;

  private java.lang.String BankIdentificationNumber;

  public java.lang.String getBankIdentificationNumber() {
    return BankIdentificationNumber;
  }

  

  public void setBankIdentificationNumber(java.lang.String BankIdentificationNumber) {
    this.BankIdentificationNumber = BankIdentificationNumber;
    BankIdentificationNumber__is_set = true;
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
   * element  : CreditCardAddress1 of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CreditCardAddress1__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","CreditCardAddress1","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean CreditCardAddress1__is_set = false;

  private java.lang.String CreditCardAddress1;

  public java.lang.String getCreditCardAddress1() {
    return CreditCardAddress1;
  }

  

  public void setCreditCardAddress1(java.lang.String CreditCardAddress1) {
    this.CreditCardAddress1 = CreditCardAddress1;
    CreditCardAddress1__is_set = true;
  }
  
  /**
   * element  : CreditCardAddress2 of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CreditCardAddress2__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","CreditCardAddress2","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean CreditCardAddress2__is_set = false;

  private java.lang.String CreditCardAddress2;

  public java.lang.String getCreditCardAddress2() {
    return CreditCardAddress2;
  }

  

  public void setCreditCardAddress2(java.lang.String CreditCardAddress2) {
    this.CreditCardAddress2 = CreditCardAddress2;
    CreditCardAddress2__is_set = true;
  }
  
  /**
   * element  : CreditCardCity of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CreditCardCity__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","CreditCardCity","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean CreditCardCity__is_set = false;

  private java.lang.String CreditCardCity;

  public java.lang.String getCreditCardCity() {
    return CreditCardCity;
  }

  

  public void setCreditCardCity(java.lang.String CreditCardCity) {
    this.CreditCardCity = CreditCardCity;
    CreditCardCity__is_set = true;
  }
  
  /**
   * element  : CreditCardCountry of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CreditCardCountry__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","CreditCardCountry","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean CreditCardCountry__is_set = false;

  private java.lang.String CreditCardCountry;

  public java.lang.String getCreditCardCountry() {
    return CreditCardCountry;
  }

  

  public void setCreditCardCountry(java.lang.String CreditCardCountry) {
    this.CreditCardCountry = CreditCardCountry;
    CreditCardCountry__is_set = true;
  }
  
  /**
   * element  : CreditCardExpirationMonth of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo CreditCardExpirationMonth__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","CreditCardExpirationMonth","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean CreditCardExpirationMonth__is_set = false;

  private java.lang.Integer CreditCardExpirationMonth;

  public java.lang.Integer getCreditCardExpirationMonth() {
    return CreditCardExpirationMonth;
  }

  

  public void setCreditCardExpirationMonth(java.lang.Integer CreditCardExpirationMonth) {
    this.CreditCardExpirationMonth = CreditCardExpirationMonth;
    CreditCardExpirationMonth__is_set = true;
  }
  
  /**
   * element  : CreditCardExpirationYear of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo CreditCardExpirationYear__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","CreditCardExpirationYear","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean CreditCardExpirationYear__is_set = false;

  private java.lang.Integer CreditCardExpirationYear;

  public java.lang.Integer getCreditCardExpirationYear() {
    return CreditCardExpirationYear;
  }

  

  public void setCreditCardExpirationYear(java.lang.Integer CreditCardExpirationYear) {
    this.CreditCardExpirationYear = CreditCardExpirationYear;
    CreditCardExpirationYear__is_set = true;
  }
  
  /**
   * element  : CreditCardHolderName of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CreditCardHolderName__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","CreditCardHolderName","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean CreditCardHolderName__is_set = false;

  private java.lang.String CreditCardHolderName;

  public java.lang.String getCreditCardHolderName() {
    return CreditCardHolderName;
  }

  

  public void setCreditCardHolderName(java.lang.String CreditCardHolderName) {
    this.CreditCardHolderName = CreditCardHolderName;
    CreditCardHolderName__is_set = true;
  }
  
  /**
   * element  : CreditCardMaskNumber of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CreditCardMaskNumber__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","CreditCardMaskNumber","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean CreditCardMaskNumber__is_set = false;

  private java.lang.String CreditCardMaskNumber;

  public java.lang.String getCreditCardMaskNumber() {
    return CreditCardMaskNumber;
  }

  

  public void setCreditCardMaskNumber(java.lang.String CreditCardMaskNumber) {
    this.CreditCardMaskNumber = CreditCardMaskNumber;
    CreditCardMaskNumber__is_set = true;
  }
  
  /**
   * element  : CreditCardNumber of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CreditCardNumber__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","CreditCardNumber","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean CreditCardNumber__is_set = false;

  private java.lang.String CreditCardNumber;

  public java.lang.String getCreditCardNumber() {
    return CreditCardNumber;
  }

  

  public void setCreditCardNumber(java.lang.String CreditCardNumber) {
    this.CreditCardNumber = CreditCardNumber;
    CreditCardNumber__is_set = true;
  }
  
  /**
   * element  : CreditCardPostalCode of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CreditCardPostalCode__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","CreditCardPostalCode","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean CreditCardPostalCode__is_set = false;

  private java.lang.String CreditCardPostalCode;

  public java.lang.String getCreditCardPostalCode() {
    return CreditCardPostalCode;
  }

  

  public void setCreditCardPostalCode(java.lang.String CreditCardPostalCode) {
    this.CreditCardPostalCode = CreditCardPostalCode;
    CreditCardPostalCode__is_set = true;
  }
  
  /**
   * element  : CreditCardSecurityCode of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CreditCardSecurityCode__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","CreditCardSecurityCode","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean CreditCardSecurityCode__is_set = false;

  private java.lang.String CreditCardSecurityCode;

  public java.lang.String getCreditCardSecurityCode() {
    return CreditCardSecurityCode;
  }

  

  public void setCreditCardSecurityCode(java.lang.String CreditCardSecurityCode) {
    this.CreditCardSecurityCode = CreditCardSecurityCode;
    CreditCardSecurityCode__is_set = true;
  }
  
  /**
   * element  : CreditCardState of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CreditCardState__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","CreditCardState","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean CreditCardState__is_set = false;

  private java.lang.String CreditCardState;

  public java.lang.String getCreditCardState() {
    return CreditCardState;
  }

  

  public void setCreditCardState(java.lang.String CreditCardState) {
    this.CreditCardState = CreditCardState;
    CreditCardState__is_set = true;
  }
  
  /**
   * element  : CreditCardType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo CreditCardType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","CreditCardType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean CreditCardType__is_set = false;

  private java.lang.String CreditCardType;

  public java.lang.String getCreditCardType() {
    return CreditCardType;
  }

  

  public void setCreditCardType(java.lang.String CreditCardType) {
    this.CreditCardType = CreditCardType;
    CreditCardType__is_set = true;
  }
  
  /**
   * element  : DeviceSessionId of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo DeviceSessionId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","DeviceSessionId","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean DeviceSessionId__is_set = false;

  private java.lang.String DeviceSessionId;

  public java.lang.String getDeviceSessionId() {
    return DeviceSessionId;
  }

  

  public void setDeviceSessionId(java.lang.String DeviceSessionId) {
    this.DeviceSessionId = DeviceSessionId;
    DeviceSessionId__is_set = true;
  }
  
  /**
   * element  : Email of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Email__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","Email","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Email__is_set = false;

  private java.lang.String Email;

  public java.lang.String getEmail() {
    return Email;
  }

  

  public void setEmail(java.lang.String Email) {
    this.Email = Email;
    Email__is_set = true;
  }
  
  /**
   * element  : IPAddress of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo IPAddress__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","IPAddress","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean IPAddress__is_set = false;

  private java.lang.String IPAddress;

  public java.lang.String getIPAddress() {
    return IPAddress;
  }

  

  public void setIPAddress(java.lang.String IPAddress) {
    this.IPAddress = IPAddress;
    IPAddress__is_set = true;
  }
  
  /**
   * element  : LastFailedSaleTransactionDate of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo LastFailedSaleTransactionDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","LastFailedSaleTransactionDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean LastFailedSaleTransactionDate__is_set = false;

  private java.util.Calendar LastFailedSaleTransactionDate;

  public java.util.Calendar getLastFailedSaleTransactionDate() {
    return LastFailedSaleTransactionDate;
  }

  

  public void setLastFailedSaleTransactionDate(java.util.Calendar LastFailedSaleTransactionDate) {
    this.LastFailedSaleTransactionDate = LastFailedSaleTransactionDate;
    LastFailedSaleTransactionDate__is_set = true;
  }
  
  /**
   * element  : LastTransactionDateTime of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo LastTransactionDateTime__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","LastTransactionDateTime","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean LastTransactionDateTime__is_set = false;

  private java.util.Calendar LastTransactionDateTime;

  public java.util.Calendar getLastTransactionDateTime() {
    return LastTransactionDateTime;
  }

  

  public void setLastTransactionDateTime(java.util.Calendar LastTransactionDateTime) {
    this.LastTransactionDateTime = LastTransactionDateTime;
    LastTransactionDateTime__is_set = true;
  }
  
  /**
   * element  : LastTransactionStatus of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo LastTransactionStatus__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","LastTransactionStatus","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean LastTransactionStatus__is_set = false;

  private java.lang.String LastTransactionStatus;

  public java.lang.String getLastTransactionStatus() {
    return LastTransactionStatus;
  }

  

  public void setLastTransactionStatus(java.lang.String LastTransactionStatus) {
    this.LastTransactionStatus = LastTransactionStatus;
    LastTransactionStatus__is_set = true;
  }
  
  /**
   * element  : MaxConsecutivePaymentFailures of type {http://www.w3.org/2001/XMLSchema}short
   * java type: com.sforce.soap.XMLSchema.Short
   */
  private static final com.sforce.ws.bind.TypeInfo MaxConsecutivePaymentFailures__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","MaxConsecutivePaymentFailures","http://www.w3.org/2001/XMLSchema","short",0,1,true);

  private boolean MaxConsecutivePaymentFailures__is_set = false;

  private Short MaxConsecutivePaymentFailures;

  public Short getMaxConsecutivePaymentFailures() {
    return MaxConsecutivePaymentFailures;
  }

  

  public void setMaxConsecutivePaymentFailures(Short MaxConsecutivePaymentFailures) {
    this.MaxConsecutivePaymentFailures = MaxConsecutivePaymentFailures;
    MaxConsecutivePaymentFailures__is_set = true;
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
   * element  : NumConsecutiveFailures of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo NumConsecutiveFailures__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","NumConsecutiveFailures","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean NumConsecutiveFailures__is_set = false;

  private java.lang.Integer NumConsecutiveFailures;

  public java.lang.Integer getNumConsecutiveFailures() {
    return NumConsecutiveFailures;
  }

  

  public void setNumConsecutiveFailures(java.lang.Integer NumConsecutiveFailures) {
    this.NumConsecutiveFailures = NumConsecutiveFailures;
    NumConsecutiveFailures__is_set = true;
  }
  
  /**
   * element  : PaymentRetryWindow of type {http://www.w3.org/2001/XMLSchema}short
   * java type: com.sforce.soap.XMLSchema.Short
   */
  private static final com.sforce.ws.bind.TypeInfo PaymentRetryWindow__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","PaymentRetryWindow","http://www.w3.org/2001/XMLSchema","short",0,1,true);

  private boolean PaymentRetryWindow__is_set = false;

  private Short PaymentRetryWindow;

  public Short getPaymentRetryWindow() {
    return PaymentRetryWindow;
  }

  

  public void setPaymentRetryWindow(Short PaymentRetryWindow) {
    this.PaymentRetryWindow = PaymentRetryWindow;
    PaymentRetryWindow__is_set = true;
  }
  
  /**
   * element  : PaypalBaid of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo PaypalBaid__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","PaypalBaid","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean PaypalBaid__is_set = false;

  private java.lang.String PaypalBaid;

  public java.lang.String getPaypalBaid() {
    return PaypalBaid;
  }

  

  public void setPaypalBaid(java.lang.String PaypalBaid) {
    this.PaypalBaid = PaypalBaid;
    PaypalBaid__is_set = true;
  }
  
  /**
   * element  : PaypalEmail of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo PaypalEmail__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","PaypalEmail","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean PaypalEmail__is_set = false;

  private java.lang.String PaypalEmail;

  public java.lang.String getPaypalEmail() {
    return PaypalEmail;
  }

  

  public void setPaypalEmail(java.lang.String PaypalEmail) {
    this.PaypalEmail = PaypalEmail;
    PaypalEmail__is_set = true;
  }
  
  /**
   * element  : PaypalPreapprovalKey of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo PaypalPreapprovalKey__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","PaypalPreapprovalKey","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean PaypalPreapprovalKey__is_set = false;

  private java.lang.String PaypalPreapprovalKey;

  public java.lang.String getPaypalPreapprovalKey() {
    return PaypalPreapprovalKey;
  }

  

  public void setPaypalPreapprovalKey(java.lang.String PaypalPreapprovalKey) {
    this.PaypalPreapprovalKey = PaypalPreapprovalKey;
    PaypalPreapprovalKey__is_set = true;
  }
  
  /**
   * element  : PaypalType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo PaypalType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","PaypalType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean PaypalType__is_set = false;

  private java.lang.String PaypalType;

  public java.lang.String getPaypalType() {
    return PaypalType;
  }

  

  public void setPaypalType(java.lang.String PaypalType) {
    this.PaypalType = PaypalType;
    PaypalType__is_set = true;
  }
  
  /**
   * element  : Phone of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Phone__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","Phone","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Phone__is_set = false;

  private java.lang.String Phone;

  public java.lang.String getPhone() {
    return Phone;
  }

  

  public void setPhone(java.lang.String Phone) {
    this.Phone = Phone;
    Phone__is_set = true;
  }
  
  /**
   * element  : SkipValidation of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo SkipValidation__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","SkipValidation","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean SkipValidation__is_set = false;

  private java.lang.Boolean SkipValidation;

  public java.lang.Boolean getSkipValidation() {
    return SkipValidation;
  }

  

  public void setSkipValidation(java.lang.Boolean SkipValidation) {
    this.SkipValidation = SkipValidation;
    SkipValidation__is_set = true;
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
   * element  : UseDefaultRetryRule of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo UseDefaultRetryRule__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","UseDefaultRetryRule","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean UseDefaultRetryRule__is_set = false;

  private java.lang.Boolean UseDefaultRetryRule;

  public java.lang.Boolean getUseDefaultRetryRule() {
    return UseDefaultRetryRule;
  }

  

  public void setUseDefaultRetryRule(java.lang.Boolean UseDefaultRetryRule) {
    this.UseDefaultRetryRule = UseDefaultRetryRule;
    UseDefaultRetryRule__is_set = true;
  }
  

  /**
   */
  @Override
public void write(javax.xml.namespace.QName __element,
      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
      throws java.io.IOException {
    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
    __typeMapper.writeXsiType(__out, "http://object.api.zuora.com/", "PaymentMethod");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  @Override
protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, AccountId__typeInfo, AccountId, AccountId__is_set);
    __typeMapper.writeString(__out, AchAbaCode__typeInfo, AchAbaCode, AchAbaCode__is_set);
    __typeMapper.writeString(__out, AchAccountName__typeInfo, AchAccountName, AchAccountName__is_set);
    __typeMapper.writeString(__out, AchAccountNumber__typeInfo, AchAccountNumber, AchAccountNumber__is_set);
    __typeMapper.writeString(__out, AchAccountNumberMask__typeInfo, AchAccountNumberMask, AchAccountNumberMask__is_set);
    __typeMapper.writeString(__out, AchAccountType__typeInfo, AchAccountType, AchAccountType__is_set);
    __typeMapper.writeString(__out, AchBankName__typeInfo, AchBankName, AchBankName__is_set);
    __typeMapper.writeObject(__out, Active__typeInfo, Active, Active__is_set);
    __typeMapper.writeString(__out, BankIdentificationNumber__typeInfo, BankIdentificationNumber, BankIdentificationNumber__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeString(__out, CreditCardAddress1__typeInfo, CreditCardAddress1, CreditCardAddress1__is_set);
    __typeMapper.writeString(__out, CreditCardAddress2__typeInfo, CreditCardAddress2, CreditCardAddress2__is_set);
    __typeMapper.writeString(__out, CreditCardCity__typeInfo, CreditCardCity, CreditCardCity__is_set);
    __typeMapper.writeString(__out, CreditCardCountry__typeInfo, CreditCardCountry, CreditCardCountry__is_set);
    __typeMapper.writeObject(__out, CreditCardExpirationMonth__typeInfo, CreditCardExpirationMonth, CreditCardExpirationMonth__is_set);
    __typeMapper.writeObject(__out, CreditCardExpirationYear__typeInfo, CreditCardExpirationYear, CreditCardExpirationYear__is_set);
    __typeMapper.writeString(__out, CreditCardHolderName__typeInfo, CreditCardHolderName, CreditCardHolderName__is_set);
    __typeMapper.writeString(__out, CreditCardMaskNumber__typeInfo, CreditCardMaskNumber, CreditCardMaskNumber__is_set);
    __typeMapper.writeString(__out, CreditCardNumber__typeInfo, CreditCardNumber, CreditCardNumber__is_set);
    __typeMapper.writeString(__out, CreditCardPostalCode__typeInfo, CreditCardPostalCode, CreditCardPostalCode__is_set);
    __typeMapper.writeString(__out, CreditCardSecurityCode__typeInfo, CreditCardSecurityCode, CreditCardSecurityCode__is_set);
    __typeMapper.writeString(__out, CreditCardState__typeInfo, CreditCardState, CreditCardState__is_set);
    __typeMapper.writeString(__out, CreditCardType__typeInfo, CreditCardType, CreditCardType__is_set);
    __typeMapper.writeString(__out, DeviceSessionId__typeInfo, DeviceSessionId, DeviceSessionId__is_set);
    __typeMapper.writeString(__out, Email__typeInfo, Email, Email__is_set);
    __typeMapper.writeString(__out, IPAddress__typeInfo, IPAddress, IPAddress__is_set);
    __typeMapper.writeObject(__out, LastFailedSaleTransactionDate__typeInfo, LastFailedSaleTransactionDate, LastFailedSaleTransactionDate__is_set);
    __typeMapper.writeObject(__out, LastTransactionDateTime__typeInfo, LastTransactionDateTime, LastTransactionDateTime__is_set);
    __typeMapper.writeString(__out, LastTransactionStatus__typeInfo, LastTransactionStatus, LastTransactionStatus__is_set);
    __typeMapper.writeObject(__out, MaxConsecutivePaymentFailures__typeInfo, MaxConsecutivePaymentFailures, MaxConsecutivePaymentFailures__is_set);
    __typeMapper.writeString(__out, Name__typeInfo, Name, Name__is_set);
    __typeMapper.writeObject(__out, NumConsecutiveFailures__typeInfo, NumConsecutiveFailures, NumConsecutiveFailures__is_set);
    __typeMapper.writeObject(__out, PaymentRetryWindow__typeInfo, PaymentRetryWindow, PaymentRetryWindow__is_set);
    __typeMapper.writeString(__out, PaypalBaid__typeInfo, PaypalBaid, PaypalBaid__is_set);
    __typeMapper.writeString(__out, PaypalEmail__typeInfo, PaypalEmail, PaypalEmail__is_set);
    __typeMapper.writeString(__out, PaypalPreapprovalKey__typeInfo, PaypalPreapprovalKey, PaypalPreapprovalKey__is_set);
    __typeMapper.writeString(__out, PaypalType__typeInfo, PaypalType, PaypalType__is_set);
    __typeMapper.writeString(__out, Phone__typeInfo, Phone, Phone__is_set);
    __typeMapper.writeObject(__out, SkipValidation__typeInfo, SkipValidation, SkipValidation__is_set);
    __typeMapper.writeString(__out, Type__typeInfo, Type, Type__is_set);
    __typeMapper.writeString(__out, UpdatedById__typeInfo, UpdatedById, UpdatedById__is_set);
    __typeMapper.writeObject(__out, UpdatedDate__typeInfo, UpdatedDate, UpdatedDate__is_set);
    __typeMapper.writeObject(__out, UseDefaultRetryRule__typeInfo, UseDefaultRetryRule, UseDefaultRetryRule__is_set);
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
    if (__typeMapper.isElement(__in, AchAbaCode__typeInfo)) {
      setAchAbaCode(__typeMapper.readString(__in, AchAbaCode__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AchAccountName__typeInfo)) {
      setAchAccountName(__typeMapper.readString(__in, AchAccountName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AchAccountNumber__typeInfo)) {
      setAchAccountNumber(__typeMapper.readString(__in, AchAccountNumber__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AchAccountNumberMask__typeInfo)) {
      setAchAccountNumberMask(__typeMapper.readString(__in, AchAccountNumberMask__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AchAccountType__typeInfo)) {
      setAchAccountType(__typeMapper.readString(__in, AchAccountType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AchBankName__typeInfo)) {
      setAchBankName(__typeMapper.readString(__in, AchBankName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Active__typeInfo)) {
      setActive((java.lang.Boolean)__typeMapper.readObject(__in, Active__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, BankIdentificationNumber__typeInfo)) {
      setBankIdentificationNumber(__typeMapper.readString(__in, BankIdentificationNumber__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, CreditCardAddress1__typeInfo)) {
      setCreditCardAddress1(__typeMapper.readString(__in, CreditCardAddress1__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CreditCardAddress2__typeInfo)) {
      setCreditCardAddress2(__typeMapper.readString(__in, CreditCardAddress2__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CreditCardCity__typeInfo)) {
      setCreditCardCity(__typeMapper.readString(__in, CreditCardCity__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CreditCardCountry__typeInfo)) {
      setCreditCardCountry(__typeMapper.readString(__in, CreditCardCountry__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CreditCardExpirationMonth__typeInfo)) {
      setCreditCardExpirationMonth((java.lang.Integer)__typeMapper.readObject(__in, CreditCardExpirationMonth__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CreditCardExpirationYear__typeInfo)) {
      setCreditCardExpirationYear((java.lang.Integer)__typeMapper.readObject(__in, CreditCardExpirationYear__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CreditCardHolderName__typeInfo)) {
      setCreditCardHolderName(__typeMapper.readString(__in, CreditCardHolderName__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CreditCardMaskNumber__typeInfo)) {
      setCreditCardMaskNumber(__typeMapper.readString(__in, CreditCardMaskNumber__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CreditCardNumber__typeInfo)) {
      setCreditCardNumber(__typeMapper.readString(__in, CreditCardNumber__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CreditCardPostalCode__typeInfo)) {
      setCreditCardPostalCode(__typeMapper.readString(__in, CreditCardPostalCode__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CreditCardSecurityCode__typeInfo)) {
      setCreditCardSecurityCode(__typeMapper.readString(__in, CreditCardSecurityCode__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CreditCardState__typeInfo)) {
      setCreditCardState(__typeMapper.readString(__in, CreditCardState__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CreditCardType__typeInfo)) {
      setCreditCardType(__typeMapper.readString(__in, CreditCardType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, DeviceSessionId__typeInfo)) {
      setDeviceSessionId(__typeMapper.readString(__in, DeviceSessionId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Email__typeInfo)) {
      setEmail(__typeMapper.readString(__in, Email__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IPAddress__typeInfo)) {
      setIPAddress(__typeMapper.readString(__in, IPAddress__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LastFailedSaleTransactionDate__typeInfo)) {
      setLastFailedSaleTransactionDate((java.util.Calendar)__typeMapper.readObject(__in, LastFailedSaleTransactionDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LastTransactionDateTime__typeInfo)) {
      setLastTransactionDateTime((java.util.Calendar)__typeMapper.readObject(__in, LastTransactionDateTime__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LastTransactionStatus__typeInfo)) {
      setLastTransactionStatus(__typeMapper.readString(__in, LastTransactionStatus__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, MaxConsecutivePaymentFailures__typeInfo)) {
      setMaxConsecutivePaymentFailures((Short)__typeMapper.readObject(__in, MaxConsecutivePaymentFailures__typeInfo, Short.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Name__typeInfo)) {
      setName(__typeMapper.readString(__in, Name__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, NumConsecutiveFailures__typeInfo)) {
      setNumConsecutiveFailures((java.lang.Integer)__typeMapper.readObject(__in, NumConsecutiveFailures__typeInfo, java.lang.Integer.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PaymentRetryWindow__typeInfo)) {
      setPaymentRetryWindow((Short)__typeMapper.readObject(__in, PaymentRetryWindow__typeInfo, Short.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PaypalBaid__typeInfo)) {
      setPaypalBaid(__typeMapper.readString(__in, PaypalBaid__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PaypalEmail__typeInfo)) {
      setPaypalEmail(__typeMapper.readString(__in, PaypalEmail__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PaypalPreapprovalKey__typeInfo)) {
      setPaypalPreapprovalKey(__typeMapper.readString(__in, PaypalPreapprovalKey__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PaypalType__typeInfo)) {
      setPaypalType(__typeMapper.readString(__in, PaypalType__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Phone__typeInfo)) {
      setPhone(__typeMapper.readString(__in, Phone__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SkipValidation__typeInfo)) {
      setSkipValidation((java.lang.Boolean)__typeMapper.readObject(__in, SkipValidation__typeInfo, java.lang.Boolean.class));
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
    __in.peekTag();
    if (__typeMapper.isElement(__in, UseDefaultRetryRule__typeInfo)) {
      setUseDefaultRetryRule((java.lang.Boolean)__typeMapper.readObject(__in, UseDefaultRetryRule__typeInfo, java.lang.Boolean.class));
    }
  }

  @Override
public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[PaymentMethod ");
    sb.append(super.toString());
    sb.append(" AccountId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AccountId)+"'\n");
    sb.append(" AchAbaCode=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AchAbaCode)+"'\n");
    sb.append(" AchAccountName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AchAccountName)+"'\n");
    sb.append(" AchAccountNumber=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AchAccountNumber)+"'\n");
    sb.append(" AchAccountNumberMask=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AchAccountNumberMask)+"'\n");
    sb.append(" AchAccountType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AchAccountType)+"'\n");
    sb.append(" AchBankName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AchBankName)+"'\n");
    sb.append(" Active=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Active)+"'\n");
    sb.append(" BankIdentificationNumber=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(BankIdentificationNumber)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" CreditCardAddress1=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreditCardAddress1)+"'\n");
    sb.append(" CreditCardAddress2=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreditCardAddress2)+"'\n");
    sb.append(" CreditCardCity=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreditCardCity)+"'\n");
    sb.append(" CreditCardCountry=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreditCardCountry)+"'\n");
    sb.append(" CreditCardExpirationMonth=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreditCardExpirationMonth)+"'\n");
    sb.append(" CreditCardExpirationYear=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreditCardExpirationYear)+"'\n");
    sb.append(" CreditCardHolderName=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreditCardHolderName)+"'\n");
    sb.append(" CreditCardMaskNumber=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreditCardMaskNumber)+"'\n");
    sb.append(" CreditCardNumber=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreditCardNumber)+"'\n");
    sb.append(" CreditCardPostalCode=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreditCardPostalCode)+"'\n");
    sb.append(" CreditCardSecurityCode=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreditCardSecurityCode)+"'\n");
    sb.append(" CreditCardState=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreditCardState)+"'\n");
    sb.append(" CreditCardType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreditCardType)+"'\n");
    sb.append(" DeviceSessionId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(DeviceSessionId)+"'\n");
    sb.append(" Email=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Email)+"'\n");
    sb.append(" IPAddress=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IPAddress)+"'\n");
    sb.append(" LastFailedSaleTransactionDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastFailedSaleTransactionDate)+"'\n");
    sb.append(" LastTransactionDateTime=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastTransactionDateTime)+"'\n");
    sb.append(" LastTransactionStatus=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LastTransactionStatus)+"'\n");
    sb.append(" MaxConsecutivePaymentFailures=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(MaxConsecutivePaymentFailures)+"'\n");
    sb.append(" Name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Name)+"'\n");
    sb.append(" NumConsecutiveFailures=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(NumConsecutiveFailures)+"'\n");
    sb.append(" PaymentRetryWindow=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PaymentRetryWindow)+"'\n");
    sb.append(" PaypalBaid=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PaypalBaid)+"'\n");
    sb.append(" PaypalEmail=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PaypalEmail)+"'\n");
    sb.append(" PaypalPreapprovalKey=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PaypalPreapprovalKey)+"'\n");
    sb.append(" PaypalType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PaypalType)+"'\n");
    sb.append(" Phone=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Phone)+"'\n");
    sb.append(" SkipValidation=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SkipValidation)+"'\n");
    sb.append(" Type=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Type)+"'\n");
    sb.append(" UpdatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UpdatedById)+"'\n");
    sb.append(" UpdatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UpdatedDate)+"'\n");
    sb.append(" UseDefaultRetryRule=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UseDefaultRetryRule)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}