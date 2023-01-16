package MHVII;

public class Animal {
    private String nome;
    private String tipo;
    private int qntPatas;
 
    public Animal(String nome, String tipo, int qntPatas) {
        this.nome = nome;
        this.tipo = tipo;
        this.qntPatas = qntPatas;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getQntPatas() {
        return qntPatas;
    }
    public void setQntPatas(int qntPatas) {
        this.qntPatas = qntPatas;
    }

    @Override
    public String toString() {
        return "Animal [nome=" + nome + ", qntPatas=" + qntPatas + ", tipo=" + tipo + "]";
    }

}
