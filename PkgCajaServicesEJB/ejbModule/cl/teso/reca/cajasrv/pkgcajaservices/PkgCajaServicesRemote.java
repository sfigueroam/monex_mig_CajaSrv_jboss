package cl.teso.reca.cajasrv.pkgcajaservices;

import java.math.BigDecimal;
import java.util.Date;

import javax.ejb.Remote;

@Remote
public interface PkgCajaServicesRemote {

	public abstract ConsultarArResult consultarAr(BigDecimal dpsid)
			throws PkgCajaServicesException;

	public abstract FormPagoCajaResult formPagoCaja(BigDecimal inFrmId)
			throws PkgCajaServicesException;

	public abstract GetFormDescrResult getFormDescr(BigDecimal inId)
			throws PkgCajaServicesException;

	public abstract GetFormPropertiesResult getFormProperties(
			BigDecimal inFrmId, String inProp) throws PkgCajaServicesException;

	public abstract GetFrmIdResult getFrmId(BigDecimal inFormCod,
			String inFormVer, String inFormVig) throws PkgCajaServicesException;

	public abstract GetFrmIdSafeResult getFrmIdSafe(BigDecimal inFormCod,
			String inFormVer, String inFormVig) throws PkgCajaServicesException;

	public abstract GetItemdefResult getItemdef(BigDecimal inFrmId,
			BigDecimal inItmCode) throws PkgCajaServicesException;

	public abstract GetItemdefSafeResult getItemdefSafe(BigDecimal inFrmId,
			BigDecimal inItmCode) throws PkgCajaServicesException;

	public abstract GetItemdescripcionResult getItemdescripcion(
			BigDecimal inFormtipo, String inFormversion, BigDecimal inItmCode)
			throws PkgCajaServicesException;

	public abstract GetItmCodeUsageResult getItmCodeUsage(BigDecimal inFrmId,
			String inCodigoUsage) throws PkgCajaServicesException;

	public abstract GetMapComunasResult getMapComunas()
			throws PkgCajaServicesException;

	public abstract GetMapDpsResult getMapDps() throws PkgCajaServicesException;

	public abstract GetMapFResult getMapF() throws PkgCajaServicesException;

	public abstract GetOficinaDescripcionResult getOficinaDescripcion(
			BigDecimal inOficinaNumero) throws PkgCajaServicesException;

	public abstract GetTablaOficinasResult getTablaOficinas()
			throws PkgCajaServicesException;

	public abstract GrabaLogTransaccionResult grabaLogTransaccion(
			String inTransaccionNombre, BigDecimal inOficina,
			BigDecimal inFormulario, String inCodigoAr, String inRutRol,
			String inParametros, BigDecimal inCodigoRetorno,
			String inMensajeRetorno, BigDecimal inCodigoRetOracle,
			String inMensajeRetOracle) throws PkgCajaServicesException;

	public abstract IngresarArResult ingresarAr(Date inFechaCaja,
			Date inFechaEmision, Date inFechaValidez, BigDecimal inSistema,
			String inUsuario, BigDecimal inClienteTipo, BigDecimal inRutRol,
			String inRutRolDv, BigDecimal inFormCod, String inFormVer,
			BigDecimal inFormFolio, String inFormFolioDv, Date inPeriodo,
			Date inFechaVcto, String inItems, String inItemsCut,
			BigDecimal inMoneda, BigDecimal inMontoPlazo,
			BigDecimal inMontoTotal, BigDecimal inReajustes,
			BigDecimal inIntereses, BigDecimal inMultas,
			BigDecimal inCondonaciones, String inEsRezagado,
			String outCodigoBarra) throws PkgCajaServicesException;

	public abstract IngresarPagoResult ingresarPago(BigDecimal inDpsid,
			String inIdPago, BigDecimal inMontoPagado, Date inFechaPago)
			throws PkgCajaServicesException;

	public abstract PenalizeResult penalize(String touplestgf,
			String contexttgfin) throws PkgCajaServicesException;

	public abstract ProcesarResult procesar(String touplestgf,
			String contexttgfin) throws PkgCajaServicesException;

}