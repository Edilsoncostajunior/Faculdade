int main(void)
{
    
    char entrada;
    int numMov, movimento, i;
    int vetor[] = {0, 0, 0};
    int vetorsup[] = {0};

    scanf("%d %c", &numMov, &entrada);
    
    if(entrada == 'A')
        vetor[0] = 1;
    else if(entrada == 'B')
        vetor[1] = 1;
    else if(entrada == 'C')
        vetor[2] = 1;

    for(i = 1; i <= numMov; i++){
        scanf("%d", &movimento);

        if (movimento == 1){
            vetorsup[0] = vetor[0];
            vetor[0] = vetor[1];
            vetor[1] = vetorsup[0];
        }
        else if(movimento == 2){
            vetorsup[0] = vetor[1];
            vetor[1] = vetor[2];
            vetor[2] = vetorsup[0];
        }
        else if(movimento == 3){
            vetorsup[0] = vetor[0];
            vetor[0] = vetor[2];
            vetor[2] = vetorsup[0];
        }
    }
     
    if (vetor[0] == 1)
        printf("A\n");
    else if(vetor[1] == 1)
        printf("B\n");
    else if(vetor[2] == 1)
        printf("C\n");

    return 0;
}