package tarea2;


public class Comprador{
    
    Moneda moneda;
    int tipoBebida;
    
    public Comprador(Moneda m, int b, Expendedor e){
        moneda = m;
        tipoBebida = b;
    }
    public int CuantoVuelto(){
        return 0;
    }
    public String queBebiste(){
        return "0";
    }
}
