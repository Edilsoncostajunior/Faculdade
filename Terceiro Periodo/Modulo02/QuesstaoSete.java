package Modulo02;

import java.util.Scanner;

public class QuesstaoSete {

    public static Scanner Sc = new Scanner(System.in);

    public static void main(String[] args) {

        
        System.out.println("Informe o prato escolhido: ");
        String prato = Sc.nextLine();

        int calorias = 0;

        switch (prato) {
            case "Italiano":
                calorias += 750;
                break;
            case "Japones":
                calorias += 342;
                break;
            case "Salvadoreano":
                calorias += 545;
            return;    
            default:
            System.out.println("Sinto muito mas ainda não temos as informações deste prato.");
                break;
        }

        System.out.println("Informe a bebida escolhida: ");
        String bebida = Sc.nextLine();

        switch (bebida) {
            
            case "Suco de Laranja":
                calorias += 80;
                break;
            case "Cha":
                calorias += 30;
                break;
            case "Refrigerante":
                calorias += 90;
            break;    
            default:
            System.out.println("Sinto muito mas ainda não temos as informações desta bebida.l");
                break;
        }

        System.out.printf("A quantidade de calorias ingeridas foi igual a %d", calorias);
    }

    
}
