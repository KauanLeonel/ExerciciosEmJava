package Lista4.Ex2.Agenda.Types;

import javax.swing.JOptionPane;

import Lista4.Ex2.Agenda.Agenda;

public class Legal extends Agenda {
    private int cnpj;
    private int stateRegistration;
    private String coporateReason;

    @Override
    public void delete(){
        setName(null);
        setAdress(null);
        setEmail(null);
        setCnpj(0);
        setStateRegistration(0);
        setCoporateReason(null);
    }

    @Override
    public void add() {
        cnpj = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o cnpj: "));
        setName(JOptionPane.showInputDialog(null, "Insira o nome: "));
        setAdress(JOptionPane.showInputDialog(null, "Insira o endereço: "));
        stateRegistration = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o estado de registro: "));
        setEmail(JOptionPane.showInputDialog(null, "Insira o email: "));
        coporateReason = JOptionPane.showInputDialog(null, "Insira a razão social: ");
    }

    @Override
    public String show(){
        String all = "";
        all += "CPF: " + getCnpj() + "\nNome: "+ getName() + "\nEndereço: " + getAdress() + "\nEmail: " + getEmail() + "\nEstado: " + getStateRegistration() + "\nRazão social: " + getCoporateReason() + "\n";
        return all;
    }

    // #region GETTERS and SETTERS
    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public int getStateRegistration() {
        return stateRegistration;
    }

    public void setStateRegistration(int stateRegistration) {
        this.stateRegistration = stateRegistration;
    }

    public String getCoporateReason() {
        return coporateReason;
    }

    public void setCoporateReason(String coporateReason) {
        this.coporateReason = coporateReason;
    }
    // #endregion
}
