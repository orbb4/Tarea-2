package tarea2;
import java.util.ArrayList;
public class Expendedor {
    private DepositoVuelto depositoVuelto;
    private int precio;
    private Deposito depCocaCola = new Deposito();
    private Deposito depSprite = new Deposito();
    private Deposito depFanta = new Deposito();
+
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
    public Bebida comprarBebida(Moneda m, int cual) throws NoHayBebidaException, PagoIncorrectoException, PagoInsuficienteException{
        if(m.getValor() == 0){
            throw new PagoIncorrectoException("Valor de moneda no puede ser null");
        }
        if(m.getValor() < precio){
            throw new PagoInsuficienteException("Pago insuficiente");
            //COCACOLA - SPRITE - FANTA
        }else if((cual==0 && depCocaCola.getArrayBebidas().isEmpty() )|| cual == 1 && depSprite.getArrayBebidas().isEmpty() || (cual == 2 && depFanta.getArrayBebidas().isEmpty())){
            throw new NoHayBebidaException("No hay bebidas del tipo escogido");
        }else{
            
        }
    }
    public DepositoVuelto getDepositoVuelto(){
        return depositoVuelto;
    }
}
