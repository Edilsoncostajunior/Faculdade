package Modulo02;

import java.util.Scanner;

public class QuestaoQuatroSegundaAtt {

    public static Scanner Sc = new Scanner(System.in);
    
    public static void main(String[] args) {


        int numCrescente[] = new int[10];
        int numDecrescente[] = new int[10];
        int aux = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Informe os numeros do vetor:");
            numCrescente[i] = Sc.nextInt();
            numDecrescente[i] = numCrescente[i];
        }
                
        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                // Organiza o vetor de forma crescente.
                if (numCrescente[i] > numCrescente[j]) {
                
                    aux = numCrescente[i];
                    numCrescente[i] = numCrescente[j];
                    numCrescente[j] = aux;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                //Organiza o vetor de forma decrescente.
                if (numDecrescente[i] < numDecrescente[j]) {
                
                    aux = numDecrescente[i];
                    numDecrescente[i] = numDecrescente[j];
                    numDecrescente[j] = aux;
                }
            }
        }

        System.out.println("vetor em ordem crescente:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d ", numCrescente[i]);
        }

        System.out.println("\nvetor em ordem decrescente:");
        for (int k = 0; k < 10; k++) {
            System.out.printf("%d ", numDecrescente[k]);
        }
    }
}