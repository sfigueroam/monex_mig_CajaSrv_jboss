/*
 * File: GetItemdescripcionCaller.java  2009-09-10 15:52:14-04:00
 * User: Felipe Gonzalez (DP S.A.)
 *
 * File generated by OBCOM SQL Wizard 5.1.248 (www.obcom.cl).
 * DO NOT EDIT THIS FILE <<Signature:bmmx3MMgSvNfONmO99+HMN>>.
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
 * Implements a caller of procedure "RECA.PKG_CAJA_SERVICES.GET_ITEMDESCRIPCION".
 *
 * IN_FORMTIPO                NUMBER             Input
 * IN_FORMVERSION             VARCHAR2(4000)     Input
 * IN_ITM_CODE                NUMBER             Input
 * OUT_ITEMDESCRIPCION        VARCHAR2(4000)     Output
 * OUT_ITEMDESCRIPCION_LARGA  VARCHAR2(4000)     Output
 * OUT_ITEMTYPE               VARCHAR2(4000)     Output
 * OUT_ITEMUSAGE              VARCHAR2(4000)     Output
 * OUT_ITEMPRINT              VARCHAR2(4000)     Output
 * OUT_ITEMREP                VARCHAR2(4000)     Output
 * OUT_RESULTADO              NUMBER             Output
 */
public class GetItemdescripcionCaller extends ProcedureCaller
{
    /**
     * Executes procedure "RECA.PKG_CAJA_SERVICES.GET_ITEMDESCRIPCION" using a DataSource.
     */
    public static GetItemdescripcionResult execute(DataSource dataSource, BigDecimal inFormtipo, String inFormversion, BigDecimal inItmCode)
        throws SQLException
    {
        Connection conn = dataSource.getConnection();
        try
        {
            return execute(conn, inFormtipo, inFormversion, inItmCode);
        }
        finally
        {
            conn.close();
        }
    }

    /**
     * Executes procedure "RECA.PKG_CAJA_SERVICES.GET_ITEMDESCRIPCION" using a Connection.
     */
    public static GetItemdescripcionResult execute(Connection conn, BigDecimal inFormtipo, String inFormversion, BigDecimal inItmCode)
        throws SQLException
    {
        GetItemdescripcionResult result = new GetItemdescripcionResult();
        ArrayList resultSets = new ArrayList();
        CallableStatement call = conn.prepareCall("{call RECA.PKG_CAJA_SERVICES.GET_ITEMDESCRIPCION(?,?,?,?,?,?,?,?,?,?)}");
        try
        {
            call.setBigDecimal(1, inFormtipo);
            call.setString(2, inFormversion);
            call.setBigDecimal(3, inItmCode);
            call.registerOutParameter(4, Types.VARCHAR);
            call.registerOutParameter(5, Types.VARCHAR);
            call.registerOutParameter(6, Types.VARCHAR);
            call.registerOutParameter(7, Types.VARCHAR);
            call.registerOutParameter(8, Types.VARCHAR);
            call.registerOutParameter(9, Types.VARCHAR);
            call.registerOutParameter(10, Types.NUMERIC);
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
            
            System.out.println("call.getString(4): "+call.getString(4));
            System.out.println("call.getString(5): "+call.getString(5));
            System.out.println("call.getString(6): "+call.getString(6));
            result.setOutItemdescripcion(call.getString(4));
            result.setOutItemdescripcionLarga(call.getString(5));
            result.setOutItemtype(call.getString(6));
            result.setOutItemusage(call.getString(7));
            result.setOutItemprint(call.getString(8));
            result.setOutItemrep(call.getString(9));
            result.setOutResultado(call.getBigDecimal(10));
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
