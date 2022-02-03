#include <stdio.h>
#include <ctype.h>
#include <string.h>

int main(void)
{
    char placa[15];
    int repeat, contador;

    scanf("%d", &repeat);

    for (contador = 0; contador < repeat; contador++) {
        
        scanf("%s", placa);
        
        if (strlen(placa) != 8)
        {
            printf("FAILURE\n");
        }
        
        
        else if (strlen(placa) == 8){
             
             if (isupper(placa[0]) && isupper(placa[1]) && isupper(placa[2])) {
                
                if (placa[3] == '-') {
                    
                    if ( ((isdigit(placa[4]) && isdigit(placa[5]) && isdigit(placa[6]) && isdigit(placa[7])))) {        
                        
                        if (placa[7] == '1' || placa[7] == '2')
                        {
                            printf("MONDAY\n");
                        }
                        else if ( placa[7] == '3' || placa[7] == '4')
                        {
                            printf("TUESDAY\n");
                        }
                        else if (placa[7] == '5' || placa[7] == '6')
                        {
                            printf("WEDNESDAY\n");
                        }
                        else if (placa[7] == '7' || placa[7] == '8')
                        {
                            printf("THURSDAY\n");
                        }
                        else if (placa[7] == '9' || placa[7] == '0')
                        {
                            printf("FRIDAY\n");
                        }
                    }
                    else
                    printf("FAILURE\n"); 
                }
                else
                printf("FAILURE\n");
            }
        
        else printf("FAILURE\n");
        } 
        
        

              
    }    
    return 0;
}
