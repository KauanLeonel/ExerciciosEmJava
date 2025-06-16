package Lista6;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero = 0;
        boolean valido = false;

        while (!valido) {
            try {
                System.out.print("Digite um número: ");
                String entrada = sc.nextLine();
                numero = Double.parseDouble(entrada);
                valido = true; // Se não lançar exceção, sai do loop
            } catch (NumberFormatException e) {
                System.out.println("Opa… Acho que você se enganou! Digite novamente...");
            }
        }

        double quadrado = Math.pow(numero, 2);
        System.out.println("O quadrado de " + numero + " é " + quadrado);
    }
}
