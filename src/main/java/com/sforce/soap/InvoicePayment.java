package com.sforce.soap;

/**
 * Generated class, please do not edit.
 */
public class InvoicePayment extends com.sforce.soap.StaticZObject {

  /**
   * Constructor
   */
  public InvoicePayment() {
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
   * element  : InvoiceId of type {http://api.zuora.com/}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo InvoiceId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","InvoiceId","http://api.zuora.com/","ID",0,1,true);

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
   * element  : PaymentId of type {http://api.zuora.com/}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo PaymentId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","PaymentId","http://api.zuora.com/","ID",0,1,true);

  private boolean PaymentId__is_set = false;

  private java.lang.String PaymentId;

  public java.lang.String getPaymentId() {
    return PaymentId;
  }

  

  public void setPaymentId(java.lang.String PaymentId) {
    this.PaymentId = PaymentId;
    PaymentId__is_set = true;
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
    __typeMapper.writeXsiType(__out, "http://object.api.zuora.com/", "InvoicePayment");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  @Override
protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, Amount__typeInfo, Amount, Amount__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeString(__out, InvoiceId__typeInfo, InvoiceId, InvoiceId__is_set);
    __typeMapper.writeString(__out, PaymentId__typeInfo, PaymentId, PaymentId__is_set);
    __typeMapper.writeObject(__out, RefundAmount__typeInfo, RefundAmount, RefundAmount__is_set);
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
    if (__typeMapper.isElement(__in, Amount__typeInfo)) {
      setAmount((java.lang.Double)__typeMapper.readObject(__in, Amount__typeInfo, java.lang.Double.class));
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
    if (__typeMapper.isElement(__in, InvoiceId__typeInfo)) {
      setInvoiceId(__typeMapper.readString(__in, InvoiceId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PaymentId__typeInfo)) {
      setPaymentId(__typeMapper.readString(__in, PaymentId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RefundAmount__typeInfo)) {
      setRefundAmount((java.lang.Double)__typeMapper.readObject(__in, RefundAmount__typeInfo, java.lang.Double.class));
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
    sb.append("[InvoicePayment ");
    sb.append(super.toString());
    sb.append(" Amount=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Amount)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" InvoiceId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(InvoiceId)+"'\n");
    sb.append(" PaymentId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PaymentId)+"'\n");
    sb.append(" RefundAmount=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RefundAmount)+"'\n");
    sb.append(" UpdatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UpdatedById)+"'\n");
    sb.append(" UpdatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UpdatedDate)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}