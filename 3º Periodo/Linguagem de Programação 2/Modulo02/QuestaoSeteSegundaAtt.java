package Modulo02;

import java.util.Scanner;

public class QuestaoSeteSegundaAtt {

    public static Scanner Sc = new Scanner(System.in);

    public static void main(String[] args) {
        int matriz1[][] = new int[5][5];
        int matriz2[][] = new int[5][5];
        int somaMatrizes[][] = new int[5][5];
        int diferencaMatrizes[][] = new int[5][5];

        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 5 ; j++) {
                System.out.printf("Informe os valores da %dº linha da primeira matriz: \n", i+1);
                matriz1[i][j] = Sc.nextInt();
                
            }
        }
        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 5 ; j++) {
                System.out.printf("Informe os valores da %dº linha da segunda matriz: \n", i+1);
                matriz2[i][j] = Sc.nextInt();
                
            }
        }

        //Soma das matrizes.
        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 5 ; j++) {
                somaMatrizes[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        //diferença das matrizes.
        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 5 ; j++) {
                diferencaMatrizes[i][j] = matriz1[i][j] -  matriz2[i][j];
            }
        }

        System.out.println("A soma das matrizes é: ");
        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 5 ; j++) {

                System.out.printf( "%d ", somaMatrizes[i][j]);
            }
            System.out.println(" ");
        }

        System.out.println("A diferença das matrizes é: ");
        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 5 ; j++) {

                System.out.printf( "%d ", diferencaMatrizes[i][j]);
            }
            System.out.println(" ");

        }
    }
    
}
