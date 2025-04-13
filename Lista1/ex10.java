import java.util.Scanner;

public class ex10 {
    public static int inverter(int num){
        int invertido = 0;
        while(num > 0){
        invertido = invertido *10 + (num % 10);
        num = num /10;
        }
        return invertido;
    }
    public static void main(String[] args) {
        /*Escrever um algoritmo que lê um número de 3 dígitos e o inverta, escrevendo o número invertido. Utilize função no seu programa. */
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um algorismo que será invertido: ");
        int num = sc.nextInt();
        num = inverter(num);
        System.out.println("O número invertido é " + num);
    }
}