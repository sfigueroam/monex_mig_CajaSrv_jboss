/*
 * Source: ArPagarCajaResult.java - Generated by OBCOM SQL Wizard 5.1.266
 * Author: Felipe Gonzalez M (DP S.A.)
 *
 * Copyright (c) OBCOM INGENIERIA S.A. (Chile). All rights reserved.
 *
 * All rights to this product are owned by OBCOM INGENIERIA S.A. and may only be
 * used  under  the  terms of its associated license document. You may NOT copy,
 * modify, sublicense, or distribute this source file or portions of  it  unless
 * previously  authorized in writing by OBCOM INGENIERIA S.A. In any event, this
 * notice and above copyright must always be included verbatim with this file.
 */

package cl.teso.reca.pkgcajaservicestrx;

import java.math.BigDecimal;
import java.util.Date;
import javax.sql.RowSet;

/**
 * Output parameters of procedure "RECA.PKG_CAJA_SERVICES_TRX.AR_PAGAR_CAJA".
 */
public class ArPagarCajaResult extends ProcedureResult
{
    private static final long serialVersionUID = 1L;
    private BigDecimal outErrlvl;
    private String outMensajes;
    private String outContestId;
    private Date outFechaContable;
    private RowSet[] rowSets;

    /**
     * Constructor.
     */
    public ArPagarCajaResult()
    {
        super();
    }

    /**
     * Returns the value of "OutErrlvl".
     */
    public BigDecimal getOutErrlvl()
    {
        return outErrlvl;
    }

    /**
     * Changes the value of "OutErrlvl".
     */
    public void setOutErrlvl(BigDecimal outErrlvl)
    {
        this.outErrlvl = outErrlvl;
    }

    /**
     * Returns the value of "OutMensajes".
     */
    public String getOutMensajes()
    {
        return outMensajes;
    }

    /**
     * Changes the value of "OutMensajes".
     */
    public void setOutMensajes(String outMensajes)
    {
        this.outMensajes = outMensajes;
    }

    /**
     * Returns the value of "OutContestId".
     */
    public String getOutContestId()
    {
        return outContestId;
    }

    /**
     * Changes the value of "OutContestId".
     */
    public void setOutContestId(String outContestId)
    {
        this.outContestId = outContestId;
    }

    /**
     * Returns the value of "OutFechaContable".
     */
    public Date getOutFechaContable()
    {
        return outFechaContable;
    }

    /**
     * Changes the value of "OutFechaContable".
     */
    public void setOutFechaContable(Date outFechaContable)
    {
        this.outFechaContable = outFechaContable;
    }

    /**
     * Changes the value of "RowSets".
     */
    void setRowSets(RowSet[] rowSets)
    {
        this.rowSets = rowSets;
    }

    /**
     * Returns the value of "RowSetCount".
     */
    public int getRowSetCount()
    {
        return (rowSets != null) ? rowSets.length : 0;
    }

    /**
     * Returns the "RowSet" at the specified index.
     */
    public RowSet getRowSet(int index)
    {
        if (index < 0 || index >= getRowSetCount())
            throw new ArrayIndexOutOfBoundsException(index);
        return rowSets[index];
    }
}
