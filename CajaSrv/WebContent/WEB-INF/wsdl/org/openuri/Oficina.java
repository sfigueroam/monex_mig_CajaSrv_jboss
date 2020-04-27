
package org.openuri;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Oficina complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Oficina">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rutIra" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dvIra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoABIF" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="oficinaNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oficinaConara" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="oficinaNumero" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="oficinaCuentaCte" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Oficina", propOrder = {
    "rutIra",
    "dvIra",
    "codigoABIF",
    "oficinaNombre",
    "oficinaConara",
    "oficinaNumero",
    "oficinaCuentaCte"
})
public class Oficina {

    protected BigDecimal rutIra;
    protected String dvIra;
    protected BigDecimal codigoABIF;
    protected String oficinaNombre;
    protected BigDecimal oficinaConara;
    protected BigDecimal oficinaNumero;
    protected BigDecimal oficinaCuentaCte;

    /**
     * Gets the value of the rutIra property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRutIra() {
        return rutIra;
    }

    /**
     * Sets the value of the rutIra property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRutIra(BigDecimal value) {
        this.rutIra = value;
    }

    /**
     * Gets the value of the dvIra property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDvIra() {
        return dvIra;
    }

    /**
     * Sets the value of the dvIra property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDvIra(String value) {
        this.dvIra = value;
    }

    /**
     * Gets the value of the codigoABIF property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCodigoABIF() {
        return codigoABIF;
    }

    /**
     * Sets the value of the codigoABIF property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCodigoABIF(BigDecimal value) {
        this.codigoABIF = value;
    }

    /**
     * Gets the value of the oficinaNombre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOficinaNombre() {
        return oficinaNombre;
    }

    /**
     * Sets the value of the oficinaNombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOficinaNombre(String value) {
        this.oficinaNombre = value;
    }

    /**
     * Gets the value of the oficinaConara property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOficinaConara() {
        return oficinaConara;
    }

    /**
     * Sets the value of the oficinaConara property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOficinaConara(BigDecimal value) {
        this.oficinaConara = value;
    }

    /**
     * Gets the value of the oficinaNumero property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOficinaNumero() {
        return oficinaNumero;
    }

    /**
     * Sets the value of the oficinaNumero property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOficinaNumero(BigDecimal value) {
        this.oficinaNumero = value;
    }

    /**
     * Gets the value of the oficinaCuentaCte property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOficinaCuentaCte() {
        return oficinaCuentaCte;
    }

    /**
     * Sets the value of the oficinaCuentaCte property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOficinaCuentaCte(BigDecimal value) {
        this.oficinaCuentaCte = value;
    }

}
