package Lista4.Ex2.Agenda.Types;

import javax.swing.JOptionPane;

import Lista4.Ex2.Agenda.Agenda;

public class Fisic extends Agenda {
    private int cpf;
    private String dateOfBirth;
    private String maritalStatus;

    @Override
    public void add() {
        cpf = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o cpf: "));
        setName(JOptionPane.showInputDialog(null, "Insira o nome: "));
        setAdress(JOptionPane.showInputDialog(null, "Insira o endereço: "));
        dateOfBirth = JOptionPane.showInputDialog(null, "Insira a data de nascimento: ");
        setEmail(JOptionPane.showInputDialog(null, "Insira o email: "));
        maritalStatus = JOptionPane.showInputDialog(null, "Insira o estado cívil: ");
    }

    // #region Gettes and Settes
    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
    // #endregion
}
