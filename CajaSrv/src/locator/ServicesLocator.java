package locator;

import javax.naming.Context;
import javax.naming.InitialContext;

import cl.teso.reca.pkgcajaservicestrx.PkgCajaServicesTrxRemote;
import cl.teso.reca.pkgcajaserviceslog.PkgCajaServicesLogRemote;
import cl.teso.reca.cajasrv.pkgcajaservices.PkgCajaServicesRemote;

import org.apache.log4j.Logger;
import java.io.InputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ServicesLocator {

	// EJB 3.0 "PkgCajaServicesTrxEJB.jar"
	private PkgCajaServicesTrxRemote pkgCajaServicesTrxRemote;
	
	// EJB 3.0 "PkgCajaServicesLogEJB.jar"
	private PkgCajaServicesLogRemote pkgCajaServicesLogRemote;
	
	// EJB 3.0 "PkgCajaServicesEJB.jar"
	private PkgCajaServicesRemote pkgCajaServicesRemote;
	
	private static Logger logger = Logger.getLogger("cajasrv.locator.ServicesLocator");
	private static InputStream in = null;

	public static final String FILE_NAME_ME = "CajaSrvEculink.properties";
    public static String JNDI_EJB_PKGCAJASERVICESTRXREMOTE = "";
    public static String JNDI_EJB_PKGCAJASERVICESLOGREMOTE = "";
	public static String JNDI_EJB_PKGCAJASERVICESREMOTE = "";
	
	public static void cargarProperties() throws Exception
    {
       try
       {
          in = ServicesLocator.class.getClassLoader().getResourceAsStream(FILE_NAME_ME);
          Properties prop = new Properties();
          prop.load(in);
          logger.info("------>>>>> Carga de cargarProperties Exitosa : " + FILE_NAME_ME);

          JNDI_EJB_PKGCAJASERVICESTRXREMOTE = prop.getProperty("JNDI.EJB.PKGCAJASERVICESTRXREMOTE");
          JNDI_EJB_PKGCAJASERVICESLOGREMOTE = prop.getProperty("JNDI.EJB.PKGCAJASERVICESLOGREMOTE");
          JNDI_EJB_PKGCAJASERVICESREMOTE = prop.getProperty("JNDI.EJB.PKGCAJASERVICESREMOTE");
   
          logger.info("------>>>>> Carga de propiedades Exitosa : ");
         in.close();
      } catch (FileNotFoundException e) {
          // TODO Auto-generated catch block
          logger.info("Error en el metodo CargarProperties()1 : " + e);
      } catch (IOException e) {
          // TODO Auto-generated catch block
          logger.info("Error en el metodo CargarProperties()2 : " + e);			            
      }
    }
	
	public PkgCajaServicesTrxRemote getPkgCajaServicesTrxRemote() {
		  try {
		   if (pkgCajaServicesTrxRemote == null) {
			cargarProperties();
		    Context ctx = new InitialContext();
		    // pkgCajaServicesTrxRemote = (PkgCajaServicesTrxRemote) ctx
			// 		.lookup("java:global/CajaSrvEAR/PkgCajaServicesTrxEJB/PkgCajaServicesTrx!cl.teso.reca.pkgcajaservicestrx.PkgCajaServicesTrxRemote");
			pkgCajaServicesTrxRemote = (PkgCajaServicesTrxRemote) ctx
		    		.lookup(JNDI_EJB_PKGCAJASERVICESTRXREMOTE);

		   }

		  } catch (Exception e) {
		   System.out.println(e.toString());
		  }

		  return pkgCajaServicesTrxRemote;
	 }

	
	public PkgCajaServicesLogRemote getPkgCajaServicesLogRemote() {
		  try {
		   if (pkgCajaServicesLogRemote == null) {
			cargarProperties();
		    Context ctx = new InitialContext();
		    // pkgCajaServicesLogRemote = (PkgCajaServicesLogRemote) ctx
			// 		.lookup("java:global/CajaSrvEAR/PkgCajaServicesLogEJB/PkgCajaServicesLog!cl.teso.reca.pkgcajaserviceslog.PkgCajaServicesLogRemote");
			pkgCajaServicesLogRemote = (PkgCajaServicesLogRemote) ctx
		    		.lookup(JNDI_EJB_PKGCAJASERVICESLOGREMOTE);

		   }

		  } catch (Exception e) {
		   System.out.println(e.toString());
		  }

		  return pkgCajaServicesLogRemote;
	 }

	
	public PkgCajaServicesRemote getPkgCajaServicesRemote() {
		  try {
		   if (pkgCajaServicesRemote == null) {
			cargarProperties();
		    Context ctx = new InitialContext();
		    // pkgCajaServicesRemote = (PkgCajaServicesRemote) ctx
			// 		.lookup("java:global/CajaSrvEAR/PkgCajaServicesEJB/PkgCajaServices!cl.teso.reca.cajasrv.pkgcajaservices.PkgCajaServicesRemote");
			pkgCajaServicesRemote = (PkgCajaServicesRemote) ctx
		    		.lookup(JNDI_EJB_PKGCAJASERVICESREMOTE);

		   }

		  } catch (Exception e) {
		   System.out.println(e.toString());
		  }

		  return pkgCajaServicesRemote;
	 }
}
