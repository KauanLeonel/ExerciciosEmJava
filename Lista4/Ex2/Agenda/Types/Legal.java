package Lista4.Ex2.Agenda.Types;

import Lista4.Ex2.Agenda.Agenda;

public class Legal extends Agenda {
    private int cnpj;
    private int stateRegistration;
    private String coporateReason;

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
