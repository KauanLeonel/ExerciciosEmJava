import javax.swing.JOptionPane;

public class l2ex6 {
    public static void main(String[] args) {
        int vetor1[] = new int[5];
        int vetor2[] = new int[5];
        int vetor3[] = new int[6];
        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da posicao " + i));
        }
        for (int i = 0; i < vetor2.length; i++) {
            vetor2[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da posicao " + i));
        }

        for (int i = vetor3.length - 1; i > 0; i--) {
            vetor3[i] += vetor2[i - 1] + vetor1[i - 1];
            if (vetor3[i] > 9) {
                vetor3[i - 1] = vetor3[i] / 10;
                vetor3[i] = vetor3[i] % 10;
            }
        }

        String str = "";
        for (int i = 0; i < vetor3.length; i++) {
            str += vetor3[i];
        }

        JOptionPane.showMessageDialog(null, "A soma tem como resultado: " + str);

    }
}
