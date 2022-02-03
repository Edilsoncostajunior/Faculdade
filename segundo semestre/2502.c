#include <ctype.h>
#include <stdio.h>
#include <string.h>

int min(char c) {
    return (isupper(c)? 'a' + c  -'A'  : c);
}

int max(char c) {
    return (islower(c)? 'A' + c - 'a' : c);
}

int main() {
    
    int i, j, c, n, cripto[1024];
	char Csar1[50], Csar2[50], linha[1024];
	
	while (scanf("%d %d ", &c, &n) != EOF) {
		
		for (i = 0; i < 1000; i++)
			cripto[i] = i;

		scanf("%[^\n]%*c", Csar1);
		scanf("%[^\n]%*c", Csar2);
		
		for (i = 0 ; i < strlen(Csar1); i++) {
			cripto[(int) Csar1[i]] = max(Csar2[i]);
			if (isupper(Csar1[i]))
				cripto['a' + Csar1[i] - 'A'] = min(Csar2[i]);
			
			cripto[(int)Csar2[i]] = max(Csar1[i]);
			if (isupper(Csar2[i]))
				cripto['a' + Csar2[i] - 'A'] = min(Csar1[i]);
		}
		
		for (i = 0; i < n; i++) {
			scanf("%[^\n]%*c", linha);
			for (j = 0; j < strlen(linha); j++)
				printf("%c",(isupper(linha[j])? (char) max(cripto[(int) linha[j]]) : (char) min(cripto[(int) linha[j]])));
			printf("\n");
		}
		printf("\n");
	}	
	return 0;
}