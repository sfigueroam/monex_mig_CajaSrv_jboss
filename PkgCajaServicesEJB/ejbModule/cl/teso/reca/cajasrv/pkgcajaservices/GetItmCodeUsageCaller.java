/*
 * File: GetItmCodeUsageCaller.java  2009-09-10 15:52:14-04:00
 * User: Felipe Gonzalez (DP S.A.)
 *
 * File generated by OBCOM SQL Wizard 5.1.248 (www.obcom.cl).
 * DO NOT EDIT THIS FILE <<Signature:Bl77jaDHfVvJ+oXJfTZA9w>>.
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
 * Implements a caller of procedure "RECA.PKG_CAJA_SERVICES.GET_ITM_CODE_USAGE".
 *
 * RETURN_VALUE       NUMBER             Return
 * IN_FRM_ID          NUMBER             Input
 * IN_CODIGO_USAGE    VARCHAR2(4000)     Input
 */
public class GetItmCodeUsageCaller extends ProcedureCaller
{
    /**
     * Executes procedure "RECA.PKG_CAJA_SERVICES.GET_ITM_CODE_USAGE" using a DataSource.
     */
    public static GetItmCodeUsageResult execute(DataSource dataSource, BigDecimal inFrmId, String inCodigoUsage)
        throws SQLException
    {
        Connection conn = dataSource.getConnection();
        try
        {
            return execute(conn, inFrmId, inCodigoUsage);
        }
        finally
        {
            conn.close();
        }
    }

    /**
     * Executes procedure "RECA.PKG_CAJA_SERVICES.GET_ITM_CODE_USAGE" using a Connection.
     */
    public static GetItmCodeUsageResult execute(Connection conn, BigDecimal inFrmId, String inCodigoUsage)
        throws SQLException
    {
        GetItmCodeUsageResult result = new GetItmCodeUsageResult();
        ArrayList resultSets = new ArrayList();
        CallableStatement call = conn.prepareCall("{?=call RECA.PKG_CAJA_SERVICES.GET_ITM_CODE_USAGE(?,?)}");
        try
        {
            call.registerOutParameter(1, Types.NUMERIC);
            call.setBigDecimal(2, inFrmId);
            call.setString(3, inCodigoUsage);
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
