#include <stdio.h>

int main()

{

double valor,valor3;
int valor2,numCem,numCinquenta,numVinte,numDez,X,numDois,numUm,numCinquentaCent,numvinte_cincoCent;
int cem,cinquenta,vinte,dez,cinco,dois,um,m_cinquenta,vinte_cincoCent,dezCent,cincoCent,umcent;

scanf ("%lf",&valor);

valor2=valor;
cem=valor2/100;
numCem=valor2%100;
cinquenta=numCem/50;
numCinquenta=numCem%50;
vinte=numCinquenta/20;
numVinte=numCinquenta%20;
dez=numVinte/10;
numVinte=numVinte%10;
cinco=numVinte/5;
numDez=numVinte%5;
dois=numDez/2;
um=numDez%2;


valor3=valor*100;
X=(int) valor3;
numDois=X%100;
m_cinquenta=numDois/50;
numUm=numDois%50;
vinte_cincoCent=numUm/25;
numCinquentaCent=numUm%25;
dezCent=numCinquentaCent/10;
numvinte_cincoCent=numCinquentaCent%10;
cincoCent=numvinte_cincoCent/5;
umcent=numvinte_cincoCent%5;

printf ("NOTAS:\n");
printf ("%d nota(s) de R$ 100.00\n",cem);
printf ("%d nota(s) de R$ 50.00\n",cinquenta);
printf ("%d nota(s) de R$ 20.00\n",vinte);
printf ("%d nota(s) de R$ 10.00\n",dez);
printf ("%d nota(s) de R$ 5.00\n",cinco);
printf ("%d nota(s) de R$ 2.00\n",dois);
printf ("MOEDAS:\n");
printf ("%d moeda(s) de R$ 1.00\n",um);
printf ("%d moeda(s) de R$ 0.50\n",m_cinquenta);
printf ("%d moeda(s) de R$ 0.25\n",vinte_cincoCent);
printf ("%d moeda(s) de R$ 0.10\n",dezCent);
printf ("%d moeda(s) de R$ 0.05\n",cincoCent);
printf ("%d moeda(s) de R$ 0.01\n",umcent);



return 0;

}