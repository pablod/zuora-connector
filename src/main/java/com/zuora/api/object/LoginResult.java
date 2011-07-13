package com.zuora.api.object;

/**
 * Generated class, please do not edit.
 */
public class LoginResult implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public LoginResult() {
  }
    
  
  /**
   * element  : Session of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Session__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","Session","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean Session__is_set = false;

  private java.lang.String Session;

  public java.lang.String getSession() {
    return Session;
  }

  

  public void setSession(java.lang.String Session) {
    this.Session = Session;
    Session__is_set = true;
  }
  
  /**
   * element  : ServerUrl of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo ServerUrl__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","ServerUrl","http://www.w3.org/2001/XMLSchema","string",1,1,true);

  private boolean ServerUrl__is_set = false;

  private java.lang.String ServerUrl;

  public java.lang.String getServerUrl() {
    return ServerUrl;
  }

  

  public void setServerUrl(java.lang.String ServerUrl) {
    this.ServerUrl = ServerUrl;
    ServerUrl__is_set = true;
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
   
    __typeMapper.writeString(__out, Session__typeInfo, Session, Session__is_set);
    __typeMapper.writeString(__out, ServerUrl__typeInfo, ServerUrl, ServerUrl__is_set);
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
    if (__typeMapper.verifyElement(__in, Session__typeInfo)) {
      setSession((java.lang.String)__typeMapper.readString(__in, Session__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.verifyElement(__in, ServerUrl__typeInfo)) {
      setServerUrl((java.lang.String)__typeMapper.readString(__in, ServerUrl__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[LoginResult ");
    
    sb.append(" Session=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Session)+"'\n");
    sb.append(" ServerUrl=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ServerUrl)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}