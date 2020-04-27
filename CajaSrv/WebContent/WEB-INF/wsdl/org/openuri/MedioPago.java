
package org.openuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MedioPago complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MedioPago">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nemo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cheque" type="{http://www.openuri.org/}Cheque" minOccurs="0"/>
 *         &lt;element name="tarjeta" type="{http://www.openuri.org/}Tarjeta" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedioPago", propOrder = {
    "nemo",
    "fecha",
    "cheque",
    "tarjeta"
})
public class MedioPago {

    protected String nemo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;
    protected Cheque cheque;
    protected Tarjeta tarjeta;

    /**
     * Gets the value of the nemo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNemo() {
        return nemo;
    }

    /**
     * Sets the value of the nemo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNemo(String value) {
        this.nemo = value;
    }

    /**
     * Gets the value of the fecha property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * Sets the value of the fecha property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecha(XMLGregorianCalendar value) {
        this.fecha = value;
    }

    /**
     * Gets the value of the cheque property.
     * 
     * @return
     *     possible object is
     *     {@link Cheque }
     *     
     */
    public Cheque getCheque() {
        return cheque;
    }

    /**
     * Sets the value of the cheque property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cheque }
     *     
     */
    public void setCheque(Cheque value) {
        this.cheque = value;
    }

    /**
     * Gets the value of the tarjeta property.
     * 
     * @return
     *     possible object is
     *     {@link Tarjeta }
     *     
     */
    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    /**
     * Sets the value of the tarjeta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tarjeta }
     *     
     */
    public void setTarjeta(Tarjeta value) {
        this.tarjeta = value;
    }

}
