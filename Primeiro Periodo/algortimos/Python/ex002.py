matriz = [[1,3,4,5,2], [1,4,5,2,1], [9,3,10,1,6], [1,2,9,6,4], [1,2,3,4,5]]
for i in range(5):
    print(matriz[i])
for i in range(5):
    for j in range(5):
        matriz[i][j] = 0
        if i == j:
            matriz[i][j] = 1
print('-----------------------------------------------------')
for i in range(5):
    print(matriz[i])
        
        


