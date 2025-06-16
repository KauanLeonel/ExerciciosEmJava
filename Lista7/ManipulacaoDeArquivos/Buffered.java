package Lista7.ManipulacaoDeArquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Buffered {
    public static void escreverBufferedWriter(String texto, String nomeArquivo, boolean a){
    FileWriter fw;
    BufferedWriter bw = null;
    try {
        fw = new FileWriter(nomeArquivo + ".txt", a);
        bw = new BufferedWriter(fw);
    }
    catch (IOException e) {
        System.out.println("Erro durante a abertura do arquivo! \n\n Detalhes do erro: " + e.getMessage());
    }
    if (bw != null) {
        try {
            bw.write(texto);
            bw.newLine();
        }
        catch (IOException e) {
            System.out.println("Erro durante a escrita do arquivo! \n\n Detalhes do erro: " + e.getMessage());
        }
        try{
            bw.flush();
            bw.close();
        }
        catch(IOException e){
            System.out.println("Erro durante o fechamento do arquivo! \n\n Detalhes do erro: " + e.getMessage());
        }
    }
}

}
