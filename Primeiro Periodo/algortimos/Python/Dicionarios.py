angulos = input('Digite os angulos: ').lower().strip()
lista = list(angulos.split())

matrizAngulos = []
dicionario = {}

def criarTupla():
    tupla = ()
    for j in range(3):
        tupla = tupla + (int(matrizAngulos[i][j]),)
    dicionario[lista[i]] = tupla

for i in range(len(lista)):
    if 'g' in lista[i] and 'm' in lista[i] and 's' in lista[i]:
        matrizAngulos.append(lista[i].replace('g', ' ').replace('m', ' ').replace('s', ' ').split())
        criarTupla()
    elif 'g' in lista[i] and 'm' in lista[i] and 's' not in lista[i]:
        matrizAngulos.append((lista[i].replace('g', ' ').replace('m', ' ') + ' 0').split())
        criarTupla()
    elif 'g' in lista[i] and 's' in lista[i] and 'm' not in lista[i]:
        matrizAngulos.append(lista[i].replace('g', ' 0 ').replace('s', ' ').split())
        criarTupla()
    elif 'm' in lista[i] and 's' in lista[i] and 'g' not in lista[i]:
        matrizAngulos.append('0 ' + lista[i].replace('m', ' ').replace('s', ' ').split())
        criarTupla()
    elif 'g' in lista[i] and 'm' not in lista[i] and 's' not in lista[i]:
        matrizAngulos.append((lista[i].replace('g', ' ') + '0 ' + '0').split())
        criarTupla()
    elif 'm' in lista[i] and 'g' not in lista[i] and 's' not in lista[i]:
        matrizAngulos.append(('0 ' + lista[i].replace('m', ' ') + ' 0').split())
        criarTupla()
    elif 's' in lista[i] and 'g' not in lista[i] and 'm' not in lista[i]:
        matrizAngulos.append(('0 ' + '0 ' + lista[i].replace('s', ' ')).split())
        criarTupla()

#soma -------------------------------------------------------
somaS = 0
somaM = 0
somaG = 0
for key in dicionario.keys():
    somaS += dicionario[key][2]
    while somaS >= 60:
        somaS -= 60
        somaM += 1
    somaM += dicionario[key][1]
    while somaM >= 60:
        somaM -= 60
        somaG += 1
    somaG += dicionario[key][0]

tuplaSoma = (somaG, somaM, somaS)
#------------------------------------------------------------

#media ------------------------------------------------------
g = tuplaSoma[0]
m = tuplaSoma[1]
s = tuplaSoma[2]

if g % len(dicionario) != 0:
    m += ((g % len(dicionario)) * 60)
    mediaG = g // len(dicionario)
else:
    mediaG = g / len(dicionario)
if m % len(dicionario) != 0:
    s += ((m % len(dicionario)) * 60)
    mediaM = m // len(dicionario)
else:
    mediaM = m / len(dicionario)
mediaS = s / (len(dicionario))

media = (mediaG, mediaM, mediaS)
#-----------------------------------------------------------

#print ----------------------------------------------------
for key in dicionario.keys():
    print(f'                {key}')
print('+ _________________________')
print(f'                {somaG}g{somaM}m{somaS}s')
print(f'         Média: {mediaG}g{mediaM:.0f}m{mediaS:.0f}s')
#----------------------------------------------------------