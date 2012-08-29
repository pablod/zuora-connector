
package com.zuora.api;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.zuora.api.object.Dynamic;
import com.zuora.api.object.ZObject;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zObjects" type="{http://object.api.zuora.com/}zObject" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "zObjects"
})
@XmlRootElement(name = "create")
public class Create
    extends Dynamic
    implements Serializable
{

    private final static long serialVersionUID = 100L;
    protected List<ZObject> zObjects;

    /**
     * Gets the value of the zObjects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zObjects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZObjects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ZObject }
     * 
     * 
     */
    public List<ZObject> getZObjects() {
        if (zObjects == null) {
            zObjects = new ArrayList<ZObject>();
        }
        return this.zObjects;
    }

}