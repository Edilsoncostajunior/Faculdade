package Atividade02;


import java.util.Scanner;

public class BrincandoComBusca {
    static Scanner Sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        double antes, depois;
        Busca_IF b = new Busca();
        final int[] vetor = b.geraVetorNumericoOrdenado(11);
        b.MostrarVetor(vetor);
        
        antes = System.nanoTime();
        b.buscaLinear_iterativa(vetor, 1);
        depois = System.nanoTime();
        System.out.printf("\nbuscaLinear_iterativa:  %.4f/ms", ((depois - antes)/1000000.0) );
    }
}
