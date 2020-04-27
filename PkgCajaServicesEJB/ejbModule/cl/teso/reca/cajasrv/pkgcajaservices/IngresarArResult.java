/*
 * File: IngresarArResult.java  2009-09-10 15:52:15-04:00
 * User: Felipe Gonzalez (DP S.A.)
 *
 * File generated by OBCOM SQL Wizard 5.1.248 (www.obcom.cl).
 * DO NOT EDIT THIS FILE <<Signature:wmkyBpbFEcoSymcb7K0k-f>>.
 */

package cl.teso.reca.cajasrv.pkgcajaservices;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.sql.RowSet;

/**
 * Output parameters of procedure "RECA.PKG_CAJA_SERVICES.INGRESAR_AR".
 */
public class IngresarArResult implements Serializable
{
    private static final long serialVersionUID = 1L;
    private String myOutCodigoBarra;
    private BigDecimal myOutFolioAr;
    private RowSet[] myRowSets;

    /**
     * Constructor.
     */
    public IngresarArResult()
    {
    }

    /**
     * Returns the value of "OutCodigoBarra".
     */
    public String getOutCodigoBarra()
    {
        return myOutCodigoBarra;
    }

    /**
     * Changes the value of "OutCodigoBarra".
     */
    public void setOutCodigoBarra(String value)
    {
        myOutCodigoBarra = value;
    }

    /**
     * Returns the value of "OutFolioAr".
     */
    public BigDecimal getOutFolioAr()
    {
        return myOutFolioAr;
    }

    /**
     * Changes the value of "OutFolioAr".
     */
    public void setOutFolioAr(BigDecimal value)
    {
        myOutFolioAr = value;
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