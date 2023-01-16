package Modulo02;

import java.util.Scanner;

public class QuestaoSeis {
    
    public static Scanner Sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Informe sua idade: ");
        int idade = Sc.nextInt();

        if (idade < 16) {
            System.out.println("não eleitor.");
        }
        else if (idade > 16 && idade <65) {
            System.out.println("Eleitor obrigatório.");
        } else {
            System.out.println("Eleitor não facultativo.");
        }

    }

}
