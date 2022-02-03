#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>

int main(void)

    {
        int i = 0, valor2;
        scanf("%d", &valor2);
        do
        {
            i++;
            valor2 = valor2 / 10;
       }
       while (valor2 != 0);
       printf("%i", i);

       


       return 0;
        }