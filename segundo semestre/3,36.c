#include <stdio.h>
#include <math.h>

int main(void) {
	int valor, valor2, i = 0, j = 0, resto, valorDec = 0;
	scanf("%i", &valor);
    valor2 = valor;
    do
        {
            j++;
            valor2 = valor2 / 10;
       }
       while (valor2 != 0);
       printf("%i", j );
    
	for (i = 0; i < j; i++) {
		resto = valor - ((valor / 10)*10);
		 
		valor = valor / 10;
		valorDec += resto * pow(2,i);
	}
	printf("Decimal: %i \n", valorDec);

	return 0;
}
