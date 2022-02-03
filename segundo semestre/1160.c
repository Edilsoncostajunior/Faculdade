#include <stdio.h>

int main(void)
{
    int T, PB, PA, anos, i;
    double TaxA, TaXB;

    scanf("%d", &T);

    for ( i = 0; i < T; i++)
    {
        anos = 0;
        scanf("%d%d%lf%lf", &PA, &PB, &TaxA, &TaXB);
        
        TaxA = TaxA/100.0;
        TaXB = TaXB/100.0;

        while (PA <= PB )
        {
            
            PA +=  PA * TaxA;
            PB +=  PB * TaXB;
            
            anos++;
        if (anos > 100)
        {
            printf("Mais de 1 seculo.\n");
            break;
        }
        }
        if (anos <= 100)
        {
            printf("%d anos.\n", anos);
        }
        
        
        

    }
    
    return 0;
}
