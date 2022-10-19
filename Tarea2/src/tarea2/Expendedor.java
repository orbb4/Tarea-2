package tarea2;

public class Expendedor{
    private DepositoVuelto depositoVuelto;
    private int precio;
    public Expendedor(int nBebidas, DepositoVuelto depositoVuelto){
        this.depositoVuelto = depositoVuelto;
        
    }
    public Bebida comprarBebida(Moneda m, int cual) throws NoHayBebidaException, PagoIncorrectoException{
        if(m.getValor() < precio){
            throw new PagoIncorrectoException("Pago insuficiente");
        //}else if()
        
    }
}
