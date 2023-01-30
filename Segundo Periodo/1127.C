# include <stdio.h>
#include <math.h>

int main(void){
    double d,velocidadeFugitivo,velocidadeGuarda,tempoGuarda,tempoFugitivo;
    int distanciaTotal = 12;

    while (scanf("%lf%lf%lf", &d,&velocidadeFugitivo,&velocidadeGuarda ) > 0 )
    {

    //Calculando tempoguarda e tempofugitivo:
    tempoFugitivo =(double) distanciaTotal  / velocidadeFugitivo;
    tempoGuarda =(double) (sqrt(pow(distanciaTotal , 2.0) + pow( d , 2.0))) / velocidadeGuarda;

    //Realizando as comparações do tempo
    if (tempoFugitivo >= tempoGuarda){
        printf("S\n");
    }
    else{
        printf("N\n");
    }
    }
    return 0;
}