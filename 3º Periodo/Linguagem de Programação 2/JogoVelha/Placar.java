package JogoVelha;

import java.util.ArrayList;
import java.util.Scanner;

public class Placar {
    private static Scanner Sc = new Scanner(System.in);
    private static ArrayList<Jogador> listaJogadores = new ArrayList<>();
    private static Jogador player;

    public static Jogador addJogador() {
        String nome = Print.adicionarJogador();
        player = new Jogador(nome.toUpperCase());
        player = pesquisarJogador(player);

        listaJogadores.add(player);
        return player;
    }

    public static void mostrarJogadores() {
        for (Jogador jogador : listaJogadores) {
            if (jogador.getPontuação() != 0) {
                System.out.println(jogador);
            } else if (jogador.getPontuação() == 0) {
                jogador = null;
            } else if (listaJogadores.contains(null) == true) {
                listaJogadores.removeAll(null);
            }
        }

    }

    public static Jogador pesquisarJogador(Jogador pJogador) {
        for (Jogador jogador : listaJogadores) {
            if (jogador.getNome().equals(pJogador.getNome()) == true) {
                System.out.println("esse jogador ja existe, digite 1 para continuar jogando com ele, e 2 para adicionar outro jogador.");
                int op = Sc.nextInt();

                while (op != 1 && op != 2) {
                    System.out.println("valor invalido, digite 1 ou 2:");
                    op = Sc.nextInt();
                }

                

                if (op == 1) {
                    int i = listaJogadores.indexOf(jogador);
                    pJogador = listaJogadores.set(i, pJogador);
                } else if (op == 2 ) {
                    return pJogador;
                } 
              
                
            }

        }
        return pJogador;

    }

    public static void SetJogador(Jogador player) {
        player.setPontuação(player.getPontuação() + 1);
    }
}
