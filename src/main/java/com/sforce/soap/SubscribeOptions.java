package com.sforce.soap;

/**
 * Generated class, please do not edit.
 */
public class SubscribeOptions implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public SubscribeOptions() {
  }
    
  
  /**
   * element  : GenerateInvoice of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo GenerateInvoice__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","GenerateInvoice","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean GenerateInvoice__is_set = false;

  private java.lang.Boolean GenerateInvoice;

  public java.lang.Boolean getGenerateInvoice() {
    return GenerateInvoice;
  }

  

  public void setGenerateInvoice(java.lang.Boolean GenerateInvoice) {
    this.GenerateInvoice = GenerateInvoice;
    GenerateInvoice__is_set = true;
  }
  
  /**
   * element  : ProcessPayments of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: java.lang.Boolean
   */
  private static final com.sforce.ws.bind.TypeInfo ProcessPayments__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","ProcessPayments","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean ProcessPayments__is_set = false;

  private java.lang.Boolean ProcessPayments;

  public java.lang.Boolean getProcessPayments() {
    return ProcessPayments;
  }

  

  public void setProcessPayments(java.lang.Boolean ProcessPayments) {
    this.ProcessPayments = ProcessPayments;
    ProcessPayments__is_set = true;
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
   
    __typeMapper.writeObject(__out, GenerateInvoice__typeInfo, GenerateInvoice, GenerateInvoice__is_set);
    __typeMapper.writeObject(__out, ProcessPayments__typeInfo, ProcessPayments, ProcessPayments__is_set);
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
    if (__typeMapper.isElement(__in, GenerateInvoice__typeInfo)) {
      setGenerateInvoice((java.lang.Boolean)__typeMapper.readObject(__in, GenerateInvoice__typeInfo, java.lang.Boolean.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, ProcessPayments__typeInfo)) {
      setProcessPayments((java.lang.Boolean)__typeMapper.readObject(__in, ProcessPayments__typeInfo, java.lang.Boolean.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[SubscribeOptions ");
    
    sb.append(" GenerateInvoice=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(GenerateInvoice)+"'\n");
    sb.append(" ProcessPayments=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProcessPayments)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}