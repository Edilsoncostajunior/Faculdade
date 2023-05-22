matriz = []
contador = 0
for i in range (4):
    linha = []
    for j in range (4):
        elemento = int(input('Informe um número: '))
        linha.append(elemento)
        if elemento > 10:
            contador += 1
    matriz.append(linha)

for i in range(4):
    print(matriz[i])
print(f'Existem {contador} valores maiores que 10')


