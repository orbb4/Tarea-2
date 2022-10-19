package tarea2;

class PagoIncorrectoException extends Exception{
    public PagoIncorrectoException(String errorMessage){
        super(errorMessage);
    }
}

