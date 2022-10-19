package tarea2;
import java.util.ArrayList;


class Deposito{
    private ArrayList<Bebida> bebidas;
    public Deposito(){
        bebidas = new ArrayList();
    }
    public void addBebida(Bebida b){
        bebidas.add(b);
    }
    public Bebida getBebida(){
        if(bebidas.size() != 0){
            return bebidas.remove(0);
        }else{
            return null;
        }
       
    }
}

/*
class DepositoVuelto{
    private ArrayList<Moneda> monedas;
    public Deposito(){
        monedas = new ArrayList();
    }
    public void addMoneda(Bebida b){
        monedas.add(b);
    }
    public Bebida getMoneda(){
        if(monedas.size() != 0){
            return monedas.remove(0);
        }else{
            return null;
        }
       
    }
}
*/