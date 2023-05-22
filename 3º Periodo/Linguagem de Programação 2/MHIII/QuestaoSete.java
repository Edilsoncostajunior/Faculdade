package MHIII;

import java.util.Scanner;

public class QuestaoSete {
    
    public static Scanner Sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("digite o primeiro inteiro");
        int x = Sc.nextInt();
        System.out.println("digite o segundo inteiro");
        int y = Sc.nextInt();

        System.out.print(mdc(x, y));
    }

    public static int mdc(int x, int y){
        if (x%y == 0) {
            return y;
        }
        else{
            return mdc(y, x%y);
        }
            
        
    }
}
