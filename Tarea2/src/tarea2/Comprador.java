
package tarea2;

<<<<<<< HEAD

public class Comprador{
>>>>>>> cd01be670789f145330a6f2013ff31f92d488595
    
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
