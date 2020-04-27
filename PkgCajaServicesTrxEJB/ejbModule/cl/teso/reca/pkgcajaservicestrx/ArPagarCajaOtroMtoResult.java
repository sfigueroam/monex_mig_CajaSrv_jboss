/*
 * File: ArPagarCajaOtroMtoResult.java  2010-03-05 11:56:51-04:00
 * User: Felipe Gonzalez M (DP S.A.)
 *
 * File generated by OBCOM SQL Wizard 5.1.256 (www.obcom.cl).
 * DO NOT EDIT THIS FILE <<Signature:ncO9EneYyf79G9eKk-Ukzb>>.
 */

package cl.teso.reca.pkgcajaservicestrx;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.sql.RowSet;

/**
 * Output parameters of procedure "RECA.PKG_CAJA_SERVICES_TRX.AR_PAGAR_CAJA_OTRO_MTO".
 */
public class ArPagarCajaOtroMtoResult implements Serializable
{
    private static final long serialVersionUID = 1L;
    private BigDecimal myOutErrlvl;
    private String myOutMensajes;
    private String myOutContestId;
    private Date myOutFechaContable;
    private RowSet[] myRowSets;

    /**
     * Constructor.
     */
    public ArPagarCajaOtroMtoResult()
    {
    }

    /**
     * Returns the value of "OutErrlvl".
     */
    public BigDecimal getOutErrlvl()
    {
        return myOutErrlvl;
    }

    /**
     * Changes the value of "OutErrlvl".
     */
    public void setOutErrlvl(BigDecimal value)
    {
        myOutErrlvl = value;
    }

    /**
     * Returns the value of "OutMensajes".
     */
    public String getOutMensajes()
    {
        return myOutMensajes;
    }

    /**
     * Changes the value of "OutMensajes".
     */
    public void setOutMensajes(String value)
    {
        myOutMensajes = value;
    }

    /**
     * Returns the value of "OutContestId".
     */
    public String getOutContestId()
    {
        return myOutContestId;
    }

    /**
     * Changes the value of "OutContestId".
     */
    public void setOutContestId(String value)
    {
        myOutContestId = value;
    }

    /**
     * Returns the value of "OutFechaContable".
     */
    public Date getOutFechaContable()
    {
        return myOutFechaContable;
    }

    /**
     * Changes the value of "OutFechaContable".
     */
    public void setOutFechaContable(Date value)
    {
        myOutFechaContable = value;
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