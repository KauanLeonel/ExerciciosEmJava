package Lista4.Ex2.Agenda;

import javax.swing.JOptionPane;

public class Agenda {
    private String name;
    private String adress;
    private String email;

    public void add() {
        name = JOptionPane.showInputDialog(null, "Insira o nome: ");
        adress = JOptionPane.showInputDialog(null, "Insira o endereço: ");
        email = JOptionPane.showInputDialog(null, "Insira o email: ");
    }

    public boolean isDeleted() {
        return this.name == null || this.name.isEmpty();
    }

    public String show() {
        String all = "";
        all += getName() + getAdress() + getEmail();
        return all;
    }

    public void delete() {
        setName(null);
        setAdress(null);
        setEmail(null);
    }

    // #region Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    // #endregion
}
