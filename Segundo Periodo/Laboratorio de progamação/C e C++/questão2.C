#include <stdio.h>
 
int main(void)
{
    int num1, num2, num3, num4, num5, maior, menor;


    printf("entre com os 5 numeros:\n");
    
    scanf("%d%d%d%d%d", &num1, &num2, &num3, &num4, &num5);
    
    //comparações a serem feitas para definir maior e menor//
    if (num1 > num2  )
    {
        maior = num1;
        menor = num2;
    }   
    if (num1 < num2)
    {
        maior = num2;
        menor = num1;
    }  
    if (maior < num3)
    {
        maior = num3;
    }   
    if ( menor > num3)
    {
        menor = num3;
    }   
    if (maior < num4)
    {
        maior = num4;
    }
    
    if ( menor > num4)
    {
        menor = num4;
    }
    if (maior < num5)
    {
        maior = num5;
    } 
    if ( menor > num5)
    {
        menor = num5;
    }

    printf("o maior numero: %d \no menor numero: %d ", maior, menor);
    return 0;
}