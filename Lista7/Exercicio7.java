package Lista7;

import java.io.*;
import java.util.Scanner;

public class Exercicio7 {

    public static void copiarArquivo() {
        Scanner sc = new Scanner(System.in);

        String arquivoOrigem;
        String arquivoDestino;

        while (true) {
            System.out.print("Digite o nome do arquivo de origem: ");
            arquivoOrigem = sc.nextLine();

            File origem = new File(arquivoOrigem);
            if (!origem.exists() || !origem.isFile()) {
                System.out.println("Arquivo de origem não existe ou não é um arquivo válido. Tente novamente.");
                continue;
            }
            break;
        }

        while (true) {
            System.out.print("Digite o nome do arquivo de destino: ");
            arquivoDestino = sc.nextLine();

            File destino = new File(arquivoDestino);

            if (destino.exists()) {
                System.out.print("Arquivo de destino já existe. Deseja sobrescrever? (sim/não): ");
                String resposta = sc.nextLine().trim().toLowerCase();

                if (resposta.equals("sim") || resposta.equals("s")) {
                    if (podeCriarArquivo(destino)) {
                        break; // ok para sobrescrever
                    } else {
                        System.out.println("Não é possível criar o arquivo de destino (pasta inexistente ou sem permissão).");
                        continue; // pede nome de destino de novo
                    }
                } else {
                    // pedir novo nome de destino
                    System.out.println("Informe um novo nome para o arquivo de destino.");
                    continue;
                }
            } else {
                // arquivo destino não existe, verifica se pode criar
                if (podeCriarArquivo(destino)) {
                    break;
                } else {
                    System.out.println("Não é possível criar o arquivo de destino (pasta inexistente ou sem permissão). Tente outro nome.");
                }
            }
        }

        // Agora copiar o arquivo
        try (
            FileInputStream fis = new FileInputStream(arquivoOrigem);
            FileOutputStream fos = new FileOutputStream(arquivoDestino);
        ) {
            byte[] buffer = new byte[4096];
            int bytesLidos;

            while ((bytesLidos = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesLidos);
            }

            System.out.println("Arquivo copiado com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao copiar arquivo: " + e.getMessage());
        }
    }

    // Método que verifica se é possível criar/escrever no arquivo destino
    private static boolean podeCriarArquivo(File arquivo) {
        try {
            if (!arquivo.exists()) {
                File parent = arquivo.getParentFile();
                if (parent != null) {
                    return parent.exists() && parent.isDirectory() && parent.canWrite();
                } else {
                    // Sem pasta pai, assume diretório atual
                    File atual = new File(".");
                    return atual.canWrite();
                }
            } else {
                // arquivo existe, verificar se é possível escrever
                return arquivo.canWrite();
            }
        } catch (SecurityException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        copiarArquivo();
    }
}
