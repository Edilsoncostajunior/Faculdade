#include <stdio.h>

int main(void)
{
    float consumo, consumo_geral, consumofinal, litros, km;
    int numabastecimento = 0;
    //primeira entrada dos litros//
    printf("informe quantos litros abasteceu (-1 para terminar): \n");
    scanf("%f", &litros);

    //inicio do loop//
    while (litros != -1)
    {
        //entrada dos km//
        printf("informe quantos Km dirigiu: \n");
        scanf("%f", &km);
        
        //contas a serem feitas//
        consumo =  km / litros;
        ++numabastecimento;
        consumo_geral +=  consumo;
        consumofinal = consumo_geral / numabastecimento;
        
        printf("o consumo atual %.3f Km/L\n", consumo);

        //segunda entrada dos litros para terminar o loop//
        printf("informe quantos litros abasteceu (-1 para terminar): \n");
        scanf("%f", &litros);

    }
    
    printf("consumo geral: %.3f km/L", consumofinal);

    return 0;
}
