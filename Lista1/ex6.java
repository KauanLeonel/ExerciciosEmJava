import javax.swing.JOptionPane;

public class ex6 {
    public static void main(String[] args) {
        /*
         * Escreva um programa em ANSI C que solicite ao usuário uma string utilizando a
         * função gets(). Em
         * seguida, utilizando uma estrutura de repetição, percorra cada caractere da
         * string para contar o número
         * total de vogais presentes (a, e, i, o, u), considerando tanto letras
         * maiúsculas quanto minúsculas. Ao final,
         * exiba a quantidade total de vogais encontradas na string fornecida.
         */
    
    String str = "";
    int vogais = 0;
    str = JOptionPane.showInputDialog("Digite uma frase: ");
    str = str.toLowerCase();
    for(int i = 0; i < str.length(); i++){
        if(str.charAt(i) == 'a'|| str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
            vogais++;
        }
    }
    JOptionPane.showMessageDialog(null, "Quantidade de vogais: " + vogais);
    }
    
}
