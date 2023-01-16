from projeto_kezia import Df
import pandas as pd

def linha(tam=104):
    return '-'*tam


def cabeçalho (txt):
    print (linha())
    print (txt.center(104))
    print (linha())

    
def menu(lista):
    #cabeçalho('MENU')
    c=1
    for item in lista:
        print(f'{c}-{item}')
        c +=1
    print (linha())



def alternativas(lista):
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
        alternativas (["Pesquisar Novamente", "Fazer registro"])
        num = int(input("Opção:"))
            
    if num == 2:
        registro_df = pd.read_excel ("registroofc.xlsx")
        aluno = input("Nome do Aluno:")
        titulo = input("Título do livro:")
        dia_registro = input("Dia do Registro:")
        dia_entrega = input ("Dia da Entrega:")
        dia_entregue = "-"
        registro_df.loc[len(registro_df)] = [aluno , titulo, dia_registro,dia_entrega, dia_entregue]
        registro_df.to_excel('registroofc.xlsx', encoding='utf',index=False)
        Df.loc[Df['Título'] == titulo, 'Quantidade'] = Df.loc[Df['Título'] == titulo, 'Quantidade']-1
        print ("Registro realizado com sucesso!")
        #display(registro_df)
        return Df

Df = None
    
#----------------------------------------------------------LOGIN-------------------------------------------------------------

arq = open('registrados.txt', 'a')
print('Crie um login')
nome_usuario = input('Digite o nome de usuário: ')
senha = input('Digite sua senha: ')


arq.write('{}\n'.format(nome_usuario))
arq.write('{}\n'.format(senha))

print('Cadastro realizado com sucesso!\n')
arq.close() 

arq = open('registrados.txt')
print('Efetue o seu login')
nome_login = input('Digite o seu nome de usuario: ')
senha = input('Insira sua senha: ')

registrados = arq.readlines()
if nome_login and senha + '\n' in registrados:
    print('Bem vindo ao sistema da biblioteca, {}!'.format(nome_login))
else:
    print('Você digitou seu nome de usuario errado, por favor digite novamente')
arq.close()
    
    
#------------------------------------------------------MENU------------------------------------------------------------------
cabeçalho('MENU')
menu (['Categorias', 'Reservas', 'Registro dos alunos', 'Entregas','Cadastrar livro', 'Sair'])
opcao = int(input("Opção:"))
    
#-------------------------------------------------- CATEGORIAS---------------------------------------------------------------

if opcao ==  1:
    
    cabeçalho('CATEGORIAS')
    menu (['Matemática', 'Física', 'Filosofia', 'Suspense', 'Romance'])
    categoria = int(input("Qual é a categoria desejada?"))
    
    
    if categoria == 1:
        matematica_df = pd.read_excel ("livrosMatematica.xlsx")
        print(matematica_df)
        nome_mat = input("Nome do livro:")
        print (matematica_df[matematica_df["Título"].str.contains(pat=nome_mat,case=False)])
        alternativas (["Pesquisar Novamente", "Fazer registro"])
        alternativa = int(input("Opção:"))
        
        Pesquisa_e_Registro(matematica_df,nome_mat,alternativa )
        matematica_df.to_excel('livrosMatematica.xlsx', encoding='utf',index=False)    
        #display(matematica_df)

    
    elif categoria == 2:
        fisica_df = pd.read_excel ("livrosFisica.xlsx")
        print(fisica_df)
        nome_fis = input("Nome do livro:")
        print (fisica_df[fisica_df["Título"].str.contains(pat=nome_fis,case=False)])
        alternativas (["Pesquisar Novamente", "Fazer registro"])
        alternativa = int(input("Opção:"))

        Pesquisa_e_Registro(fisica_df,nome_fis,alternativa )
        fisica_df.to_excel('livrosMatematica.xlsx', encoding='utf',index=False)    
        #print(fisica_df)
    
        
    elif categoria == 3:
        filosofia_df = pd.read_excel ("livrosFilosofia.xlsx")
        print(filosofia_df)
        nome_filo = input("Nome do livro:")
        print (filosofia_df[filosofia_df["Título"].str.contains(pat=nome_filo,case=False)])
        alternativas (["Pesquisar Novamente", "Fazer registro"])
        alternativa = int(input("Opção:"))

        Pesquisa_e_Registro(filosofia_df,nome_filo,alternativa )
        filosofia_df.to_excel('livrosMatematica.xlsx', encoding='utf',index=False)    
        #print(filosofia_df)
    
    elif categoria == 4:
        suspense_df = pd.read_excel ("livrosSuspense.xlsx")
        print(suspense_df)
        nome_sus = input("Nome do livro:")
        print (suspense_df[suspense_df["Título"].str.contains(pat=nome_sus,case=False)])
        alternativas (["Pesquisar Novamente", "Fazer registro"])
        alternativa = int(input("Opção:"))

        Pesquisa_e_Registro(suspense_df,nome_sus,alternativa )
        suspense_df.to_excel('livrosMatematica.xlsx', encoding='utf',index=False)    
        #print(suspense_df)
    
    elif categoria == 5:
        romance_df = pd.read_excel ("livrosRomance.xlsx")
        print(romance_df)
        nome_romance = input("Nome do livro:")
        print (romance_df[romance_df["Título"].str.contains(pat=nome_romance,case=False)])
        alternativas (["Pesquisar Novamente", "Fazer registro"])
        alternativa = int(input("Opção:"))

        Pesquisa_e_Registro(romance_df,nome_romance,alternativa )
        romance_df.to_excel('livrosMatematica.xlsx', encoding='utf',index=False)    
        #print(romance_df)
        
    
    
        
#------------------------------------------------------------RESERVAS--------------------------------------------------------      
    
elif opcao == 2:
    
    cabeçalho('RESERVAS')
    menu (["Fazer Reserva","Visualizar Reservas"])
    reserva = int(input("Opção:"))
    reserva_df = pd.read_excel ("reserva.xlsx")
    if reserva == 1:
        
        aluno = input("Nome do aluno:")
        titulo = input("Título do livro:")
        data = input("Dia da reserva:")
        reserva_df.loc[len(reserva_df)] = [aluno , titulo, data]
        reserva_df.to_excel('reserva.xlsx', encoding='utf',index=False)
        print(reserva_df)
     
    elif reserva == 2:
        print (reserva_df)
    
    

elif opcao == 3:
    print("Aparece o registro dos alunos")
    
#--------------------------------------------------------- ENTREGAS-----------------------------------------------------------
elif opcao == 4:
    
    registro_df = pd.read_excel ("registroofc.xlsx")
     #inserir a coluna
    #registro_df ['Dia Entregue'] 
    alternativas (["Adicionar dia que o livro foi entregue","Multas"])
    alternativa = int(input("Opção:"))
    
    if alternativa == 1:
        
        registro_df ['Dia do registro'] = pd.to_datetime(registro_df['Dia do registro'])
        registro_df ['Dia do registro'] = registro_df ['Dia do registro'].dt.strftime('%d/%m/%Y')
        registro_df ['Dia da entrega'] = pd.to_datetime(registro_df['Dia da entrega'])
        registro_df ['Dia da entrega'] = registro_df ['Dia da entrega'].dt.strftime('%d/%m/%Y')
        #registro2_df ['Dia Entregue'] = pd.to_datetime(registro2_df['Dia Entregue'])
        #registro2_df ['Dia Entregue'] = registro2_df ['Dia Entregue'].dt.strftime('%d/%m/%Y')
        
        
        print (registro_df)
        
        index = int(input("Index:"))
        dia_entregue = input("Dia entregue:")
        registro_df.iat [index,4] = dia_entregue 
        registro_df ['Dia entregue'] = pd.to_datetime(registro_df['Dia entregue'])
        registro_df ['Dia entregue'] = registro_df ['Dia entregue'].dt.strftime('%d/%m/%Y')
        
        
        registro_df.to_excel('registroofc.xlsx', encoding='utf',index=False)
        print (registro_df)
  
    
    

    
#-----------------------opcao para fazer a adicao de livros novos nas tabelas de cada categoria------------------------------
elif opcao == 5: 
    
    print (['Matemática', 'Física', 'Filosofia', 'Suspense', 'Romance'])
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