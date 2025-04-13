package Lista3.Ex03;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Conta account = new Conta();
        int choose;
        
        account.setNumAccount(Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o número da conta: ")));
        account.setBalance(Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o saldo da conta: ")));

        

        while(true){
            choose = Integer.parseInt(JOptionPane.showInputDialog("1- Extrato\n2- Saque\n3- Depósito\n4- Sair\nDigite a opção: "));
            switch (choose) {
                case 1:
                    account.extratic();
                    break;
                    case 2:
                    account.loot(Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o valor a ser retirado: ")));
                    break;
                    case 3:
                    account.deposit(Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o valor a ser depositado: ")));
                    break;
                default:
                return;
            }
        }
    }
}
