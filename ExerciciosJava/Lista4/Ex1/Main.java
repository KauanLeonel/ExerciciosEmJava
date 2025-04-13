package Lista4.Ex1;

import javax.swing.JOptionPane;

import Lista4.Ex1.Class.Funcionario.Funcionario;
import Lista4.Ex1.Class.Funcionario.Assistent.Types.Administrative;
import Lista4.Ex1.Class.Funcionario.Assistent.Types.Technical;

public class Main {

    public static void main(String[] args) {
    
        int choose;
        JOptionPane.showMessageDialog(null, "Bem-vindo ao sistema de cadastro de funcionário");
        do{
        choose = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Gostaria de cadastrar um assistente administrativo(0) ou técnico(1): "));} while (choose  < 0 || choose > 1);
        switch (choose) {
            case 0:
             Administrative person = new Administrative();
             person.setName(JOptionPane.showInputDialog(null, "Insira o nome do funcionário"));
             person.setRegistration(Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a matrícula")));
             person.setWage(Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o salário: ")));
             person.setRotation(JOptionPane.showInputDialog(null, "Qual o turno (Dia/Noite): "));
             if (person.getRotation().equalsIgnoreCase("noite")){
                person.setAdditional(Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o valor do adicional noturno: ")));
             }
             person.showData();

                break;
            case 1:
             Technical person1 = new Technical();
             person1.setName(JOptionPane.showInputDialog(null, "Insira o nome do funcionário"));
             person1.setWage(Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o salário: ")));
             person1.setAddtional(Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o bônus: ")));
             person1.showData();
                break;

            default:
                break;
        }
    }
}
