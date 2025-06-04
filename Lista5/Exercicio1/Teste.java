package Lista5.Exercicio1;

public class Teste {
    public static void main(String[] args) {
        float num1 = 15, num2 = 3.14f;
        CalculadoraCientifica calc = new CalculadoraCientifica();
        System.out.println("Soma " + calc.soma(num1, num2));
        System.out.println("Subtração " + calc.subatracao(num1, num2));
        System.out.println("Multiplicação " + calc.multiplicacao(num1, num2));
        System.out.println("Divisão " + calc.divisao(num1, num2));
        System.out.println("Divisão por zero " + calc.divisao(num1, 0));
        System.out.println("Potência " + calc.potencia(num1, num2));
        System.out.println("Raiz " + calc.raizQuadrada(num1));


    }
}
