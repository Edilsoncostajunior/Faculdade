#include <stdio.h>

int main(void)
{
    int numTeste, valorX, loop, contador, qtdDivisores = 0;

    scanf("%d", &numTeste);

    for ( loop = 0 ; loop < numTeste; loop++)
    {
        contador = 0;
        scanf("%d", &valorX);
        
            for ( qtdDivisores = 1 ; qtdDivisores <= valorX ; qtdDivisores++)
            {  
                if (valorX % qtdDivisores == 0)
                {
                    contador++;
                    
                }
                
            }
     if (contador > 2)
    {
        printf("%d nao eh primo\n", valorX);
            }
    else
        printf("%d eh primo\n", valorX);  
        
    }
    
    return 0;
}