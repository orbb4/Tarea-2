package tarea2;

abstract class Bebida{
    private int serie;
    public Bebida(int serie){
        this.serie = serie;
    }
    public int getSerie(){
        return serie;
    }
    public String beber(){

        return "sabor: ";
       
    }
}

class Moneda{ 
      
 } 
 class Moneda100 extends Moneda{ 
     private int valor = 100; 
     public int getValor(){ 
         return valor; 
     } 
 } 
 class Moneda500 extends Moneda{ 
     private int valor = 500; 
     public int getValor(){ 
         return valor; 
     } 
 } 
 class Moneda1000 extends Moneda{ 
     private int valor = 1000; 
     public int getValor(){ 
         return valor; 
     } 
 } 
 class Moneda1500 extends Moneda{ 
     private int valor = 1500; 
     public int getValor(){ 
         return valor; 
     } 
 }
