matriz = []
for i in range(3):
    linha = []
    for j in range(3):
        elemento = int(input('Digite o elemento: '))
        linha.append(elemento)
    matriz.append(linha)

print('------------------Matriz---------------')
for i in range(3):
    print(matriz[i])

soma = 0
for i in range(len(matriz)):
    for j in range(len(matriz[0])):
        if (i < j):
            soma += matriz[i][j]
print(f'A soma é {soma}')