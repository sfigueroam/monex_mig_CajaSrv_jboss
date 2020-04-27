/*
 * File: GetItemdefSafeResult.java  2009-09-10 15:52:14-04:00
 * User: Felipe Gonzalez (DP S.A.)
 *
 * File generated by OBCOM SQL Wizard 5.1.248 (www.obcom.cl).
 * DO NOT EDIT THIS FILE <<Signature:LNnhgLb-c3Ehj24b1wR-37>>.
 */

package cl.teso.reca.cajasrv.pkgcajaservices;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.sql.RowSet;

/**
 * Output parameters of procedure "RECA.PKG_CAJA_SERVICES.GET_ITEMDEF_SAFE".
 */
public class GetItemdefSafeResult implements Serializable
{
    private static final long serialVersionUID = 1L;
    private String myOutItemdescripcion;
    private String myOutItemdescripcionLarga;
    private String myOutItemtype;
    private String myOutItemusage;
    private String myOutItemprint;
    private String myOutItemrep;
    private BigDecimal myOutResultado;
    private RowSet[] myRowSets;

    /**
     * Constructor.
     */
    public GetItemdefSafeResult()
    {
    }

    /**
     * Returns the value of "OutItemdescripcion".
     */
    public String getOutItemdescripcion()
    {
        return myOutItemdescripcion;
    }

    /**
     * Changes the value of "OutItemdescripcion".
     */
    public void setOutItemdescripcion(String value)
    {
        myOutItemdescripcion = value;
    }

    /**
     * Returns the value of "OutItemdescripcionLarga".
     */
    public String getOutItemdescripcionLarga()
    {
        return myOutItemdescripcionLarga;
    }

    /**
     * Changes the value of "OutItemdescripcionLarga".
     */
    public void setOutItemdescripcionLarga(String value)
    {
        myOutItemdescripcionLarga = value;
    }

    /**
     * Returns the value of "OutItemtype".
     */
    public String getOutItemtype()
    {
        return myOutItemtype;
    }

    /**
     * Changes the value of "OutItemtype".
     */
    public void setOutItemtype(String value)
    {
        myOutItemtype = value;
    }

    /**
     * Returns the value of "OutItemusage".
     */
    public String getOutItemusage()
    {
        return myOutItemusage;
    }

    /**
     * Changes the value of "OutItemusage".
     */
    public void setOutItemusage(String value)
    {
        myOutItemusage = value;
    }

    /**
     * Returns the value of "OutItemprint".
     */
    public String getOutItemprint()
    {
        return myOutItemprint;
    }

    /**
     * Changes the value of "OutItemprint".
     */
    public void setOutItemprint(String value)
    {
        myOutItemprint = value;
    }

    /**
     * Returns the value of "OutItemrep".
     */
    public String getOutItemrep()
    {
        return myOutItemrep;
    }

    /**
     * Changes the value of "OutItemrep".
     */
    public void setOutItemrep(String value)
    {
        myOutItemrep = value;
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
