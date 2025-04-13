import javax.swing.JOptionPane;

public class ex11 {
    public static void main (String[] args){
        int matriz[][]= new int[2][2]; //vetor
        int vetor[] = new int[2]; //array
        String nome = "Kauan"; //nome
        int num = 0; //num

        System.out.println("Saída com quebra de linha");
        System.out.print("Saída");
        JOptionPane.showMessageDialog(null, "Mostrar mensagem");
        num = Integer.parseInt(JOptionPane.showInputDialog("Receber um numero"));
        int r = JOptionPane.showConfirmDialog(null, "Mensagem de escolha: ( " + num  +" numero obtido)");

        float num2 = 1.234f;
        System.out.printf("%f", num2);
    }
}
