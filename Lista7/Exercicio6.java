package Lista7;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Exercicio6 {

    static class Aluno {
        String nome;
        int codigo;
        int nota1;
        int nota2;
        double media;
        String situacao;

        public Aluno(String nome, int codigo, int nota1, int nota2) {
            this.nome = nome;
            this.codigo = codigo;
            this.nota1 = nota1;
            this.nota2 = nota2;
            this.media = (nota1 + nota2) / 2.0;
            this.situacao = calcularSituacao(media);
        }

        private String calcularSituacao(double media) {
            if (media >= 7.0) return "Aprovado";
            else if (media >= 4.0) return "IFA";
            else return "Reprovado";
        }

        @Override
        public String toString() {
            return String.format("%s (Código %d) - Média: %.2f - %s", nome, codigo, media, situacao);
        }
    }

    public static void main(String[] args) {
        String arquivo = "alunos.dat";

        ArrayList<Aluno> alunos = new ArrayList<>();

        try (DataInputStream dis = new DataInputStream(new FileInputStream(arquivo))) {

            while (dis.available() > 0) {
                // 1. lê tamanho do nome
                int tamanhoNome = dis.readInt();

                // 2. lê chars do nome
                StringBuilder nomeBuilder = new StringBuilder();
                for (int i = 0; i < tamanhoNome; i++) {
                    char c = dis.readChar();
                    nomeBuilder.append(c);
                }
                String nome = nomeBuilder.toString();

                // 3. lê código
                int codigo = dis.readInt();

                // 4. lê as notas
                int nota1 = dis.readInt();
                int nota2 = dis.readInt();

                // cria aluno e adiciona na lista
                Aluno aluno = new Aluno(nome, codigo, nota1, nota2);
                alunos.add(aluno);
            }

        } catch (IOException e) {
            System.err.println("Erro ao ler arquivo: " + e.getMessage());
            return;
        }

        // Agora calcular média da turma
        double somaMedias = 0;
        for (Aluno a : alunos) {
            somaMedias += a.media;
        }
        double mediaTurma = alunos.size() > 0 ? somaMedias / alunos.size() : 0;

        // Mostrar resultados organizados
        System.out.println("=== Alunos Aprovados ===");
        alunos.stream().filter(a -> a.situacao.equals("Aprovado")).forEach(System.out::println);

        System.out.println("\n=== Alunos em IFA ===");
        alunos.stream().filter(a -> a.situacao.equals("IFA")).forEach(System.out::println);

        System.out.println("\n=== Alunos Reprovados ===");
        alunos.stream().filter(a -> a.situacao.equals("Reprovado")).forEach(System.out::println);

        System.out.printf("\nMédia da turma: %.2f\n", mediaTurma);
    }
}
