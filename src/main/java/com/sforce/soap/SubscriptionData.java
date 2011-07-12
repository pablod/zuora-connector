package com.sforce.soap;

/**
 * Generated class, please do not edit.
 */
public class SubscriptionData implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public SubscriptionData() {
  }
    
  
  /**
   * element  : Subscription of type {http://object.api.zuora.com/}Subscription
   * java type: com.sforce.soap.Subscription
   */
  private static final com.sforce.ws.bind.TypeInfo Subscription__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","Subscription","http://object.api.zuora.com/","Subscription",0,1,true);

  private boolean Subscription__is_set = false;

  private com.sforce.soap.Subscription Subscription;

  public com.sforce.soap.Subscription getSubscription() {
    return Subscription;
  }

  

  public void setSubscription(com.sforce.soap.Subscription Subscription) {
    this.Subscription = Subscription;
    Subscription__is_set = true;
  }
  
  /**
   * element  : RatePlanData of type {http://api.zuora.com/}RatePlanData
   * java type: com.sforce.soap.RatePlanData[]
   */
  private static final com.sforce.ws.bind.TypeInfo RatePlanData__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","RatePlanData","http://api.zuora.com/","RatePlanData",0,-1,true);

  private boolean RatePlanData__is_set = false;

  private com.sforce.soap.RatePlanData[] RatePlanData = new com.sforce.soap.RatePlanData[0];

  public com.sforce.soap.RatePlanData[] getRatePlanData() {
    return RatePlanData;
  }

  

  public void setRatePlanData(com.sforce.soap.RatePlanData[] RatePlanData) {
    this.RatePlanData = RatePlanData;
    RatePlanData__is_set = true;
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
   
    __typeMapper.writeObject(__out, Subscription__typeInfo, Subscription, Subscription__is_set);
    __typeMapper.writeObject(__out, RatePlanData__typeInfo, RatePlanData, RatePlanData__is_set);
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
    if (__typeMapper.isElement(__in, Subscription__typeInfo)) {
      setSubscription((com.sforce.soap.Subscription)__typeMapper.readObject(__in, Subscription__typeInfo, com.sforce.soap.Subscription.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, RatePlanData__typeInfo)) {
      setRatePlanData((com.sforce.soap.RatePlanData[])__typeMapper.readObject(__in, RatePlanData__typeInfo, com.sforce.soap.RatePlanData[].class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[SubscriptionData ");
    
    sb.append(" Subscription=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Subscription)+"'\n");
    sb.append(" RatePlanData=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(RatePlanData)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}