package tarea2;
import java.util.ArrayList;
public class Expendedor {
    private DepositoVuelto depositoVuelto;
    private int precio;
    private ArrayList<CocaCola> bebidasCocaCola = new ArrayList();
    private ArrayList<Sprite> bebidasSprite = new ArrayList();
    private ArrayList<Fanta> bebidasFanta = new ArrayList();
    
    public Expendedor(int nBebidas, DepositoVuelto depositoVuelto, int precio){
        this.depositoVuelto = depositoVuelto;
        this.precio = precio;
        CocaCola bebCoca = new CocaCola(32883);
        for(int i=0; i<nBebidas; ++i){
            bebidasCocaCola.add(bebCoca);
        }
        Sprite bebSprite = new Sprite(29798);
        for(int i=0; i<nBebidas; ++i){
            bebidasSprite.add(bebSprite);
        }
        Fanta bebFanta = new Fanta(39845);
        for(int i=0; i<nBebidas; ++i){
            bebidasFanta.add(bebFanta);
        }
               
    }
    public Bebida comprarBebida(Moneda m, int cual) throws NoHayBebidaException, PagoIncorrectoException, PagoInsuficienteException{
        if(m.getValor() == 0){
            throw new PagoIncorrectoException("Valor de moneda no puede ser null");
        }
        if(m.getValor() < precio){
            throw new PagoInsuficienteException("Pago insuficiente");
            //COCACOLA - SPRITE - FANTA
        }else if((cual==0 && bebidasCocaCola.isEmpty() )|| cual == 1 && bebidasSprite.isEmpty() || (cual == 2 && bebidasFanta.isEmpty())){
            throw new NoHayBebidaException("No hay bebidas del tipo escogido");
        }else{
            
        }
    }
}
