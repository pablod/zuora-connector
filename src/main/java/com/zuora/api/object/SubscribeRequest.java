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
public class SubscribeRequest implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public SubscribeRequest() {
  }
    
  
  /**
   * element  : Account of type {http://object.api.zuora.com/}Account
   * java type: com.sforce.soap.Account
   */
  private static final com.sforce.ws.bind.TypeInfo Account__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","Account","http://object.api.zuora.com/","Account",0,1,true);

  private boolean Account__is_set = false;

  private com.zuora.api.object.Account Account;

  public com.zuora.api.object.Account getAccount() {
    return Account;
  }

  

  public void setAccount(com.zuora.api.object.Account Account) {
    this.Account = Account;
    Account__is_set = true;
  }
  
  /**
   * element  : PaymentMethod of type {http://object.api.zuora.com/}PaymentMethod
   * java type: com.sforce.soap.PaymentMethod
   */
  private static final com.sforce.ws.bind.TypeInfo PaymentMethod__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","PaymentMethod","http://object.api.zuora.com/","PaymentMethod",0,1,true);

  private boolean PaymentMethod__is_set = false;

  private com.zuora.api.object.PaymentMethod PaymentMethod;

  public com.zuora.api.object.PaymentMethod getPaymentMethod() {
    return PaymentMethod;
  }

  

  public void setPaymentMethod(com.zuora.api.object.PaymentMethod PaymentMethod) {
    this.PaymentMethod = PaymentMethod;
    PaymentMethod__is_set = true;
  }
  
  /**
   * element  : BillToContact of type {http://object.api.zuora.com/}Contact
   * java type: com.sforce.soap.Contact
   */
  private static final com.sforce.ws.bind.TypeInfo BillToContact__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","BillToContact","http://object.api.zuora.com/","Contact",0,1,true);

  private boolean BillToContact__is_set = false;

  private com.zuora.api.object.Contact BillToContact;

  public com.zuora.api.object.Contact getBillToContact() {
    return BillToContact;
  }

  

  public void setBillToContact(com.zuora.api.object.Contact BillToContact) {
    this.BillToContact = BillToContact;
    BillToContact__is_set = true;
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
   * element  : SoldToContact of type {http://object.api.zuora.com/}Contact
   * java type: com.sforce.soap.Contact
   */
  private static final com.sforce.ws.bind.TypeInfo SoldToContact__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","SoldToContact","http://object.api.zuora.com/","Contact",0,1,true);

  private boolean SoldToContact__is_set = false;

  private com.zuora.api.object.Contact SoldToContact;

  public com.zuora.api.object.Contact getSoldToContact() {
    return SoldToContact;
  }

  

  public void setSoldToContact(com.zuora.api.object.Contact SoldToContact) {
    this.SoldToContact = SoldToContact;
    SoldToContact__is_set = true;
  }
  
  /**
   * element  : SubscribeOptions of type {http://api.zuora.com/}SubscribeOptions
   * java type: com.sforce.soap.SubscribeOptions
   */
  private static final com.sforce.ws.bind.TypeInfo SubscribeOptions__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","SubscribeOptions","http://api.zuora.com/","SubscribeOptions",0,1,true);

  private boolean SubscribeOptions__is_set = false;

  private com.zuora.api.object.SubscribeOptions SubscribeOptions;

  public com.zuora.api.object.SubscribeOptions getSubscribeOptions() {
    return SubscribeOptions;
  }

  

  public void setSubscribeOptions(com.zuora.api.object.SubscribeOptions SubscribeOptions) {
    this.SubscribeOptions = SubscribeOptions;
    SubscribeOptions__is_set = true;
  }
  
  /**
   * element  : SubscriptionData of type {http://api.zuora.com/}SubscriptionData
   * java type: com.sforce.soap.SubscriptionData
   */
  private static final com.sforce.ws.bind.TypeInfo SubscriptionData__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","SubscriptionData","http://api.zuora.com/","SubscriptionData",0,1,true);

  private boolean SubscriptionData__is_set = false;

  private com.zuora.api.object.SubscriptionData SubscriptionData;

  public com.zuora.api.object.SubscriptionData getSubscriptionData() {
    return SubscriptionData;
  }

  

  public void setSubscriptionData(com.zuora.api.object.SubscriptionData SubscriptionData) {
    this.SubscriptionData = SubscriptionData;
    SubscriptionData__is_set = true;
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
   
    __typeMapper.writeObject(__out, Account__typeInfo, Account, Account__is_set);
    __typeMapper.writeObject(__out, PaymentMethod__typeInfo, PaymentMethod, PaymentMethod__is_set);
    __typeMapper.writeObject(__out, BillToContact__typeInfo, BillToContact, BillToContact__is_set);
    __typeMapper.writeObject(__out, PreviewOptions__typeInfo, PreviewOptions, PreviewOptions__is_set);
    __typeMapper.writeObject(__out, SoldToContact__typeInfo, SoldToContact, SoldToContact__is_set);
    __typeMapper.writeObject(__out, SubscribeOptions__typeInfo, SubscribeOptions, SubscribeOptions__is_set);
    __typeMapper.writeObject(__out, SubscriptionData__typeInfo, SubscriptionData, SubscriptionData__is_set);
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
    if (__typeMapper.isElement(__in, Account__typeInfo)) {
      setAccount((com.zuora.api.object.Account)__typeMapper.readObject(__in, Account__typeInfo, com.zuora.api.object.Account.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PaymentMethod__typeInfo)) {
      setPaymentMethod((com.zuora.api.object.PaymentMethod)__typeMapper.readObject(__in, PaymentMethod__typeInfo, com.zuora.api.object.PaymentMethod.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, BillToContact__typeInfo)) {
      setBillToContact((com.zuora.api.object.Contact)__typeMapper.readObject(__in, BillToContact__typeInfo, com.zuora.api.object.Contact.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PreviewOptions__typeInfo)) {
      setPreviewOptions((com.zuora.api.object.PreviewOptions)__typeMapper.readObject(__in, PreviewOptions__typeInfo, com.zuora.api.object.PreviewOptions.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SoldToContact__typeInfo)) {
      setSoldToContact((com.zuora.api.object.Contact)__typeMapper.readObject(__in, SoldToContact__typeInfo, com.zuora.api.object.Contact.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SubscribeOptions__typeInfo)) {
      setSubscribeOptions((com.zuora.api.object.SubscribeOptions)__typeMapper.readObject(__in, SubscribeOptions__typeInfo, com.zuora.api.object.SubscribeOptions.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SubscriptionData__typeInfo)) {
      setSubscriptionData((com.zuora.api.object.SubscriptionData)__typeMapper.readObject(__in, SubscriptionData__typeInfo, com.zuora.api.object.SubscriptionData.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[SubscribeRequest ");
    
    sb.append(" Account=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Account)+"'\n");
    sb.append(" PaymentMethod=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PaymentMethod)+"'\n");
    sb.append(" BillToContact=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(BillToContact)+"'\n");
    sb.append(" PreviewOptions=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PreviewOptions)+"'\n");
    sb.append(" SoldToContact=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SoldToContact)+"'\n");
    sb.append(" SubscribeOptions=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SubscribeOptions)+"'\n");
    sb.append(" SubscriptionData=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SubscriptionData)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}