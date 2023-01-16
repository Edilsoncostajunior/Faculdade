package MHIII;

import java.util.Scanner;

public class QuestaoSeis {
    
    public static Scanner Sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n; 
        System.out.println("Informe o valor de n: ");
        n = Sc.nextInt();
        System.out.print( Soma_recursiva(n)-1);
    }

    public static int Soma_recursiva(int n){

        if (n<0) {
            return -1;
        }
        else if(n == 0){
            return 1;
        }else{
            return n + Soma_recursiva(n-1);
        }

       
    }
}
