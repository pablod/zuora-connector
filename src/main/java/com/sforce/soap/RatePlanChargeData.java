package com.sforce.soap;

/**
 * Generated class, please do not edit.
 */
public class RatePlanChargeData implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public RatePlanChargeData() {
  }
    
  
  /**
   * element  : RatePlanCharge of type {http://object.api.zuora.com/}RatePlanCharge
   * java type: com.sforce.soap.RatePlanCharge
   */
  private static final com.sforce.ws.bind.TypeInfo RatePlanCharge__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","RatePlanCharge","http://object.api.zuora.com/","RatePlanCharge",0,1,true);

  private boolean RatePlanCharge__is_set = false;

  private com.sforce.soap.RatePlanCharge RatePlanCharge;

  public com.sforce.soap.RatePlanCharge getRatePlanCharge() {
    return RatePlanCharge;
  }

  

  public void setRatePlanCharge(com.sforce.soap.RatePlanCharge RatePlanCharge) {
    this.RatePlanCharge = RatePlanCharge;
    RatePlanCharge__is_set = true;
  }
  
  /**
   * element  : RatePlanChargeTier of type {http://object.api.zuora.com/}RatePlanChargeTier
   * java type: com.sforce.soap.RatePlanChargeTier[]
   */
  private static final com.sforce.ws.bind.TypeInfo RatePlanChargeTier__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","RatePlanChargeTier","http://object.api.zuora.com/","RatePlanChargeTier",0,-1,true);

  private boolean RatePlanChargeTier__is_set = false;

  private com.sforce.soap.RatePlanChargeTier[] RatePlanChargeTier = new com.sforce.soap.RatePlanChargeTier[0];

  public com.sforce.soap.RatePlanChargeTier[] getRatePlanChargeTier() {
    return RatePlanChargeTier;
  }

  

  public void setRatePlanChargeTier(com.sforce.soap.RatePlanChargeTier[] RatePlanChargeTier) {
    this.RatePlanChargeTier = RatePlanChargeTier;
    RatePlanChargeTier__is_set = true;
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
   
    __typeMapper.writeObject(__out, RatePlanCharge__typeInfo, RatePlanCharge, RatePlanCharge__is_set);
    __typeMapper.writeObject(__out, RatePlanChargeTier__typeInfo, RatePlanChargeTier, RatePlanChargeTier__is_set);
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
    if (__typeMapper.isElement(__in, RatePlanCharge__typeInfo)) {
      setRatePlanCharge((com.sforce.soap.RatePlanCharge)__typeMapper.readObject(__in, RatePlanCharge__typeInfo, com.sforce.soap.RatePlanCharge.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RatePlanChargeTier__typeInfo)) {
      setRatePlanChargeTier((com.sforce.soap.RatePlanChargeTier[])__typeMapper.readObject(__in, RatePlanChargeTier__typeInfo, com.sforce.soap.RatePlanChargeTier[].class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[RatePlanChargeData ");
    
    sb.append(" RatePlanCharge=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RatePlanCharge)+"'\n");
    sb.append(" RatePlanChargeTier=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RatePlanChargeTier)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}