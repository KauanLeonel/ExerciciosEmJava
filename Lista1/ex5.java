import java.util.Scanner;

public class ex5 {
    public static int numDigitos(int num) {
        int digitos = 1;
        while (num > 10) {
            num = num / 10;
            digitos++;
        }
        return digitos;
    }

    public static int elevado(int num, int dig) {
        int resultado = 1;
        while (dig > 0) {
            resultado *= num;
            dig--;
        }
        return resultado;
    }

    public static int armstrong(int num, int dig) {
        int total = 0, temp;
        while (num > 10) {
            temp = num % 10;
            total += elevado(temp, dig);
            num = num / 10;
        }
        total += num;
        return total;
    }

    public static void main(String[] args) {
        /*
         * Implemente um programa que leia um número inteiro positivo n e verifique se
         * ele é um número de
         * Armstrong (ou seja, se a soma dos seus dígitos elevados ao número de dígitos
         * é igual ao próprio número).
         * Utilize uma estrutura de repetição while. Um número de Armstrong é um número
         * que é igual à soma de
         * seus próprios dígitos, cada um elevado à potência do número de dígitos. Por
         * exemplo: 153 é um número
         * de Armstrong porque (1^3 + 5^3 + 3^3 = 153) e 370 também é um número de
         * Armstrong porque (3^3 +
         * 7^3 + 0^3 = 370). O código poderá receber até 4 digitos, elaborar a função
         * para calcular o quadrado, cubo
         * e elevado a quarta potência.
         */
        int num, dig, total;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para verificar se ele é um numero de Armstrogn: ");
        num = sc.nextInt();
        dig = numDigitos(num);
        total = armstrong(num, dig);
        if (num == total)
            System.out.println("O numero " + num + " é armstrong");
        else
            System.out.println("Ele não é");
    }
}
