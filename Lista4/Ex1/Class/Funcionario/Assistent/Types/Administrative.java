package Lista4.Ex1.Class.Funcionario.Assistent.Types;

import Lista4.Ex1.Class.Funcionario.Assistent.Assistente;

/*) sabendo que os Assistentes Técnicos possuem um bônus salarial e que os
Assistentes Administrativos possuem um turno (dia ou noite) e um
adicional noturno, crie as classes: Tecnico e Administrativo e
sobrescreva o método ganhoAnual() de ambas as classes
(Administrativo e Tecnico). */

public class Administrative extends Assistente {
    private String rotation;
    private Float additional = 0f;

    @Override
    public double annualGain() {
        double gain;
        gain = ((getWage() + additional) * 12);
    return gain;
    }

    // #region Getters And Setterss
    public String getRotation() {
        return rotation;
    }

    public void setRotation(String rotation) {
        this.rotation = rotation;
    }

    public Float getAdditional() {
        return additional;
    }

    public void setAdditional(Float additional) {
        this.additional = additional;
    }
    // #endregion

}
