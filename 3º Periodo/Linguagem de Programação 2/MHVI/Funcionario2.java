package MHVI;

public class Funcionario2 extends Pessoa2{
    
    protected String matricula;
    protected float salario;

    public Funcionario2(){

    }
    
    public Funcionario2(String nome, String cpf, String matricula, float salario) {
        super(nome, cpf);
        this.matricula = matricula;
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario [cpf=" + cpf + ", nome=" + nome + ", matricula=" + matricula + ", salario=" + salario + "]";
    }
}
