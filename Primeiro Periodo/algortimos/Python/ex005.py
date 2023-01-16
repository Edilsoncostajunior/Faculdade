print('Matriz A')
matrizA = []
for i in range(4):
    linha = []
    for j in range(4):
        elementoA = int(input(f'{[i+1, j+1]}: '))
        linha.append(elementoA)
    matrizA.append(linha)

for i in range(4):
    print(matrizA[i])

print('Matriz B')
matrizB = []
for i in range(4):
    linha = []
    for j in range (4):
        elementoB = int(input(f'{[i+1, j+1]}: '))
        linha.append(elementoB)
    matrizB.append(linha)

for i in range(4):
    print(matrizB[i])

print('Matriz C')
matrizC = []
for i in range(4):
    linha = []
    for j in range(4):
        if matrizA[i][j] > matrizB[i][j]:
            linha.append(matrizA[i][j])
        else:
            linha.append(matrizB[i][j])
    matrizC.append(linha)

for i in range(4):
    print(matrizC[i])
