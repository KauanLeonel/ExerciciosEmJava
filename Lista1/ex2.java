import java.util.Arrays;

import javax.swing.JOptionPane;

public class ex2 {
    public static void main(String[] args) {
        int vet1[] = new int[4];
        int vet2[] = new int[4];
        
        for (int i = 0; i < vet1.length; i++){
            vet1[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Escreva o valor da posição " + i + " do vetor 1: "));
        }
        for (int i = 0; i < vet2.length; i++){
            vet2[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Escreva o valor da posição " + i + " do vetor 2: "));
        }
        int vet3[] = new int [vet1.length];

        for(int i = 0; i < vet1.length; i++ ){
            for(int j = 0; j < vet2.length; j ++){
                if(vet1[i] == vet2[j]) vet3[i] = vet1[i];
            }
        }

        System.out.println(Arrays.toString(vet3));
    }
}