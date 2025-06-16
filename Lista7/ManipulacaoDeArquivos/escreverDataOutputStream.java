package Lista7.ManipulacaoDeArquivos;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class escreverDataOutputStream {
    public static void escreverDataOutputStream(Item item[], String nomeArquivo, boolean a) {
    FileOutputStream fos;
    DataOutputStream dos = null;
    try {
        fos = new FileOutputStream(nomeArquivo + ".dat", a);
        dos = new DataOutputStream(fos);
    }
    catch (FileNotFoundException e) {
        System.out.println("Arquivo não encontrado! \n\n Detalhes do erro: " + e.getMessage());
    }

    if (dos != null) {
        for (Item i : item) {
            try {
                dos.writeUTF(i.getDescricao());
                dos.writeInt(i.getQuantidade());
                dos.writeDouble(i.getPreco());
            }
            catch (IOException e) {
                System.out.println("Erro durante a escrita do arquivo! \n\n Detalhes do erro: " + e.getMessage());
            }
        }
        try {
            dos.close();
        }
        catch (IOException e) {
            System.out.println("Erro durante o fechamento do arquivo! \n\n Detalhes do erro: " + e.getMessage());
        }
    }
}

}
