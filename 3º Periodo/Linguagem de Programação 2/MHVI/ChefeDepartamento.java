package MHVI;

import java.util.Calendar;

public class ChefeDepartamento extends Funcionario {

    private String departamento;
    private Calendar datapromocao;
    private float gratificacao;

    public ChefeDepartamento(String nome, String cpf, Calendar dataNasc, String matricula, Calendar dataAdmissao,
            float salario, String departamento, Calendar datapromocao, float gratificacao) {
        super(nome, cpf, dataNasc, matricula, dataAdmissao, salario);
        this.datapromocao = datapromocao;
        this.gratificacao = gratificacao;
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Calendar getDatapromocao() {
        return datapromocao;
    }

    public void setDatapromocao(Calendar datapromocao) {
        this.datapromocao = datapromocao;
    }

    public float getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(float gratificacao) {
        this.gratificacao = gratificacao;
    }

    @Override
    public String toString() {
        return "ChefeDepartamento [cpf=" + cpf + ", dataNasc=" + dataNasc.get(Calendar.DAY_OF_MONTH) + "/"
                + dataNasc.get(Calendar.MONTH) + "/" + dataNasc.get(Calendar.YEAR) + "/"
                + ", nome=" + nome + ", dataAdmissao=" + dataAdmissao.get(Calendar.DAY_OF_MONTH) + "/"
                + dataAdmissao.get(Calendar.MONTH) +
                "/" + dataAdmissao.get(Calendar.YEAR) + "matricula=" + matricula + ", salario=" + salario
                + ", dataPromocao=" + datapromocao.get(Calendar.DAY_OF_MONTH) + "/" + ", dataPromocao="
                + datapromocao.get(Calendar.MONTH) +
                "/" + ", dataPromocao=" + datapromocao.get(Calendar.YEAR) + ", departamento=" + departamento
                + ", gratificação" + gratificacao + "]";
    }

}
