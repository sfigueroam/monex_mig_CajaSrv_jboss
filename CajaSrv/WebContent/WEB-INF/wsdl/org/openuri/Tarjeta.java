
package org.openuri;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Tarjeta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Tarjeta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tarjetaTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tarjetaMarca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="autorizadorFecha" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="autorizadorTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="autorizadorCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cuotaTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cuotaNumero" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tarjeta", propOrder = {
    "tarjetaTipo",
    "tarjetaMarca",
    "autorizadorFecha",
    "autorizadorTipo",
    "autorizadorCodigo",
    "cuotaTipo",
    "cuotaNumero"
})
public class Tarjeta {

    protected String tarjetaTipo;
    protected String tarjetaMarca;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar autorizadorFecha;
    protected String autorizadorTipo;
    protected String autorizadorCodigo;
    protected String cuotaTipo;
    protected BigDecimal cuotaNumero;

    /**
     * Gets the value of the tarjetaTipo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarjetaTipo() {
        return tarjetaTipo;
    }

    /**
     * Sets the value of the tarjetaTipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarjetaTipo(String value) {
        this.tarjetaTipo = value;
    }

    /**
     * Gets the value of the tarjetaMarca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarjetaMarca() {
        return tarjetaMarca;
    }

    /**
     * Sets the value of the tarjetaMarca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarjetaMarca(String value) {
        this.tarjetaMarca = value;
    }

    /**
     * Gets the value of the autorizadorFecha property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAutorizadorFecha() {
        return autorizadorFecha;
    }

    /**
     * Sets the value of the autorizadorFecha property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAutorizadorFecha(XMLGregorianCalendar value) {
        this.autorizadorFecha = value;
    }

    /**
     * Gets the value of the autorizadorTipo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutorizadorTipo() {
        return autorizadorTipo;
    }

    /**
     * Sets the value of the autorizadorTipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutorizadorTipo(String value) {
        this.autorizadorTipo = value;
    }

    /**
     * Gets the value of the autorizadorCodigo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutorizadorCodigo() {
        return autorizadorCodigo;
    }

    /**
     * Sets the value of the autorizadorCodigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutorizadorCodigo(String value) {
        this.autorizadorCodigo = value;
    }

    /**
     * Gets the value of the cuotaTipo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuotaTipo() {
        return cuotaTipo;
    }

    /**
     * Sets the value of the cuotaTipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuotaTipo(String value) {
        this.cuotaTipo = value;
    }

    /**
     * Gets the value of the cuotaNumero property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCuotaNumero() {
        return cuotaNumero;
    }

    /**
     * Sets the value of the cuotaNumero property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCuotaNumero(BigDecimal value) {
        this.cuotaNumero = value;
    }

}
