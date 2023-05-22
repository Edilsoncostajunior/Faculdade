matrizG = [['a'], ['b'], ['c'], ['d'], ['e'], ['a'], ['b'], ['c'], ['d'], ['e']] 
matrizalunos = []

for i in range(2):
    linha = []
    contrespostacerta = 0
    matricula = int(input('digite sua matricula:'))
    linha.append(matricula)
    for i in range(10):
        resposta = input('resposta da questão ' + str(i+1))
        linha.append(resposta)
        if resposta == matrizG[i]:
            contrespostacerta += 1
linha.append(contrespostacerta)
matrizalunos.append(linha)

print('g=', matrizG)
for i in range(matrizalunos):
    print(matrizalunos[i])
