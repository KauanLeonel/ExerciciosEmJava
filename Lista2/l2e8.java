import javax.swing.JOptionPane;

public class l2e8 {

   
    public static void main(String[] args) {
        int vetor[] = new int[6];
        int temp = 0;
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Integer
                    .parseInt(JOptionPane.showInputDialog(null, "Insira o valor do " + i + "º primeior vetor:"));
        }
        for (int j = 0; j < vetor.length; j++) {
            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[j] < vetor[i]) {
                    temp = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = temp;
                }
            }
        }
        for (int i = 0; i < vetor.length; i++) {
            JOptionPane.showMessageDialog(null, vetor[i]);
        }
    }
}
