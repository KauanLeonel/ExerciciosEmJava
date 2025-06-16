package Lista7;
import java.io.*; // Importa classes para manipulação de arquivos
import java.util.Scanner; // Importa Scanner para entrada de dados

public class Exercicio7 {

    // Método para copiar arquivos
    public static void copiarArquivo() {
        Scanner sc = new Scanner(System.in); // Cria o scanner para entrada do usuário

        String arquivoOrigem; // Nome do arquivo de origem
        String arquivoDestino; // Nome do arquivo de destino

        // Loop para garantir que o arquivo de origem existe
        while (true) {
            System.out.print("Digite o nome do arquivo de origem: ");
            arquivoOrigem = sc.nextLine(); // Lê o nome do arquivo de origem

            File origem = new File(arquivoOrigem); // Cria objeto File para o arquivo de origem
            if (!origem.exists() || !origem.isFile()) { // Verifica se o arquivo não existe ou não é um arquivo comum
                System.out.println("Arquivo de origem não existe ou não é um arquivo válido. Tente novamente.");
                continue; // Pede novamente
            }
            break; // Sai do loop se o arquivo existir e for válido
        }

        // Loop para tratar o arquivo de destino
        while (true) {
            System.out.print("Digite o nome do arquivo de destino: ");
            arquivoDestino = sc.nextLine(); // Lê o nome do arquivo de destino

            File destino = new File(arquivoDestino); // Cria objeto File para destino

            if (destino.exists()) { // Verifica se o arquivo destino já existe
                System.out.print("Arquivo de destino já existe. Deseja sobrescrever? (sim/não): ");
                String resposta = sc.nextLine().trim().toLowerCase(); // Lê e trata a resposta

                if (resposta.equals("sim") || resposta.equals("s")) { // Se a resposta for sim
                    if (podeCriarArquivo(destino)) { // Verifica se é possível criar (sobrescrever)
                        break; // Sai do loop e prossegue
                    } else {
                        System.out.println("Não é possível criar o arquivo de destino (pasta inexistente ou sem permissão).");
                        continue; // Pede novo nome
                    }
                } else { // Se não quiser sobrescrever
                    System.out.println("Informe um novo nome para o arquivo de destino.");
                    continue; // Repete o loop para pedir outro nome
                }
            } else { // Se o arquivo destino não existe
                if (podeCriarArquivo(destino)) { // Verifica se é possível criar o arquivo destino
                    break; // Ok, pode criar, sai do loop
                } else {
                    System.out.println("Não é possível criar o arquivo de destino (pasta inexistente ou sem permissão). Tente outro nome.");
                }
            }
        }

        // Bloco try-with-resources para abrir os arquivos e garantir fechamento
        try (
            FileInputStream fis = new FileInputStream(arquivoOrigem); // Abre arquivo de origem para leitura de bytes
            FileOutputStream fos = new FileOutputStream(arquivoDestino); // Abre/cria arquivo de destino para escrita de bytes
        ) {
            byte[] buffer = new byte[4096]; // Buffer de 4 KB para transferência
            int bytesLidos; // Quantidade de bytes lidos

            // Loop de leitura e escrita até o fim do arquivo
            while ((bytesLidos = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesLidos); // Escreve no destino os bytes lidos
            }

            System.out.println("Arquivo copiado com sucesso!"); // Mensagem de sucesso
        } catch (IOException e) { // Captura erro de IO
            System.out.println("Erro ao copiar arquivo: " + e.getMessage()); // Mensagem de erro
        }
    }

    // Método auxiliar para verificar se é possível criar ou sobrescrever um arquivo
    private static boolean podeCriarArquivo(File arquivo) {
        try {
            if (!arquivo.exists()) { // Se o arquivo ainda não existe
                File parent = arquivo.getParentFile(); // Verifica o diretório pai
                if (parent != null) { // Se tiver um diretório pai (não é raiz)
                    return parent.exists() && parent.isDirectory() && parent.canWrite(); // Verifica se pasta existe e é gravável
                } else {
                    // Se não tem pasta pai, assume o diretório atual
                    File atual = new File(".");
                    return atual.canWrite(); // Verifica se pode escrever no diretório atual
                }
            } else {
                // Se o arquivo já existe, verifica se tem permissão para escrever nele
                return arquivo.canWrite();
            }
        } catch (SecurityException e) { // Em caso de erro de permissão
            return false;
        }
    }

    // Método principal para executar o programa
    public static void main(String[] args) {
        copiarArquivo(); // Chama o método de copiar arquivo
    }
}
