package Lista5.Exercicio4;

public class Leite extends Produto{
    private int validade;
    @Override
    public void setValor(float valor) {
        // TODO Auto-generated method stub
        super.setValor(5);
    }

    public void obterValor(){
        setValor(getValor() - (validade) * 3.7f );
    }

    public Leite(int validade) {
        this.validade = validade;
    }

    public int getValidade() {
        return validade;
    }

    public void setValidade(int validade) {
        this.validade = validade;
    }

    
}
