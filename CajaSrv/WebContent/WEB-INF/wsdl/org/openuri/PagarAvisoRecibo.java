
package org.openuri;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="terminal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="turnoInicio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="operacionFecha" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="operacionFolio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="operacionSecuencia" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="avisoReciboFuente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="avisoReciboCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="folioF01" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="montoPagado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="medioPago" type="{http://www.openuri.org/}MedioPago" minOccurs="0"/>
 *         &lt;element name="ingresoForzado" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="claveDeuda" type="{http://www.openuri.org/}RecaClave" minOccurs="0"/>
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
    "terminal",
    "turnoInicio",
    "operacionFecha",
    "operacionFolio",
    "operacionSecuencia",
    "avisoReciboFuente",
    "avisoReciboCodigo",
    "folioF01",
    "montoPagado",
    "medioPago",
    "ingresoForzado",
    "claveDeuda"
})
@XmlRootElement(name = "pagarAvisoRecibo")
public class PagarAvisoRecibo {

    protected BigDecimal oficinaId;
    protected String terminal;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar turnoInicio;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar operacionFecha;
    protected BigDecimal operacionFolio;
    protected BigDecimal operacionSecuencia;
    protected String avisoReciboFuente;
    protected String avisoReciboCodigo;
    protected BigDecimal folioF01;
    protected BigDecimal montoPagado;
    protected MedioPago medioPago;
    protected Boolean ingresoForzado;
    protected RecaClave claveDeuda;

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
     * Gets the value of the terminal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminal() {
        return terminal;
    }

    /**
     * Sets the value of the terminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminal(String value) {
        this.terminal = value;
    }

    /**
     * Gets the value of the turnoInicio property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTurnoInicio() {
        return turnoInicio;
    }

    /**
     * Sets the value of the turnoInicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTurnoInicio(XMLGregorianCalendar value) {
        this.turnoInicio = value;
    }

    /**
     * Gets the value of the operacionFecha property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOperacionFecha() {
        return operacionFecha;
    }

    /**
     * Sets the value of the operacionFecha property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOperacionFecha(XMLGregorianCalendar value) {
        this.operacionFecha = value;
    }

    /**
     * Gets the value of the operacionFolio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOperacionFolio() {
        return operacionFolio;
    }

    /**
     * Sets the value of the operacionFolio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOperacionFolio(BigDecimal value) {
        this.operacionFolio = value;
    }

    /**
     * Gets the value of the operacionSecuencia property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOperacionSecuencia() {
        return operacionSecuencia;
    }

    /**
     * Sets the value of the operacionSecuencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOperacionSecuencia(BigDecimal value) {
        this.operacionSecuencia = value;
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

    /**
     * Gets the value of the folioF01 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFolioF01() {
        return folioF01;
    }

    /**
     * Sets the value of the folioF01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFolioF01(BigDecimal value) {
        this.folioF01 = value;
    }

    /**
     * Gets the value of the montoPagado property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoPagado() {
        return montoPagado;
    }

    /**
     * Sets the value of the montoPagado property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoPagado(BigDecimal value) {
        this.montoPagado = value;
    }

    /**
     * Gets the value of the medioPago property.
     * 
     * @return
     *     possible object is
     *     {@link MedioPago }
     *     
     */
    public MedioPago getMedioPago() {
        return medioPago;
    }

    /**
     * Sets the value of the medioPago property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedioPago }
     *     
     */
    public void setMedioPago(MedioPago value) {
        this.medioPago = value;
    }

    /**
     * Gets the value of the ingresoForzado property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIngresoForzado() {
        return ingresoForzado;
    }

    /**
     * Sets the value of the ingresoForzado property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIngresoForzado(Boolean value) {
        this.ingresoForzado = value;
    }

    /**
     * Gets the value of the claveDeuda property.
     * 
     * @return
     *     possible object is
     *     {@link RecaClave }
     *     
     */
    public RecaClave getClaveDeuda() {
        return claveDeuda;
    }

    /**
     * Sets the value of the claveDeuda property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecaClave }
     *     
     */
    public void setClaveDeuda(RecaClave value) {
        this.claveDeuda = value;
    }

}
