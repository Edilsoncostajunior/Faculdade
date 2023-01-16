#include <stdio.h>
int main()
{
    int cateto1, cateto2, hip, i, j, k;

    for ( i = 1; i < 500; i++)
    {  
        cateto1 = i;
        for ( j = 1; j < 500; j++)
        {
            cateto2 = j;
            for ( k = 1; k < 500; k++)
            {
                hip = k;
                if ((hip*hip) == (cateto1 * cateto1) +(cateto2 *cateto2))
                {
                    printf("(%i)(%i)(%i)\n", hip, cateto1, cateto2);
                }
                
            }
            
        }

        
    }
    
    return 0;
}
