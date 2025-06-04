package Lista5.Exercicio3;

public class ContaCorrente extends Conta implements Tributavel{
    @Override
    public double calculaTributos() {
        // TODO Auto-generated method stub
         return (getSaldo() * 0.1); 
    }
}
