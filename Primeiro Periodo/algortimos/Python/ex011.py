matriz = []
for i in range (4):
    linha = []
    for j in range(4):
        elemento = int(input('Digite o elemento: '))
        linha.append(elemento)
    matriz.append(linha)

print('------------Matriz-------------')
for i in range(4):
    print(matriz[i])
print('--------Matriz transformada---------')
matrizTriangular = []

for i in range(4):
    linha = []
    for j in range(4):
        elemento = matriz[i][j]
        if i < j:
            elemento = 0
        linha.append(elemento)
    matrizTriangular.append(linha)

for i in range(4):
    print(matrizTriangular[i])

