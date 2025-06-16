package Lista6.Ex3;

public class Conta {
    private double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de " + valor + " realizado.");
    }

    public void sacar(double valor) throws SaldoException {
        if (valor > saldo) {
            throw new SaldoException("Tentativa de saque de R$ " + valor + " com saldo de R$ " + saldo);
        }
        saldo -= valor;
        System.out.println("Saque de " + valor + " realizado.");
    }

    public double getSaldo() {
        return saldo;
    }
}