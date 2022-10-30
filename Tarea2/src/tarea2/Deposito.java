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
    public ArrayList<Bebida> getArrayBebidas(){
        return bebidas;
    }
}
class DepositoVuelto{
    private ArrayList<Moneda100> monedas;
    public DepositoVuelto(){
        monedas = new ArrayList();
    }
    public void addMoneda(){
        monedas.add(new Moneda100());
    }
    public Moneda100 getMoneda(){
        if(monedas.size() != 0){
            return monedas.remove(0);
        }else{
            return null;
        }
       
    }
}
