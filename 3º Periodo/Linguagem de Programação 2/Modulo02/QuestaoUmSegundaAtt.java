package Modulo02;

import java.util.Scanner;

public class QuestaoUmSegundaAtt {

    public static Scanner Sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("digite um numero: ");
        int numero = Sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int multiplicacao = numero * i;
            System.out.printf("O %dº valor da tabuada do numero %d é %d\n ", i,numero, multiplicacao);
        }

    }
    
}
