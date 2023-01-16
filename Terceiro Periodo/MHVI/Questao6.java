package MHVI;

import java.util.ArrayList;
import java.util.List;

public class Questao6 {
    public List<Pessoa2> lista = new ArrayList<Pessoa2>();

    public void cadastrarPessoa(Pessoa2 pessoa) {
        lista.add(pessoa);
    }

    public void mostrarPessoa() {
        for (Pessoa2 pessoa : lista) {
            System.out.println(pessoa.toString());
        }
    }

    public static void main(String[] args) {

        Questao6 aplicacao = new Questao6();

        Pessoa2 pessoa = new Pessoa2("Roberval", "123456789");

        Cliente cliente = new Cliente("Marivaldo", "109876543", 332);

        Funcionario2 funcionario = new Funcionario2("Fulaninho", "567896543", "325457", 3500);

        Gerente gerente = new Gerente("Creitin", "965436789", "0004", 5000, 1);

        aplicacao.cadastrarPessoa(pessoa);
        aplicacao.cadastrarPessoa(cliente);
        aplicacao.cadastrarPessoa(funcionario);
        aplicacao.cadastrarPessoa(gerente);

        aplicacao.mostrarPessoa();
    }
}