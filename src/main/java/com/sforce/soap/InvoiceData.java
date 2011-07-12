package com.sforce.soap;

/**
 * Generated class, please do not edit.
 */
public class InvoiceData implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public InvoiceData() {
  }
    
  
  /**
   * element  : Invoice of type {http://object.api.zuora.com/}Invoice
   * java type: com.sforce.soap.Invoice
   */
  private static final com.sforce.ws.bind.TypeInfo Invoice__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","Invoice","http://object.api.zuora.com/","Invoice",0,1,true);

  private boolean Invoice__is_set = false;

  private com.sforce.soap.Invoice Invoice;

  public com.sforce.soap.Invoice getInvoice() {
    return Invoice;
  }

  

  public void setInvoice(com.sforce.soap.Invoice Invoice) {
    this.Invoice = Invoice;
    Invoice__is_set = true;
  }
  
  /**
   * element  : InvoiceItem of type {http://object.api.zuora.com/}InvoiceItem
   * java type: com.sforce.soap.InvoiceItem[]
   */
  private static final com.sforce.ws.bind.TypeInfo InvoiceItem__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","InvoiceItem","http://object.api.zuora.com/","InvoiceItem",0,-1,true);

  private boolean InvoiceItem__is_set = false;

  private com.sforce.soap.InvoiceItem[] InvoiceItem = new com.sforce.soap.InvoiceItem[0];

  public com.sforce.soap.InvoiceItem[] getInvoiceItem() {
    return InvoiceItem;
  }

  

  public void setInvoiceItem(com.sforce.soap.InvoiceItem[] InvoiceItem) {
    this.InvoiceItem = InvoiceItem;
    InvoiceItem__is_set = true;
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
   
    __typeMapper.writeObject(__out, Invoice__typeInfo, Invoice, Invoice__is_set);
    __typeMapper.writeObject(__out, InvoiceItem__typeInfo, InvoiceItem, InvoiceItem__is_set);
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
    if (__typeMapper.isElement(__in, Invoice__typeInfo)) {
      setInvoice((com.sforce.soap.Invoice)__typeMapper.readObject(__in, Invoice__typeInfo, com.sforce.soap.Invoice.class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, InvoiceItem__typeInfo)) {
      setInvoiceItem((com.sforce.soap.InvoiceItem[])__typeMapper.readObject(__in, InvoiceItem__typeInfo, com.sforce.soap.InvoiceItem[].class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[InvoiceData ");
    
    sb.append(" Invoice=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Invoice)+"'\n");
    sb.append(" InvoiceItem=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(InvoiceItem)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}