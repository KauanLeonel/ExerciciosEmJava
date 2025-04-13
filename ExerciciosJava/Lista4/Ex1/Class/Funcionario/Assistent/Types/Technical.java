package Lista4.Ex1.Class.Funcionario.Assistent.Types;

import Lista4.Ex1.Class.Funcionario.Funcionario;

public class Technical extends Funcionario {
    private float addtional = 0f;

    /*
     * ) sabendo que os Assistentes Técnicos possuem um bônus salarial e que os
     * Assistentes Administrativos possuem um turno (dia ou noite) e um
     * adicional noturno, crie as classes: Tecnico e Administrativo e
     * sobrescreva o método ganhoAnual() de ambas as classes
     * (Administrativo e Tecnico).
     */

    @Override
    public double annualGain() {
        return (getWage() + addtional) * 12;
    }

    //#region Getters and Setters
    public float getAddtional() {
        return addtional;
    }

    public void setAddtional(float addtional) {
        this.addtional = addtional;
    }

    /*@Override 
    public void setWage(double wage){
        this.wage = wage + addtional;
    }*/
    //#endregion
    
}
