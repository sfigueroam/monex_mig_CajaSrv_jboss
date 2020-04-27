package cl.teso.reca.pkgcajaservicestrx.classes.Messages; 

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;

public class Tarjeta implements Serializable
{ 
    private static final long serialVersionUID = 1L;
		
		public String		tarjetaTipo;
		public String		tarjetaMarca;
		public Calendar		autorizadorFecha;
        public String       autorizadorTipo;
        public String       autorizadorCodigo;
        public String       cuotaTipo;
        public BigDecimal	cuotaNumero;
} 
