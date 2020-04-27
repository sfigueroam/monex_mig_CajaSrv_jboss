
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
 *         &lt;element name="extraerTablaOficinasResult" type="{http://www.openuri.org/}ArrayOfOficina" minOccurs="0"/>
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
    "extraerTablaOficinasResult"
})
@XmlRootElement(name = "extraerTablaOficinasResponse")
public class ExtraerTablaOficinasResponse {

    protected ArrayOfOficina extraerTablaOficinasResult;

    /**
     * Gets the value of the extraerTablaOficinasResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOficina }
     *     
     */
    public ArrayOfOficina getExtraerTablaOficinasResult() {
        return extraerTablaOficinasResult;
    }

    /**
     * Sets the value of the extraerTablaOficinasResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOficina }
     *     
     */
    public void setExtraerTablaOficinasResult(ArrayOfOficina value) {
        this.extraerTablaOficinasResult = value;
    }

}
