package Lista3.Ex04;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args){
        //Data data = new Data();
        int dia;
        int mes;
        int ano;
        
        dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o dia: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o mês: "));
        ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o ano: "));

        Data data = new Data(dia, mes, ano);
        data.ToString();
    }
}