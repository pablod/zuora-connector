
package com.zuora.api.fault;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvalidValueFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvalidValueFault">
 *   &lt;complexContent>
 *     &lt;extension base="{http://fault.api.zuora.com/}ApiFault">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvalidValueFault")
public class InvalidValueFault
    extends ApiFault
    implements Serializable
{

    private final static long serialVersionUID = 100L;

}
