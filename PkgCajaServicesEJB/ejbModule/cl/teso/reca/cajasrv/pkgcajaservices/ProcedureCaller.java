/*
 * File: ProcedureCaller.java  2009-09-10 15:52:15-04:00
 * User: Felipe Gonzalez (DP S.A.)
 *
 * File generated by OBCOM SQL Wizard 5.1.248 (www.obcom.cl).
 * DO NOT EDIT THIS FILE <<Signature:pAKFxBrJT-0jsZm9TVEp9E>>.
 */

package cl.teso.reca.cajasrv.pkgcajaservices;

import java.sql.ResultSet;
import java.util.Date;
import javax.sql.RowSet;
//import weblogic.jdbc.rowset.RowSetFactory;
//import weblogic.jdbc.rowset.WLCachedRowSet;

/**
 * Implements methods common to all procedure callers.
 */
public abstract class ProcedureCaller
{
    // The same as oracle.jdbc.OracleTypes.CURSOR
    protected static final int ORACLE_CURSOR = -10;

    //------------------------------------------------------------
    //-- ResultSet methods ---------------------------------------
    //------------------------------------------------------------

    /**
     * Builds a RowSet from the supplied ResultSet.
     */
    protected static RowSet toRowSet(ResultSet resultSet)
        throws java.sql.SQLException
    {
		return null;
//        RowSetFactory factory = RowSetFactory.newInstance();
//        WLCachedRowSet rowSet = factory.newCachedRowSet();
//        rowSet.populate(resultSet);
//        return rowSet;
    }

    //------------------------------------------------------------
    //-- DATE/TIME conversion methods ----------------------------
    //------------------------------------------------------------

    /**
     * Converts the supplied Date to a SQL Timestamp instance.
     */
    protected static java.sql.Timestamp toTimestamp(Date date)
    {
        if (date == null || date instanceof java.sql.Timestamp)
            return (java.sql.Timestamp) date;
        return new java.sql.Timestamp(date.getTime());
    }
}
