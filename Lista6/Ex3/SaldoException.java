package Lista6.Ex3;

public class SaldoException extends Exception{
       public SaldoException(String mensagem) {
        super(mensagem);
    }

    @Override
    public String getMessage() {
        return "Erro de saldo: " + super.getMessage();
    }
}
