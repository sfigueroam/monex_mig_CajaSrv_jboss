
package org.openuri;

import java.math.BigDecimal;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "RecaServicesSoap", targetNamespace = "http://www.openuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface RecaServicesSoap {


    /**
     * <p>Consulta Aviso Recibo.
     * 
     * @param formTipo
     * @param avisoReciboCodigo
     * @param oficinaId
     * @return
     *     returns org.openuri.ConsultarAvisoReciboResult
     */
    @WebMethod(action = "http://www.openuri.org/consultarAvisoRecibo")
    @WebResult(name = "consultarAvisoReciboResult", targetNamespace = "http://www.openuri.org/")
    @RequestWrapper(localName = "consultarAvisoRecibo", targetNamespace = "http://www.openuri.org/", className = "org.openuri.ConsultarAvisoRecibo")
    @ResponseWrapper(localName = "consultarAvisoReciboResponse", targetNamespace = "http://www.openuri.org/", className = "org.openuri.ConsultarAvisoReciboResponse")
    public ConsultarAvisoReciboResult consultarAvisoRecibo(
        @WebParam(name = "oficinaId", targetNamespace = "http://www.openuri.org/")
        BigDecimal oficinaId,
        @WebParam(name = "avisoReciboCodigo", targetNamespace = "http://www.openuri.org/")
        String avisoReciboCodigo,
        @WebParam(name = "formTipo", targetNamespace = "http://www.openuri.org/")
        BigDecimal formTipo);

    /**
     * <p>Consulta Deudas.
     * 
     * @param clave
     * @param oficinaId
     * @return
     *     returns org.openuri.ConsultarDeudaResult
     */
    @WebMethod(action = "http://www.openuri.org/consultarDeuda")
    @WebResult(name = "consultarDeudaResult", targetNamespace = "http://www.openuri.org/")
    @RequestWrapper(localName = "consultarDeuda", targetNamespace = "http://www.openuri.org/", className = "org.openuri.ConsultarDeuda")
    @ResponseWrapper(localName = "consultarDeudaResponse", targetNamespace = "http://www.openuri.org/", className = "org.openuri.ConsultarDeudaResponse")
    public ConsultarDeudaResult consultarDeuda(
        @WebParam(name = "oficinaId", targetNamespace = "http://www.openuri.org/")
        BigDecimal oficinaId,
        @WebParam(name = "clave", targetNamespace = "http://www.openuri.org/")
        RecaClave clave);

    /**
     * <p>Pago Aviso Recibo.
     * 
     * @param operacionSecuencia
     * @param avisoReciboFuente
     * @param turnoInicio
     * @param operacionFecha
     * @param avisoReciboCodigo
     * @param ingresoForzado
     * @param terminal
     * @param folioF01
     * @param claveDeuda
     * @param operacionFolio
     * @param oficinaId
     * @param montoPagado
     * @param medioPago
     * @return
     *     returns java.math.BigDecimal
     */
    @WebMethod(action = "http://www.openuri.org/pagarAvisoRecibo")
    @WebResult(name = "pagarAvisoReciboResult", targetNamespace = "http://www.openuri.org/")
    @RequestWrapper(localName = "pagarAvisoRecibo", targetNamespace = "http://www.openuri.org/", className = "org.openuri.PagarAvisoRecibo")
    @ResponseWrapper(localName = "pagarAvisoReciboResponse", targetNamespace = "http://www.openuri.org/", className = "org.openuri.PagarAvisoReciboResponse")
    public BigDecimal pagarAvisoRecibo(
        @WebParam(name = "oficinaId", targetNamespace = "http://www.openuri.org/")
        BigDecimal oficinaId,
        @WebParam(name = "terminal", targetNamespace = "http://www.openuri.org/")
        String terminal,
        @WebParam(name = "turnoInicio", targetNamespace = "http://www.openuri.org/")
        XMLGregorianCalendar turnoInicio,
        @WebParam(name = "operacionFecha", targetNamespace = "http://www.openuri.org/")
        XMLGregorianCalendar operacionFecha,
        @WebParam(name = "operacionFolio", targetNamespace = "http://www.openuri.org/")
        BigDecimal operacionFolio,
        @WebParam(name = "operacionSecuencia", targetNamespace = "http://www.openuri.org/")
        BigDecimal operacionSecuencia,
        @WebParam(name = "avisoReciboFuente", targetNamespace = "http://www.openuri.org/")
        String avisoReciboFuente,
        @WebParam(name = "avisoReciboCodigo", targetNamespace = "http://www.openuri.org/")
        String avisoReciboCodigo,
        @WebParam(name = "folioF01", targetNamespace = "http://www.openuri.org/")
        BigDecimal folioF01,
        @WebParam(name = "montoPagado", targetNamespace = "http://www.openuri.org/")
        BigDecimal montoPagado,
        @WebParam(name = "medioPago", targetNamespace = "http://www.openuri.org/")
        MedioPago medioPago,
        @WebParam(name = "ingresoForzado", targetNamespace = "http://www.openuri.org/")
        Boolean ingresoForzado,
        @WebParam(name = "claveDeuda", targetNamespace = "http://www.openuri.org/")
        RecaClave claveDeuda);

    /**
     * <p>Reversa Pago Aviso Recibo.
     * 
     * @param operacionSecuencia
     * @param avisoReciboFuente
     * @param claveDeuda
     * @param turnoInicio
     * @param operacionFecha
     * @param avisoReciboCodigo
     * @param ingresoForzado
     * @param operacionFolio
     * @param oficinaId
     * @param terminal
     * @param montoPagado
     * @param folioF01
     * @return
     *     returns java.math.BigDecimal
     */
    @WebMethod(action = "http://www.openuri.org/reversarPagoAvisoRecibo")
    @WebResult(name = "reversarPagoAvisoReciboResult", targetNamespace = "http://www.openuri.org/")
    @RequestWrapper(localName = "reversarPagoAvisoRecibo", targetNamespace = "http://www.openuri.org/", className = "org.openuri.ReversarPagoAvisoRecibo")
    @ResponseWrapper(localName = "reversarPagoAvisoReciboResponse", targetNamespace = "http://www.openuri.org/", className = "org.openuri.ReversarPagoAvisoReciboResponse")
    public BigDecimal reversarPagoAvisoRecibo(
        @WebParam(name = "oficinaId", targetNamespace = "http://www.openuri.org/")
        BigDecimal oficinaId,
        @WebParam(name = "terminal", targetNamespace = "http://www.openuri.org/")
        String terminal,
        @WebParam(name = "turnoInicio", targetNamespace = "http://www.openuri.org/")
        XMLGregorianCalendar turnoInicio,
        @WebParam(name = "operacionFecha", targetNamespace = "http://www.openuri.org/")
        XMLGregorianCalendar operacionFecha,
        @WebParam(name = "operacionFolio", targetNamespace = "http://www.openuri.org/")
        BigDecimal operacionFolio,
        @WebParam(name = "operacionSecuencia", targetNamespace = "http://www.openuri.org/")
        BigDecimal operacionSecuencia,
        @WebParam(name = "avisoReciboFuente", targetNamespace = "http://www.openuri.org/")
        String avisoReciboFuente,
        @WebParam(name = "avisoReciboCodigo", targetNamespace = "http://www.openuri.org/")
        String avisoReciboCodigo,
        @WebParam(name = "folioF01", targetNamespace = "http://www.openuri.org/")
        BigDecimal folioF01,
        @WebParam(name = "montoPagado", targetNamespace = "http://www.openuri.org/")
        BigDecimal montoPagado,
        @WebParam(name = "ingresoForzado", targetNamespace = "http://www.openuri.org/")
        Boolean ingresoForzado,
        @WebParam(name = "claveDeuda", targetNamespace = "http://www.openuri.org/")
        RecaClave claveDeuda);

    /**
     * <p>Extrae Tabla Oficinas TGR.
     * 
     * @return
     *     returns org.openuri.ArrayOfOficina
     */
    @WebMethod(action = "http://www.openuri.org/extraerTablaOficinas")
    @WebResult(name = "extraerTablaOficinasResult", targetNamespace = "http://www.openuri.org/")
    @RequestWrapper(localName = "extraerTablaOficinas", targetNamespace = "http://www.openuri.org/", className = "org.openuri.ExtraerTablaOficinas")
    @ResponseWrapper(localName = "extraerTablaOficinasResponse", targetNamespace = "http://www.openuri.org/", className = "org.openuri.ExtraerTablaOficinasResponse")
    public ArrayOfOficina extraerTablaOficinas();

    /**
     * <p>Extrae Hora Servidor.
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "http://www.openuri.org/extraerHoraServidor")
    @WebResult(name = "extraerHoraServidorResult", targetNamespace = "http://www.openuri.org/")
    @RequestWrapper(localName = "extraerHoraServidor", targetNamespace = "http://www.openuri.org/", className = "org.openuri.ExtraerHoraServidor")
    @ResponseWrapper(localName = "extraerHoraServidorResponse", targetNamespace = "http://www.openuri.org/", className = "org.openuri.ExtraerHoraServidorResponse")
    public String extraerHoraServidor();

    /**
     * <p>Pago Aviso Recibo.
     * 
     * @param folioEnvio
     * @return
     *     returns org.openuri.ProcesaTrnSafResult
     */
    @WebMethod(action = "http://www.openuri.org/pagoArCajaVaxSaf")
    @WebResult(name = "pagoArCajaVaxSafResult", targetNamespace = "http://www.openuri.org/")
    @RequestWrapper(localName = "pagoArCajaVaxSaf", targetNamespace = "http://www.openuri.org/", className = "org.openuri.PagoArCajaVaxSaf")
    @ResponseWrapper(localName = "pagoArCajaVaxSafResponse", targetNamespace = "http://www.openuri.org/", className = "org.openuri.PagoArCajaVaxSafResponse")
    public ProcesaTrnSafResult pagoArCajaVaxSaf(
        @WebParam(name = "folioEnvio", targetNamespace = "http://www.openuri.org/")
        BigDecimal folioEnvio);

}