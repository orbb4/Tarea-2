package tarea2;
public class Tarea2 {
    public static void main(String[] args) {
        Deposito d = new Deposito();
        Moneda100 m = new Moneda100();
        System.out.println(m.getSerie());
<<<<<<< HEAD
=======
    }
    
        Deposito d = new Deposito();
        Moneda100 m = new Moneda100();
        System.out.println(m.getSerie());
>>>>>>> 33769c3491d86726d7b34d12af91558d58db66e9
        Moneda moneda = new Moneda();
        Expendedor expendedor = new Expendedor(5, 1000);
        Comprador comprador = new Comprador(moneda, 1, expendedor);
    }        
}