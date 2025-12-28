package src.entities.ExceptionConta;

public class ErrorContaException extends Exception {
    public ErrorContaException (String mensagem) {
        super(mensagem); // Passa a mensagem para a classe pai (Exception)
    }
}

