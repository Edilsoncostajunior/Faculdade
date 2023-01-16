package MHIII;

import java.util.Scanner;

public class QuestaoCinco {
    public static Scanner Sc = new Scanner(System.in);
    public static String S1, S2, auxString = "";

    public static void main(String[] args) {

        String opcaoString;

        do {
            System.out.println("digite a) para ler uma String S1.");
            System.out.println("digite b) para imprimir o tamanho de S1.");
            System.out.println("digite c) para comparar a string S1 com uma nova String.");
            System.out.println("digite d) para para concatenar a string S1 com uma nova String.");
            System.out.println("digite e) para imprimir a String S1 de forma inversa.");
            System.out.println("Aperte ENTER para sair.");
            opcaoString = Sc.nextLine();

            switch (opcaoString) {
                case "a":
                    opcaoA();
                    break;
                case "b":
                    opcaoB();
                    break;
                case "c":
                    opcaoC();
                    break;
                case "d":
                    opcaoD();
                    break;
                case "e":
                    opcaoE();
                default:
                    break;
            }

        } while (opcaoString != "");

    }

    public static void opcaoA() {
        System.out.println("informe a String S1");
        S1 = Sc.nextLine();
        if (S1.length() > 20) {
            while (S1.length() > 20) {
                System.out.println("informe uma String com menos de 20 caracteres.");
                S1 = Sc.nextLine();
            }
        }
    }

    public static void opcaoB() {
        if (S1 == null) {
            System.out.println("impossivel realizar esta função.");

        } else {
            System.out.println("o tamanho da String S1 é: " + S1.length());
        }
    }

    public static void opcaoC() {
        if (S1 == null) {
            System.out.println("impossivel realizar esta função.");

        } else {
            System.out.println("informe a String S2: ");
            S2 = Sc.nextLine();
            if (S1.equals(S2)) {
                System.out.println("A String S1: " + S1 + " é igual a String S2: " + S2);

            } else {
                System.out.println("A String S1: " + S1 + " é diferente da String S2: " + S2);

            }
        }
    }

    public static void opcaoD() {
        if (S1 == null) {
            System.out.println("impossivel realizar esta função.");
        } else {
            System.out.println("informe a String S2: ");
            S2 = Sc.nextLine();
            System.out.println("a concatenação de S1 com S2 é: ");
            System.out.println(S1.concat(S2));
        }
    }

    public static void opcaoE(){
        if (S1 == null) {
            System.out.println("impossivel realizar esta função.");

        } else {
            for (int i = S1.length() - 1; i >= 0; i--) {
                auxString = auxString + S1.charAt(i);
            }
            System.out.printf("a String inversa é: %s \n", auxString);
            
        }
    }
}