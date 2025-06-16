package Lista7.ManipulacaoDeArquivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivo {
    public static String lerBufferedReader(String nomeArquivo) {
    String r = "";
    String linha = "";
    FileReader fr;
    BufferedReader br = null;
    try {
        fr = new FileReader(nomeArquivo + ".txt");
        br = new BufferedReader(fr);
    }
    catch (FileNotFoundException e) {
        System.out.println("Arquivo não encontrado! \n\n Detalhes do erro: " + e.getMessage());
    }
    if (br != null) {
        do {
            r += linha + " \n";
            try {
                linha = br.readLine();
            }
            catch (IOException e) {
                System.out.println("Erro durante a leitura do arquivo! \n\n Detalhes do erro: " + e.getMessage());
            }
        } while (linha != null);
        try {
            br.close();
        }
        catch (IOException e) {
            System.out.println("Erro durante o fechamento do arquivo! \n\n Detalhes do erro: " + e.getMessage());
        }
    }
    return r;
}

}
