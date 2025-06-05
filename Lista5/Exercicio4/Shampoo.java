package Lista5.Exercicio4;

public class Shampoo extends Produto {
    private int irritabilidade;

    public void obterValor(){
        setValor(irritabilidade * 3.7f);
    }

    public Shampoo(int irritabilidade) {
        this.irritabilidade = irritabilidade;
    }

    public int getIrritabilidade() {
        return irritabilidade;
    }

    public void setIrritabilidade(int irritabilidade) {
        this.irritabilidade = irritabilidade;
    }

    
}
