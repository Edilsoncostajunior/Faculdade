package Modulo02;

import java.util.Scanner;

public class QuestaoTresSegundaAtt {
    public static Scanner Sc = new Scanner(System.in);

    public static void main(String[] args) {

        String vetorNomes[] = { "", "", "" };
        int i = 0, numA = 0, numE = 0;

        while (i < 3) {
            System.out.println("Infome um nome: ");
            vetorNomes[i] = Sc.nextLine();
            i++;
        }

        for (int k = 0; k < 3; k++) {

            for (int j = 0; j < vetorNomes[k].length() ; j++) {

                if (vetorNomes[k].charAt(j) == 'e' || vetorNomes[k].charAt(j) == 'E') {
                    numE++;
                }

                else if (vetorNomes[k].charAt(j) == 'a' || vetorNomes[k].charAt(j) == 'A') {
                    numA++;
                }
            }
            System.out.printf("o nome %s tem letras a: %d e letras e: %d\n",vetorNomes[k], numA, numE);
            numA = 0;
            numE = 0;
        }

    }
}
