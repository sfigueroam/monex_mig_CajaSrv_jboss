/*
 * File: GetOficinaDescripcionResult.java  2009-09-10 15:52:14-04:00
 * User: Felipe Gonzalez (DP S.A.)
 *
 * File generated by OBCOM SQL Wizard 5.1.248 (www.obcom.cl).
 * DO NOT EDIT THIS FILE <<Signature:BMI3ajxcgFqUh7QmmMeF+U>>.
 */

package cl.teso.reca.cajasrv.pkgcajaservices;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.sql.RowSet;

/**
 * Output parameters of procedure "RECA.PKG_CAJA_SERVICES.GET_OFICINA_DESCRIPCION".
 */
public class GetOficinaDescripcionResult implements Serializable
{
    private static final long serialVersionUID = 1L;
    private BigDecimal myOutRutIra;
    private String myOutRutIraDv;
    private BigDecimal myOutCodAbif;
    private String myOutOficinaNombre;
    private BigDecimal myOutComunaConara;
    private BigDecimal myOutCtaCte;
    private BigDecimal myOutResultado;
    private RowSet[] myRowSets;

    /**
     * Constructor.
     */
    public GetOficinaDescripcionResult()
    {
    }

    /**
     * Returns the value of "OutRutIra".
     */
    public BigDecimal getOutRutIra()
    {
        return myOutRutIra;
    }

    /**
     * Changes the value of "OutRutIra".
     */
    public void setOutRutIra(BigDecimal value)
    {
        myOutRutIra = value;
    }

    /**
     * Returns the value of "OutRutIraDv".
     */
    public String getOutRutIraDv()
    {
        return myOutRutIraDv;
    }

    /**
     * Changes the value of "OutRutIraDv".
     */
    public void setOutRutIraDv(String value)
    {
        myOutRutIraDv = value;
    }

    /**
     * Returns the value of "OutCodAbif".
     */
    public BigDecimal getOutCodAbif()
    {
        return myOutCodAbif;
    }

    /**
     * Changes the value of "OutCodAbif".
     */
    public void setOutCodAbif(BigDecimal value)
    {
        myOutCodAbif = value;
    }

    /**
     * Returns the value of "OutOficinaNombre".
     */
    public String getOutOficinaNombre()
    {
        return myOutOficinaNombre;
    }

    /**
     * Changes the value of "OutOficinaNombre".
     */
    public void setOutOficinaNombre(String value)
    {
        myOutOficinaNombre = value;
    }

    /**
     * Returns the value of "OutComunaConara".
     */
    public BigDecimal getOutComunaConara()
    {
        return myOutComunaConara;
    }

    /**
     * Changes the value of "OutComunaConara".
     */
    public void setOutComunaConara(BigDecimal value)
    {
        myOutComunaConara = value;
    }

    /**
     * Returns the value of "OutCtaCte".
     */
    public BigDecimal getOutCtaCte()
    {
        return myOutCtaCte;
    }

    /**
     * Changes the value of "OutCtaCte".
     */
    public void setOutCtaCte(BigDecimal value)
    {
        myOutCtaCte = value;
    }

    /**
     * Returns the value of "OutResultado".
     */
    public BigDecimal getOutResultado()
    {
        return myOutResultado;
    }

    /**
     * Changes the value of "OutResultado".
     */
    public void setOutResultado(BigDecimal value)
    {
        myOutResultado = value;
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