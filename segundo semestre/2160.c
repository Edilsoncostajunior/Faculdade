#include <stdio.h>
#include <string.h>

int main(void)
{
    char nome[500];
    gets(nome);
    
    if ( strlen(nome) <= 80)
    {
         printf("YES\n");
    }
    else
        printf("NO\n");
    return 0;
}
