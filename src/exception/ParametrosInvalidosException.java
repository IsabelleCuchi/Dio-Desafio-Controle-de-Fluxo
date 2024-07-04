package exception;

public class ParametrosInvalidosException extends Exception{
    public ParametrosInvalidosException() {
        super("O segundo parametro dever ser maior");
    }
}
