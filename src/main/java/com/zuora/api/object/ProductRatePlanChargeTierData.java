package com.zuora.api.object;

/**
 * Generated class, please do not edit.
 */
public class ProductRatePlanChargeTierData implements com.sforce.ws.bind.XMLizable {

  /**
   * Constructor
   */
  public ProductRatePlanChargeTierData() {
  }
    
  
  /**
   * element  : ProductRatePlanChargeTier of type {http://object.api.zuora.com/}ProductRatePlanChargeTier
   * java type: com.sforce.soap.ProductRatePlanChargeTier[]
   */
  private static final com.sforce.ws.bind.TypeInfo ProductRatePlanChargeTier__typeInfo =
    new com.sforce.ws.bind.TypeInfo("http://api.zuora.com/","ProductRatePlanChargeTier","http://object.api.zuora.com/","ProductRatePlanChargeTier",0,-1,true);

  private boolean ProductRatePlanChargeTier__is_set = false;

  private com.zuora.api.object.ProductRatePlanChargeTier[] ProductRatePlanChargeTier = new com.zuora.api.object.ProductRatePlanChargeTier[0];

  public com.zuora.api.object.ProductRatePlanChargeTier[] getProductRatePlanChargeTier() {
    return ProductRatePlanChargeTier;
  }

  

  public void setProductRatePlanChargeTier(com.zuora.api.object.ProductRatePlanChargeTier[] ProductRatePlanChargeTier) {
    this.ProductRatePlanChargeTier = ProductRatePlanChargeTier;
    ProductRatePlanChargeTier__is_set = true;
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
   
    __typeMapper.writeObject(__out, ProductRatePlanChargeTier__typeInfo, ProductRatePlanChargeTier, ProductRatePlanChargeTier__is_set);
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
    if (__typeMapper.isElement(__in, ProductRatePlanChargeTier__typeInfo)) {
      setProductRatePlanChargeTier((com.zuora.api.object.ProductRatePlanChargeTier[])__typeMapper.readObject(__in, ProductRatePlanChargeTier__typeInfo, com.zuora.api.object.ProductRatePlanChargeTier[].class));
    }
  }

  public String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("[ProductRatePlanChargeTierData ");
    
    sb.append(" ProductRatePlanChargeTier=");
    sb.append("'"+com.sforce.ws.util.Verbose.toString(ProductRatePlanChargeTier)+"'\n");
    sb.append("]\n");
    return sb.toString();
  }
}