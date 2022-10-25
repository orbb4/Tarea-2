package tarea2;
public class Comprador{    
    private String tipoBebida;
    private int vuelto = 0;    
    public Comprador(Moneda m, int b, Expendedor e) throws NoHayBebidaException, PagoIncorrectoException, PagoInsuficienteException{
        int vueltot;
        Bebida bebida = e.comprarBebida(m, b); 
        vueltot = 0;
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
            vueltot = 0;
        }else{
            while(moneda_uno != null){
                System.out.println(moneda_uno.getSerie());
                vueltot += moneda_uno.getValor();
                moneda_uno = e.getVuelto();
                 
            } 
        }
        vuelto = vueltot;
    }

    public int cuantoVuelto(){
        return vuelto;
    }
    public String queBebiste(){
        return tipoBebida;
    }
}
