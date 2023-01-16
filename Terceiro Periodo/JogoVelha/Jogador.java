package JogoVelha;

public class Jogador {
    private String nome;
    private int pontuação = 0;
    
    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontuação() {
        return pontuação;
    }

    public void setPontuação(int pontuação) {
        this.pontuação = pontuação;
    }

    @Override
    public String toString() {
        return "Jogador [nome=" + nome + ", pontuação=" + pontuação + "]";
    }

    
}
