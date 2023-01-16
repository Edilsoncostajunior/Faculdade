matriz = []
elemento = 0
for i in range(1,11):
    linha = []
    for j in range(1,11):
        if i < j:
            elemento = (2 * i)  + (7 * j)  - 2
        elif i == j:
            elemento = 3 * (i ** 2) - 1
        elif i > j:
            elemento = 4 * (i ** 3) - 5 * (j ** 2) + 1
        linha.append(elemento)
    matriz.append(linha)

for i in range(10):
    print(matriz[i])