matriz = []
for i in range (3):
    linha = []
    for j in range(3):
        elemento = int(input('Digite o elemento: '))
        linha.append(elemento)
    matriz.append(linha)

print('------------Matriz-------------')
for i in range(3):
    print(matriz[i])

matrizTransposta = []

for i in range(3):
    linha = []
    for j in range(3):
        elemento = matriz[j][i]
        linha.append(elemento)
    matrizTransposta.append(linha)

print('-------------Matriz transposta-------------')
for i in range(3):
    print(matrizTransposta[i])