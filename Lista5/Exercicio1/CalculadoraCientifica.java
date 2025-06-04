package Lista5.Exercicio1;

public class CalculadoraCientifica extends Calculadora {
    
    public double raizQuadrada(float num){
        double numInteiro = (double) num;
        return Math.sqrt(numInteiro);
    }

        public double potencia(float num, float expoente){
        return Math.pow(num, expoente);
    }
}
