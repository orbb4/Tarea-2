package tarea2;
import java.util.ArrayList;
public class Tarea2 {
    public static void main(String[] args) {
          
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