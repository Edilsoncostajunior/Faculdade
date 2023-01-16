package JogoVelha;

import java.util.Scanner;

public class MainVelha {

    public static Scanner Sc = new Scanner(System.in);
    private static int op;

    public static void main(String[] args) {

        do {
            menu();
            switch (op) {
                case 1:Partida.PartidaNormal();
                    break;
                case 2:Partida.PartidaComputadorFacil();
                    break;
                case 3:Partida.PartidaComputadorMedio();
                    break;

                case 5:Placar.mostrarJogadores();;
                    break;
                default:
                    break;
            }
        } while (op != 0);
    }


    private static void menu(){
        op = Print.showMenu();
    }
}