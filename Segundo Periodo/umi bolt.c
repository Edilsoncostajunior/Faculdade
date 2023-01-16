#include <stdio.h>

int main (void)
{
    double tempo, menorTempo;
    int i, numtentativas;

    while(scanf("%d", &numtentativas) != 0)
    {
        for (i = 1; i <= numtentativas; i++)
        {
            scanf("%lf", &tempo);

            if (i == 1){
                menorTempo = tempo;
            }
            if (i > 1){
                if (tempo <= menorTempo){
                    menorTempo = tempo;
                }
            }
        }   
        printf("%.2lf\n", menorTempo);
    }

    return 0;
}