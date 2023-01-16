package MHIII;

import java.util.Scanner;

public class Questaoquatro {
    
    public static Scanner Sc = new Scanner(System.in);

    public static void main(String[] args) {
        String string1, string2;
        System.out.println("digite a primeira String:");
        string1 = Sc.next();
        System.out.println("digite a segunda String:");
        string2 = Sc.next();

        Compara_string(string1, string2);
    }

    public static void Compara_string(String string1,String string2){
        if (string1.equals(string2)) {
            System.out.println("Strings iguais");
        }
        else{
            string1 = string1.concat(string2);
            System.out.print(string1);
        }
    }
}
