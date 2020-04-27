/*
 * File: GetFormPropertiesCaller.java  2009-09-10 15:52:14-04:00
 * User: Felipe Gonzalez (DP S.A.)
 *
 * File generated by OBCOM SQL Wizard 5.1.248 (www.obcom.cl).
 * DO NOT EDIT THIS FILE <<Signature:tIVVMM8fvQbEaCEoJG1sNF>>.
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
 * Implements a caller of procedure "RECA.PKG_CAJA_SERVICES.GET_FORM_PROPERTIES".
 *
 * RETURN_VALUE       VARCHAR2(4000)     Return
 * IN_FRM_ID          NUMBER             Input
 * IN_PROP            VARCHAR2(4000)     Input
 */
public class GetFormPropertiesCaller extends ProcedureCaller
{
    /**
     * Executes procedure "RECA.PKG_CAJA_SERVICES.GET_FORM_PROPERTIES" using a DataSource.
     */
    public static GetFormPropertiesResult execute(DataSource dataSource, BigDecimal inFrmId, String inProp)
        throws SQLException
    {
        Connection conn = dataSource.getConnection();
        try
        {
            return execute(conn, inFrmId, inProp);
        }
        finally
        {
            conn.close();
        }
    }

    /**
     * Executes procedure "RECA.PKG_CAJA_SERVICES.GET_FORM_PROPERTIES" using a Connection.
     */
    public static GetFormPropertiesResult execute(Connection conn, BigDecimal inFrmId, String inProp)
        throws SQLException
    {
        GetFormPropertiesResult result = new GetFormPropertiesResult();
        ArrayList resultSets = new ArrayList();
        CallableStatement call = conn.prepareCall("{?=call RECA.PKG_CAJA_SERVICES.GET_FORM_PROPERTIES(?,?)}");
        try
        {
            call.registerOutParameter(1, Types.VARCHAR);
            call.setBigDecimal(2, inFrmId);
            call.setString(3, inProp);
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
            result.setReturnValue(call.getString(1));
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