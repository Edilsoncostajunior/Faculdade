print('Matriz é do tipo n x m')
dimensaoN = int(input('Digite a dimensao n da matriz A: '))
dimensaoM = int(input('Digite a dimensao m da matriz A: '))

matrizA = []
for i in range(dimensaoN):
    linha = []
    for j in range(dimensaoM):
        elemento = int(input('Digite o valor do elemento: '))
        linha.append(elemento)
    matrizA.append(linha)

print('Matriz é do tipo n x m')
dimensaoN = int(input('Digite a dimensao n da matriz B: '))
dimensaoM = int(input('Digite a dimensao m da matriz B: '))

matrizB = []
for i in range(dimensaoN):
    linha = []
    for j in range(dimensaoM):
        elemento = int(input('Digite o valor do elemento: '))
        linha.append(elemento)
    matrizB.append(linha)

colunaA = len(matrizA[0])
linhaB = len(matrizB)
linhaA = len(matrizA)
colunaB = len(matrizB[0])

if colunaA != linhaB:
    print('Não é possível fazer a multiplicação')
else:
    matrizC = []
    for i in range(linhaA):
        linha = []
        for j in range(colunaB):
            somatorio = 0
            for k in range(linhaB):
                somatorio += matrizA[i][k] * matrizB[k][j]
            linha.append(somatorio)
        matrizC.append(linha)

for i in range(linhaA):
    print(matrizC[i])
                

