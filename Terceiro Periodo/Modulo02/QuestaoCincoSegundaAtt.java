package Modulo02;

import java.util.Scanner;

public class QuestaoCincoSegundaAtt {
    public static Scanner Sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.println("Informe quantas notas serão lidas: ");
        int notas = Sc.nextInt();
        int alunos[][] = new int[5][notas];
        float media = 0;

        for (int i = 0; i < 5 ; i++) {
            int soma=0;
            for (int j = 0; j < notas ; j++) {
                System.out.printf("Informe as notas do %dº aluno: \n", i+1);
                alunos[i][j] = Sc.nextInt();
                soma += alunos[i][j];
            }
            media = (float) soma/notas;
            if (media > 7) {

                System.out.println("Aluno aprovado!!\n");
            }
            else{
                System.out.println("O aluno foi Reprovado.\n");
            }
        }
        
    }
    
}
