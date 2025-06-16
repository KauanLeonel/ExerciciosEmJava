package Lista7.ManipulacaoDeArquivos;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class lerObjectInputStream {
    public static String lerObjectInputStream(String nomeArquivo) {
    String r = "";
    FileInputStream fis;
    BufferedInputStream bis;
    ObjectInputStream ois = null;

    try {
        fis = new FileInputStream(nomeArquivo + ".dat");
        bis = new BufferedInputStream(fis);
        ois = new ObjectInputStream(bis);
    }
    catch (FileNotFoundException e) {
        System.out.println("Arquivo não encontrado! \n\n Detalhes do erro: " + e.getMessage());
    }
    catch (IOException e) {
        System.out.println("Erro na criação do objeto! \n\n Detalhes do erro: " + e.getMessage());
    }

    if (ois != null) {
        boolean fimArquivo = false;
        while (!fimArquivo) {
            try {
                Item i = (Item) ois.readObject();
                r += i.toString() + "\n";
            }
            catch (EOFException e) {
                fimArquivo = true;
            }
            catch (ClassNotFoundException e) {
                System.out.println("Classe não encontrada! \n\n Detalhes do erro: " + e.getMessage());
            }
            catch (IOException e) {
                System.out.println("Erro na leitura do arquivo! \n\n Detalhes do erro: " + e.getMessage());
            }
        }

        try {
            ois.close();
        }
        catch (IOException e) {
            System.out.println("Erro durante o fechamento do arquivo! \n\n Detalhes do erro: " + e.getMessage());
        }
    }

    return r;
}

}
