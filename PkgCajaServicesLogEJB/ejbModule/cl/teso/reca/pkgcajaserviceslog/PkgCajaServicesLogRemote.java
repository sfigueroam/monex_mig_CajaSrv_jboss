package cl.teso.reca.pkgcajaserviceslog;

import java.math.BigDecimal;

import javax.ejb.Remote;

@Remote
public interface PkgCajaServicesLogRemote {


	public abstract GrabaLogTransaccionResult grabaLogTransaccion(
			String inTransaccionNombre, BigDecimal inOficina,
			BigDecimal inFormulario, String inCodigoAr, String inRutRol,
			String inParametros, BigDecimal inCodigoRetorno,
			String inMensajeRetorno, BigDecimal inCodigoRetOracle,
			String inMensajeRetOracle) throws PkgCajaServicesLogException;

}