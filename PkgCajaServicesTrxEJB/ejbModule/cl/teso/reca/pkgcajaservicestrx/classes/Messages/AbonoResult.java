package cl.teso.reca.pkgcajaservicestrx.classes.Messages; 

import java.io.Serializable;
import java.math.BigDecimal;
import cl.teso.reca.pkgcutservicestrx.classes.Messages.RecaItems;

public class AbonoResult extends PagoResult implements Serializable
{     
	private static final long serialVersionUID = 1L;
    
    private BigDecimal montoPlazo;
    private BigDecimal reajustes;
    private BigDecimal intereses;   
    private BigDecimal multas;
    private BigDecimal condonacion;
    private BigDecimal montoPago;        
    
    private RecaItems[] recaItemsAbono;
    
    public BigDecimal getMontoPlazo() {return this.montoPlazo;}
    public BigDecimal getReajustes() {return this.reajustes;}
    public BigDecimal getIntereses() {return this.intereses;}
    public BigDecimal getMultas() {return this.multas;}
    public BigDecimal getCondonacion() {return this.condonacion;}
    public BigDecimal getMontoPago() {return this.montoPago;}    
    public RecaItems[] getRecaItemsAbono() {return this.recaItemsAbono;}
    
    public void setMontoPlazo(BigDecimal montoPlazo) {this.montoPlazo = montoPlazo;}
    public void setReajustes(BigDecimal reajustes) {this.reajustes = reajustes;}
    public void setIntereses(BigDecimal intereses) {this.intereses = intereses;}
    public void setMultas(BigDecimal multas) {this.multas = multas;}
    public void setCondonacion(BigDecimal condonacion) {this.condonacion = condonacion;}
    public void setMontoPago(BigDecimal montoPago) {this.montoPago = montoPago;}   
    public void setRecaItems(RecaItems[] recaItems) {this.recaItemsAbono = recaItems;};



} 
