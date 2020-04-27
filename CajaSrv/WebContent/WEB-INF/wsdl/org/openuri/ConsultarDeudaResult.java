
package org.openuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsultarDeudaResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsultarDeudaResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recaDeudaArr" type="{http://www.openuri.org/}ArrayOfRecaDeuda" minOccurs="0"/>
 *         &lt;element name="codigoRetorno" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mensajeRetorno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarDeudaResult", propOrder = {
    "recaDeudaArr",
    "codigoRetorno",
    "mensajeRetorno"
})
public class ConsultarDeudaResult {

    protected ArrayOfRecaDeuda recaDeudaArr;
    protected int codigoRetorno;
    protected String mensajeRetorno;

    /**
     * Gets the value of the recaDeudaArr property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRecaDeuda }
     *     
     */
    public ArrayOfRecaDeuda getRecaDeudaArr() {
        return recaDeudaArr;
    }

    /**
     * Sets the value of the recaDeudaArr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRecaDeuda }
     *     
     */
    public void setRecaDeudaArr(ArrayOfRecaDeuda value) {
        this.recaDeudaArr = value;
    }

    /**
     * Gets the value of the codigoRetorno property.
     * 
     */
    public int getCodigoRetorno() {
        return codigoRetorno;
    }

    /**
     * Sets the value of the codigoRetorno property.
     * 
     */
    public void setCodigoRetorno(int value) {
        this.codigoRetorno = value;
    }

    /**
     * Gets the value of the mensajeRetorno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensajeRetorno() {
        return mensajeRetorno;
    }

    /**
     * Sets the value of the mensajeRetorno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensajeRetorno(String value) {
        this.mensajeRetorno = value;
    }

}
