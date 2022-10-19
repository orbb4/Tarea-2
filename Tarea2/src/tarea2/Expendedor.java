package tarea2;
import java.util.ArrayList;
public class Expendedor {
    private DepositoVuelto depositoVuelto;
    private int precio;
    private Deposito depCocaCola = new Deposito();
    private Deposito depSprite = new Deposito();
    private Deposito depFanta = new Deposito();
    public Expendedor(int nBebidas, DepositoVuelto depositoVuelto, int precio){
        this.depositoVuelto = depositoVuelto;
        this.precio = precio;
        CocaCola bebCoca = new CocaCola(32883);
        for(int i=0; i<nBebidas; ++i){
            depCocaCola.addBebida(bebCoca);
        }
        Sprite bebSprite = new Sprite(29798);
        for(int i=0; i<nBebidas; ++i){
            depSprite.addBebida(bebSprite);
        }
        Fanta bebFanta = new Fanta(39845);
        for(int i=0; i<nBebidas; ++i){
            depFanta.addBebida(bebFanta);
        }
               
    }
    public Bebida comprarBebida(Moneda m, int cual) throws NoHayBebidaException, PagoIncorrectoException{
        if(m.getValor() < precio){
            throw new PagoIncorrectoException("Pago insuficiente");
        //}else if()
        
    }
}
