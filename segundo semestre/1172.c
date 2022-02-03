#include <stdio.h>

int i;
float vetor[100];

int main(void)
{
    for ( i = 0; i < 100; i++)
    {
        scanf("%f", &vetor[i]);
        if (vetor[i] <= 10)
        {
            printf("A[%d] = %.1f\n", i , vetor[i] );
        }
        
    }
    
    return 0;
}
