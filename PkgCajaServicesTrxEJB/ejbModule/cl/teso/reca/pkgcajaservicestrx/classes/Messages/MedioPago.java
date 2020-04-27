package cl.teso.reca.pkgcajaservicestrx.classes.Messages; 

import java.io.Serializable;
import java.util.Calendar;


public class MedioPago implements Serializable
{ 
    
    private static final long serialVersionUID = 1L;
		
        public String       nemo;
        public Calendar     fecha;
        public Cheque       cheque;
        public Tarjeta      tarjeta;
} 
