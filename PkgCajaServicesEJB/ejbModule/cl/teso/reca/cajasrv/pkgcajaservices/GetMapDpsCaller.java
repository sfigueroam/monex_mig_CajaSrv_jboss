/*
 * File: GetMapDpsCaller.java  2009-09-10 15:52:14-04:00
 * User: Felipe Gonzalez (DP S.A.)
 *
 * File generated by OBCOM SQL Wizard 5.1.248 (www.obcom.cl).
 * DO NOT EDIT THIS FILE <<Signature:zlrDYOhN5oPf4mTBMklC9L>>.
 */

package cl.teso.reca.cajasrv.pkgcajaservices;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.sql.DataSource;
import javax.sql.RowSet;

/**
 * Implements a caller of procedure "RECA.PKG_CAJA_SERVICES.GET_MAP_DPS".
 *
 * RETURN_VALUE       REF CURSOR         Return
 */
public class GetMapDpsCaller extends ProcedureCaller
{
    /**
     * Executes procedure "RECA.PKG_CAJA_SERVICES.GET_MAP_DPS" using a DataSource.
     */
    public static GetMapDpsResult execute(DataSource dataSource)
        throws SQLException
    {
        Connection conn = dataSource.getConnection();
        try
        {
            return execute(conn);
        }
        finally
        {
            conn.close();
        }
    }

    /**
     * Executes procedure "RECA.PKG_CAJA_SERVICES.GET_MAP_DPS" using a Connection.
     */
    public static GetMapDpsResult execute(Connection conn)
        throws SQLException
    {
        GetMapDpsResult result = new GetMapDpsResult();
        ArrayList resultSets = new ArrayList();
        if (conn.getMetaData().getURL().startsWith("jdbc:oracle:"))
        {
            CallableStatement call = conn.prepareCall("{?=call RECA.PKG_CAJA_SERVICES.GET_MAP_DPS()}");
            try
            {
                call.registerOutParameter(1, ORACLE_CURSOR);
                call.execute();
                resultSets.add(toRowSet((ResultSet) call.getObject(1)));
            }
            finally
            {
                call.close();
            }
        }
        else
        {
            CallableStatement call = conn.prepareCall("{call RECA.PKG_CAJA_SERVICES.GET_MAP_DPS()}");
            try
            {
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
            }
            finally
            {
                call.close();
            }
        }
        if (resultSets.size() > 0)
        {
            RowSet[] rowSets = new RowSet[resultSets.size()];
            result.setRowSets((RowSet[]) resultSets.toArray(rowSets));
        }
        return result;
    }
}
