/*
Gabriel Yuri Ramalho Ferreira - 211080330
Edilson Costa do Nascimento Júnior - 211080101
Rafael de Sousa Cavalcante - 211080152
*/

#include <stdio.h>
#include <stdlib.h>
#include <time.h> /* contém protótipo para função time */

 /* constantes de enumeração representam status do jogo */
 enum Status { CONTINUE, WON, LOST };

 int rollDice( void ); /* protótipo de função */

 /* função main inicia a execução do programa */
 int main( void )
 {
 int sum; /* soma dos dados lançados */
 int myPoint; /* ponto ganho */
 float saldoBanca = 1000; //Variável que vai armazenar o saldo do jogador
 float aposta;

 printf("Insira o valor da sua aposta: R$");
 scanf("%f",&aposta);

 //Verificando o valor da aposta:
 while(aposta > saldoBanca){
     printf("Digite um abaixo de mil reais: R$");
     scanf("%f",&aposta);

 }

 enum Status gameStatus; /* pode conter CONTINUE, WON ou LOST */

 /* randomiza gerador de número aleatório usando hora atual */
 srand( time( NULL ) );

 sum = rollDice(); /* primeiro lançamento dos dados */

 /* determina status do jogo com base na soma dos dados */
 switch( sum ) {

 /* vence na primeira jogada */
 case 7:
 case 11:
 saldoBanca += aposta;
 gameStatus = WON;
 break;

 /* perde na primeira jogada */
 case 2:
 case 3:
 case 12:
 saldoBanca -= aposta;
 gameStatus = LOST;
 break;

 /* lembra ponto */
 default:
 gameStatus = CONTINUE;
 myPoint = sum;
 printf( "Ponto e %d\n", myPoint );
 break; /* optional */
 } /* fim do switch */

 /* enquanto jogo não termina */
 while ( gameStatus == CONTINUE ) {
 printf("Vamos, voce ainda tem chance!\n");
 sum = rollDice(); /* joga dados novamente */

 /* determina status do jogo */
 if ( sum == myPoint ) { /* vence fazendo ponto */
 saldoBanca += aposta;
 printf("Seu novo saldo atual e de R$%.2f\n", saldoBanca);
 gameStatus = WON; /* jogo termina, jogador vence */
 } /* fim do if */
 else {

     if ( sum == 7 ) { /* perde por lançar 7 */
 saldoBanca -= aposta;
 printf("Assim voce se quebra!\n");
 gameStatus = LOST; /* jogo termina, jogador perde */
 } /* fim do if */
 } /* fim do else */
 } /* fim do while */

 /* mostra mensagem de vitória ou perda */
 if ( gameStatus == WON ) { /* jogador venceu? */
 printf("O seu saldo final e: R$%.2f\n",saldoBanca);
 printf( "Jogador vence\n" );
 printf("Voce esta ganhando!\n");

 } /* fim do if */
 else { /* jogador perdeu */
 if(saldoBanca == 0){
     printf("Sinto muito. Voce esta quebrado!\n");
 }
 printf("O seu saldo final e: R$%.2f\n",saldoBanca);
 printf("Jogador perde\n" );
 } /* fim do else */

 return 0; /* indica conclusão bem-sucedida */
 } /* fim do main */

 /* lança dados, calcula soma e exibe resultados */
 int rollDice( void )
 {
 int die1; /* primeiro dado */
 int die2; /* segundo dado */
 int workSum; /* soma dos dados */

 die1 = 1 + ( rand() % 6 ); /* escolhe valor aleatório die1 */
 die2 = 1 + ( rand() % 6 ); /* escolhe valor aleatório die2 */
 workSum = die1 + die2; /* soma die1 e die2 */

 /* exibe resultados dessa jogada */
 printf( "Jogador rolou %d + %d = %d\n", die1, die2, workSum );
 return workSum; /* retorna soma dos dados */
 } 
 