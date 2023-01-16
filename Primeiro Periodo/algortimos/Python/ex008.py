matriz = []
soma = 0
for i in range (3):
    linha = []
    for j in range(3):
        elemento = int(input('Digite o elemento: '))
        linha.append(elemento)
        if i == j:
            soma += elemento
    matriz.append(linha)

print('------------Matriz-------------')
for i in range(3):
    print(matriz[i])
print(f'A soma é {soma}')
