package com.sforce.soap;

/**
 * Generated class, please do not edit.
 */
public class AccountingRun extends com.sforce.soap.StaticZObject {

  /**
   * Constructor
   */
  public AccountingRun() {
  }
    
  
  /**
   * element  : AccountingRunDate of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo AccountingRunDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","AccountingRunDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean AccountingRunDate__is_set = false;

  private java.util.Calendar AccountingRunDate;

  public java.util.Calendar getAccountingRunDate() {
    return AccountingRunDate;
  }

  

  public void setAccountingRunDate(java.util.Calendar AccountingRunDate) {
    this.AccountingRunDate = AccountingRunDate;
    AccountingRunDate__is_set = true;
  }
  
  /**
   * element  : AccountingRunNumber of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo AccountingRunNumber__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","AccountingRunNumber","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean AccountingRunNumber__is_set = false;

  private java.lang.String AccountingRunNumber;

  public java.lang.String getAccountingRunNumber() {
    return AccountingRunNumber;
  }

  

  public void setAccountingRunNumber(java.lang.String AccountingRunNumber) {
    this.AccountingRunNumber = AccountingRunNumber;
    AccountingRunNumber__is_set = true;
  }
  
  /**
   * element  : AdjustmentExtractDownloadUrl of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo AdjustmentExtractDownloadUrl__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","AdjustmentExtractDownloadUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean AdjustmentExtractDownloadUrl__is_set = false;

  private java.lang.String AdjustmentExtractDownloadUrl;

  public java.lang.String getAdjustmentExtractDownloadUrl() {
    return AdjustmentExtractDownloadUrl;
  }

  

  public void setAdjustmentExtractDownloadUrl(java.lang.String AdjustmentExtractDownloadUrl) {
    this.AdjustmentExtractDownloadUrl = AdjustmentExtractDownloadUrl;
    AdjustmentExtractDownloadUrl__is_set = true;
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
   * element  : InvoiceExtractDownloadUrl of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo InvoiceExtractDownloadUrl__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","InvoiceExtractDownloadUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean InvoiceExtractDownloadUrl__is_set = false;

  private java.lang.String InvoiceExtractDownloadUrl;

  public java.lang.String getInvoiceExtractDownloadUrl() {
    return InvoiceExtractDownloadUrl;
  }

  

  public void setInvoiceExtractDownloadUrl(java.lang.String InvoiceExtractDownloadUrl) {
    this.InvoiceExtractDownloadUrl = InvoiceExtractDownloadUrl;
    InvoiceExtractDownloadUrl__is_set = true;
  }
  
  /**
   * element  : PaymentExtractDownloadUrl of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo PaymentExtractDownloadUrl__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","PaymentExtractDownloadUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean PaymentExtractDownloadUrl__is_set = false;

  private java.lang.String PaymentExtractDownloadUrl;

  public java.lang.String getPaymentExtractDownloadUrl() {
    return PaymentExtractDownloadUrl;
  }

  

  public void setPaymentExtractDownloadUrl(java.lang.String PaymentExtractDownloadUrl) {
    this.PaymentExtractDownloadUrl = PaymentExtractDownloadUrl;
    PaymentExtractDownloadUrl__is_set = true;
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
    __typeMapper.writeXsiType(__out, "http://object.api.zuora.com/", "AccountingRun");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  @Override
protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, AccountingRunDate__typeInfo, AccountingRunDate, AccountingRunDate__is_set);
    __typeMapper.writeString(__out, AccountingRunNumber__typeInfo, AccountingRunNumber, AccountingRunNumber__is_set);
    __typeMapper.writeString(__out, AdjustmentExtractDownloadUrl__typeInfo, AdjustmentExtractDownloadUrl, AdjustmentExtractDownloadUrl__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeString(__out, InvoiceExtractDownloadUrl__typeInfo, InvoiceExtractDownloadUrl, InvoiceExtractDownloadUrl__is_set);
    __typeMapper.writeString(__out, PaymentExtractDownloadUrl__typeInfo, PaymentExtractDownloadUrl, PaymentExtractDownloadUrl__is_set);
    __typeMapper.writeString(__out, Status__typeInfo, Status, Status__is_set);
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
    if (__typeMapper.isElement(__in, AccountingRunDate__typeInfo)) {
      setAccountingRunDate((java.util.Calendar)__typeMapper.readObject(__in, AccountingRunDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AccountingRunNumber__typeInfo)) {
      setAccountingRunNumber(__typeMapper.readString(__in, AccountingRunNumber__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, AdjustmentExtractDownloadUrl__typeInfo)) {
      setAdjustmentExtractDownloadUrl(__typeMapper.readString(__in, AdjustmentExtractDownloadUrl__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, InvoiceExtractDownloadUrl__typeInfo)) {
      setInvoiceExtractDownloadUrl(__typeMapper.readString(__in, InvoiceExtractDownloadUrl__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PaymentExtractDownloadUrl__typeInfo)) {
      setPaymentExtractDownloadUrl(__typeMapper.readString(__in, PaymentExtractDownloadUrl__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Status__typeInfo)) {
      setStatus(__typeMapper.readString(__in, Status__typeInfo, java.lang.String.class));
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
    sb.append("[AccountingRun ");
    sb.append(super.toString());
    sb.append(" AccountingRunDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AccountingRunDate)+"'\n");
    sb.append(" AccountingRunNumber=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AccountingRunNumber)+"'\n");
    sb.append(" AdjustmentExtractDownloadUrl=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AdjustmentExtractDownloadUrl)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" InvoiceExtractDownloadUrl=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(InvoiceExtractDownloadUrl)+"'\n");
    sb.append(" PaymentExtractDownloadUrl=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PaymentExtractDownloadUrl)+"'\n");
    sb.append(" Status=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Status)+"'\n");
    sb.append(" UpdatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UpdatedById)+"'\n");
    sb.append(" UpdatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UpdatedDate)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}