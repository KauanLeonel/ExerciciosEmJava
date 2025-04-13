import java.util.Scanner;

public class ex4 {
    /*
     * Desenvolva um programa que contenha uma função chamada somaDigitos, que
     * receba um número
     * inteiro positivo e retorne a soma dos seus dígitos. No main, leia uma
     * sequência de números até que o
     * usuário insira o valor 0. Para cada número inserido, chame a função
     * somaDigitos e exiba o resultado. Use
     * uma estrutura de repetição para solicitar continuamente os números do usuário
     * até que ele digite 0.
     */
    public static int somaDigitos(int total) {
        int soma = 0;
        while (total > 10) {
            soma += total / 10;
            total = total % 10;
        }
        soma += total;
        return soma;
    }

    public static void main(String[] args) {
        int num = 1, total = 0;
        Scanner sc = new Scanner(System.in);
        while (num != 0) {
            System.out.println("Digite um numero (zero cancela a operação):");
            num = sc.nextInt();
            if (num == 0)
                break;
            total = total * 10 + num;
        }
        System.out.println(total);
        System.out.println(somaDigitos(total));
    }
}
