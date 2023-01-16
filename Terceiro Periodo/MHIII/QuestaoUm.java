package MHIII;

import java.util.Scanner;

public class QuestaoUm {

    public static Scanner Sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int num, resultado;
        System.out.println("digite um numero");
        num = Sc.nextInt();
        resultado = Par_ou_impar(num);
        System.out.printf("%d", resultado);

    }

    public static int Par_ou_impar(int num){  
        if (num % 2 == 0) {
            return 1;    
        }else{
            return 0;
        }

    }
}
