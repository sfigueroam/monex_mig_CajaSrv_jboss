package locator;

import javax.naming.Context;
import javax.naming.InitialContext;

import cl.teso.reca.pkgcajaservicestrx.PkgCajaServicesTrxRemote;
import cl.teso.reca.pkgcajaserviceslog.PkgCajaServicesLogRemote;
import cl.teso.reca.cajasrv.pkgcajaservices.PkgCajaServicesRemote;

public class ServicesLocator {

	// EJB 3.0 "PkgCajaServicesTrxEJB.jar"
	private PkgCajaServicesTrxRemote pkgCajaServicesTrxRemote;
	
	// EJB 3.0 "PkgCajaServicesLogEJB.jar"
	private PkgCajaServicesLogRemote pkgCajaServicesLogRemote;
	
	// EJB 3.0 "PkgCajaServicesEJB.jar"
	private PkgCajaServicesRemote pkgCajaServicesRemote;
	

	
	public PkgCajaServicesTrxRemote getPkgCajaServicesTrxRemote() {
		  try {
		   if (pkgCajaServicesTrxRemote == null) {
		    Context ctx = new InitialContext();
		    pkgCajaServicesTrxRemote = (PkgCajaServicesTrxRemote) ctx
		    		.lookup("java:global/CajaSrvEAR/PkgCajaServicesTrxEJB/PkgCajaServicesTrx!cl.teso.reca.pkgcajaservicestrx.PkgCajaServicesTrxRemote");
		   }

		  } catch (Exception e) {
		   System.out.println(e.toString());
		  }

		  return pkgCajaServicesTrxRemote;
	 }

	
	public PkgCajaServicesLogRemote getPkgCajaServicesLogRemote() {
		  try {
		   if (pkgCajaServicesLogRemote == null) {
		    Context ctx = new InitialContext();
		    pkgCajaServicesLogRemote = (PkgCajaServicesLogRemote) ctx
		    		.lookup("java:global/CajaSrvEAR/PkgCajaServicesLogEJB/PkgCajaServicesLog!cl.teso.reca.pkgcajaserviceslog.PkgCajaServicesLogRemote");
		   }

		  } catch (Exception e) {
		   System.out.println(e.toString());
		  }

		  return pkgCajaServicesLogRemote;
	 }

	
	public PkgCajaServicesRemote getPkgCajaServicesRemote() {
		  try {
		   if (pkgCajaServicesRemote == null) {
		    Context ctx = new InitialContext();
		    pkgCajaServicesRemote = (PkgCajaServicesRemote) ctx
		    		.lookup("java:global/CajaSrvEAR/PkgCajaServicesEJB/PkgCajaServices!cl.teso.reca.cajasrv.pkgcajaservices.PkgCajaServicesRemote");
		   }

		  } catch (Exception e) {
		   System.out.println(e.toString());
		  }

		  return pkgCajaServicesRemote;
	 }
}
