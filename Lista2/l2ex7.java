import javax.swing.JOptionPane;

public class l2ex7 {
    public static void main(String[] args) {
        int vetor1[] = new int[6];
        int vetor2[] = new int[3];
        int temp = 0;
        for (int i = 0; i < vetor2.length; i++) {
            vetor1[i] = Integer
                    .parseInt(JOptionPane.showInputDialog(null, "Insira o " + i + "º valor do primeiro vetor: "));
        }
        for (int i = 0; i < vetor2.length; i++) {
            vetor2[i] = Integer
                    .parseInt(JOptionPane.showInputDialog(null, "Insira o " + i + "º valor do segundo vetor: "));
        }
        for (int i = 0; i < vetor2.length; i++) {
            if (vetor2[i] != vetor1[1] && vetor2[i] != vetor1[0] && vetor2[i] != vetor1[2]) {
                vetor1[i + 3] = vetor2[i];
            }
        }

        String str = "";

        for (int k = 0; k < vetor1.length; k++) {
            str += vetor1[k] + " ";
        }

        JOptionPane.showMessageDialog(null, str);
    }
}
