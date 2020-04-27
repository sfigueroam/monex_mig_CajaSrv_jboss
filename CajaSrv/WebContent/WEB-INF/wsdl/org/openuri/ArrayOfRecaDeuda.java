
package org.openuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRecaDeuda complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRecaDeuda">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecaDeuda" type="{http://www.openuri.org/}RecaDeuda" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRecaDeuda", propOrder = {
    "recaDeuda"
})
public class ArrayOfRecaDeuda {

    @XmlElement(name = "RecaDeuda", nillable = true)
    protected List<RecaDeuda> recaDeuda;

    /**
     * Gets the value of the recaDeuda property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recaDeuda property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecaDeuda().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecaDeuda }
     * 
     * 
     */
    public List<RecaDeuda> getRecaDeuda() {
        if (recaDeuda == null) {
            recaDeuda = new ArrayList<RecaDeuda>();
        }
        return this.recaDeuda;
    }

}
