package Lista5.Exercicio2;

public class ProdutosFabricados implements IProdutoFabricado{
    private String nome;
    private IProduto[] ingredientes;

     public ProdutosFabricados(String nome, IProduto[] ingredientes) {
        this.nome = nome;
        this.ingredientes = ingredientes;
    }
    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return nome;
    }

    @Override
    public float getCusto() {
        float custo = 0; 
        for (int i = 0; i < ingredientes.length; i++) {
            custo += ingredientes[i].getCusto();
        }
        return custo;
    }

    public int getNumeroIngredientes(){
        return ingredientes.length;
    }

    @Override
    public IProduto getIngrediente(int num) {
        return ingredientes[num];
    }

    //#region
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public IProduto[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(IProduto[] ingredientes) {
        this.ingredientes = ingredientes;
    }
    //#endregion
    

}
