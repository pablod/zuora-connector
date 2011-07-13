package com.zuora.api.object;

/**
 * Generated class, please do not edit.
 */
public class TaxationItem extends com.zuora.api.object.StaticZObject {

  /**
   * Constructor
   */
  public TaxationItem() {
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
   * element  : ExemptAmount of type {http://www.w3.org/2001/XMLSchema}decimal
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo ExemptAmount__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","ExemptAmount","http://www.w3.org/2001/XMLSchema","decimal",0,1,true);

  private boolean ExemptAmount__is_set = false;

  private java.lang.Double ExemptAmount;

  public java.lang.Double getExemptAmount() {
    return ExemptAmount;
  }

  

  public void setExemptAmount(java.lang.Double ExemptAmount) {
    this.ExemptAmount = ExemptAmount;
    ExemptAmount__is_set = true;
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
   * element  : InvoiceItemId of type {http://api.zuora.com/}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo InvoiceItemId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","InvoiceItemId","http://api.zuora.com/","ID",0,1,true);

  private boolean InvoiceItemId__is_set = false;

  private java.lang.String InvoiceItemId;

  public java.lang.String getInvoiceItemId() {
    return InvoiceItemId;
  }

  

  public void setInvoiceItemId(java.lang.String InvoiceItemId) {
    this.InvoiceItemId = InvoiceItemId;
    InvoiceItemId__is_set = true;
  }
  
  /**
   * element  : Jurisdiction of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Jurisdiction__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","Jurisdiction","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Jurisdiction__is_set = false;

  private java.lang.String Jurisdiction;

  public java.lang.String getJurisdiction() {
    return Jurisdiction;
  }

  

  public void setJurisdiction(java.lang.String Jurisdiction) {
    this.Jurisdiction = Jurisdiction;
    Jurisdiction__is_set = true;
  }
  
  /**
   * element  : LocationCode of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo LocationCode__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","LocationCode","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean LocationCode__is_set = false;

  private java.lang.String LocationCode;

  public java.lang.String getLocationCode() {
    return LocationCode;
  }

  

  public void setLocationCode(java.lang.String LocationCode) {
    this.LocationCode = LocationCode;
    LocationCode__is_set = true;
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
   * element  : TaxAmount of type {http://www.w3.org/2001/XMLSchema}decimal
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo TaxAmount__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","TaxAmount","http://www.w3.org/2001/XMLSchema","decimal",0,1,true);

  private boolean TaxAmount__is_set = false;

  private java.lang.Double TaxAmount;

  public java.lang.Double getTaxAmount() {
    return TaxAmount;
  }

  

  public void setTaxAmount(java.lang.Double TaxAmount) {
    this.TaxAmount = TaxAmount;
    TaxAmount__is_set = true;
  }
  
  /**
   * element  : TaxCode of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo TaxCode__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","TaxCode","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean TaxCode__is_set = false;

  private java.lang.String TaxCode;

  public java.lang.String getTaxCode() {
    return TaxCode;
  }

  

  public void setTaxCode(java.lang.String TaxCode) {
    this.TaxCode = TaxCode;
    TaxCode__is_set = true;
  }
  
  /**
   * element  : TaxCodeDescription of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo TaxCodeDescription__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","TaxCodeDescription","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean TaxCodeDescription__is_set = false;

  private java.lang.String TaxCodeDescription;

  public java.lang.String getTaxCodeDescription() {
    return TaxCodeDescription;
  }

  

  public void setTaxCodeDescription(java.lang.String TaxCodeDescription) {
    this.TaxCodeDescription = TaxCodeDescription;
    TaxCodeDescription__is_set = true;
  }
  
  /**
   * element  : TaxDate of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo TaxDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","TaxDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean TaxDate__is_set = false;

  private java.util.Calendar TaxDate;

  public java.util.Calendar getTaxDate() {
    return TaxDate;
  }

  

  public void setTaxDate(java.util.Calendar TaxDate) {
    this.TaxDate = TaxDate;
    TaxDate__is_set = true;
  }
  
  /**
   * element  : TaxRate of type {http://www.w3.org/2001/XMLSchema}decimal
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo TaxRate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","TaxRate","http://www.w3.org/2001/XMLSchema","decimal",0,1,true);

  private boolean TaxRate__is_set = false;

  private java.lang.Double TaxRate;

  public java.lang.Double getTaxRate() {
    return TaxRate;
  }

  

  public void setTaxRate(java.lang.Double TaxRate) {
    this.TaxRate = TaxRate;
    TaxRate__is_set = true;
  }
  
  /**
   * element  : TaxRateDescription of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo TaxRateDescription__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","TaxRateDescription","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean TaxRateDescription__is_set = false;

  private java.lang.String TaxRateDescription;

  public java.lang.String getTaxRateDescription() {
    return TaxRateDescription;
  }

  

  public void setTaxRateDescription(java.lang.String TaxRateDescription) {
    this.TaxRateDescription = TaxRateDescription;
    TaxRateDescription__is_set = true;
  }
  
  /**
   * element  : TaxRateType of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo TaxRateType__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","TaxRateType","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean TaxRateType__is_set = false;

  private java.lang.String TaxRateType;

  public java.lang.String getTaxRateType() {
    return TaxRateType;
  }

  

  public void setTaxRateType(java.lang.String TaxRateType) {
    this.TaxRateType = TaxRateType;
    TaxRateType__is_set = true;
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
    __typeMapper.writeXsiType(__out, "http://object.api.zuora.com/", "TaxationItem");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  @Override
protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, AccountingCode__typeInfo, AccountingCode, AccountingCode__is_set);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeObject(__out, ExemptAmount__typeInfo, ExemptAmount, ExemptAmount__is_set);
    __typeMapper.writeString(__out, InvoiceId__typeInfo, InvoiceId, InvoiceId__is_set);
    __typeMapper.writeString(__out, InvoiceItemId__typeInfo, InvoiceItemId, InvoiceItemId__is_set);
    __typeMapper.writeString(__out, Jurisdiction__typeInfo, Jurisdiction, Jurisdiction__is_set);
    __typeMapper.writeString(__out, LocationCode__typeInfo, LocationCode, LocationCode__is_set);
    __typeMapper.writeString(__out, Name__typeInfo, Name, Name__is_set);
    __typeMapper.writeObject(__out, TaxAmount__typeInfo, TaxAmount, TaxAmount__is_set);
    __typeMapper.writeString(__out, TaxCode__typeInfo, TaxCode, TaxCode__is_set);
    __typeMapper.writeString(__out, TaxCodeDescription__typeInfo, TaxCodeDescription, TaxCodeDescription__is_set);
    __typeMapper.writeObject(__out, TaxDate__typeInfo, TaxDate, TaxDate__is_set);
    __typeMapper.writeObject(__out, TaxRate__typeInfo, TaxRate, TaxRate__is_set);
    __typeMapper.writeString(__out, TaxRateDescription__typeInfo, TaxRateDescription, TaxRateDescription__is_set);
    __typeMapper.writeString(__out, TaxRateType__typeInfo, TaxRateType, TaxRateType__is_set);
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
    if (__typeMapper.isElement(__in, AccountingCode__typeInfo)) {
      setAccountingCode(__typeMapper.readString(__in, AccountingCode__typeInfo, java.lang.String.class));
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
    if (__typeMapper.isElement(__in, ExemptAmount__typeInfo)) {
      setExemptAmount((java.lang.Double)__typeMapper.readObject(__in, ExemptAmount__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, InvoiceId__typeInfo)) {
      setInvoiceId(__typeMapper.readString(__in, InvoiceId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, InvoiceItemId__typeInfo)) {
      setInvoiceItemId(__typeMapper.readString(__in, InvoiceItemId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Jurisdiction__typeInfo)) {
      setJurisdiction(__typeMapper.readString(__in, Jurisdiction__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, LocationCode__typeInfo)) {
      setLocationCode(__typeMapper.readString(__in, LocationCode__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Name__typeInfo)) {
      setName(__typeMapper.readString(__in, Name__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TaxAmount__typeInfo)) {
      setTaxAmount((java.lang.Double)__typeMapper.readObject(__in, TaxAmount__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TaxCode__typeInfo)) {
      setTaxCode(__typeMapper.readString(__in, TaxCode__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TaxCodeDescription__typeInfo)) {
      setTaxCodeDescription(__typeMapper.readString(__in, TaxCodeDescription__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TaxDate__typeInfo)) {
      setTaxDate((java.util.Calendar)__typeMapper.readObject(__in, TaxDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TaxRate__typeInfo)) {
      setTaxRate((java.lang.Double)__typeMapper.readObject(__in, TaxRate__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TaxRateDescription__typeInfo)) {
      setTaxRateDescription(__typeMapper.readString(__in, TaxRateDescription__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, TaxRateType__typeInfo)) {
      setTaxRateType(__typeMapper.readString(__in, TaxRateType__typeInfo, java.lang.String.class));
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
    sb.append("[TaxationItem ");
    sb.append(super.toString());
    sb.append(" AccountingCode=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AccountingCode)+"'\n");
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" ExemptAmount=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ExemptAmount)+"'\n");
    sb.append(" InvoiceId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(InvoiceId)+"'\n");
    sb.append(" InvoiceItemId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(InvoiceItemId)+"'\n");
    sb.append(" Jurisdiction=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Jurisdiction)+"'\n");
    sb.append(" LocationCode=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(LocationCode)+"'\n");
    sb.append(" Name=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Name)+"'\n");
    sb.append(" TaxAmount=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TaxAmount)+"'\n");
    sb.append(" TaxCode=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TaxCode)+"'\n");
    sb.append(" TaxCodeDescription=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TaxCodeDescription)+"'\n");
    sb.append(" TaxDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TaxDate)+"'\n");
    sb.append(" TaxRate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TaxRate)+"'\n");
    sb.append(" TaxRateDescription=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TaxRateDescription)+"'\n");
    sb.append(" TaxRateType=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(TaxRateType)+"'\n");
    sb.append(" UpdatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UpdatedById)+"'\n");
    sb.append(" UpdatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UpdatedDate)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}