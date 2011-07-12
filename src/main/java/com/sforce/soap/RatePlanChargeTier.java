package com.sforce.soap;

/**
 * Generated class, please do not edit.
 */
public class RatePlanChargeTier extends com.sforce.soap.StaticZObject {

  /**
   * Constructor
   */
  public RatePlanChargeTier() {
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
   * element  : EndingUnit of type {http://www.w3.org/2001/XMLSchema}decimal
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo EndingUnit__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","EndingUnit","http://www.w3.org/2001/XMLSchema","decimal",0,1,true);

  private boolean EndingUnit__is_set = false;

  private java.lang.Double EndingUnit;

  public java.lang.Double getEndingUnit() {
    return EndingUnit;
  }

  

  public void setEndingUnit(java.lang.Double EndingUnit) {
    this.EndingUnit = EndingUnit;
    EndingUnit__is_set = true;
  }
  
  /**
   * element  : IsOveragePrice of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo IsOveragePrice__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","IsOveragePrice","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean IsOveragePrice__is_set = false;

  private java.lang.Boolean IsOveragePrice;

  public java.lang.Boolean getIsOveragePrice() {
    return IsOveragePrice;
  }

  

  public void setIsOveragePrice(java.lang.Boolean IsOveragePrice) {
    this.IsOveragePrice = IsOveragePrice;
    IsOveragePrice__is_set = true;
  }
  
  /**
   * element  : Price of type {http://www.w3.org/2001/XMLSchema}decimal
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo Price__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","Price","http://www.w3.org/2001/XMLSchema","decimal",0,1,true);

  private boolean Price__is_set = false;

  private java.lang.Double Price;

  public java.lang.Double getPrice() {
    return Price;
  }

  

  public void setPrice(java.lang.Double Price) {
    this.Price = Price;
    Price__is_set = true;
  }
  
  /**
   * element  : PriceFormat of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo PriceFormat__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","PriceFormat","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean PriceFormat__is_set = false;

  private java.lang.String PriceFormat;

  public java.lang.String getPriceFormat() {
    return PriceFormat;
  }

  

  public void setPriceFormat(java.lang.String PriceFormat) {
    this.PriceFormat = PriceFormat;
    PriceFormat__is_set = true;
  }
  
  /**
   * element  : RatePlanChargeId of type {http://api.zuora.com/}ID
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo RatePlanChargeId__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","RatePlanChargeId","http://api.zuora.com/","ID",0,1,true);

  private boolean RatePlanChargeId__is_set = false;

  private java.lang.String RatePlanChargeId;

  public java.lang.String getRatePlanChargeId() {
    return RatePlanChargeId;
  }

  

  public void setRatePlanChargeId(java.lang.String RatePlanChargeId) {
    this.RatePlanChargeId = RatePlanChargeId;
    RatePlanChargeId__is_set = true;
  }
  
  /**
   * element  : StartingUnit of type {http://www.w3.org/2001/XMLSchema}decimal
   * java type: java.lang.Double
   */
  private static final com.sforce.ws.bind.TypeInfo StartingUnit__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","StartingUnit","http://www.w3.org/2001/XMLSchema","decimal",0,1,true);

  private boolean StartingUnit__is_set = false;

  private java.lang.Double StartingUnit;

  public java.lang.Double getStartingUnit() {
    return StartingUnit;
  }

  

  public void setStartingUnit(java.lang.Double StartingUnit) {
    this.StartingUnit = StartingUnit;
    StartingUnit__is_set = true;
  }
  
  /**
   * element  : Tier of type {http://www.w3.org/2001/XMLSchema}int
   * java type: java.lang.Integer
   */
  private static final com.sforce.ws.bind.TypeInfo Tier__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://object.api.zuora.com/","Tier","http://www.w3.org/2001/XMLSchema","int",0,1,true);

  private boolean Tier__is_set = false;

  private java.lang.Integer Tier;

  public java.lang.Integer getTier() {
    return Tier;
  }

  

  public void setTier(java.lang.Integer Tier) {
    this.Tier = Tier;
    Tier__is_set = true;
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
    __typeMapper.writeXsiType(__out, "http://object.api.zuora.com/", "RatePlanChargeTier");
    writeFields(__out, __typeMapper);
    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
  }

  @Override
protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);
    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);
    __typeMapper.writeObject(__out, EndingUnit__typeInfo, EndingUnit, EndingUnit__is_set);
    __typeMapper.writeObject(__out, IsOveragePrice__typeInfo, IsOveragePrice, IsOveragePrice__is_set);
    __typeMapper.writeObject(__out, Price__typeInfo, Price, Price__is_set);
    __typeMapper.writeString(__out, PriceFormat__typeInfo, PriceFormat, PriceFormat__is_set);
    __typeMapper.writeString(__out, RatePlanChargeId__typeInfo, RatePlanChargeId, RatePlanChargeId__is_set);
    __typeMapper.writeObject(__out, StartingUnit__typeInfo, StartingUnit, StartingUnit__is_set);
    __typeMapper.writeObject(__out, Tier__typeInfo, Tier, Tier__is_set);
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
    if (__typeMapper.isElement(__in, CreatedById__typeInfo)) {
      setCreatedById(__typeMapper.readString(__in, CreatedById__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, CreatedDate__typeInfo)) {
      setCreatedDate((java.util.Calendar)__typeMapper.readObject(__in, CreatedDate__typeInfo, java.util.Calendar.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, EndingUnit__typeInfo)) {
      setEndingUnit((java.lang.Double)__typeMapper.readObject(__in, EndingUnit__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, IsOveragePrice__typeInfo)) {
      setIsOveragePrice((java.lang.Boolean)__typeMapper.readObject(__in, IsOveragePrice__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Price__typeInfo)) {
      setPrice((java.lang.Double)__typeMapper.readObject(__in, Price__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, PriceFormat__typeInfo)) {
      setPriceFormat(__typeMapper.readString(__in, PriceFormat__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RatePlanChargeId__typeInfo)) {
      setRatePlanChargeId(__typeMapper.readString(__in, RatePlanChargeId__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, StartingUnit__typeInfo)) {
      setStartingUnit((java.lang.Double)__typeMapper.readObject(__in, StartingUnit__typeInfo, java.lang.Double.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Tier__typeInfo)) {
      setTier((java.lang.Integer)__typeMapper.readObject(__in, Tier__typeInfo, java.lang.Integer.class));
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
    sb.append("[RatePlanChargeTier ");
    sb.append(super.toString());
    sb.append(" CreatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");
    sb.append(" CreatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");
    sb.append(" EndingUnit=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(EndingUnit)+"'\n");
    sb.append(" IsOveragePrice=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsOveragePrice)+"'\n");
    sb.append(" Price=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Price)+"'\n");
    sb.append(" PriceFormat=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(PriceFormat)+"'\n");
    sb.append(" RatePlanChargeId=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RatePlanChargeId)+"'\n");
    sb.append(" StartingUnit=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(StartingUnit)+"'\n");
    sb.append(" Tier=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Tier)+"'\n");
    sb.append(" UpdatedById=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UpdatedById)+"'\n");
    sb.append(" UpdatedDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(UpdatedDate)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}