package tarea2;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Tarea2 {
    public static void main(String[] args){
        Deposito d = new Deposito();
        Moneda100 m = new Moneda100();
        System.out.println(m.getSerie());
        Moneda moneda = new Moneda();
        Expendedor expendedor = new Expendedor(5, 1000);
        Comprador comprador = new Comprador(moneda, 1, expendedor);
        //Moneda1000 moneda = new Moneda1000();
        //Expendedor expendedor = new Expendedor(1, 700);
        Comprador comprador1;
        Comprador comprador2;
        Comprador comprador3;
        Comprador comprador4;
        
        System.out.println("Comprador 1: caso moneda null");
        comprador = new Comprador(null, 1, expendedor);
        System.out.println(comprador.cuantoVuelto());
        System.out.println(comprador.queBebiste());
        System.out.println("Comprador 2: caso compra exitosa");       
        comprador2 = new Comprador(moneda, 0, expendedor);
        System.out.println(comprador2.cuantoVuelto());
        System.out.println(comprador2.queBebiste());
        System.out.println("Comprador 3: caso pago insuficiente");
        comprador3 = new Comprador(m, 1, expendedor);
        System.out.println(comprador3.cuantoVuelto());
        System.out.println(comprador3.queBebiste());
        System.out.println("Comprador 4: caso bebidas insuficientes");
        comprador4 = new Comprador(moneda, 0, expendedor);
        System.out.println(comprador4.cuantoVuelto());
        System.out.println(comprador4.queBebiste());
    }        
}