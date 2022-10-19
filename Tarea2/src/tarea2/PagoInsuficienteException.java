package tarea2;

class PagoInsuficienteException extends Exception{
    public PagoInsuficienteException(String errorMessage){
        super(errorMessage);
    }
}
