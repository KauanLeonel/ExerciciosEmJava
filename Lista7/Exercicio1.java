package Lista7;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Exercicio1 {

    public static void escreverFileWritter(String texto, String nomeDoArquivo, boolean a ){
        FileWriter fw = null;
        try{
            fw = new FileWriter(nomeDoArquivo + ".txt", a);
            fw.write(texto);
        }
        catch(IOException e){
            System.out.println("Erro durante a escrita do bagulho!  \n\nDetalhes do erro do bagulho: " 
            + e.getMessage());
        }

        if(fw != null){
            try{
                fw.close();
            } catch(IOException e){
                System.out.println("Erro durante o fechamento do bagulho!  \n\nDetalhes do erro: " 
                + e.getMessage());  
            }
        }
    }
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("INSIRA O NÚMERO DA TABUADA: "));
        String texto = "tabuada_num"+num;
        String tabuada = "";
        boolean adicionar = false;
        int res = 0;
        for (int i = 1; i < 11; i++) {
            res = i * num;
            tabuada += Integer.toString(res) + "\n";
        }
        escreverFileWritter(tabuada, texto, adicionar);
    }
}
