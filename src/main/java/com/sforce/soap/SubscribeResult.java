package com.sforce.soap;

/**
 * Generated class, please do not edit.
 */
public class SubscribeResult implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public SubscribeResult() {
  }
    
  
  /**
   * element  : AccountId of type {http://api.zuora.com/}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo AccountId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","AccountId","http://api.zuora.com/","ID",0,1,true);

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
   * element  : AccountNumber of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo AccountNumber__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","AccountNumber","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean AccountNumber__is_set = false;

  private java.lang.String AccountNumber;

  public java.lang.String getAccountNumber() {
    return AccountNumber;
  }

  

  public void setAccountNumber(java.lang.String AccountNumber) {
    this.AccountNumber = AccountNumber;
    AccountNumber__is_set = true;
  }
  
  /**
   * element  : Errors of type {http://api.zuora.com/}Error
   * java type: com.sforce.soap.Error[]
   */
  private static final com.sforce.ws.bind.TypeInfo Errors__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","Errors","http://api.zuora.com/","Error",0,-1,true);

  private boolean Errors__is_set = false;

  private com.sforce.soap.Error[] Errors = new com.sforce.soap.Error[0];

  public com.sforce.soap.Error[] getErrors() {
    return Errors;
  }

  

  public void setErrors(com.sforce.soap.Error[] Errors) {
    this.Errors = Errors;
    Errors__is_set = true;
  }
  
  /**
   * element  : InvoiceData of type {http://api.zuora.com/}InvoiceData
   * java type: com.sforce.soap.InvoiceData[]
   */
  private static final com.sforce.ws.bind.TypeInfo InvoiceData__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","InvoiceData","http://api.zuora.com/","InvoiceData",0,-1,true);

  private boolean InvoiceData__is_set = false;

  private com.sforce.soap.InvoiceData[] InvoiceData = new com.sforce.soap.InvoiceData[0];

  public com.sforce.soap.InvoiceData[] getInvoiceData() {
    return InvoiceData;
  }

  

  public void setInvoiceData(com.sforce.soap.InvoiceData[] InvoiceData) {
    this.InvoiceData = InvoiceData;
    InvoiceData__is_set = true;
  }
  
  /**
   * element  : InvoiceId of type {http://api.zuora.com/}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo InvoiceId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","InvoiceId","http://api.zuora.com/","ID",0,1,true);

  private boolean InvoiceId__is_set = false;

  private java.lang.String InvoiceId;

  public java.lang.String getInvoiceId() {
    return InvoiceId;
  }

  

  public void setInvoiceId(java.lang.String InvoiceId) {
    this.InvoiceId = InvoiceId;
    InvoiceId__is_set = true;
  }
  
  /**
   * element  : InvoiceNumber of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo InvoiceNumber__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","InvoiceNumber","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean InvoiceNumber__is_set = false;

  private java.lang.String InvoiceNumber;

  public java.lang.String getInvoiceNumber() {
    return InvoiceNumber;
  }

  

  public void setInvoiceNumber(java.lang.String InvoiceNumber) {
    this.InvoiceNumber = InvoiceNumber;
    InvoiceNumber__is_set = true;
  }
  
  /**
   * element  : PaymentTransactionNumber of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo PaymentTransactionNumber__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","PaymentTransactionNumber","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean PaymentTransactionNumber__is_set = false;

  private java.lang.String PaymentTransactionNumber;

  public java.lang.String getPaymentTransactionNumber() {
    return PaymentTransactionNumber;
  }

  

  public void setPaymentTransactionNumber(java.lang.String PaymentTransactionNumber) {
    this.PaymentTransactionNumber = PaymentTransactionNumber;
    PaymentTransactionNumber__is_set = true;
  }
  
  /**
   * element  : SubscriptionId of type {http://api.zuora.com/}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo SubscriptionId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","SubscriptionId","http://api.zuora.com/","ID",0,1,true);

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
   * element  : SubscriptionNumber of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo SubscriptionNumber__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","SubscriptionNumber","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean SubscriptionNumber__is_set = false;

  private java.lang.String SubscriptionNumber;

  public java.lang.String getSubscriptionNumber() {
    return SubscriptionNumber;
  }

  

  public void setSubscriptionNumber(java.lang.String SubscriptionNumber) {
    this.SubscriptionNumber = SubscriptionNumber;
    SubscriptionNumber__is_set = true;
  }
  
  /**
   * element  : Success of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo Success__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","Success","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean Success__is_set = false;

  private boolean Success;

  public boolean getSuccess() {
    return Success;
  }

  

  public boolean isSuccess() {
    return Success;
  }

  

  public void setSuccess(boolean Success) {
    this.Success = Success;
    Success__is_set = true;
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
   
    __typeMapper.writeString(__out, AccountId__typeInfo, AccountId, AccountId__is_set);
    __typeMapper.writeString(__out, AccountNumber__typeInfo, AccountNumber, AccountNumber__is_set);
    __typeMapper.writeObject(__out, Errors__typeInfo, Errors, Errors__is_set);
    __typeMapper.writeObject(__out, InvoiceData__typeInfo, InvoiceData, InvoiceData__is_set);
    __typeMapper.writeString(__out, InvoiceId__typeInfo, InvoiceId, InvoiceId__is_set);
    __typeMapper.writeString(__out, InvoiceNumber__typeInfo, InvoiceNumber, InvoiceNumber__is_set);
    __typeMapper.writeString(__out, PaymentTransactionNumber__typeInfo, PaymentTransactionNumber, PaymentTransactionNumber__is_set);
    __typeMapper.writeString(__out, SubscriptionId__typeInfo, SubscriptionId, SubscriptionId__is_set);
    __typeMapper.writeString(__out, SubscriptionNumber__typeInfo, SubscriptionNumber, SubscriptionNumber__is_set);
    __typeMapper.writeBoolean(__out, Success__typeInfo, Success, Success__is_set);
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
    if (__typeMapper.isElement(__in, AccountId__typeInfo)) {
      setAccountId((java.lang.String)__typeMapper.readString(__in, AccountId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AccountNumber__typeInfo)) {
      setAccountNumber((java.lang.String)__typeMapper.readString(__in, AccountNumber__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Errors__typeInfo)) {
      setErrors((com.sforce.soap.Error[])__typeMapper.readObject(__in, Errors__typeInfo, com.sforce.soap.Error[].class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, InvoiceData__typeInfo)) {
      setInvoiceData((com.sforce.soap.InvoiceData[])__typeMapper.readObject(__in, InvoiceData__typeInfo, com.sforce.soap.InvoiceData[].class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, InvoiceId__typeInfo)) {
      setInvoiceId((java.lang.String)__typeMapper.readString(__in, InvoiceId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, InvoiceNumber__typeInfo)) {
      setInvoiceNumber((java.lang.String)__typeMapper.readString(__in, InvoiceNumber__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PaymentTransactionNumber__typeInfo)) {
      setPaymentTransactionNumber((java.lang.String)__typeMapper.readString(__in, PaymentTransactionNumber__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SubscriptionId__typeInfo)) {
      setSubscriptionId((java.lang.String)__typeMapper.readString(__in, SubscriptionId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, SubscriptionNumber__typeInfo)) {
      setSubscriptionNumber((java.lang.String)__typeMapper.readString(__in, SubscriptionNumber__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Success__typeInfo)) {
      setSuccess((boolean)__typeMapper.readBoolean(__in, Success__typeInfo, boolean.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[SubscribeResult ");
    
    sb.append(" AccountId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AccountId)+"'\n");
    sb.append(" AccountNumber=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AccountNumber)+"'\n");
    sb.append(" Errors=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Errors)+"'\n");
    sb.append(" InvoiceData=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(InvoiceData)+"'\n");
    sb.append(" InvoiceId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(InvoiceId)+"'\n");
    sb.append(" InvoiceNumber=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(InvoiceNumber)+"'\n");
    sb.append(" PaymentTransactionNumber=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PaymentTransactionNumber)+"'\n");
    sb.append(" SubscriptionId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SubscriptionId)+"'\n");
    sb.append(" SubscriptionNumber=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(SubscriptionNumber)+"'\n");
    sb.append(" Success=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Success)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}