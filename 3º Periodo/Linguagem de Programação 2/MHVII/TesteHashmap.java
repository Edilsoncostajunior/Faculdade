package MHVII;

import java.util.HashMap;
import java.util.Scanner;

public class TesteHashmap {
    
    private static Scanner Sc = new Scanner(System.in);
    private static int op;
    private static HashMap< Integer ,String> listaCompras = new HashMap<>();

    public static void main(String[] args) {

        do {
            menu();
            switch (op) {
                case 1:addCompra();
                    break;
            
                case 2:mostrarLista();
                break;
                
                case 3:pesquisarItem();
                break;
                
                case 4:excluirItem();
                break;

                default:
                    break;
            }
        } while (op != 0);
    }
    
    private static void menu(){
        System.out.println("---------------------------------------");
        System.out.println("Escolha uma das opções");
        System.out.println("1 - Adicionar item.");
        System.out.println("2 - Ver lista.");
        System.out.println("3 - Pesquisar Item na lista.");
        System.out.println("4 - Excluir item da lista.");

        System.out.println("digite 0 para sair.");
        System.out.println("---------------------------------------");

        op = Sc.nextInt();
    }
    private static void addCompra(){
        System.out.println("Infome o nome do objeto:");
        String nome = Sc.next();
        System.out.println("Infome a numeração/Id do objeto:");
        int id = Sc.nextInt();
        listaCompras.put(id, nome);
    }

    private static void mostrarLista(){
        System.out.println("------------lista------------");
        System.out.println(listaCompras.values());

    }
    private static void pesquisarItem(){
        System.out.println("informe a numeração/Id que deseja pesquisar"); 
                int item = Sc.nextInt();
                if (listaCompras.containsKey(item) == true) {
                    System.out.println("item na lista.");
                }else{
                    System.out.println("Este item não esta na lista.");
                }
    }
    private static void excluirItem(){
        mostrarLista();
        System.out.println("Informe a numeração/Id do Item a ser excluido.");
        int item = Sc.nextInt();
        listaCompras.remove(item);
        System.out.println("Item removido com sucesso.");
    }
}
