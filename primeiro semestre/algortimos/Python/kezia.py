import pandas as pd

matematica_df = pd.read_excel ("livrosMatematica.xlsx")
fisica_df = pd.read_excel ("livrosFisica.xlsx")
filosofia_df = pd.read_excel ("livrosFilosofia.xlsx")
suspense_df = pd.read_excel ("livrosSuspense.xlsx")
romance_df = pd.read_excel ("livrosRomance.xlsx")

Df = None

def linha(tam=104):
    return '-'*tam


def cabeçalho (txt):
    print (linha())
    print (txt.center(104))
    print (linha())

    
def menu(lista):
    cabeçalho('MENU')
    c=1
    for item in lista:
        print(f'{c}-{item}')
        c +=1
    print (linha())
    
    
#resultado
menu (['Categorias', 'Reservas', 'Registro dos alunos', 'Entregas','Cadastrar livro', 'Sair'])
opcao = int(input("Opção:"))


def categorias(lista):
    cabeçalho('CATEGORIAS')
    c=1
    for item in lista:
        print(f'{c}-{item}')
        c +=1
    print (linha())

    
def reservas(lista):
    cabeçalho('RESERVAS')
    c=1
    for item in lista:
        print(f'{c}-{item}')
        c +=1
    print (linha())


def pesquisa(lista):
    print (linha())
    c=1
    for item in lista:
        print(f'{c}-{item}')
        c +=1
    print (linha())

def Pesquisa_e_Registro(Df, nome, num):
    while num != 1 and num != 2:
        num = input('digite um valor valido')
    while num == 1:
        nome = input("Nome do livro:")
        print (Df[Df["Título"].str.contains(pat=nome,case=False)])
        pesquisa (["Pesquisar Novamente", "Fazer registro"])
        num = int(input("Opção:"))
            
    if num == 2:
        registro_df = pd.read_excel ("registro.xlsx")
        aluno = input("Nome do Aluno:")
        titulo = input("Título do livro:")
        dia_registro = input("Dia do Registro:")
        dia_entrega = input ("Dia da Entrega:")
        registro_df.loc[len(registro_df)] = [aluno , titulo, dia_registro,dia_entrega]
        registro_df.to_excel('registro.xlsx', encoding='utf',index=False)
        Df.loc[Df['Título'] == titulo, 'Quantidade'] = Df.loc[Df['Título'] == titulo, 'Quantidade']-1
        print(registro_df)
        return Df
   
    
#-------------------------------------------------- CATEGORIAS---------------------------------------------------------------


if opcao ==  1:
  
    categorias (['Matemática', 'Física', 'Filosofia', 'Suspense', 'Romance'])
    categoria = int(input("Qual é a categoria desejada?"))
    
    
    if categoria == 1:
        print(matematica_df)
        nome_mat = input("Nome do livro:")
        print (matematica_df[matematica_df["Título"].str.contains(pat=nome_mat,case=False)])
        pesquisa (["Pesquisar Novamente", "Fazer registro"])
        alternativa = int(input("Opção:"))
        
        Pesquisa_e_Registro(matematica_df,nome_mat,alternativa )
        matematica_df.to_excel('livrosMatematica.xlsx', encoding='utf',index=False)    
        print(matematica_df)

    
    elif categoria == 2:
        print(fisica_df)
        nome_fis = input("Nome do livro:")
        print (fisica_df[fisica_df["Título"].str.contains(pat=nome_fis,case=False)])
        pesquisa (["Pesquisar Novamente", "Fazer registro"])
        alternativa = int(input("Opção:"))

        Pesquisa_e_Registro(fisica_df,nome_fis,alternativa )
        fisica_df.to_excel('LivrosFisica.xlsx', encoding='utf',index=False)    
        print(fisica_df)
    
        
    elif categoria == 3:
        print(filosofia_df)
        nome_filo = input("Nome do livro:")
        print (filosofia_df[filosofia_df["Título"].str.contains(pat=nome_filo,case=False)])
        pesquisa (["Pesquisar Novamente", "Fazer registro"])
        alternativa = int(input("Opção:"))

        Pesquisa_e_Registro(filosofia_df,nome_filo,alternativa )
        filosofia_df.to_excel('LivrosFilosofia.xlsx', encoding='utf',index=False)    
        print(filosofia_df)
    
    elif categoria == 4:
        print(suspense_df)
        nome_sus = input("Nome do livro:")
        print (suspense_df[suspense_df["Título"].str.contains(pat=nome_sus,case=False)])
        pesquisa (["Pesquisar Novamente", "Fazer registro"])
        alternativa = int(input("Opção:"))

        Pesquisa_e_Registro(suspense_df,nome_sus,alternativa )
        suspense_df.to_excel('LivrosSuspense.xlsx', encoding='utf',index=False)    
        print(suspense_df)
    
    elif categoria == 5:
        print(romance_df)
        nome_romance = input("Nome do livro:")
        print (romance_df[romance_df["Título"].str.contains(pat=nome_romance,case=False)])
        pesquisa (["Pesquisar Novamente", "Fazer registro"])
        alternativa = int(input("Opção:"))

        Pesquisa_e_Registro(romance_df,nome_romance,alternativa )
        romance_df.to_excel('LivrosRomance.xlsx', encoding='utf',index=False)    
        print(romance_df)
#------------------------------------------------------------RESERVAS--------------------------------------------------------      
    
elif opcao == 2:
    
    reservas (["Fazer Reserva","Visualizar Reservas"])
    reserva = int(input("Opção:"))
    reserva_df = pd.read_excel ("reserva.xlsx")
    
    if reserva == 1:
        aluno = input("Nome do aluno:")
        if aluno in reserva_df.values:
            print ("Não pode fazer a reserva")
            
        else:
            titulo = input("Título do livro:")
            data = input("Dia da reserva:")
            reserva_df.loc[len(reserva_df)] = [aluno , titulo, data]
            reserva_df.to_excel('reserva.xlsx', encoding='utf',index=False)
            print(reserva_df)
     
    elif reserva == 2:
        print (reserva_df)
    
    

elif opcao == 3:
    print("Aparece o registro dos alunos")
    
elif opcao == 4:
    print("Aparece as entregas")

    
    
#-----------------------opcao para fazer a adicao de livros novos nas tabelas de cada categoria------------------------------
elif opcao == 5: 
    
    categorias (['Matemática', 'Física', 'Filosofia', 'Suspense', 'Romance'])
    categoria = int(input("Qual é a categoria desejada?"))

    if categoria == 1:
        matematica_df = pd.read_excel ("livrosMatematica.xlsx")
        titulo = input('Título:')
        autor = input('Autor: ')
        idioma = input('Idioma')
        qtd = int(input('Quantidade:'))
        matematica_df.loc[len(matematica_df)] = [titulo , autor,"Matemática", idioma, qtd]
        matematica_df.to_excel('livrosMatematica.xlsx', encoding='utf',index=False)
        print(matematica_df)
    
    elif categoria == 2:
        fisica_df = pd.read_excel ("livrosFisica.xlsx")
        titulo = input('Título:')
        autor = input('Autor: ')
        idioma = input('Idioma')
        qtd = int(input('Quantidade:'))
        fisica_df.loc[len(fisica_df)] = [titulo , autor,"Física", idioma, qtd]
        print(fisica_df)
        
    elif categoria == 3:
        filosofia_df = pd.read_excel ("livrosFilosofia.xlsx")
        titulo = input('Título:')
        autor = input('Autor: ')
        idioma = input('Idioma')
        qtd = int(input('Quantidade:'))
        filosofia_df.loc[len(filosofia_df)] = [titulo , autor,"Filosofia", idioma, qtd]
        print(filosofia_df)
        
    elif categoria == 4:
        suspense_df = pd.read_excel ("livrosSuspense.xlsx")
        titulo = input('Título:')
        autor = input('Autor: ')
        idioma = input('Idioma')
        qtd = int(input('Quantidade:'))
    
        suspense_df.loc[len(suspense_df)] = [titulo , autor,"Suspense", idioma, qtd]
        #adiciona no arquivo
        suspense_df.to_excel('livrosSuspense.xlsx', encoding='utf',index=False)
        #so mostra
        print(suspense_df)
    
    elif categoria == 5:
        romance_df = pd.read_excel ("livrosRomance.xlsx")
        titulo = input('Título:')
        autor = input('Autor: ')
        idioma = input('Idioma')
        qtd = int(input('Quantidade:'))
        romance_df.loc[len(romance_df)] = [titulo , autor,"Romance", idioma, qtd]
        print(romance_df)

    #ate aqui    
elif opcao == 6:
    print("Volta para a tela de login")
    
else:
    print("Resultado inválido")