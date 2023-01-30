#include <stdio.h>

int main(void)

{
    int contador, contadorPositivo=0;
    float num, media, soma = 0;

    for (contador = 1; contador <= 6; contador++)   {

        scanf("%f", &num);

        if (num > 0)    {
            contadorPositivo++;
            soma += num;
        }
    }
    media = soma / contadorPositivo;

    printf("%d numeros positivos\n",contadorPositivo);
    printf("%.1f\n", media);

return 0;
}