package Lista5.Exercicio2;

public class ProdutosComprados implements IProduto {
    private String nomeProduto;
    private float valor;

    public ProdutosComprados(String nomeProduto, float valor) {
        this.nomeProduto = nomeProduto;
        this.valor = valor;
    }
    @Override
    public float getCusto() {
        // TODO Auto-generated method stub
        return valor;
    }
    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return nomeProduto;
    }

    //#region Getters and Setters
    public String getNomeProduto() {
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public void setvalor(float valor) {
        this.valor = valor;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    //#endregion

    
}
