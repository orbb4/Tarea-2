
package tarea2;

<<<<<<< HEAD

public class Comprador{
>>>>>>> cd01be670789f145330a6f2013ff31f92d488595
    
    String tipoBebida;
    int vuelto;
    
    public Comprador(Moneda m, int b, Expendedor e){
        Bebida bebida = e.comprarBebida(m, b); 
        switch(b){
            case 0:
                tipoBebida = "CocaCola";
            case 1:
                tipoBebida = "Sprite";
            case 2:
                tipoBebida = "Fanta";
        Moneda moneda_uno = e.getDepositoVuelto();
        if(moneda_uno == null){vuelto = 0}
        else{
            while(moneda_uno != null){
                vuelto += moneda_uno.getValor();
                moneda_uno = e.getDepositoValor();
                 
            } 
        }
    }
    public int CuantoVuelto(){
        return vuelto;
    }
    public String queBebiste(){
        return tipoBebida;
    }
}
