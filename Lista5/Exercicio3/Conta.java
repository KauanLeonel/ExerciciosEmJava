package Lista5.Exercicio3;

public class Conta {
    private double saldo;

    public void sacar(double dindin){
        setSaldo(getSaldo() - dindin); 
    }

    public void depositar(double dindin){
        setSaldo(getSaldo() + dindin); 
    }

    public double obterSaldo(){
        return getSaldo();
    }

    //#region Getters and Setters
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    //#endregion
    
}
