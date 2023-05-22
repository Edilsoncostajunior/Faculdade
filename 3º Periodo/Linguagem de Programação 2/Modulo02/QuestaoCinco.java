package Modulo02;

import java.util.Scanner;

public class QuestaoCinco {
    public static Scanner Sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        float rendimento, valorTotal;

        System.out.println("Informe o valor do deposito:");
        int deposito = Sc.nextInt();
        System.out.println("Informe a taxa de juros :");
        int juros = Sc.nextInt();

        rendimento = (float) deposito * juros/100;
        System.out.printf("O rendimento mensal é igual a %.1f", rendimento);
        valorTotal = (float) deposito + rendimento;
        System.out.printf("O valor total é igual a %.2f", valorTotal);

    }
    
}
