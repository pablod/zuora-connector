package com.sforce.soap;

/**
 * Generated class, please do not edit.
 */
public class Error implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public Error() {
  }
    
  
  /**
   * element  : Code of type {http://api.zuora.com/}ErrorCode
   * java type: com.sforce.soap.ErrorCode
   */
  private static final com.sforce.ws.bind.TypeInfo Code__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","Code","http://api.zuora.com/","ErrorCode",0,1,true);

  private boolean Code__is_set = false;

  private com.sforce.soap.ErrorCode Code;

  public com.sforce.soap.ErrorCode getCode() {
    return Code;
  }

  

  public void setCode(com.sforce.soap.ErrorCode Code) {
    this.Code = Code;
    Code__is_set = true;
  }
  
  /**
   * element  : Message of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Message__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","Message","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Message__is_set = false;

  private java.lang.String Message;

  public java.lang.String getMessage() {
    return Message;
  }

  

  public void setMessage(java.lang.String Message) {
    this.Message = Message;
    Message__is_set = true;
  }
  
  /**
   * element  : Field of type {http://www.w3.org/2001/XMLSchema}string
   * java type: java.lang.String
   */
  private static final com.sforce.ws.bind.TypeInfo Field__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","Field","http://www.w3.org/2001/XMLSchema","string",0,1,true);

  private boolean Field__is_set = false;

  private java.lang.String Field;

  public java.lang.String getField() {
    return Field;
  }

  

  public void setField(java.lang.String Field) {
    this.Field = Field;
    Field__is_set = true;
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
   
    __typeMapper.writeObject(__out, Code__typeInfo, Code, Code__is_set);
    __typeMapper.writeString(__out, Message__typeInfo, Message, Message__is_set);
    __typeMapper.writeString(__out, Field__typeInfo, Field, Field__is_set);
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
    if (__typeMapper.isElement(__in, Code__typeInfo)) {
      setCode((com.sforce.soap.ErrorCode)__typeMapper.readObject(__in, Code__typeInfo, com.sforce.soap.ErrorCode.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Message__typeInfo)) {
      setMessage((java.lang.String)__typeMapper.readString(__in, Message__typeInfo, java.lang.String.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Field__typeInfo)) {
      setField((java.lang.String)__typeMapper.readString(__in, Field__typeInfo, java.lang.String.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[Error ");
    
    sb.append(" Code=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Code)+"'\n");
    sb.append(" Message=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Message)+"'\n");
    sb.append(" Field=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Field)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}