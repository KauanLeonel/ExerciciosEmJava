package Lista6.Ex3;

public class Teste {
    public static void main(String[] args) {
        Conta conta = new Conta(300);

        conta.depositar(200);

        try {
            conta.sacar(100);  // OK
            conta.sacar(500);  // Vai lançar exceção
        } catch (SaldoException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Saldo final: R$ " + conta.getSaldo());
    }
}
