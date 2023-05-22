package MHIII;

import java.util.Scanner;


public class QuestaoDois {

    public static Scanner Sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("digite A para uma média aritmética e P para uma media ponderada:");
        String escolha = Sc.nextLine();
        System.out.println("Infome a primeira nota");
        float nota1 = Sc.nextFloat();
        System.out.println("Infome a segunda nota");
        float nota2 = Sc.nextFloat();
        System.out.println("Infome a terceira nota");
        float nota3 = Sc.nextFloat();

        float media = Media(escolha, nota1, nota2, nota3);

        System.out.printf("A média do aluno é igual a %.2f", media);
    }

    public static float Media(String escolha, float nota1, float nota2, float nota3){
        float media = 0;

        if (escolha.equals("A")) {
            media = (nota1 + nota2 + nota3)/3;    
        }
        else if (escolha.equals("P")) {
            media = ((nota1 * 5) + (nota2 * 3) + (nota3 * 2))/10;
        }

        return media;
    }
}


