/*
Gabriel Yuri Ramalho Ferreira - 211080330
Edilson Costa do Nascimento Júnior - 211080101
Rafael de Sousa Cavalcante - 211080152
*/

#include <stdio.h>

void inicalizarVetor(short int array[1000]){
    for (register short int i = 0; i < 1000; i++){
        array[i] = 1;
    }

return;

}

void definirPrimos(short int array[1000]){
    short int subscrito = 0;
     for (register short int i = 1; i < 1000; i++){
        subscrito = i + 1;
        if (array[i] == 1){
            for (register short int j = subscrito; j <= 1000 - i;){
                j += subscrito;
                array[j - 1] = 0;
            }
        }
        
    }

    for (register short int i = 1; i < 1000; i++){
        if (array[i] == 1){
            printf("%d\n", (i + 1));
        }
    }

    return;
}

int main(void)
{
    short int array[1000];
    
    inicalizarVetor(array);
    definirPrimos(array);

    return 0;
    
}