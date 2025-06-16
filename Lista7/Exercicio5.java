package Lista7;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String arquivo = "alunos.dat";

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(arquivo))) {

            for (int i = 1; i <= 3; i++) {
                System.out.println("Aluno " + i + ":");

                System.out.print("Nome: ");
                String nome = sc.nextLine();

                System.out.print("Código: ");
                int codigo = Integer.parseInt(sc.nextLine());

                System.out.print("Nota 1 (inteiro): ");
                int nota1 = Integer.parseInt(sc.nextLine());

                System.out.print("Nota 2 (inteiro): ");
                int nota2 = Integer.parseInt(sc.nextLine());

                // 1. escreve o tamanho do nome
                dos.writeInt(nome.length());

                // 2. escreve os caracteres do nome (char por char)
                for (int j = 0; j < nome.length(); j++) {
                    dos.writeChar(nome.charAt(j));
                }

                // 3. código do aluno
                dos.writeInt(codigo);

                // 4. as duas notas
                dos.writeInt(nota1);
                dos.writeInt(nota2);

                System.out.println("Aluno gravado com sucesso.\n");
            }

        } catch (IOException e) {
            System.err.println("Erro ao gravar arquivo: " + e.getMessage());
        }

        sc.close();
    }
}
