
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
 *         &lt;element name="oficinaId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="avisoReciboCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="formTipo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
    "oficinaId",
    "avisoReciboCodigo",
    "formTipo"
})
@XmlRootElement(name = "consultarAvisoRecibo")
public class ConsultarAvisoRecibo {

    protected BigDecimal oficinaId;
    protected String avisoReciboCodigo;
    protected BigDecimal formTipo;

    /**
     * Gets the value of the oficinaId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOficinaId() {
        return oficinaId;
    }

    /**
     * Sets the value of the oficinaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOficinaId(BigDecimal value) {
        this.oficinaId = value;
    }

    /**
     * Gets the value of the avisoReciboCodigo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvisoReciboCodigo() {
        return avisoReciboCodigo;
    }

    /**
     * Sets the value of the avisoReciboCodigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvisoReciboCodigo(String value) {
        this.avisoReciboCodigo = value;
    }

    /**
     * Gets the value of the formTipo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFormTipo() {
        return formTipo;
    }

    /**
     * Sets the value of the formTipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFormTipo(BigDecimal value) {
        this.formTipo = value;
    }

}
