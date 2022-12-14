package tarea2;
public class Tarea2 {
    public static void main(String[] args){
        Deposito d = new Deposito();
        Moneda100 m = new Moneda100();
        Moneda1000 moneda = new Moneda1000();
        
        Expendedor expendedor = new Expendedor(1, 700);
        Comprador comprador;
        Comprador comprador2;
        Comprador comprador3;
        Comprador comprador4;
        
        System.out.println("Comprador 1: caso moneda null");
        comprador = new Comprador(null, 1, expendedor);
        System.out.println("Vuelto: "+comprador.cuantoVuelto());
        System.out.println("Bebida: "+comprador.queBebiste());
        System.out.println("\nComprador 2: caso compra exitosa");       
        comprador2 = new Comprador(moneda, 0, expendedor);
        System.out.println("Vuelto: "+comprador2.cuantoVuelto());
        System.out.println("Bebida: "+comprador2.queBebiste());
        System.out.println("\nComprador 3: caso pago insuficiente");
        comprador3 = new Comprador(m, 1, expendedor);
        System.out.println("Vuelto: "+comprador3.cuantoVuelto());
        System.out.println("Bebida: "+comprador3.queBebiste());
        System.out.println("\nComprador 4: caso bebidas insuficientes");
        comprador4 = new Comprador(moneda, 0, expendedor);
        System.out.println("Vuelto: "+comprador4.cuantoVuelto());
        System.out.println("Bebida: "+comprador4.queBebiste());

    }        
}