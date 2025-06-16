package Lista7.ManipulacaoDeArquivos;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class escreverObjectOutputStream {
    public static void escreverObjectOutputStream(Item[] item, String nomeArquivo, boolean a) {
    FileOutputStream fos;
    BufferedOutputStream bos;
    ObjectOutputStream oos = null;

    try {
        fos = new FileOutputStream(nomeArquivo + ".dat", a);
        bos = new BufferedOutputStream(fos);
        oos = new ObjectOutputStream(bos);
    }
    catch (FileNotFoundException e) {
        System.out.println("Arquivo não encontrado! \n\n Detalhes do erro: " + e.getMessage());
    }
    catch (IOException e) {
        System.out.println("Erro na criação do objeto! \n\n Detalhes do erro: " + e.getMessage());
    }

    if (oos != null) {
        for (Item i : item) {
            try {
                oos.writeObject(i);
            }
            catch (IOException e) {
                System.out.println("Erro durante a escrita do arquivo! \n\n Detalhes do erro: " + e.getMessage());
            }
        }
        try {
            oos.close();
        }
        catch (IOException e) {
            System.out.println("Erro durante o fechamento do arquivo! \n\n Detalhes do erro: " + e.getMessage());
        }
    }
}

}
