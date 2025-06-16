package Lista7.ManipulacaoDeArquivos;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class lerBufferedInputStream {
    public static String lerBufferedInputStream(String nomeArquivo) {
    String r = "";
    FileInputStream fis;
    BufferedInputStream bis;
    DataInputStream dis = null;

    try {
        fis = new FileInputStream(nomeArquivo + ".dat");
        bis = new BufferedInputStream(fis);
        dis = new DataInputStream(bis);
    }
    catch (FileNotFoundException e) {
        System.out.println("Arquivo não encontrado! \n\n Detalhes do erro: " + e.getMessage());
    }

    if (dis != null) {
        boolean fimArquivo = false;
        while (!fimArquivo) {
            try {
                Item i = new Item(dis.readUTF(), dis.readInt(), dis.readDouble());
                r += i.toString() + "\n";
            }
            catch (EOFException e) {
                fimArquivo = true;
            }
            catch (IOException e) {
                System.out.println("Erro durante a leitura do arquivo! \n\n Detalhes do erro: " + e.getMessage());
            }
        }
        try {
            dis.close();
        }
        catch (IOException e) {
            System.out.println("Erro durante o fechamento do arquivo! \n\n Detalhes do erro: " + e.getMessage());
        }
    }

    return r;
}

}
