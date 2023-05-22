/*1) Linguagens compiladas transcrevem o código fonte para um novo tipo de arquivo, caso não ocorra nenhum erro, o código irá "rodar", já na linguagem interpretada, 
trabalhamos com uma maquina virtual, onde essa maquina vai transcrever o código para o sistema operacional que esta sendo utilizado. 
A vantagem de uma linguagem interpretada é a criação de apenas um código onde irá rodar em qualquer OS, mas o código pode aparecer de forma "desconfigurada" em sistemas diferentes, 
já a linguagem compilada é diretamente ligada ao sistema operacional, o que também é sua desvantagem. 

2)
a)10fone$com: não podemos ter um numero como primeiro caractere de uma variável. 
b)nome*usuario: não podemos ter um operador matemático no nome da variável.
c)end*a-6:não podemos ter um operador matemático no nome da variável.
d)#media: a variável não pode começar com # apenas com _ ou $.
e)nome aluno: não devemos usar espaços em branco entre os nomes da variável.
f)média: não se deve utilizar acentos.*/

package Modulo02;

import java.util.Scanner;

public class QuestaoTres {

    public static Scanner Sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        
        
        float nota, soma = 0, media;
        System.out.println("Informe o nome do aluno:");
        String nome = Sc.nextLine();
        System.out.println("Informe o nome da disciplina:");
        String disciplina = Sc.nextLine();


        for (int i = 0; i < 4; i++) {
            System.out.printf("Informe o valor da %dº nota: \n", i+1);
            nota = Sc.nextFloat();
            soma += nota;
        }
        media = soma/4;

        System.out.println("O aluno: " + nome); 
        System.out.println("Na disciplina de: " + disciplina);
        System.out.println("e sua média é igual a: " + media);

    }
    
}
