public class pong {
    public static void main(String[] args) {
        int vetor[][] = new int[5][21];
        vetor[2][10] = 1;
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor[i].length; j++) {
                System.out.print("[" + vetor[i][j] + "]");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        while (true) {
            for (int i = 10; i < vetor[2].length - 1; i++) {
                vetor[2][i] = 0;
                if (vetor[2][i] != vetor[2].length)
                    vetor[2][i + 1] = 1;
                for (int k = 0; k < vetor.length; k++) {
                    for (int j = 0; j < vetor[k].length; j++) {
                        System.out.print("[" + vetor[k][j] + "]");
                    }
                    System.out.print("\n");
                }
                System.out.print("\n");
            }
            {
                for (int i = vetor[2].length; i > vetor[2][0]; i--) {
                    vetor[2][i] = 0;
                    vetor[2][i - 1] = 1;
                    for (int k = 0; k < vetor.length; k++) {
                        for (int j = 0; j < vetor[k].length; j++) {
                            System.out.print("[" + vetor[k][j] + "]");
                        }
                        System.out.print("\n");
                    }
                    System.out.print("\n");
                }
            }
        }
    }
}