package tarea2;
public class Comprador{    
    private String tipoBebida;
    private int vuelto;    
    public Comprador(Moneda m, int b, Expendedor e) throws NoHayBebidaException, PagoIncorrectoException, PagoInsuficienteException{
    String tipoBebida;
    int vuelto;
        Bebida bebida = e.comprarBebida(m, b); 
        vuelto = 0;
        switch(b){
            case 0:
                tipoBebida = "CocaCola";
            case 1:
                tipoBebida = "Sprite";
            case 2:
                tipoBebida = "Fanta";
        }
        Moneda moneda_uno = e.getVuelto();
        if(moneda_uno == null){
            vuelto = 0;
        }else{        
            while(moneda_uno != null){
                vuelto += moneda_uno.getValor();
                moneda_uno = e.getVuelto();
                 
            } 
        }
    }

    public int cuantoVuelto(){
        return vuelto;
    }
    public String queBebiste(){
        return tipoBebida;
    }
}
