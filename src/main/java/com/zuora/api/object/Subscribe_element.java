package com.zuora.api.object;

/**
 * Generated class, please do not edit.
 */
public class Subscribe_element implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public Subscribe_element() {
  }
    
  
  /**
   * element  : subscribes of type {http://api.zuora.com/}SubscribeRequest
   * java type: com.sforce.soap.SubscribeRequest[]
   */
  private static final com.sforce.ws.bind.TypeInfo subscribes__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","subscribes","http://api.zuora.com/","SubscribeRequest",0,-1,true);

  private boolean subscribes__is_set = false;

  private com.zuora.api.object.SubscribeRequest[] subscribes = new com.zuora.api.object.SubscribeRequest[0];

  public com.zuora.api.object.SubscribeRequest[] getSubscribes() {
    return subscribes;
  }

  

  public void setSubscribes(com.zuora.api.object.SubscribeRequest[] subscribes) {
    this.subscribes = subscribes;
    subscribes__is_set = true;
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
   
    __typeMapper.writeObject(__out, subscribes__typeInfo, subscribes, subscribes__is_set);
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
    if (__typeMapper.isElement(__in, subscribes__typeInfo)) {
      setSubscribes((com.zuora.api.object.SubscribeRequest[])__typeMapper.readObject(__in, subscribes__typeInfo, com.zuora.api.object.SubscribeRequest[].class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[Subscribe_element ");
    
    sb.append(" subscribes=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(subscribes)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}