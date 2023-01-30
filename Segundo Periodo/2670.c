#include <stdio.h>

int main(void)
{
    int A1, A2, A3, tempo1, tempo2, tempo3;
    scanf("%d", &A1);
    scanf("%d", &A2);
    scanf("%d", &A3);

    tempo1 = ( A1 * 0) + ( A2 * 2 ) + ( A3*4);
    tempo2 = ( A1 * 2) + ( A2 * 0 ) + ( A3*2);
    tempo3 = ( A1 * 4) + ( A2 * 2 ) + ( A3*0);

    if (tempo2 >= tempo1 && tempo1 <= tempo3)
    {
        printf("%d\n", tempo1);
    }
    else if (tempo1 >= tempo2 && tempo2 <= tempo3)
    {
        printf("%d\n", tempo2);
    }
        else if (tempo1 >= tempo3 && tempo3 <= tempo2)
    {
        printf("%d\n", tempo3);
    }
    return 0;
}
