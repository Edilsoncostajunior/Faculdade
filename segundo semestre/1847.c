#include <stdio.h>

int main(void)
{
    int dia1, dia2, dia3, diferencaD2D1, diferencaD3D2, diferencaD2D3, diferencaD1D2;
    scanf("%d%d%d", &dia1, &dia2, &dia3);
    diferencaD2D1 = dia2 - dia1;
    diferencaD2D3 = dia2 - dia3;
    diferencaD3D2 = dia3 - dia2;
    diferencaD1D2 = dia1 - dia2;
    
    if (dia2 > dia1)
    {
        if (dia3 > dia2)
        {
            if (diferencaD3D2 < diferencaD2D1)
            {
                printf(":(\n");
            }
            else printf(":)\n");
         }    
        else
            printf(":(\n");
    }
    
    else if ( dia1 > dia2)
    {
        if (dia2 > dia3)
        {
            if (diferencaD1D2 > diferencaD2D3)
            {
                printf(":)\n");
            }
            else 
                printf(":(\n");
        }   
        else
            printf(":)\n");
        

    }
    else if (dia3 > dia2)
        printf(":)\n");
    else
        printf(":(\n");
    return 0;
}
