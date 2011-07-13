package com.zuora.api.object;

/**
 * Generated class, please do not edit.
 */
public class CallOptions_element extends com.sforce.ws.bind.SoapHeaderObject implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public CallOptions_element() {
  }
    
  
  /**
   * element  : useSingleTransaction of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo useSingleTransaction__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","useSingleTransaction","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean useSingleTransaction__is_set = false;

  private java.lang.Boolean useSingleTransaction;

  public java.lang.Boolean getUseSingleTransaction() {
    return useSingleTransaction;
  }

  

  public void setUseSingleTransaction(java.lang.Boolean useSingleTransaction) {
    this.useSingleTransaction = useSingleTransaction;
    useSingleTransaction__is_set = true;
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
   super.writeFields(__out, __typeMapper);
    __typeMapper.writeObject(__out, useSingleTransaction__typeInfo, useSingleTransaction, useSingleTransaction__is_set);
  }


  public void load(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
    __typeMapper.consumeStartTag(__in);
    loadFields(__in, __typeMapper);
    __typeMapper.consumeEndTag(__in);
  }

  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,
      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
   super.loadFields(__in, __typeMapper);
    __in.peekTag();
    if (__typeMapper.isElement(__in, useSingleTransaction__typeInfo)) {
      setUseSingleTransaction((java.lang.Boolean)__typeMapper.readObject(__in, useSingleTransaction__typeInfo, java.lang.Boolean.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[CallOptions_element ");
    sb.append(super.toString());
    sb.append(" useSingleTransaction=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(useSingleTransaction)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}