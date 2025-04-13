
public class Aluno {
    
public class aluno {
    private float matricula;
    private String nome;
    private float notasProva[] = new float[2];
    private float notaTrabalho;
    
    float media(float notasProva, float notaTrabalho) {
    return (this.notasProva[0] * 2.5f) + (this.notasProva[1] * 2.5f) + (this.notaTrabalho * 0.2f);
    }
    
    float rec(float notaSemifinal, float recuperacao) {
    if (notaSemifinal < 6) {
    float nota = 6 - notaSemifinal;
    } else return 0;
    float mediaFinal = (notaSemifinal + recuperacao) /2;
    return mediaFinal;
    }
    
    public float getMatricula() {
    return matricula;
    }
    
    public void setMatricula(float matricula) {
    this.matricula = matricula;
    }
    
    public void setNome(String nome) {
    this.nome = nome;
    }
    
    public void setNotasProva(float[] notasProva) {
    this.notasProva = notasProva;
    }
    
    public void setNotaTrabalho(float notaTrabalho) {
    this.notaTrabalho = notaTrabalho;
    }
    
    public String getNome() {
    return nome;
    }
    
    public float[] getNotasProva() {
    return notasProva;
    }
    
    public float getNotaTrabalho() {
    return notaTrabalho;
    }
    }
}
