
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
 *         &lt;element name="pagoArCajaVaxSafResult" type="{http://www.openuri.org/}ProcesaTrnSafResult" minOccurs="0"/>
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
    "pagoArCajaVaxSafResult"
})
@XmlRootElement(name = "pagoArCajaVaxSafResponse")
public class PagoArCajaVaxSafResponse {

    protected ProcesaTrnSafResult pagoArCajaVaxSafResult;

    /**
     * Gets the value of the pagoArCajaVaxSafResult property.
     * 
     * @return
     *     possible object is
     *     {@link ProcesaTrnSafResult }
     *     
     */
    public ProcesaTrnSafResult getPagoArCajaVaxSafResult() {
        return pagoArCajaVaxSafResult;
    }

    /**
     * Sets the value of the pagoArCajaVaxSafResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcesaTrnSafResult }
     *     
     */
    public void setPagoArCajaVaxSafResult(ProcesaTrnSafResult value) {
        this.pagoArCajaVaxSafResult = value;
    }

}
