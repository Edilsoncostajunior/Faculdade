def somaElementosLista(lista1,lista2):
    listaSoma = []
    menor = None
    maior = None
    copialista1 = lista1.copy()
    copialista2 = lista2.copy()


    if len(lista1) > len(lista2):
        menor = lista2
        maior = lista1
    else:
        menor = lista1
        maior = lista2

    if lista1 ==[] and lista2 == []:
        return print('a soma é igual a', [])

    if len(lista1) == len(lista2):
        posicao = len(lista1) - 1
        for i in range(len(lista1)):
            soma = lista1[posicao] + lista2[posicao]
            if soma > 9:
                soma -= 10
                lista1[posicao-1] += 1
        
            listaSoma.append(soma)
            posicao -= 1
        if lista1[0] + lista2[0] > 9:
            listaSoma.append(1)
    else:
        Menor_posicao = len(menor) - 1
        Maior_posicao = len(maior) - 1
        for i in range(len(menor)):
            soma = maior[Maior_posicao] + menor[Menor_posicao]
            if soma > 9:
                soma -= 10
                maior[Maior_posicao - 1] += 1
            listaSoma.append(soma)
            Menor_posicao -= 1
            Maior_posicao -= 1
        for a in range(len(maior)-len(menor)):
            if maior[Maior_posicao] > 9:
                soma = maior[Maior_posicao] - 10
                maior[Maior_posicao - 1] += 1
                listaSoma.append(soma)
            else:
                 listaSoma.append(maior[Maior_posicao])
            Maior_posicao -= 1
        if maior[0] > 9:
            listaSoma.append(1)
        
            
    listaSoma.reverse()
    
    
    return listaSoma
    
l1 = [3,4,5,8]
l2 = [1,2,7]

print(somaElementosLista(l1,l2))
           