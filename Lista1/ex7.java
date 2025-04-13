import javax.swing.JOptionPane;

public class ex7 {
    public static void main(String[] args) {
        /*
         * Implemente um programa que leia uma mensagem e um caractere. Após a leitura,
         * o programa deve, por meio de função, retirar todas as ocorrências do
         * caractere
         * informado na mensagem colocando * em seu lugar. A função deve também
         * retornar o total de caracteres retirados. Ao final, o programa deve imprimir
         * a frase
         * ajustada e a quantidade de caracteres substituídos.
         */
    String msg, letra;
    msg = JOptionPane.showInputDialog("Escreva uma frase: ");
    letra = JOptionPane.showInputDialog("Insira o caractere a ser excluído:");
    StringBuilder msg2 = new StringBuilder(msg);
    for(int i = 0; i < msg.length(); i++){
        if(msg.charAt(i) == letra.charAt(0)){
            msg2.setCharAt(i, '*');
        } else{
            msg2.setCharAt(i, msg.charAt(i));
        }
    }
    JOptionPane.showMessageDialog(null, msg2);
    }
}
