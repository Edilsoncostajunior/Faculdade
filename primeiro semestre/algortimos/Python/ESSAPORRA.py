def somaElementosLista(lista1,lista2):
    listaSoma = []
    menor = None
    maior = None
    copialista1 = lista1.copy ()
    copialista2 = lista2.copy ()

    def soma():
        posicao = len(copialista1) - 1
        for i in range(len(copialista1)):
            soma = copialista1[posicao] + copialista2[posicao]
            if soma > 9:
                soma -= 10
                copialista1[posicao-1] += 1

            listaSoma.append(soma)
            posicao -= 1
        if copialista1[0] + copialista2[0] > 9:
            listaSoma.append(1)

    if len(copialista1) > len(copialista2):
        menor = copialista2
        maior = copialista1
    else:
        menor = copialista1
        maior = copialista2

    if copialista1 ==[] and copialista2 == []:
        return 'A soma das listas é []'
    elif len(copialista1) == len(copialista2):
        soma()
    else:
        diferenca = len(maior) - len(menor)
        menor.reverse()
        for i in range(diferenca):
            menor.append(0)
        menor.reverse()
        soma()
        

    listaSoma.reverse()
    print (str(lista1).rjust (20))
    print (str(lista2).rjust (20))
    print(('-'*20).rjust(10))
    return(str(listaSoma).rjust (20))

#l1 = []
#l2 = []

print(somaElementosLista([],[]))