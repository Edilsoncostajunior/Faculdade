package MHVI;

import java.util.Calendar;

public class TestaTudo {
    public static void main(String[] args) {

        Calendar dataNascPessoa = Calendar.getInstance();
        dataNascPessoa.set(1995, Calendar.JANUARY, 07);
        Pessoa pessoa = new Pessoa("Claudinha", "123456789", dataNascPessoa);

        Calendar dataNascAluno = Calendar.getInstance();
        dataNascAluno.set(2002, Calendar.MAY, 02);

        Pessoa aluno = new Aluno("Caillou", "1098765432", dataNascAluno, "11111111");
        
        Calendar dataNascFuncionario = Calendar.getInstance();
        Calendar dataAdmissaoFuncionario = Calendar.getInstance();
        dataNascFuncionario.set(2000, Calendar.FEBRUARY, 07);
        dataAdmissaoFuncionario.set(2021, Calendar.MARCH, 10);
        
        Pessoa funcionario = new Funcionario("Roberval", "1234765432", dataNascFuncionario, "88888888",
                dataAdmissaoFuncionario, 3396.76f);
                
        Calendar dataNascChef = Calendar.getInstance();
        Calendar dataAdmissaoChef = Calendar.getInstance();
        Calendar dataPromocaoChef = Calendar.getInstance();
        dataNascChef.set(1990, Calendar.SEPTEMBER, 10);
        dataAdmissaoChef.set(2019, Calendar.SEPTEMBER, 06);
        dataPromocaoChef.set(2021, Calendar.APRIL, 10);

        Pessoa chefdepartamento = new ChefeDepartamento("João", "456789123", dataNascChef, "987456", dataAdmissaoChef,
                10000, "RH", dataPromocaoChef, 2000);
       
        System.out.println(pessoa.toString() + "\n" + aluno.toString() + "\n" + funcionario.toString() + "\n"
                + chefdepartamento.toString());
    }
}
