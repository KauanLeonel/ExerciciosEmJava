package Lista7.ManipulacaoDeArquivos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class LerBuffered {
    public static void main(String[] args) {
    // TODO code application logic here

    String nomeArquivo = JOptionPane.showInputDialog("Entre com o nome do arquivo: ");
    String texto;

    texto = ESArquivo.lerFileReader(nomeArquivo);
    JOptionPane.showMessageDialog(null, "Lendo o arquivo " + nomeArquivo + ":\n\n" + texto);
}

public static String lerFileReader(String nomeArquivo) {
    int c = 0;
    String r = "";
    FileReader fr = null;
    try {
        fr = new FileReader(nomeArquivo + ".txt");
    }
    catch (FileNotFoundException e) {
        System.out.println("Arquivo não encontrado! \n\n Detalhes do erro: " + e.getMessage());
    }
    if (fr != null) {
        do {
            r += (char) c;
            try {
                c = fr.read();
            }
            catch (IOException e) {
                System.out.println("Erro durante a leitura do arquivo! \n\n Detalhes do erro: " + e.getMessage());
            }
        } while (c != -1);
        try {
            fr.close();
        } catch (IOException e) {
            System.out.println("Erro durante o fechamento do arquivo! \n\n Detalhes do erro: " + e.getMessage());
        }
    }
    return r;
}

}
