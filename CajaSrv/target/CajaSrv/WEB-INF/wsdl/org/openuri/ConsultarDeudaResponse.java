
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
 *         &lt;element name="consultarDeudaResult" type="{http://www.openuri.org/}ConsultarDeudaResult" minOccurs="0"/>
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
    "consultarDeudaResult"
})
@XmlRootElement(name = "consultarDeudaResponse")
public class ConsultarDeudaResponse {

    protected ConsultarDeudaResult consultarDeudaResult;

    /**
     * Gets the value of the consultarDeudaResult property.
     * 
     * @return
     *     possible object is
     *     {@link ConsultarDeudaResult }
     *     
     */
    public ConsultarDeudaResult getConsultarDeudaResult() {
        return consultarDeudaResult;
    }

    /**
     * Sets the value of the consultarDeudaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultarDeudaResult }
     *     
     */
    public void setConsultarDeudaResult(ConsultarDeudaResult value) {
        this.consultarDeudaResult = value;
    }

}
