#include <stdio.h>
#include <string.h>

int main()
{
    int DDD;
    char nomeCidade[25];
    scanf("%d", &DDD);

    switch (DDD)
    {
    case 61:
        strcpy(nomeCidade, "Brasilia");
        break;

    case 71:
        strcpy(nomeCidade, "Salvador");
        break;

    case 11:
        strcpy(nomeCidade, "Sao Paulo");
        break;

    case 21:
        strcpy(nomeCidade, "Rio de Janeiro");
        break;

    case 32:
        strcpy(nomeCidade, "Juiz de Fora");
        break;

    case 19:
        strcpy(nomeCidade, "Campinas");
        break; 

    case 27:
        strcpy(nomeCidade, "Vitoria");
        break;

    case 31:
        strcpy(nomeCidade, "Belo Horizonte");
        break; 
        
    default:
        strcpy(nomeCidade, "DDD nao cadastrado");
        break;
    }
    printf("%s\n", nomeCidade);
    return 0;
}

