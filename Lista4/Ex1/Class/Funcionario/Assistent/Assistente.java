package Lista4.Ex1.Class.Funcionario.Assistent;

import javax.swing.JOptionPane;

import Lista4.Ex1.Class.Funcionario.Funcionario;

/*crie a classe Assistente, que também é um funcionário, e que possui um
número de matrícula. Faça os métodos gets e sets e sobrescreva o
método exibeDados(). */

public class Assistente extends Funcionario {
    private int registration;

    @Override
    public void showData() {

        JOptionPane.showMessageDialog(null, "Nome: " + getName() + "\nMatrícula: " + registration
                + "\nSalário com adicional: " + getWage() + "\nGanho anual: " + annualGain());
    }

    // #region Getters and Setters

    public int getRegistration() {
        return registration;
    }

    public void setRegistration(int registration) {
        this.registration = registration;
    }

    // #endregion
}
