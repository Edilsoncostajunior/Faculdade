#include <stdio.h>

int main()
{

    register int i, x, y; 
    int espacoBranco, asterisco = 1, meio;

    printf("digite um valor entre 1 e 19\n");
    scanf("%i", &espacoBranco);
    meio = (espacoBranco + 1) / 2;

    for (x = 0; x < meio; x++)
    { // Começa a parte superior

        for (i = 1; i <= espacoBranco; i++) // centraliza os asteriscos
            printf(" ");

        espacoBranco--;

        for (y = 0; y < asterisco; y++) // Imprime o losango
            printf("*");

        printf("\n");
        asterisco += 2; // Adiciona dois asteriscos a cada linha
    }
    //  
    asterisco -= 2;
    espacoBranco++;

    for (x = 0; x < meio; x++)
    { // Começa a imprimir a parte inferior

        asterisco -= 2;
        espacoBranco++;

        for (i = 0; i < espacoBranco; i++)
            printf(" ");

        for (y = 0; y < asterisco; y++)
            printf("*");

        printf("\n");
    }

    return 0;
}