matrizA = []
for i in range(2):
    linha = []
    for j in range(2):
        elemento = int(input('Digite o elemento: '))
        linha.append(elemento)
    matrizA.append(linha)

matrizB = []
for i in range(2):
    linha = []
    for j in range(2):
        elemento = int(input('Digite o elemento: '))
        linha.append(elemento)
    matrizB.append(linha)

print('Opções:')
print('(a) somar as duas matrizes')
print('(b) subtrair a primeira matriz da segunda')
print('(c) adicionar uma constante às duas matrizes')
print('(d) imprimir as matrizes')

while (1):
    letra = input('Digite a letra correspondente: ').upper()
    if letra == 'A' or letra == 'B' or letra == 'C' or letra == 'D':
        break
    else:
        print('Letra inválida')

if letra == 'A':
    matrizSoma = []
    for i in range(2):
        linha = []
        for j in range(2):
            elemento = matrizA[i][j] + matrizB[i][j]
            linha.append(elemento)
        matrizSoma.append(linha)
    for i in range(2):
        print(matrizSoma[i])

elif letra == 'B':
    matrizSubtracao = []
    for i in range(2):
        linha = []
        for j in range(2):
            elemento = matrizA[i][j] - matrizB[i][j]
            linha.append(elemento)
        matrizSubtracao.append(linha)
    for i in range(2):
        print(matrizSubtracao[i])

elif letra == 'C':
    escalar = int(input('Digite o valor da constante: '))
    for i in range(2):
        for j in range(2):
            matrizA[i][j] = escalar * matrizA[i][j]
            matrizB[i][j] = escalar * matrizB[i][j]
    print('Matriz A e B adicionadas:')
    print('Matriz A')
    for i in range(2):
        print(matrizA[i])
    print('Matriz B')
    for i in range(2):
        print(matrizB[i])

elif letra == 'D':
    print('Impressão das matrizes A e B:')
    print('Matriz A')
    for i in range(2):
        print(matrizA[i])
    print('Matriz B')
    for i in range(2):
        print(matrizB[i])

    