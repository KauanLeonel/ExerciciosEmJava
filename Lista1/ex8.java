import javax.swing.JOptionPane;

public class ex8 {
    public static void main(String[] args) {
        /*
         * Construa um programa em C que leia valores inteiros para a matriz A3 x 5.
         * Gerar e
         * imprimir a matriz SOMACOLUNA, em que cada elemento é a soma dos elementos
         * de uma coluna da matriz A. Faça o trecho que gera a matriz separado da
         * entrada
         * e da saída.
         */
        int matriz[][] = new int [3][5];
        int soma[]= new int[3];
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de " + i + " " + j));
            }
        }
        for(int i = 0; i < matriz.length; i++){
            soma[i] = 0;
            for(int j = 0; j < matriz[i].length; j++){
                soma[i] += matriz[i][j]; 
            }
        }
        for(int i = 0; i < soma.length; i++){
            System.out.println(soma[i]);
        }
    }
}
