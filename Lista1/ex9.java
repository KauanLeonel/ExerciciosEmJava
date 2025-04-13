import javax.swing.JOptionPane;

public class ex9 {
    public static void main(String[] args) {
        /*
         * 5. Implemente duas funções recursivas: uma que cifra um texto utilizando uma
         * cifra de substituição com
         * chave k=3 e outra que decifra o texto utilizando a mesma chave. O usuário irá
         * entrar com uma string de
         * até 10 letras (apenas letras maiúsculas ou minúsculas).
         */
        String str;
        int r;
        str = JOptionPane.showInputDialog(null, "Escreva uma frase: ");
        StringBuilder deci = new StringBuilder(str);
        r = JOptionPane.showConfirmDialog(null, "Você gostaria de cifrar(sim) ou decifrar (não)?");
        if(r == JOptionPane.YES_OPTION){
            for(int i = 0; i < str.length(); i++){
            //deci.charAt(i) = deci.charAt(i) + 3; //NÃO DÁ PARA FAZER ISSO EM JAVA
        }
    }
    }
}
