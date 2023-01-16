/*
Gabriel Yuri Ramalho Ferreira - 211080330
Edilson Costa do Nascimento Júnior - 211080101
Rafael de Sousa Cavalcante - 211080152
*/

#include <stdio.h>

#define VERDADEIRO 1
#define FALSO 0
#define MAX 100 // o numero maximo de comandos

// funções
void pegarComandos(int comandos[][2]);
int virarDireita(int d);
int virarEsquerda(int d);
void moverCaneta(int baixo, int a[][50], int dir, int dist);
void mostrarMatriz(int a[][50]);

int main(void){

    int floor[50][50] = {0}; // Matriz base
    int canetaBaixo = FALSO; // caneta para baixo inicial
    int comando; // comando atual
    int direcao = 0; // direcao indicador
    int comandoArray[MAX][2] = {0}; // array de comandos
    int distancia; // distancia para mover
    int contador = 0; // comando contador
    pegarComandos(comandoArray);
    comando = comandoArray[contador][0];
    // continua recebendo input enquanto while != 9

    while (comando != 9)
    {
        // determina o que vai ser entrado e que vai fazer
        switch (comando){

        case 1:
            canetaBaixo = FALSO;
            break; // sair do switch
        case 2:
            canetaBaixo = VERDADEIRO;
            break; // sair do switch
        case 3:
            direcao = virarDireita(direcao);
            break; // sair do switch
        case 4:
            direcao = virarEsquerda(direcao);
            break; // sair do switch
        case 5:
            distancia = comandoArray[contador][1];
            moverCaneta(canetaBaixo, floor, direcao, distancia);
            break; // sair do switch
        case 6:
            puts("\nO desenho é:\n");
            mostrarMatriz(floor);
            break; // sair do switch
        } // fim do switch
        comando = comandoArray[++contador][0];
    } // fim do while
} // fim do main

void pegarComandos(int comandos[][2]){
    int i; // contador
    int tempComando; // Variavel temporaria do comando

    printf("%s", "Digite o comando ( 9 para finalizar ): ");
    scanf("%d", &tempComando);
    while (tempComando > 9 || tempComando < 1 || tempComando == 8 || tempComando == 7)
        {//tratamento de erro
            printf("%s", "Digite um comando válido ( 9 para finalizar ): ");
            scanf("%d", &tempComando);
        }
    // recebe comandos ate 9 seja digitado

    for (i = 0; tempComando != 9 && i < MAX; ++i)
    {

        comandos[i][0] = tempComando;
        // ignora virgula na entrada do 5
        if (5 == tempComando)
        {
            scanf(".%d", &comandos[i][1]);
        } // fim do if

        printf("%s", "Digite o comando ( 9 para finalizar ): ");
        scanf("%d", &tempComando);
        while (tempComando > 9 || tempComando < 1 || tempComando == 8 || tempComando == 7)
        {
            printf("%s", "Digite um comando válido ( 9 para finalizar ): ");
            scanf("%d", &tempComando);
        }
    } // fim do for
    comandos[i][0] = 9; // ultimo comando
} // fim da função pegarComandos

// virarDireita vira a tartaruga para a direita

int virarDireita(int d)
{
    return ++d > 3 ? 0 : d;
} // fim do function virarDireita

// virarEsquerda vira tartaruga para a esquerda
int virarEsquerda(int d)
{
    return --d < 0 ? 3 : d;
} // fim do function virarEsquerda

// moverCaneta move a caneta
void moverCaneta(int baixo, int a[][50], int dir, int dist){

    int i; // contador de loops
    int j; // contador de loops
    static int xPos = 0; // coordenada X
    static int yPos = 0; // coordenada y

    // determina qual caminho a caneta vai 
    switch (dir){

    case 0: // move para a direita
        // move ate o digitado ou ate o limite
        for (j = 1; j <= dist && yPos + j < 50; ++j)
        {
            if (baixo)
            {
                a[xPos][yPos + j] = 1;
            }
        } // fim do for
        yPos += j - 1;
        break; // sair do switch
    case 1: // mover para baixo
        for (i = 1; i <= dist && xPos + i < 50; ++i)
        {
            // digite 1 se a caneta é para baixo
            if (baixo)
            {
                a[xPos + i][yPos] = 1;
            } // fim do if
        } // fim do for
        xPos += i - 1;
        break; // sair do switch
    case 2: // mover para a esquerda
        for (j = 1; j <= dist && yPos - j >= 0; ++j)
        {
            if (baixo)
            {
                a[xPos][yPos - j] = 1;
            } // fim do if
        } // fim do for
        yPos -= j - 1;
        break; // sair do switch
    case 3: //mover para a direita
        for (i = 1; i <= dist && xPos - i >= 0; ++i)
        {
            if (baixo)
            {
                a[xPos - i][yPos] = 1;
            } // fim do if
        } // fim do for
        xPos -= i - 1;
        break; // sair do switch
    } // fim do switch
} // fim do function moverCaneta

void mostrarMatriz(int a[][50]){
    int i; // contador
    int j; // contador

    for (i = 0; i < 50; i++)
    {
        for (j = 0; j < 50; j++)
        {
            putchar(a[i][j] ? '*' : ' ');
        } // fim do for
        puts("");
    } // fim do for
} // fim do function mostrarMatriz