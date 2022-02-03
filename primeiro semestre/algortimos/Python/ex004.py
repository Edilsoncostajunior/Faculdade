matriz = []
for i in range(5):
    linha = []
    for j in range(5):
        elemento = int(input(f'[{i+1, j+1}]: '))
        linha.append(elemento)
    matriz.append(linha)
valorX = int(input('Digite um valor a ser procurado na matriz: '))

while (1):
    for i in range(5):
        if valorX in matriz[i]:
            achou = True
            linha = i + 1
            coluna = matriz[i].index(valorX) + 1
        else:
            achou = False
    if achou == True:
        print('Encontrado!')
        print(f'Linha {linha}, Coluna {coluna}')
        break
    else:
        print('Não encontrado!')
        break