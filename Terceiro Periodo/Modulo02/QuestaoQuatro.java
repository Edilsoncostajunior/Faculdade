package Modulo02;

import java.util.Scanner;

public class QuestaoQuatro {

    public static Scanner Sc = new Scanner(System.in);

    public static void main(String[] args) {
        int pedacos[] = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.printf("Informe o %dº pedaço de madeira ", i+1);
            pedacos[i]= Sc.nextInt();
        }
        if (pedacos[0] < pedacos[1] + pedacos[2] && pedacos[1] < pedacos[0] + pedacos[2] && pedacos[2] < pedacos[0] + pedacos[1] ) {
            System.out.println("Esses três pedaços de madeira formam um triângulo ");
            
            
        }else{
            System.out.println("Esses três pedaços de madeira não formam um triângulo ");
        }
    }
    
}
