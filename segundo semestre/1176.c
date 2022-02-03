
#include<stdio.h>
int main()
{
   long long int primeiro = 0, segundo = 1, proximo, m, i, j;

   scanf("%d", &n);
   for(i=1; i<=n; i++, primeiro = 0, segundo = 1)
   {
       scanf("%lld",&j);
       j+=1;
       for ( m = 0 ; m < j ; m++ )
       {
          if (m <= 1) proximo = m;
          else
          {
             proximo = primeiro + segundo;
             primeiro = segundo;
             segundo = proximo;
          }
       }
          printf("Fib(%lld) = %lld\n",n-1,proximo);
   }
   return 0;
}

#include<stdio.h>
int main()
{
   long long int primeiro = 0, segundo = 1, proximo, m, j;
   int i,n;
   scanf("%d", &n);
   for(i=1; i<=n; i++, primeiro = 0, segundo = 1)
   {
       scanf("%lld",&j);
       j=j+1;
       for ( m = 0 ; m < j ; m++ )
       {
          if (m <= 1) proximo = m;
          else
          {
             proximo = primeiro + segundo;
             primeiro = segundo;
             segundo = proximo;
          }
       }
          printf("Fib(%lld) = %lld\n",j-1,proximo);
   }
   return 0;
}