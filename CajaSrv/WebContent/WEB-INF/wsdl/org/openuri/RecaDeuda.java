
package org.openuri;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RecaDeuda complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecaDeuda">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recaClave" type="{http://www.openuri.org/}RecaClave" minOccurs="0"/>
 *         &lt;element name="fechaValidez" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaEmision" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaLiquidacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="monedaId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="montoEnPlazo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="montoReajustes" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="montoIntereses" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="montoCondonacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="montoMultas" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="montoTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="avisoReciboFuente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="avisoReciboCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecaDeuda", propOrder = {
    "recaClave",
    "fechaValidez",
    "fechaEmision",
    "fechaLiquidacion",
    "monedaId",
    "montoEnPlazo",
    "montoReajustes",
    "montoIntereses",
    "montoCondonacion",
    "montoMultas",
    "montoTotal",
    "avisoReciboFuente",
    "avisoReciboCodigo"
})
public class RecaDeuda {

    protected RecaClave recaClave;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaValidez;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaEmision;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaLiquidacion;
    protected BigDecimal monedaId;
    protected BigDecimal montoEnPlazo;
    protected BigDecimal montoReajustes;
    protected BigDecimal montoIntereses;
    protected BigDecimal montoCondonacion;
    protected BigDecimal montoMultas;
    protected BigDecimal montoTotal;
    protected String avisoReciboFuente;
    protected String avisoReciboCodigo;

    /**
     * Gets the value of the recaClave property.
     * 
     * @return
     *     possible object is
     *     {@link RecaClave }
     *     
     */
    public RecaClave getRecaClave() {
        return recaClave;
    }

    /**
     * Sets the value of the recaClave property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecaClave }
     *     
     */
    public void setRecaClave(RecaClave value) {
        this.recaClave = value;
    }

    /**
     * Gets the value of the fechaValidez property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaValidez() {
        return fechaValidez;
    }

    /**
     * Sets the value of the fechaValidez property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaValidez(XMLGregorianCalendar value) {
        this.fechaValidez = value;
    }

    /**
     * Gets the value of the fechaEmision property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaEmision() {
        return fechaEmision;
    }

    /**
     * Sets the value of the fechaEmision property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaEmision(XMLGregorianCalendar value) {
        this.fechaEmision = value;
    }

    /**
     * Gets the value of the fechaLiquidacion property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaLiquidacion() {
        return fechaLiquidacion;
    }

    /**
     * Sets the value of the fechaLiquidacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaLiquidacion(XMLGregorianCalendar value) {
        this.fechaLiquidacion = value;
    }

    /**
     * Gets the value of the monedaId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMonedaId() {
        return monedaId;
    }

    /**
     * Sets the value of the monedaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMonedaId(BigDecimal value) {
        this.monedaId = value;
    }

    /**
     * Gets the value of the montoEnPlazo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoEnPlazo() {
        return montoEnPlazo;
    }

    /**
     * Sets the value of the montoEnPlazo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoEnPlazo(BigDecimal value) {
        this.montoEnPlazo = value;
    }

    /**
     * Gets the value of the montoReajustes property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoReajustes() {
        return montoReajustes;
    }

    /**
     * Sets the value of the montoReajustes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoReajustes(BigDecimal value) {
        this.montoReajustes = value;
    }

    /**
     * Gets the value of the montoIntereses property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoIntereses() {
        return montoIntereses;
    }

    /**
     * Sets the value of the montoIntereses property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoIntereses(BigDecimal value) {
        this.montoIntereses = value;
    }

    /**
     * Gets the value of the montoCondonacion property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoCondonacion() {
        return montoCondonacion;
    }

    /**
     * Sets the value of the montoCondonacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoCondonacion(BigDecimal value) {
        this.montoCondonacion = value;
    }

    /**
     * Gets the value of the montoMultas property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoMultas() {
        return montoMultas;
    }

    /**
     * Sets the value of the montoMultas property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoMultas(BigDecimal value) {
        this.montoMultas = value;
    }

    /**
     * Gets the value of the montoTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoTotal() {
        return montoTotal;
    }

    /**
     * Sets the value of the montoTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoTotal(BigDecimal value) {
        this.montoTotal = value;
    }

    /**
     * Gets the value of the avisoReciboFuente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvisoReciboFuente() {
        return avisoReciboFuente;
    }

    /**
     * Sets the value of the avisoReciboFuente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvisoReciboFuente(String value) {
        this.avisoReciboFuente = value;
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

}
