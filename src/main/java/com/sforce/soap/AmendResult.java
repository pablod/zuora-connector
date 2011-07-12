package com.sforce.soap;

/**
 * Generated class, please do not edit.
 */
public class AmendResult implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public AmendResult() {
  }
    
  
  /**
   * element  : AmendmentIds of type {http://api.zuora.com/}ID
   * java type: java.lang.String[]
   */
  private static final com.sforce.ws.bind.TypeInfo AmendmentIds__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","AmendmentIds","http://api.zuora.com/","ID",0,-1,true);

  private boolean AmendmentIds__is_set = false;

  private java.lang.String[] AmendmentIds = new java.lang.String[0];

  public java.lang.String[] getAmendmentIds() {
    return AmendmentIds;
  }

  

  public void setAmendmentIds(java.lang.String[] AmendmentIds) {
    this.AmendmentIds = AmendmentIds;
    AmendmentIds__is_set = true;
  }
  
  /**
   * element  : Errors of type {http://api.zuora.com/}Error
   * java type: com.sforce.soap.Error[]
   */
  private static final com.sforce.ws.bind.TypeInfo Errors__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","Errors","http://api.zuora.com/","Error",0,-1,true);

  private boolean Errors__is_set = false;

  private com.sforce.soap.Error[] Errors = new com.sforce.soap.Error[0];

  public com.sforce.soap.Error[] getErrors() {
    return Errors;
  }

  

  public void setErrors(com.sforce.soap.Error[] Errors) {
    this.Errors = Errors;
    Errors__is_set = true;
  }
  
  /**
   * element  : InvoiceDatas of type {http://api.zuora.com/}InvoiceData
   * java type: com.sforce.soap.InvoiceData[]
   */
  private static final com.sforce.ws.bind.TypeInfo InvoiceDatas__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","InvoiceDatas","http://api.zuora.com/","InvoiceData",0,-1,true);

  private boolean InvoiceDatas__is_set = false;

  private com.sforce.soap.InvoiceData[] InvoiceDatas = new com.sforce.soap.InvoiceData[0];

  public com.sforce.soap.InvoiceData[] getInvoiceDatas() {
    return InvoiceDatas;
  }

  

  public void setInvoiceDatas(com.sforce.soap.InvoiceData[] InvoiceDatas) {
    this.InvoiceDatas = InvoiceDatas;
    InvoiceDatas__is_set = true;
  }
  
  /**
   * element  : Success of type {http://www.w3.org/2001/XMLSchema}boolean
   * java type: boolean
   */
  private static final com.sforce.ws.bind.TypeInfo Success__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","Success","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);

  private boolean Success__is_set = false;

  private boolean Success;

  public boolean getSuccess() {
    return Success;
  }

  

  public boolean isSuccess() {
    return Success;
  }

  

  public void setSuccess(boolean Success) {
    this.Success = Success;
    Success__is_set = true;
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
   
    __typeMapper.writeObject(__out, AmendmentIds__typeInfo, AmendmentIds, AmendmentIds__is_set);
    __typeMapper.writeObject(__out, Errors__typeInfo, Errors, Errors__is_set);
    __typeMapper.writeObject(__out, InvoiceDatas__typeInfo, InvoiceDatas, InvoiceDatas__is_set);
    __typeMapper.writeBoolean(__out, Success__typeInfo, Success, Success__is_set);
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
    if (__typeMapper.isElement(__in, AmendmentIds__typeInfo)) {
      setAmendmentIds((java.lang.String[])__typeMapper.readObject(__in, AmendmentIds__typeInfo, java.lang.String[].class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Errors__typeInfo)) {
      setErrors((com.sforce.soap.Error[])__typeMapper.readObject(__in, Errors__typeInfo, com.sforce.soap.Error[].class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, InvoiceDatas__typeInfo)) {
      setInvoiceDatas((com.sforce.soap.InvoiceData[])__typeMapper.readObject(__in, InvoiceDatas__typeInfo, com.sforce.soap.InvoiceData[].class));
    }
    __in.peekTag();
    if (__typeMapper.isElement(__in, Success__typeInfo)) {
      setSuccess((boolean)__typeMapper.readBoolean(__in, Success__typeInfo, boolean.class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[AmendResult ");
    
    sb.append(" AmendmentIds=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(AmendmentIds)+"'\n");
    sb.append(" Errors=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Errors)+"'\n");
    sb.append(" InvoiceDatas=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(InvoiceDatas)+"'\n");
    sb.append(" Success=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(Success)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}