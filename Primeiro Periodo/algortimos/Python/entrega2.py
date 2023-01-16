def fetuccine(termo1, termo2, n):
    for i in range(3, (n+1)):
        if i % 2 == 0:
            pTermo = termo2 - termo1
        else:
            pTermo = termo1 + termo2          
        print(pTermo, end= ',')

        termo1 = termo2
        termo2 = pTermo


n1 = int(input('Digite o valor de n1: '))
n2 = int(input('Digite o valor de n2: '))
qtermos = int(input('Digite a quantidade de termos: '))

while qtermos < 3:
    print('São necessários pelo menos 3 termos')
    qtermos = int(input('Digite a quantidade de termos: '))

print(n1, end= ',')   
print(n2, end= ',')
fetuccine(n1, n2, qtermos)


