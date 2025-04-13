package Lista3.Ex02;

import javax.swing.JOptionPane;

public class Main {

    public static void salario(Funcionario[] funcionario) {
        int num = 0, id = 0;
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "1- Aumentar salário\n2- Salário anual"));
            id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ID do funcionário:"));
            id--;
        } while (num < 1 || num > 2);
        switch (num) {
            case 1:
                float aumento = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o aumento do salário:"));
                double novoSalario = funcionario[id].recebeAumento(funcionario, id, aumento);
                funcionario[id].setSalario(novoSalario);
                JOptionPane.showMessageDialog(null, "O novo salário é " + novoSalario);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "O salário anual é de: " + funcionario[id].calculoGanhoAnual());
                break;
        }
    }

    public static void preencherDados(Funcionario[] funcionario) {
        int num = 0;
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ID do funcionário:"));
            num--;
        } while (num > funcionario.length || num < 0);

        funcionario[num].setNome(JOptionPane.showInputDialog(null, "Digite o nome do funcionário:"));
        funcionario[num].setDep(JOptionPane.showInputDialog(null, "Digite o departamento do funcionário:"));
        funcionario[num]
                .setSalario(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o salario do funcionário:")));
        funcionario[num].setDataEntrada(JOptionPane.showInputDialog(null, "Digite a data de entrada do funcionário:"));
        funcionario[num].setRg(JOptionPane.showInputDialog(null, "Digite o RG do funcionário:"));
    }

    public static void mostrarDados(Funcionario[] funcionario) {
        int num = 0;
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ID do funcionário:"));
            num--;
        } while (num > funcionario.length || num < 0);

        JOptionPane.showMessageDialog(null,
                "Nome: " + funcionario[num].getNome() +
                        "\nDepartamento: " + funcionario[num].getDep() +
                        "\nSalário: " + funcionario[num].getSalario() +
                        "\nData de entrada: " + funcionario[num].getDataEntrada() +
                        "\nRG: " + funcionario[num].getRg());

    }

    public static void main(String[] args) {
        int numEmployee;
        JOptionPane.showMessageDialog(null, "Bem-vindo ao Sistema de Gerenciamento de funcionários !");
        do {
            numEmployee = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o número de funcionários:"));
        } while (numEmployee < 1);

        Funcionario funcionario[] = new Funcionario[numEmployee];
        for (int i = 0; i < numEmployee; i++) {
            funcionario[i] = new Funcionario();
        }

        while (true) {
            numEmployee = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1- Preencher Dados \n2- Mostrar Dados\n3-Aumento de Salario/Ganho anual\n4- Sair do sistema\nInsira a opção desejada:"));
            switch (numEmployee) {
                case 1:
                    preencherDados(funcionario);
                    break;
                case 2:
                    mostrarDados(funcionario);
                    break;
                case 3:
                    salario(funcionario);
                    break;
                case 4:
                    return;

                default:
                    JOptionPane.showMessageDialog(null, "Error 1: Entrada inválida.");
                    ;

            }
        }
    }
}