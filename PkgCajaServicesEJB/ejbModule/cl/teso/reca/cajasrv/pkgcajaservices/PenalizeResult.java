/*
 * File: PenalizeResult.java  2009-09-10 15:52:15-04:00
 * User: Felipe Gonzalez (DP S.A.)
 *
 * File generated by OBCOM SQL Wizard 5.1.248 (www.obcom.cl).
 * DO NOT EDIT THIS FILE <<Signature:Q5d93Tp-36akYsz0m+4Ocf>>.
 */

package cl.teso.reca.cajasrv.pkgcajaservices;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.sql.RowSet;

/**
 * Output parameters of procedure "RECA.PKG_CAJA_SERVICES.PENALIZE".
 */
public class PenalizeResult implements Serializable
{
    private static final long serialVersionUID = 1L;
    private String myContexttgfout;
    private String myMessagestgf;
    private BigDecimal myResultado;
    private RowSet[] myRowSets;

    /**
     * Constructor.
     */
    public PenalizeResult()
    {
    }

    /**
     * Returns the value of "Contexttgfout".
     */
    public String getContexttgfout()
    {
        return myContexttgfout;
    }

    /**
     * Changes the value of "Contexttgfout".
     */
    public void setContexttgfout(String value)
    {
        myContexttgfout = value;
    }

    /**
     * Returns the value of "Messagestgf".
     */
    public String getMessagestgf()
    {
        return myMessagestgf;
    }

    /**
     * Changes the value of "Messagestgf".
     */
    public void setMessagestgf(String value)
    {
        myMessagestgf = value;
    }

    /**
     * Returns the value of "Resultado".
     */
    public BigDecimal getResultado()
    {
        return myResultado;
    }

    /**
     * Changes the value of "Resultado".
     */
    public void setResultado(BigDecimal value)
    {
        myResultado = value;
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
