import javax.swing.JOptionPane;

public class ex1 {
    public static void main(String[] args) {
        /*
         * Faça um programa em C que armazene 15 números inteiros em um vetor e depois
         * permita que o usuário digite um número inteiro para ser buscado no vetor, se
         * for encontrado o programa deve imprimir a posição desse número no vetor, caso
         * contrário, deve imprimir a mensagem: "Nao encontrado!".
         */
        int vet[] = new int[5];
        int proc, confi = 1;
        for (int i = 0; i < vet.length; i++) {
            vet[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o "+ i +" numero: "));
        }

        proc = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual valor deseja procurar?"));

        for(int i = 0; i < vet.length; i++){
            if(proc == vet[i]){
                JOptionPane.showMessageDialog(null, "O numero " + proc + " esta na posicao " + i);
                confi = 1;
                break;
            } else {
                confi = 0;
            }
        }
        if(confi == 0) JOptionPane.showMessageDialog(null, "O numero nao foi encontrado ");
    }
}
