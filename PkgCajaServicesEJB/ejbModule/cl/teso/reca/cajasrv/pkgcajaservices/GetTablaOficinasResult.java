/*
 * File: GetTablaOficinasResult.java  2009-09-10 15:52:14-04:00
 * User: Felipe Gonzalez (DP S.A.)
 *
 * File generated by OBCOM SQL Wizard 5.1.248 (www.obcom.cl).
 * DO NOT EDIT THIS FILE <<Signature:uBAoh-eGqc7CGS2XThGPdJ>>.
 */

package cl.teso.reca.cajasrv.pkgcajaservices;

import java.io.Serializable;
import javax.sql.RowSet;

/**
 * Output parameters of procedure "RECA.PKG_CAJA_SERVICES.GET_TABLA_OFICINAS".
 */
public class GetTablaOficinasResult implements Serializable
{
    private static final long serialVersionUID = 1L;
    private RowSet[] myRowSets;

    /**
     * Constructor.
     */
    public GetTablaOficinasResult()
    {
    }

    /**
     * Changes the value of "RowSets".
     */
    void setRowSets(RowSet[] value)
    {
        myRowSets = value;
    }

    /**
     * Returns the value of "RowSetCount".
     */
    public int getRowSetCount()
    {
        return (myRowSets != null) ? myRowSets.length : 0;
    }

    /**
     * Returns the "RowSet" at the specified index.
     */
    public RowSet getRowSet(int index)
    {
        if (index < 0 || index >= getRowSetCount())
            throw new ArrayIndexOutOfBoundsException(index);
        return myRowSets[index];
    }
}
