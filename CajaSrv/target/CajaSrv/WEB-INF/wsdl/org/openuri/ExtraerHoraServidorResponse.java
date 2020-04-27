
package org.openuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="extraerHoraServidorResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "extraerHoraServidorResult"
})
@XmlRootElement(name = "extraerHoraServidorResponse")
public class ExtraerHoraServidorResponse {

    protected String extraerHoraServidorResult;

    /**
     * Gets the value of the extraerHoraServidorResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraerHoraServidorResult() {
        return extraerHoraServidorResult;
    }

    /**
     * Sets the value of the extraerHoraServidorResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraerHoraServidorResult(String value) {
        this.extraerHoraServidorResult = value;
    }

}
