package Modulo02;

import java.util.Scanner;

public class QuestaoSeisSegundaAtt {
    
    public static Scanner Sc = new Scanner (System.in);

    public static void main(String[] args) {
        System.out.println("Informe a quantidade de linhas da matriz: ");
        int linhas = Sc.nextInt();
        System.out.println("Informe a quantidade de colunas da matriz: ");
        int colunas = Sc.nextInt();

        int matriz[][] = new int[linhas][colunas];
        int matrizTransposta[][] = new int[colunas][linhas];

        for (int i = 0; i < linhas ; i++) {
            for (int j = 0; j < colunas ; j++) {
                System.out.printf("Informe os valores da %dº linha: \n", i+1);
                matriz[i][j] = Sc.nextInt();
                
            }
        }
        
        //montando a transposta.
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
               matrizTransposta[j][i] = matriz[i][j];
            }
            
        }

        System.out.println("matriz normal: ");
        for (int i = 0; i < linhas ; i++) {
            for (int j = 0; j < colunas ; j++) {
                System.out.printf("%d ", matriz[i][j]);    
            }
            System.out.println("");
        }

        System.out.println("matriz transposta: ");
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < linhas ; j++) {
                
                System.out.printf("%d ", matrizTransposta[i][j]);    
            }
            System.out.println("");
        }
        
    }
}
