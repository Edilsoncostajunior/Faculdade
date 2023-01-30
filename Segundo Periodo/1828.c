#include <string.h>
#include <stdio.h>
int main()
{
    char sheldon[15], raj[15];
    char tesoura[] = "tesoura", papel[] = "papel", pedra[] = "pedra", lagarto[] = "lagarto", spock[] = "Spock";
    int numTeste, i;

    scanf("%d", &numTeste);

    for ( i = 1; i <= numTeste; i++)
    {
    scanf("%s%s", sheldon, raj);

    if (0 == strcmp(sheldon, raj))
    {
        printf("Caso #%d: De novo!\n", i);
    }
    else if (0 == strcmp(sheldon , tesoura))
    {
        if(0 == strcmp(raj , papel) || 0 == strcmp(raj , lagarto)){
        printf("Caso #%d: Bazinga!\n", i);}

       else if(0 == strcmp(raj , spock) || 0 == strcmp(raj , pedra)){
           printf("Caso #%d: Raj trapaceou!\n", i);
       }
    }
    
    else if (0 == strcmp(sheldon , papel))
    {
        if(0 == strcmp(raj , pedra) || 0 == strcmp(raj , spock)){
        printf("Caso #%d: Bazinga!\n", i);}

       else if(0 == strcmp(raj , tesoura) || 0 == strcmp(raj , lagarto)){
           printf("Caso #%d: Raj trapaceou!\n", i);
       }
    }

    else if (0 == strcmp(sheldon , pedra))
    {
        if(0 == strcmp(raj , lagarto) || 0 == strcmp(raj , tesoura)){
        printf("Caso #%d: Bazinga!\n", i);}

       else if(0 == strcmp(raj , papel) || 0 == strcmp(raj , spock)){
           printf("Caso #%d: Raj trapaceou!\n", i);
       }
    }

    else if (0 == strcmp(sheldon , lagarto))
    {
        if(0 == strcmp(raj , papel) || 0 == strcmp(raj , spock)){
        printf("Caso #%d: Bazinga!\n", i);}

       else if(0 == strcmp(raj , tesoura) || 0 == strcmp(raj , pedra)){
           printf("Caso #%d: Raj trapaceou!\n", i);
       }
    }

    else if (0 == strcmp(sheldon , spock))
    {
        if(0 == strcmp(raj , tesoura) || 0 == strcmp(raj , pedra)){
        printf("Caso #%d: Bazinga!\n", i);}

       else if(0 == strcmp(raj , lagarto) || 0 == strcmp(raj , papel)){
           printf("Caso #%d: Raj trapaceou!\n", i);
       }
    }
    }
   
    return 0;
}

