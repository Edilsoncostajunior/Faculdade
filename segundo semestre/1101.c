#include<stdio.h>

int main(void)
{
    int m, n, i;
    int aux, soma;

    scanf("%d%d", &m, &n);
    while (m > 0 && n > 0)
    {
        soma = 0;
        if (m > n)
        {
            aux = m;
            m = n;
            n = aux;
        }

        for ( i = m ; i <= n; i++)
        {
            soma += i;
            printf("%d ", i);
        }
        printf("Sum=%d\n",soma);
        scanf("%d%d", &m, &n);

    }
    
    return 0;
}
