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

class CocaCola extends Bebida{
    public CocaCola(int n1){
        super(n1);
    }
    public String beber(){
        return super.beber()+"Cocacola";
    }
}

class Sprite extends Bebida{
    public Sprite(int n2){
        super(n2);
    }
    public String beber(){
        return super.beber()+"Sprite";
    }
}
class Fanta extends Bebida{
    public Fanta(int n3){
        super(n3);
    }
    public String beber(){
        return super.beber()+"Fanta";
    }
}

<<<<<<< HEAD

=======
>>>>>>> 33769c3491d86726d7b34d12af91558d58db66e9
