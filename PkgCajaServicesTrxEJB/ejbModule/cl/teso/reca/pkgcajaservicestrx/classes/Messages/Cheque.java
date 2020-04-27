package cl.teso.reca.pkgcajaservicestrx.classes.Messages; 


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;


public class Cheque implements Serializable { 
    private static final long serialVersionUID = 1L;
		
    public Calendar		fecha;
    public BigDecimal   banco;
    public BigDecimal   plaza;
    public BigDecimal	cuenta;
    public BigDecimal   serie;
} 
