/*
 * @(#)GrabaLogTransaccionCaller.java  2006/11/22 17:30:43
 *
 * This file was generated by "OBCOM SQL Wizard" version 5.1.198.
 * Copyright (c) OBCOM INGENIERIA S.A. (Chile) All rights reserved.
 * OBCOM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * DO NOT EDIT THIS FILE <<Signature:zYqVcA4AqPuQmQfvOLc-ic>>.
 */

package cl.teso.reca.pkgcajaserviceslog;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;
import javax.sql.DataSource;

/**
 * Implements a caller of the "RECA.PKG_CAJA_SERVICES_LOG.GRABA_LOG_TRANSACCION" database procedure.
 */
public class GrabaLogTransaccionCaller extends ProcedureCaller
{
    /**
     * Executes the "RECA.PKG_CAJA_SERVICES_LOG.GRABA_LOG_TRANSACCION" database procedure.
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
    public static GrabaLogTransaccionResult execute(DataSource dataSource, String inTransaccionNombre, BigDecimal inOficina, BigDecimal inFormulario, String inCodigoAr, String inRutRol, String inParametros, BigDecimal inCodigoRetorno, String inMensajeRetorno, BigDecimal inCodigoRetOracle, String inMensajeRetOracle)
        throws java.sql.SQLException
    {
        GrabaLogTransaccionResult result = new GrabaLogTransaccionResult();
        Connection conn = dataSource.getConnection();
        try
        {
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
                executeCall(call, resultSets);
                result.setOutResultCode(call.getBigDecimal(11));
            }
            finally
            {
                call.close();
            }
        }
        finally
        {
            conn.close();
        }
        return result;
    }
}
