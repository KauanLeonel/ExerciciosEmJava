package Lista3.Ex03;

import javax.swing.JOptionPane;

public class Conta {
    private int numAccount;
    private float balance;

    public void extratic(){
        JOptionPane.showMessageDialog(null, "Número da conta: "+ numAccount + "\nSaldo: " + balance);
    }

    public void loot (float withdrawal){
        this.balance -= withdrawal;
    }

    public void deposit (float withdrawal){
        this.balance += withdrawal;
    }
//#region Getters And Setters
    public int getNumAccount() {
        return numAccount;
    }

    public void setNumAccount(int numAccount) {
        this.numAccount = numAccount;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

//#endregion
    
}
