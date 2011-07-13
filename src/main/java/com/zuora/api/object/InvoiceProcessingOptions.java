package com.zuora.api.object;

/**
 * Generated class, please do not edit.
 */
public class InvoiceProcessingOptions implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public InvoiceProcessingOptions() {
  }
    
  
  /**
   * element  : InvoiceTargetDate of type {http://www.w3.org/2001/XMLSchema}dateTime
   * java type: java.util.Calendar
   */
  private static final com.sforce.ws.bind.TypeInfo InvoiceTargetDate__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","InvoiceTargetDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);

  private boolean InvoiceTargetDate__is_set = false;

  private java.util.Calendar InvoiceTargetDate;

  public java.util.Calendar getInvoiceTargetDate() {
    return InvoiceTargetDate;
  }

  

  public void setInvoiceTargetDate(java.util.Calendar InvoiceTargetDate) {
    this.InvoiceTargetDate = InvoiceTargetDate;
    InvoiceTargetDate__is_set = true;
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
   
    __typeMapper.writeObject(__out, InvoiceTargetDate__typeInfo, InvoiceTargetDate, InvoiceTargetDate__is_set);
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
    if (__typeMapper.isElement(__in, InvoiceTargetDate__typeInfo)) {
      setInvoiceTargetDate((java.util.Calendar)__typeMapper.readObject(__in, InvoiceTargetDate__typeInfo, java.util.Calendar.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[InvoiceProcessingOptions ");
    
    sb.append(" InvoiceTargetDate=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(InvoiceTargetDate)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}