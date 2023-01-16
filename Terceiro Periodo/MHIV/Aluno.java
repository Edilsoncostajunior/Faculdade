package MHIV;

public class Aluno {
   
    public Aluno(String nome, String matricula, Notas notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }
    
    public String nome;
    public String matricula;
    public Notas notas;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public Notas getNotas() {
        return notas;
    }
    public void setNotas(Notas notas) {
        this.notas = notas;
    }
    
}
