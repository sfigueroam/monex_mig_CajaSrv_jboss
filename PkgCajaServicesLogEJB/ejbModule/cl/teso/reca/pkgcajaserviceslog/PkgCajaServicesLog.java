/*
 * @(#)PkgCajaServicesLogBean.java  2006/11/22 17:30:45
 *
 * This file was generated by "OBCOM SQL Wizard" version 5.1.198.
 * Copyright (c) OBCOM INGENIERIA S.A. (Chile) All rights reserved.
 * OBCOM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * YOU MAY EDIT THIS FILE <<Signature:BJjF5ZVUvXK2ASapHefEzA>>.
 */

package cl.teso.reca.pkgcajaserviceslog;

import java.math.BigDecimal;

import javax.annotation.Resource;
import javax.ejb.CreateException;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.naming.InitialContext;
import javax.sql.DataSource;


@Stateless(name="PkgCajaServicesLog", mappedName="cl.teso.reca.pkgcajaserviceslog.PkgCajaServicesLog")
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class PkgCajaServicesLog implements PkgCajaServicesLogLocal, PkgCajaServicesLogRemote
{
    private static final long serialVersionUID = 1L;


    public PkgCajaServicesLog() {}
    
    private SessionContext sessionContext;
    
    @Resource(lookup="java:/jdbc/recaDS")
    private DataSource dataSource;


	public GrabaLogTransaccionResult grabaLogTransaccion(String inTransaccionNombre, BigDecimal inOficina, BigDecimal inFormulario, String inCodigoAr, String inRutRol, String inParametros, BigDecimal inCodigoRetorno, String inMensajeRetorno, BigDecimal inCodigoRetOracle, String inMensajeRetOracle)
        throws PkgCajaServicesLogException
    {
        try
        {
            return GrabaLogTransaccionCaller.execute(getDataSource(), inTransaccionNombre, inOficina, inFormulario, inCodigoAr, inRutRol, inParametros, inCodigoRetorno, inMensajeRetorno, inCodigoRetOracle, inMensajeRetOracle);
        }
        catch (java.sql.SQLException ex)
        {
            //setRollbackOnly(); No hacemos RollBack en este EJB();
            throw new PkgCajaServicesLogException("RECA.PKG_CAJA_SERVICES_LOG.GRABA_LOG_TRANSACCION", ex);
        }
    }


	public DataSource getDataSource()
    {
        return dataSource;
    }


	public SessionContext getSessionContext()
    {
        return sessionContext;
    }


	public void setRollbackOnly()
    {
        try
        {
           //getSessionContext().setRollbackOnly();
        }
        catch (java.lang.IllegalStateException ex)
        {
            // Ignore: there is no active transaction.
        }
    }


	public void setSessionContext(SessionContext context)
    {
        sessionContext = context;
    }


	public void ejbCreate() throws CreateException
    {
    }


	public void ejbActivate() {}


	public void ejbPassivate() {}


	public void ejbRemove() {}
    
}
