
package org.openuri;

import java.math.BigDecimal;
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
 *         &lt;element name="reversarPagoAvisoReciboResult" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
    "reversarPagoAvisoReciboResult"
})
@XmlRootElement(name = "reversarPagoAvisoReciboResponse")
public class ReversarPagoAvisoReciboResponse {

    protected BigDecimal reversarPagoAvisoReciboResult;

    /**
     * Gets the value of the reversarPagoAvisoReciboResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReversarPagoAvisoReciboResult() {
        return reversarPagoAvisoReciboResult;
    }

    /**
     * Sets the value of the reversarPagoAvisoReciboResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReversarPagoAvisoReciboResult(BigDecimal value) {
        this.reversarPagoAvisoReciboResult = value;
    }

}
