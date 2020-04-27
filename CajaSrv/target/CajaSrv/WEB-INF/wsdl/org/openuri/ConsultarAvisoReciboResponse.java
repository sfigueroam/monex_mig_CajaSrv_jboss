
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
 *         &lt;element name="consultarAvisoReciboResult" type="{http://www.openuri.org/}ConsultarAvisoReciboResult" minOccurs="0"/>
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
    "consultarAvisoReciboResult"
})
@XmlRootElement(name = "consultarAvisoReciboResponse")
public class ConsultarAvisoReciboResponse {

    protected ConsultarAvisoReciboResult consultarAvisoReciboResult;

    /**
     * Gets the value of the consultarAvisoReciboResult property.
     * 
     * @return
     *     possible object is
     *     {@link ConsultarAvisoReciboResult }
     *     
     */
    public ConsultarAvisoReciboResult getConsultarAvisoReciboResult() {
        return consultarAvisoReciboResult;
    }

    /**
     * Sets the value of the consultarAvisoReciboResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultarAvisoReciboResult }
     *     
     */
    public void setConsultarAvisoReciboResult(ConsultarAvisoReciboResult value) {
        this.consultarAvisoReciboResult = value;
    }

}
