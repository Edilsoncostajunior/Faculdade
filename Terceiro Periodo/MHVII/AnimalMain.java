package MHVII;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalMain {
    public static Scanner Sc = new Scanner(System.in);
    private static ArrayList<Animal> listaAnimal = new ArrayList<Animal>();
    private static int op;
    private static Animal animal;

    public static void main(String[] args) {
        do {
            menu();
            switch (op) {
                case 1:
                    addAnimal();
                    break;

                case 2:
                    mostrarAnimais();
                    break;

                default:
                    break;
            }
        } while (op != 0);
    }

    private static void menu() {
        System.out.println("Escolha uma das opções");
        System.out.println("1 - Cadastrar Animal.");
        System.out.println("2 - Ver Animais Cadastrados.");
        System.out.println("digite 0 para sair.");

        op = Sc.nextInt();
    }

    private static void addAnimal() {
        System.out.println("Infome o nome do animal:");
        String nome = Sc.next();
        System.out.println("informe o tipo do animal:");
        String tipo = Sc.next();
        System.out.println("caso o animal tenha patas, informe a quantidade:");
        int qntPatas = Sc.nextInt();
        animal = new Animal(nome, tipo, qntPatas);
        listaAnimal.add(animal);
    }

    private static void mostrarAnimais() {
        for (Animal animal : listaAnimal) {
            System.out.println(animal);
        }
    }
}
