package Lista5.Exercicio2;

public class Teste {
    public static void main(String[] args) {
       IProduto farinha = new ProdutosComprados("Farinha", 4.0f);
        IProduto leite = new ProdutosComprados("Leite", 3.0f);
        IProduto ovo = new ProdutosComprados("Ovo", 2.0f);

        IProduto[] ingredientes = { farinha, leite, ovo };

        IProdutoFabricado bolo = new ProdutosFabricados("Bolo", ingredientes);

        System.out.println("Nome: " + bolo.getName());
        System.out.println("Custo total: " + bolo.getCusto());
        System.out.println("Ingredientes:");
        for (int i = 0; i < bolo.getNumeroIngredientes(); i++) {
            System.out.println(" - " + bolo.getIngrediente(i).getName());
        }
    }
}
