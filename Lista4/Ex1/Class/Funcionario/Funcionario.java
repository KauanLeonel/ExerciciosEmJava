package Lista4.Ex1.Class.Funcionario;
/*Implemente a classe Funcionario com os atributos: nome e salario, e os
métodos: addAumento(double valor), ganhoAnual() e
exibeDados(). */

import javax.swing.JOptionPane;

public class Funcionario {
    private String name;
    private double wage;

    public double addIncrease(double value) {
        wage = wage + value;
        return wage;
    }

    public double annualGain() {
        return wage * 12;
    }

    public void showData() {
        JOptionPane.showMessageDialog(null, "Nome: " + name+ "\nSalário: " + wage+ "\nGanho anual: " + annualGain()) ;
    }

    // #region Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }
    // #region
}
