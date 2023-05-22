package MHIII;

import java.util.Scanner;

public class QuestaoTres {

    public static Scanner Sc = new Scanner(System.in);
    public static int pedacos[] = new int[3];


    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            System.out.printf("Informe o %dº pedaço de madeira ", i + 1);
            pedacos[i] = Sc.nextInt();
        }
        Tipo_triangulo(pedacos);
    }

    public static void Tipo_triangulo(int pedacos[]){

        if (pedacos[0] < pedacos[1] + pedacos[2] && pedacos[1] < pedacos[0] + pedacos[2]
                && pedacos[2] < pedacos[0] + pedacos[1]) {
                    
                    if (pedacos[0] == pedacos[1] && pedacos[1] == pedacos[2] && pedacos[0] == pedacos[2]) {
                        System.out.println("triângulo Equilátero");
                    }
                    else if(pedacos[0] == pedacos[1] || pedacos[1] == pedacos[2] || pedacos[0] == pedacos[2] ){
                        System.out.println("triângulo Isósceles");
                    }
                    else if(pedacos[0] != pedacos[1] && pedacos[1] != pedacos[2] && pedacos[0] != pedacos[2] ){
                        System.out.println("triângulo Escaleno");
                    }

        } else {
            System.out.println("Esses três pedaços de madeira não formam um triângulo ");
        }
    }

}
