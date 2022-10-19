package tarea2;
public class Comprador{    
    private String tipoBebida;
    private int vuelto;    
    public Comprador(Moneda m, int b, Expendedor e) throws NoHayBebidaException, PagoIncorrectoException, PagoInsuficienteException{
        Bebida bebida = e.comprarBebida(m, b); 
        switch(b){
            case 0:
                tipoBebida = "CocaCola";
            case 1:
                tipoBebida = "Sprite";
            case 2:
                tipoBebida = "Fanta";
        }
        Moneda moneda_uno = e.getDepositoVuelto().getMoneda();
        if(moneda_uno == null){
            vuelto = 0;
        }else{        
            while(moneda_uno != null){
                vuelto += moneda_uno.getValor();
                moneda_uno = e.getDepositoVuelto().getMoneda();
                 
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
