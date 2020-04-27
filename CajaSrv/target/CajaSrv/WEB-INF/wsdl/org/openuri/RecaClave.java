
package org.openuri;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RecaClave complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecaClave">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clienteTipo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="rutRol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="institId" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="formTipo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="formFolio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="formVersion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="periodo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="vencimiento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="moneda" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecaClave", propOrder = {
    "clienteTipo",
    "rutRol",
    "institId",
    "formTipo",
    "formFolio",
    "formVersion",
    "periodo",
    "vencimiento",
    "moneda"
})
public class RecaClave {

    protected BigDecimal clienteTipo;
    protected String rutRol;
    protected BigDecimal institId;
    protected BigDecimal formTipo;
    protected BigDecimal formFolio;
    protected BigDecimal formVersion;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar periodo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar vencimiento;
    protected BigDecimal moneda;

    /**
     * Gets the value of the clienteTipo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getClienteTipo() {
        return clienteTipo;
    }

    /**
     * Sets the value of the clienteTipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setClienteTipo(BigDecimal value) {
        this.clienteTipo = value;
    }

    /**
     * Gets the value of the rutRol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRutRol() {
        return rutRol;
    }

    /**
     * Sets the value of the rutRol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRutRol(String value) {
        this.rutRol = value;
    }

    /**
     * Gets the value of the institId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInstitId() {
        return institId;
    }

    /**
     * Sets the value of the institId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInstitId(BigDecimal value) {
        this.institId = value;
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

    /**
     * Gets the value of the formFolio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFormFolio() {
        return formFolio;
    }

    /**
     * Sets the value of the formFolio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFormFolio(BigDecimal value) {
        this.formFolio = value;
    }

    /**
     * Gets the value of the formVersion property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFormVersion() {
        return formVersion;
    }

    /**
     * Sets the value of the formVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFormVersion(BigDecimal value) {
        this.formVersion = value;
    }

    /**
     * Gets the value of the periodo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPeriodo() {
        return periodo;
    }

    /**
     * Sets the value of the periodo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPeriodo(XMLGregorianCalendar value) {
        this.periodo = value;
    }

    /**
     * Gets the value of the vencimiento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVencimiento() {
        return vencimiento;
    }

    /**
     * Sets the value of the vencimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVencimiento(XMLGregorianCalendar value) {
        this.vencimiento = value;
    }

    /**
     * Gets the value of the moneda property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMoneda() {
        return moneda;
    }

    /**
     * Sets the value of the moneda property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMoneda(BigDecimal value) {
        this.moneda = value;
    }

}
