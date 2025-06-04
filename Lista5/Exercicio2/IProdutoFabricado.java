package Lista5.Exercicio2;

public interface IProdutoFabricado extends IProduto{
    int getNumeroIngredientes();
    IProduto getIngrediente(int num);
}
