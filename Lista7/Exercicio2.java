package Lista7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Exercicio2 {

    public static String lerBufferReader(String nomeDoArquivo){
        String r = " ";
        String linha = " ";
        FileReader fr;
        BufferedReader br = null;
        try {
            fr = new FileReader(nomeDoArquivo+ ".txt");
            br = new BufferedReader(fr);
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado \n\nDetalhes do erro " + e.getMessage());
        }

        if(br != null){
            do{
                r += linha+ "\n";
            try {
                linha = br.readLine();
            } catch (IOException e) {
                System.out.println("Erro de leitura\n\nDetalhes do erro " + e.getMessage());
            }
            } while (linha != null);        
            try{
                br.close();
            }
            catch(IOException e){
                System.out.println("Erro no fechamento\n\nDetalhes do erro " + e.getMessage());
            
            }
        }
        return r;
    }
    public static void main(String[] args) {
        String text = JOptionPane.showInputDialog("Digite o arquivo que você queira ler: ");
        String texto = "";
        try{
        texto = lerBufferReader(text);
        JOptionPane.showMessageDialog(null, texto);
        } catch(Exception e){
        JOptionPane.showMessageDialog(null, "Arquivo inexistente");

        }
        
    }
}