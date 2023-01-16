package MHVI;

import java.util.Calendar;

public class Funcionario extends Pessoa {

    protected String matricula;
    protected Calendar dataAdmissao;
    protected float salario;

    public Funcionario(String nome, String cpf, Calendar dataNasc, String matricula, Calendar dataAdmissao,
            float salario) {
        super(nome, cpf, dataNasc);
        this.matricula = matricula;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Calendar getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Calendar dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario [cpf=" + cpf + ", dataNasc=" + dataNasc.get(Calendar.DAY_OF_MONTH) + "/"
                + dataNasc.get(Calendar.MONTH) + "/" + dataNasc.get(Calendar.YEAR) + "/" + ", nome=" + nome
                + ", dataAdmissao=" + dataAdmissao.get(Calendar.DAY_OF_MONTH) + "/" + dataAdmissao.get(Calendar.MONTH)
                + dataAdmissao.get(Calendar.YEAR) + "matricula=" + matricula + ", salario=" + salario + "]";
    }

}
