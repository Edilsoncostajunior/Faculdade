#include <stdio.h>

int main(int argc, char const *argv[])
{
    int i, j, n, m, x, s1, b1, a1;
    double tentS = 0.00, tentB = 0.00, tentA = 0.00, tent_S1 = 0.00, tent_B1 = 0.00, tent_A1 = 0.00, pontosSaque, pontosBloqueio, pontosAtaque;
    char name[10000];
    
    scanf("%d", &n);
    
    for(i=1; i<=n; i++)
    {
        scanf("%s", name);
        scanf("%d%d%d", &m, &j, &x);
        scanf("%d%d%d", &s1, &b1, &a1);
        tentS += m; 
        tentB += j; 
        tentA += x;
        tent_S1 += s1; 
        tent_B1 += b1; 
        tent_A1 += a1;
    }
    
    pontosSaque = (tent_S1/tentS)*100.00;
    pontosBloqueio = (tent_B1/tentB)*100.00;
    pontosAtaque = (tent_A1/tentA)*100.00;
    printf("Pontos de Saque: %.2lf %%.\n", pontosSaque);
    printf("Pontos de Bloqueio: %.2lf %%.\n", pontosBloqueio);
    printf("Pontos de Ataque: %.2lf %%.\n", pontosAtaque);

    return 0;
}
