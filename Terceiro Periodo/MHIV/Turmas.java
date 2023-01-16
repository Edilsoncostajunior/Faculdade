package MHIV;

public class Turmas {
    public int qtdAlunos;
    public String curso;
    public Professor professores;
    public Aluno alunos;

    public Turmas(int qtdAlunos, String curso, Professor professores, Aluno alunos) {
        this.qtdAlunos = qtdAlunos;
        this.curso = curso;
        this.professores = professores;
        this.alunos = alunos;
    }
    public int getQtdAlunos() {
        return qtdAlunos;
    }
    public void setQtdAlunos(int qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public Professor getProfessores() {
        return professores;
    }
    public void setProfessores(Professor professores) {
        this.professores = professores;
    }
    public Aluno getAlunos() {
        return alunos;
    }
    public void setAlunos(Aluno alunos) {
        this.alunos = alunos;
    }
    
}
