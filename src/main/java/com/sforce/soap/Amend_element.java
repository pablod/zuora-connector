package com.sforce.soap;

/**
 * Generated class, please do not edit.
 */
public class Amend_element implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public Amend_element() {
  }
    
  
  /**
   * element  : requests of type {http://api.zuora.com/}AmendRequest
   * java type: com.sforce.soap.AmendRequest[]
   */
  private static final com.sforce.ws.bind.TypeInfo requests__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","requests","http://api.zuora.com/","AmendRequest",0,-1,true);

  private boolean requests__is_set = false;

  private com.sforce.soap.AmendRequest[] requests = new com.sforce.soap.AmendRequest[0];

  public com.sforce.soap.AmendRequest[] getRequests() {
    return requests;
  }

  

  public void setRequests(com.sforce.soap.AmendRequest[] requests) {
    this.requests = requests;
    requests__is_set = true;
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
   
    __typeMapper.writeObject(__out, requests__typeInfo, requests, requests__is_set);
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
    if (__typeMapper.isElement(__in, requests__typeInfo)) {
      setRequests((com.sforce.soap.AmendRequest[])__typeMapper.readObject(__in, requests__typeInfo, com.sforce.soap.AmendRequest[].class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[Amend_element ");
    
    sb.append(" requests=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(requests)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}