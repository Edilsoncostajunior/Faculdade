/*
Gabriel Yuri Ramalho Ferreira - 211080330
Edilson Costa do Nascimento Júnior - 211080101
Rafael de Sousa Cavalcante - 211080152
*/
    #include <stdio.h>
    
    void perfect (short int number){

        short int contador = 0;
        short int fatores[number / 2];
        short int somaFatores = 0;
        

    //Verificar se o número é perfeito:
        for(register short int i2 = 1; i2 <= number / 2; i2++){
            
            if(number % i2 == 0){
                somaFatores += i2;
                fatores[contador] = i2;
                contador++;
            }

        }
        if (somaFatores == number){
            printf("%d E perfeito!\n", number);

            //Exibir soma dos fatores:
            for(register short int i3 = 0; i3 < contador; i3++){
                printf(" %d + ",fatores[i3]);
            }
            printf("\b\b = %d\n", number);

        }

        return;   
    }

    int main(void){

        //Laço de repetição para a exibição dos números perfeitos:
        for(register short int i = 1; i < 1001; i++){
            perfect(i);
        }
        return 0;
    }