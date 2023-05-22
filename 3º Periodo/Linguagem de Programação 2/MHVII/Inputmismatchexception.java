package MHVII;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Inputmismatchexception {
    private static Scanner Sc = new Scanner(System.in); 

    public static void main(String[] args) {  
        int num = 0;
    do {
        try {  
            System.out.println("-----------------------------------------------");
            System.out.println("Informe o valor que deseja calcular o seu quadrado:");  
            num = Sc.nextInt(); 
            System.out.println((num*num));  
        }   
        catch (InputMismatchException erro) {  
            System.err.println("Valor invalido.");
         }
         finally{
            System.out.println("Programa processado!"); 
         }
    } while (num != 0);
      
    }  
}
