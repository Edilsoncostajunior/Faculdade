 #include <stdio.h>
 #include <ctype.h>
 int main(void)
 {
     int num1, num2, repeat, contador;
     char entrada[4];

     scanf("%d", &repeat);

     for (contador = 1; contador <= repeat; contador++)   {

        scanf("%s", entrada);

        num1 = (entrada[0] - '0');
        num2 = (entrada[2] - '0');

        if (num1 == num2){
            printf("%d\n",num1 * num2);}

        
        else if (islower(entrada[1])){
            printf("%d\n",num1 + num2); }
        
        else
            printf("%d\n",(num1 - num2) *-1) ;
     }

     return 0;
 }
 