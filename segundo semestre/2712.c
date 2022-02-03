#include <stdio.h>
#include <ctype.h>
#include <string.h>

int main(void)
{
    char placa[8];
    int repeat, ultNum, contador;

    gets(placa);
    ultNum = placa[8];
    
    for (contador = 1; contador <= repeat; contador++) {

        if (strlen(placa) < 8)
        {
            printf("FAILURE\n");
        }
        else if (islower(placa[0]) || islower(placa[1]) || islower(placa[2]))
        {
        printf("FAILURE\n");
        }
        else if (placa[3] != '-')
        {
            printf("FAILURE\n");
        }
        else if ((isalpha(placa[4]) || isalpha(placa[5]) || isalpha(placa[6]) || isalpha(placa[7])))
        {
        printf("FAILURE\n");
        }

        else if (placa)
        {
            /* code */
        }
        
    
    
    }
    
    
    




    return 0;
}
