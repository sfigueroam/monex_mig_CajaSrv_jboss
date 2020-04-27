/*
 * File: GetFrmIdSafeCaller.java  2009-09-10 15:52:14-04:00
 * User: Felipe Gonzalez (DP S.A.)
 *
 * File generated by OBCOM SQL Wizard 5.1.248 (www.obcom.cl).
 * DO NOT EDIT THIS FILE <<Signature:z9rpiW5LiKZPCSIb4QPi4M>>.
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
 * Implements a caller of procedure "RECA.PKG_CAJA_SERVICES.GET_FRM_ID_SAFE".
 *
 * RETURN_VALUE       NUMBER             Return
 * IN_FORM_COD        NUMBER             Input
 * IN_FORM_VER        VARCHAR2(4000)     Input
 * IN_FORM_VIG        VARCHAR2(4000)     Input
 */
public class GetFrmIdSafeCaller extends ProcedureCaller
{
    /**
     * Executes procedure "RECA.PKG_CAJA_SERVICES.GET_FRM_ID_SAFE" using a DataSource.
     */
    public static GetFrmIdSafeResult execute(DataSource dataSource, BigDecimal inFormCod, String inFormVer, String inFormVig)
        throws SQLException
    {
        Connection conn = dataSource.getConnection();
        try
        {
            return execute(conn, inFormCod, inFormVer, inFormVig);
        }
        finally
        {
            conn.close();
        }
    }

    /**
     * Executes procedure "RECA.PKG_CAJA_SERVICES.GET_FRM_ID_SAFE" using a Connection.
     */
    public static GetFrmIdSafeResult execute(Connection conn, BigDecimal inFormCod, String inFormVer, String inFormVig)
        throws SQLException
    {
        GetFrmIdSafeResult result = new GetFrmIdSafeResult();
        ArrayList resultSets = new ArrayList();
        CallableStatement call = conn.prepareCall("{?=call RECA.PKG_CAJA_SERVICES.GET_FRM_ID_SAFE(?,?,?)}");
        try
        {
            call.registerOutParameter(1, Types.NUMERIC);
            call.setBigDecimal(2, inFormCod);
            call.setString(3, inFormVer);
            call.setString(4, inFormVig);
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
            result.setReturnValue(call.getBigDecimal(1));
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