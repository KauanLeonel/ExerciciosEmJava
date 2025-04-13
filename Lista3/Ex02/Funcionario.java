package Lista3.Ex02;

public class Funcionario {
    private String nome;
    private String dep;
    private double salario;
    private String dataEntrada;
    private String rg;

    public double recebeAumento(Funcionario[] funcionario, int id, float aumento) {
        double salario = funcionario[id].getSalario();
        return salario += aumento;
    }

    public double calculoGanhoAnual() {
        return this.salario * 12;
    }

    // #region GETTERS AND SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    // #endregion
}
