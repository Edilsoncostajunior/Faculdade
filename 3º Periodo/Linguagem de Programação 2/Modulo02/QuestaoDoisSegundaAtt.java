package Modulo02;

import java.util.Scanner;

public class QuestaoDoisSegundaAtt {

    public static Scanner Sc = new Scanner(System.in);

    public static void main(String[] args) {

        int mediaFilhos = 0, filhos = 0, totalFilhos = 0;
        int i = 0;
        float mediaSalarial = 0, salario, maiorSalario = 0, salarioTotal = 0;

        do {
            System.out.println("Informe o salario do habitante: ");
            salario = Sc.nextFloat();

            if (salario > 0) {
                System.out.println("Informe quantos filhos o habitante tem: ");
                filhos = Sc.nextInt();

                i++;
                salarioTotal += salario;
                totalFilhos += filhos;
            }

            if (salario > maiorSalario) {
                maiorSalario = salario;
            }

            mediaSalarial = (float) salarioTotal / i;
            mediaFilhos = totalFilhos / i;

        } while (salario != -1);
        System.out.printf("Média de Filhos = %d\n Média Salarial = %.2f\n Maior Salario = %.2f \n", mediaFilhos, mediaSalarial, maiorSalario);     
 
                
    } 
}
