package MHVII;

import java.util.HashSet;
import java.util.Scanner;

public class TesteHashSet {

    private static Scanner Sc = new Scanner(System.in);
    private static int op;
    private static HashSet<String> listaCompras = new HashSet<>();

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
        listaCompras.add(nome);
    }

    private static void mostrarLista(){
        int i = 0 ;
        System.out.println("------------lista------------");
        for (Object lista : listaCompras) {
            System.out.println(i + "-" + lista);
            i++;
        }
    }
    private static void pesquisarItem(){
        System.out.println("informe o item que deseja pesquisar"); 
                String item = Sc.next();
                if (listaCompras.contains(item) == true) {
                    System.out.println("item na lista.");
                }else{
                    System.out.println("Este item não esta na lista.");
                }
    }
    private static void excluirItem(){
        mostrarLista();
        System.out.println("Que item deseja exlcuir?");
        String item = Sc.next();
        listaCompras.remove(item);
        System.out.println("Item removido com sucesso.");
    }
    
}
