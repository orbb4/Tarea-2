package tarea2;
public class Tarea2 {
    public static void main(String[] args) throws NoHayBebidaException, PagoIncorrectoException, PagoInsuficienteException{
        Deposito d = new Deposito();
        Moneda100 m = new Moneda100();
        System.out.println(m.getSerie());
        Moneda1000 moneda = new Moneda1000();
        Expendedor expendedor = new Expendedor(5, 700);
        Comprador comprador = new Comprador(moneda, 1, expendedor);
        System.out.println(comprador.cuantoVuelto());
        System.out.println(comprador.queBebiste());
    }        
}