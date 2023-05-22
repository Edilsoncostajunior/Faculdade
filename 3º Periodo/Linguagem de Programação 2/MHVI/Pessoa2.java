package MHVI;

public class Pessoa2 {
    
    protected String nome;
    protected String cpf;

    public Pessoa2(){

    }
    
    public Pessoa2(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Pessoa [cpf=" + cpf + ", nome=" + nome + "]";
    }
}
