matriz = []
soma = 0
for i in range (3):
    linha = []
    for j in range(3):
        elemento = int(input('Digite o elemento: '))
        linha.append(elemento)
    matriz.append(linha)

print('------------Matriz-------------')
for i in range(3):
    print(matriz[i])

soma = matriz[0][2] + matriz[1][1] + matriz[2][0]
print(f'A soma dos elementos da diagonal secundária é {soma}')