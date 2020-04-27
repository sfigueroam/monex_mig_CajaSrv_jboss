/*
 * File: GrabaLogTransaccionCaller.java  2009-09-10 15:52:14-04:00
 * User: Felipe Gonzalez (DP S.A.)
 *
 * File generated by OBCOM SQL Wizard 5.1.248 (www.obcom.cl).
 * DO NOT EDIT THIS FILE <<Signature:TVIPdcmBSoLSEAMyVr5lRK>>.
 */

package cl.teso.reca.cajasrv.pkgcajaservices;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import javax.sql.DataSource;
import javax.sql.RowSet;

/**
 * Implements a caller of procedure "RECA.PKG_CAJA_SERVICES.GRABA_LOG_TRANSACCION".
 *
 * IN_TRANSACCION_NOMBRE  VARCHAR2(4000)     Input
 * IN_OFICINA             NUMBER             Input
 * IN_FORMULARIO          NUMBER             Input
 * IN_CODIGO_AR           VARCHAR2(4000)     Input
 * IN_RUT_ROL             VARCHAR2(4000)     Input
 * IN_PARAMETROS          VARCHAR2(4000)     Input
 * IN_CODIGO_RETORNO      NUMBER             Input
 * IN_MENSAJE_RETORNO     VARCHAR2(4000)     Input
 * IN_CODIGO_RET_ORACLE   NUMBER             Input
 * IN_MENSAJE_RET_ORACLE  VARCHAR2(4000)     Input
 * OUT_RESULT_CODE        NUMBER             Output
 */
public class GrabaLogTransaccionCaller extends ProcedureCaller
{
    /**
     * Executes procedure "RECA.PKG_CAJA_SERVICES.GRABA_LOG_TRANSACCION" using a DataSource.
     */
    public static GrabaLogTransaccionResult execute(DataSource dataSource, String inTransaccionNombre, BigDecimal inOficina, BigDecimal inFormulario, String inCodigoAr, String inRutRol, String inParametros, BigDecimal inCodigoRetorno, String inMensajeRetorno, BigDecimal inCodigoRetOracle, String inMensajeRetOracle)
        throws SQLException
    {
        Connection conn = dataSource.getConnection();
        try
        {
            return execute(conn, inTransaccionNombre, inOficina, inFormulario, inCodigoAr, inRutRol, inParametros, inCodigoRetorno, inMensajeRetorno, inCodigoRetOracle, inMensajeRetOracle);
        }
        finally
        {
            conn.close();
        }
    }

    /**
     * Executes procedure "RECA.PKG_CAJA_SERVICES.GRABA_LOG_TRANSACCION" using a Connection.
     */
    public static GrabaLogTransaccionResult execute(Connection conn, String inTransaccionNombre, BigDecimal inOficina, BigDecimal inFormulario, String inCodigoAr, String inRutRol, String inParametros, BigDecimal inCodigoRetorno, String inMensajeRetorno, BigDecimal inCodigoRetOracle, String inMensajeRetOracle)
        throws SQLException
    {
        GrabaLogTransaccionResult result = new GrabaLogTransaccionResult();
        ArrayList resultSets = new ArrayList();
        CallableStatement call = conn.prepareCall("{call RECA.PKG_CAJA_SERVICES.GRABA_LOG_TRANSACCION(?,?,?,?,?,?,?,?,?,?,?)}");
        try
        {
            call.setString(1, inTransaccionNombre);
            call.setBigDecimal(2, inOficina);
            call.setBigDecimal(3, inFormulario);
            call.setString(4, inCodigoAr);
            call.setString(5, inRutRol);
            call.setString(6, inParametros);
            call.setBigDecimal(7, inCodigoRetorno);
            call.setString(8, inMensajeRetorno);
            call.setBigDecimal(9, inCodigoRetOracle);
            call.setString(10, inMensajeRetOracle);
            call.registerOutParameter(11, Types.NUMERIC);
            int updateCount = 0;
            boolean haveRset = call.execute();
            while (haveRset || updateCount != -1)
            {
                if (!haveRset)
                    updateCount = call.getUpdateCount();
                else
                    resultSets.add(toRowSet(call.getResultSet()));
                haveRset = call.getMoreResults();
            }
            result.setOutResultCode(call.getBigDecimal(11));
        }
        finally
        {
            call.close();
        }
        if (resultSets.size() > 0)
        {
            RowSet[] rowSets = new RowSet[resultSets.size()];
            result.setRowSets((RowSet[]) resultSets.toArray(rowSets));
        }
        return result;
    }
}