package MHIII;

import java.util.Scanner;

public class QuestaoOito {

    public static Scanner Sc = new Scanner(System.in);
    


    public static void main(String[] args) {
        Filmes filme1, filme2, filme3;

        System.out.println("Informe os dados do primeiro filme.");
        filme1 = lerFilmes(Sc);
        System.out.println("");
        System.out.println("Informe os dados do segundo filme.");
        filme2 = lerFilmes(Sc);
        System.out.println("");
        System.out.println("Informe os dados do terceiro filme.");
        filme3 = lerFilmes(Sc);

        System.out.println("");
        System.out.println("Os dados do primeiro filme são:");
        imprimirFilmes(filme1);
        System.out.println("");
        System.out.println("Os dados do segundo filme são:");
        imprimirFilmes(filme2);
        System.out.println("");
        System.out.println("Os dados do terceiro filme são:");
        imprimirFilmes(filme3);

    }
    public static Filmes lerFilmes(Scanner Sc){
        Filmes filme = new Filmes();
        System.out.println("Digite o nome do autor:");
        filme.autor = Sc.nextLine();
        System.out.println("Digite o nome do filme:");
        filme.nome = Sc.nextLine();
        System.out.println("Digite a data de lançamento:");
        filme.ano = Sc.nextLine();
        System.out.println("Digite o preço do filme:");
        filme.preço = Sc.nextFloat();
        limparBuferrTeclado(Sc);
        return filme;


    }
    public static void imprimirFilmes(Filmes filme){
        System.out.printf("O nome do autor é: %s\n", filme.autor);
        System.out.printf("O nome do filme é: %s\n", filme.nome);
        System.out.printf("O ano do filme é: %s\n", filme.ano);
        System.out.printf("O preço do filme é: %.2f\n", filme.preço);

    }
    public static void limparBuferrTeclado(Scanner Sc) {

        if (Sc.hasNextLine()){

            Sc.nextLine();
        }
    }
}
