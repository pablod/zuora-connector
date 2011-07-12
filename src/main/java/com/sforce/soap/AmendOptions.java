package com.sforce.soap;

/**
 * Generated class, please do not edit.
 */
public class AmendOptions implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public AmendOptions() {
  }
    
  
  /**
   * element  : InvoiceProcessingOptions of type {http://api.zuora.com/}InvoiceProcessingOptions
   * java type: com.sforce.soap.InvoiceProcessingOptions
   */
  private static final com.sforce.ws.bind.TypeInfo InvoiceProcessingOptions__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","InvoiceProcessingOptions","http://api.zuora.com/","InvoiceProcessingOptions",0,1,true);

  private boolean InvoiceProcessingOptions__is_set = false;

  private com.sforce.soap.InvoiceProcessingOptions InvoiceProcessingOptions;

  public com.sforce.soap.InvoiceProcessingOptions getInvoiceProcessingOptions() {
    return InvoiceProcessingOptions;
  }

  

  public void setInvoiceProcessingOptions(com.sforce.soap.InvoiceProcessingOptions InvoiceProcessingOptions) {
    this.InvoiceProcessingOptions = InvoiceProcessingOptions;
    InvoiceProcessingOptions__is_set = true;
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
   
    __typeMapper.writeObject(__out, InvoiceProcessingOptions__typeInfo, InvoiceProcessingOptions, InvoiceProcessingOptions__is_set);
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
    if (__typeMapper.isElement(__in, InvoiceProcessingOptions__typeInfo)) {
      setInvoiceProcessingOptions((com.sforce.soap.InvoiceProcessingOptions)__typeMapper.readObject(__in, InvoiceProcessingOptions__typeInfo, com.sforce.soap.InvoiceProcessingOptions.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[AmendOptions ");
    
    sb.append(" InvoiceProcessingOptions=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(InvoiceProcessingOptions)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}