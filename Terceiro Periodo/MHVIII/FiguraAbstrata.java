package MHVIII;

public abstract class FiguraAbstrata {
    private int qtdLados;
    private String nome;

    public FiguraAbstrata( String nome, int qtdLados) {
        this.qtdLados = qtdLados;
        this.nome = nome;
    }

    public int getqtdLados() {
        return qtdLados;
    }
    public void setqtdLados(int qtdLados) {
        this.qtdLados = qtdLados;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public abstract void Desenha();

    @Override
    public String toString() {
        return "FiguraAbstrata [nome=" + nome + ", qtdLados=" + qtdLados + "]";
    }

}
