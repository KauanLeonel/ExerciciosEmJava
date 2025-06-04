package Lista5.Exercicio4;

public class Supermercado {
    public static void main(String[] args) {
        int arrays = 3;
        int aleatorio;
        Shampoo[] shampoos = new Shampoo[arrays];
        Leite[] leites = new Leite[arrays];
        Biscoito[] biscoitos = new Biscoito[arrays];
    
        for (int i = 0; i < arrays; i++) {
            aleatorio = (int)(Math.random() * 199) + 1;
            shampoos[i] = new Shampoo(i + 1);
            leites[i] = new Leite(i * 6);
            biscoitos[i] = new Biscoito(aleatorio);
        }

        for (int i = 0; i < arrays; i++) {
            System.out.println("Biscoito");
            System.out.println(biscoitos[i].getCancerigeno());
            System.out.println("Leite: ");
            System.out.println(leites[i].getValidade());
            System.out.println("Shampoo: ");
            System.out.println(shampoos[i].getIrritabilidade());
        }
    }
}
