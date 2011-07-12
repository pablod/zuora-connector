package com.sforce.soap;

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

  private com.sforce.soap.Account Account;

  public com.sforce.soap.Account getAccount() {
    return Account;
  }

  

  public void setAccount(com.sforce.soap.Account Account) {
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

  private com.sforce.soap.PaymentMethod PaymentMethod;

  public com.sforce.soap.PaymentMethod getPaymentMethod() {
    return PaymentMethod;
  }

  

  public void setPaymentMethod(com.sforce.soap.PaymentMethod PaymentMethod) {
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

  private com.sforce.soap.Contact BillToContact;

  public com.sforce.soap.Contact getBillToContact() {
    return BillToContact;
  }

  

  public void setBillToContact(com.sforce.soap.Contact BillToContact) {
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

  private com.sforce.soap.PreviewOptions PreviewOptions;

  public com.sforce.soap.PreviewOptions getPreviewOptions() {
    return PreviewOptions;
  }

  

  public void setPreviewOptions(com.sforce.soap.PreviewOptions PreviewOptions) {
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

  private com.sforce.soap.Contact SoldToContact;

  public com.sforce.soap.Contact getSoldToContact() {
    return SoldToContact;
  }

  

  public void setSoldToContact(com.sforce.soap.Contact SoldToContact) {
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

  private com.sforce.soap.SubscribeOptions SubscribeOptions;

  public com.sforce.soap.SubscribeOptions getSubscribeOptions() {
    return SubscribeOptions;
  }

  

  public void setSubscribeOptions(com.sforce.soap.SubscribeOptions SubscribeOptions) {
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

  private com.sforce.soap.SubscriptionData SubscriptionData;

  public com.sforce.soap.SubscriptionData getSubscriptionData() {
    return SubscriptionData;
  }

  

  public void setSubscriptionData(com.sforce.soap.SubscriptionData SubscriptionData) {
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
      setAccount((com.sforce.soap.Account)__typeMapper.readObject(__in, Account__typeInfo, com.sforce.soap.Account.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PaymentMethod__typeInfo)) {
      setPaymentMethod((com.sforce.soap.PaymentMethod)__typeMapper.readObject(__in, PaymentMethod__typeInfo, com.sforce.soap.PaymentMethod.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, BillToContact__typeInfo)) {
      setBillToContact((com.sforce.soap.Contact)__typeMapper.readObject(__in, BillToContact__typeInfo, com.sforce.soap.Contact.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PreviewOptions__typeInfo)) {
      setPreviewOptions((com.sforce.soap.PreviewOptions)__typeMapper.readObject(__in, PreviewOptions__typeInfo, com.sforce.soap.PreviewOptions.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SoldToContact__typeInfo)) {
      setSoldToContact((com.sforce.soap.Contact)__typeMapper.readObject(__in, SoldToContact__typeInfo, com.sforce.soap.Contact.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SubscribeOptions__typeInfo)) {
      setSubscribeOptions((com.sforce.soap.SubscribeOptions)__typeMapper.readObject(__in, SubscribeOptions__typeInfo, com.sforce.soap.SubscribeOptions.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SubscriptionData__typeInfo)) {
      setSubscriptionData((com.sforce.soap.SubscriptionData)__typeMapper.readObject(__in, SubscriptionData__typeInfo, com.sforce.soap.SubscriptionData.class));
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