package Lista5.Exercicio2;

public class GerenteProdutos {
    
    // Retorna os ingredientes necessários para fabricar um produto
    public static String[] Ingredientes(String nomeProduto) {
        // Aqui é só exemplo. Você pode depois conectar com um banco, arquivo, etc.
        switch (nomeProduto) {
            case "Bolo":
                return new String[] { "Farinha", "Leite", "Ovo" };
            case "Farinha":
                return new String[] { "Trigo" };
            case "Ovo":
            case "Leite":
            case "Trigo":
                return new String[0]; // produtos básicos, não têm ingredientes
            default:
                return new String[0]; // caso não encontrado
        }
    }

    // Retorna o valor de compra de um produto pronto
    public static float valorCompra(String nomeProduto) {
        switch (nomeProduto) {
            case "Bolo":
                return 15.0f;
            case "Farinha":
                return 5.0f;
            case "Leite":
                return 3.0f;
            case "Ovo":
                return 2.0f;
            case "Trigo":
                return 1.0f;
            default:
                return 10.0f; // valor padrão genérico
        }
    }
}
