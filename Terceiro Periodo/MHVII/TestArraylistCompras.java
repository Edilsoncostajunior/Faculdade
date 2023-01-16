package MHVII;

import java.util.ArrayList;
import java.util.Scanner;

public class TestArraylistCompras {
    private static int op;
    public static Scanner Sc = new Scanner(System.in);
    public static ArrayList<Itens> listaCompras = new ArrayList<Itens>();
    private static Itens item;

    public static void main(String[] args) {
        do {
            menu();
            switch (op) {
                case 1:
                    addCompra();
                    break;
            
                case 2:
                    mostrarLista();
                break;

                default:
                    break;
            }
        } while (op != 0);
        
    }

    private static void menu(){
        System.out.println("Escolha uma das opções");
        System.out.println("1 - Adicionar item.");
        System.out.println("2 - Ver lista.");
        System.out.println("digite 0 para sair.");

        op = Sc.nextInt();
    }
    private static void addCompra(){
        System.out.println("Infome o nome do objeto:");
        String nome = Sc.next();
        System.out.println("Infome o preço do objeto:");
        float preco = Sc.nextFloat();
        item = new Itens(nome, preco);
        listaCompras.add(item);
    }

    private static void mostrarLista(){
        for (Object lista : listaCompras) {
            System.out.println(lista);
        }
    }
}
