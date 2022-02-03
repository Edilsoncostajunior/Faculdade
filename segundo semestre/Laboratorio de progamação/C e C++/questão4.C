#include <stdio.h>

int main(void)
{
    int num1, num2, num3, num4, num5, contador;

    //primeita entrada dos 5 numeros//
    printf("entre com 5 numeros num intervalo de 1 a 30 e mostraremos o grafico correspondente a cada um:\n");
    scanf("%d%d%d%d%d", &num1, &num2, &num3, &num4, &num5);

    //checagem se os 5 numeros estão dentro do intervalo, caso n estejam todos serão pedidos novemente//
    while (num1 > 30 || num1<1 || num2 > 30 || num2 < 1 || num3 > 30 || num3 < 1 || num4 > 30|| num4 < 1  || num5 >30 || num5 < 1 )
    {
        printf("insira 5 numeros validos maiores que 1 e menores que 30:\n");
        scanf("%d%d%d%d%d", &num1, &num2, &num3, &num4, &num5);
    }
    
//printf de cada um dos numeros inseridos//
for ( contador = 1; contador <= num1 ; contador++ )
    {
        printf("*");
    }
    printf("\n");
for ( contador = 1; contador <= num2 ; contador++ )
    {
        printf("*");
    }
    printf("\n");
 for ( contador = 1; contador <= num3 ; contador++ )
    {
        printf("*");
    } 
    printf("\n");
 for ( contador = 1; contador <= num4 ; contador++ )
    {
        printf("*");
    }
    printf("\n");
 for ( contador = 1; contador <= num5 ; contador++ )
    {
        printf("*");
    }
    printf("\n");
    return 0;
}
 