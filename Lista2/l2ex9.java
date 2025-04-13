import javax.swing.JOptionPane;

public class l2ex9 {
    public static void main(String[] args) {
        int i = 0, j = 0;
        j = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de colunas:"));
        i = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de linhas:"));
        int matriz[][] = new int[i][j];
        for (int l = 0; l < j; l++) {
            for (int k = 0; k < i; k++) {
                matriz[k][l] = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor em" + l + " " + k + ":"));
            }
        }
        int maior = matriz[0][0];
        int linha = 0;
        for (int l = 0; l < j; l++) {
            for (int k = 0; k < i; k++) {
                if (matriz[k][l] > maior) {
                    maior = matriz[k][l];
                    linha = l;
                }
            }
        }
        int menor = matriz[1][linha];
        for (int k = 0; k < j; k++) {
            if (menor > matriz[k][linha]) {
                menor = matriz[k][linha];
            }
        }
        String str = "";

        for (int l = 0; l < j; l++) {
            str += "[";
            for (int k = 0; k < i; k++) {

                str += matriz[k][l];
            }
            str += "]\n";
        }
        JOptionPane.showMessageDialog(null, str);
        JOptionPane.showMessageDialog(null, " O minmax numero esta na linha " + linha + " e ele e' o" + menor);
    }
}
