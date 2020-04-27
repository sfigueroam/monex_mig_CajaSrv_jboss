package cl.teso.reca.pkgcajaservicestrx;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.ejb.Remote;

import cl.teso.reca.pkgcajaservicestrx.classes.Messages.ConsultarDeudaResult;
import cl.teso.reca.pkgcajaservicestrx.classes.Messages.MedioPago;
import cl.teso.reca.pkgcajaservicestrx.classes.Messages.PagoResult;
import cl.teso.reca.pkgcutservicestrx.classes.Messages.ConsultarAvisoReciboResult;
import cl.teso.reca.pkgcutservicestrx.classes.Messages.RecaClave;
import cl.teso.reca.pkgcutservicestrx.classes.Messages.RecaItemsVax;
import cl.teso.reca.pkgcutservicestrxsaf.messages.ProcesaTrnSafResult;

@Remote
public interface PkgCajaServicesTrxRemote {

	public abstract ConsultarAvisoReciboResult consultaARCaja(
			BigDecimal oficinaId, String avisoReciboCodigo, BigDecimal formTipo);

	public abstract ConsultarDeudaResult consultaDeudaCaja(
			BigDecimal oficinaId, RecaClave clave);

	public abstract PagoResult pagoARCaja(BigDecimal oficinaId,
			String terminal, Calendar turnoInicio, Calendar operacionFecha,
			BigDecimal operacionFolio, BigDecimal operacionSecuencia,
			String avisoReciboFuente, String avisoReciboCodigo,
			BigDecimal folioF01, BigDecimal montoPagado, MedioPago medioPago,
			Boolean ingresoForzado, RecaClave claveDeuda);

	public abstract ProcesaTrnSafResult pagoArCajaVaxSaf(BigDecimal folioEnvio)
			throws Exception;

	public abstract PagoResult reversaPagoARCaja(BigDecimal oficinaId,
			String terminal, Calendar turnoInicio, Calendar operacionFecha,
			BigDecimal operacionFolio, BigDecimal operacionSecuencia,
			String avisoReciboFuente, String avisoReciboCodigo,
			BigDecimal folioF01, BigDecimal montoPagado,
			Boolean ingresoForzado, RecaClave claveDeuda);

	public abstract RecaItemsVax[] formateaRecaItemsVax(BigDecimal formTipo,
			RecaItemsVax[] recaItems) throws Exception;

}