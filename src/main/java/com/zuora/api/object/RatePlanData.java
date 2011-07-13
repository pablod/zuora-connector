package com.zuora.api.object;

/**
 * Generated class, please do not edit.
 */
public class RatePlanData implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public RatePlanData() {
  }
    
  
  /**
   * element  : RatePlan of type {http://object.api.zuora.com/}RatePlan
   * java type: com.sforce.soap.RatePlan
   */
  private static final com.sforce.ws.bind.TypeInfo RatePlan__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","RatePlan","http://object.api.zuora.com/","RatePlan",0,1,true);

  private boolean RatePlan__is_set = false;

  private com.zuora.api.object.RatePlan RatePlan;

  public com.zuora.api.object.RatePlan getRatePlan() {
    return RatePlan;
  }

  

  public void setRatePlan(com.zuora.api.object.RatePlan RatePlan) {
    this.RatePlan = RatePlan;
    RatePlan__is_set = true;
  }
  
  /**
   * element  : RatePlanChargeData of type {http://api.zuora.com/}RatePlanChargeData
   * java type: com.sforce.soap.RatePlanChargeData[]
   */
  private static final com.sforce.ws.bind.TypeInfo RatePlanChargeData__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","RatePlanChargeData","http://api.zuora.com/","RatePlanChargeData",0,-1,true);

  private boolean RatePlanChargeData__is_set = false;

  private com.zuora.api.object.RatePlanChargeData[] RatePlanChargeData = new com.zuora.api.object.RatePlanChargeData[0];

  public com.zuora.api.object.RatePlanChargeData[] getRatePlanChargeData() {
    return RatePlanChargeData;
  }

  

  public void setRatePlanChargeData(com.zuora.api.object.RatePlanChargeData[] RatePlanChargeData) {
    this.RatePlanChargeData = RatePlanChargeData;
    RatePlanChargeData__is_set = true;
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
   
    __typeMapper.writeObject(__out, RatePlan__typeInfo, RatePlan, RatePlan__is_set);
    __typeMapper.writeObject(__out, RatePlanChargeData__typeInfo, RatePlanChargeData, RatePlanChargeData__is_set);
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
    if (__typeMapper.isElement(__in, RatePlan__typeInfo)) {
      setRatePlan((com.zuora.api.object.RatePlan)__typeMapper.readObject(__in, RatePlan__typeInfo, com.zuora.api.object.RatePlan.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RatePlanChargeData__typeInfo)) {
      setRatePlanChargeData((com.zuora.api.object.RatePlanChargeData[])__typeMapper.readObject(__in, RatePlanChargeData__typeInfo, com.zuora.api.object.RatePlanChargeData[].class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[RatePlanData ");
    
    sb.append(" RatePlan=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RatePlan)+"'\n");
    sb.append(" RatePlanChargeData=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RatePlanChargeData)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}