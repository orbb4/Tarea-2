
package tarea2;

public class Comprador{
    Moneda moneda;
    int tipoBebida;
    
    public Comprador(Moneda m, int b, Expendedor e){
        moneda = m;
        tipoBebida = b;
        Bebida bebida = e.comprarBebida(m, b);
        
    }
    public int CuantoVuelto(){
        
    }
    public String queBebiste(){
        switch(tipoBebida){
            case 0:
                return "Cocacola";
                break;
            case 1:
                return "Sprite";
                break;
            case 2:
                return "Fanta";
                break;
    }
}
