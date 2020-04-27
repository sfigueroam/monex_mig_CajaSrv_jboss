package cl.teso.reca.pkgcajaservicestrx.classes.Messages; 

import java.io.Serializable;
import java.math.BigDecimal;

public class PagoResult extends cl.teso.reca.pkgcutservicestrx.classes.Messages.RecaOut implements Serializable
{     
	private static final long serialVersionUID = 1L;
    public static final BigDecimal TRX_COMPLETED=new BigDecimal(0);
    public static final BigDecimal TRX_ERROR=new BigDecimal(1);
    public static final BigDecimal TIMEOUT=new BigDecimal(2);

} 
