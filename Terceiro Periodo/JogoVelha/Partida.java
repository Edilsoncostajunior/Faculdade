package JogoVelha;

import java.util.Scanner;

public class Partida {

    public static Scanner Sc = new Scanner(System.in);
    public static Jogador jogador1;
    public static Jogador jogador2;

    public static void PartidaNormal() {
        int[] veia = new int[9];
        int vencedor, posicao, jogador = 1;
        int contador = 0;

        do {
            Tabuleiro.MostrarMatriz();
            posicao = Print.posiçãoJogada();

            posicao = Tabuleiro.JogadaValida(posicao);
            posicao = Tabuleiro.JogadaPossivel(veia, posicao);

            Tabuleiro.Jogada(posicao, veia, jogador);
            jogador += 1;
            Tabuleiro.MostrarTabuleiro(veia);

            vencedor = Tabuleiro.Vencedor(veia);
            contador += 1;

            if (vencedor == 0 && contador == 9) {
                vencedor = 2;
            }

        } while (vencedor == 0);

        Tabuleiro.Venceu(vencedor);
    }

    public static void PartidaComputadorFacil() {

        int[] veia = new int[9];
        int vencedor, posicao;
        int VezDoJogador, VezDoComputador, posicaoComputador;
        int contador = 0;

        jogador1 = new Jogador(Print.adicionarJogador());
        
        VezDoJogador = Print.vezJogador();

        while (VezDoJogador != 1 && VezDoJogador != 2) {
            
            Print.numeroInvalido();
            System.out.print("Digite 1 para jogar sendo X e 2 para jogar sendo O: ");
            VezDoJogador = Print.vezJogador();
        }

        if (VezDoJogador == 1) {
            VezDoComputador = 2;
        } else if (VezDoJogador == 2) {
            VezDoComputador = 1;
        } else {
            VezDoComputador = 2;
        }

        do {
            System.out.printf("Digite a posição da sua proxima jogada: ");
            Tabuleiro.MostrarMatriz();
            posicao = Print.posiçãoJogada();

            posicao = Tabuleiro.JogadaValida(posicao);
            posicao = Tabuleiro.JogadaPossivel(veia, posicao);

            Tabuleiro.Jogada(posicao, veia, VezDoJogador);
            vencedor = Tabuleiro.Vencedor(veia);
            Tabuleiro.MostrarTabuleiro(veia);

            contador += 1;
            if (contador == 5) {
                vencedor = 2;
            }

            if (vencedor == 0) {
                posicaoComputador = Computador.ComputadoraBurro(veia);
                Tabuleiro.Jogada(posicaoComputador, veia, VezDoComputador);
                System.out.println("jogada do compiuter: ");
                Print.jogCompiuter();
                Tabuleiro.MostrarTabuleiro(veia);
            }

            vencedor = Tabuleiro.Vencedor(veia);
            if (contador == 5 && vencedor == 0) {
                vencedor = 2;
            }

        } while (vencedor == 0);

        Tabuleiro.Venceu(vencedor);
    }

    public static void PartidaComputadorMedio() {
        int[] veia = new int[9];
        int vencedor, posicao;
        int VezDoJogador, VezDoComputador, posicaoComputador;
        int contador = 0;

        jogador1 = new Jogador(Print.adicionarJogador());
        System.out.print("Digite 1 para jogar sendo X e 2 para jogar sendo O: ");
        VezDoJogador = Print.vezJogador();

        while (VezDoJogador != 1 && VezDoJogador != 2) {
            System.out.println("Por favor digite um numero valido.");
            System.out.print("Digite 1 para jogar sendo X e 2 para jogar sendo O: ");
            Print.numeroInvalido();
            VezDoJogador = Print.vezJogador();
        }

        if (VezDoJogador == 1) {
            VezDoComputador = 2;
        } else if (VezDoJogador == 2) {
            VezDoComputador = 1;
        } else {
            VezDoComputador = 2;
        }

        do {
            System.out.println("Digite a posição da sua proxima jogada: ");
            Tabuleiro.MostrarMatriz();
            //Tabuleiro.MostrarMatriz();
            posicao = Print.posiçãoJogada();

            posicao = Tabuleiro.JogadaValida(posicao);
            posicao = Tabuleiro.JogadaPossivel(veia, posicao);

            Tabuleiro.Jogada(posicao, veia, VezDoJogador);
            vencedor = Tabuleiro.Vencedor(veia);
            Tabuleiro.MostrarTabuleiro(veia);

            contador += 1;
            if (contador == 5) {
                vencedor = 2;
            }

            if (vencedor == 0) {
                posicaoComputador = Computador.ComputadorMedio(veia, contador, VezDoJogador);
                Tabuleiro.Jogada(posicaoComputador, veia, VezDoComputador);
                System.out.println("jogada do compiuter: ");
                Print.jogCompiuter();
                Tabuleiro.MostrarTabuleiro(veia);
            }

            vencedor = Tabuleiro.Vencedor(veia);
            if (contador == 5 && vencedor == 0) {
                vencedor = 2;
            }

        } while (vencedor == 0);

        Tabuleiro.Venceu(vencedor);
    }

}