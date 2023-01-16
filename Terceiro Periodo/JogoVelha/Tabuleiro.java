package JogoVelha;

import java.util.Scanner;

public class Tabuleiro {

    public static Scanner Sc = new Scanner(System.in);

    public static int[] Inicializar(int matriz[]) {
        for (int i = 0; i < 9; i++) {
            matriz[i] = 0;
        }
        return matriz;
    }

    public static void MostrarMatriz(){
       /* int contador = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.printf(contador + " ");
                contador += 1;
            }
            System.out.println("");
        }*/

        Print.MostrarMatriz();
    }

    public static int[] Jogada(int posicao, int velha[], int jogador) {
        if (jogador % 2 != 0) {
            velha[posicao] = 1;
        } else {
            velha[posicao] = -1;
        }
        return velha;
    }

    public static int JogadaPossivel(int velha[], int posicao){
        while (velha[posicao] != 0) {
            System.out.println("posição já ocupada, digite outra: ");
            posicao = Print.posicaoInvalida(); }
            return posicao;
    }

    public static int JogadaValida(int posicao){
        while (posicao < 0 || posicao > 8) {
            System.out.printf("posição inválida, digite outra: ");
            posicao = Print.posicaoInvalida();
        } return posicao;
    }

    public static void MostrarTabuleiro(int velha[]) {
        /*for (int i = 0; i < 9; i++) {
            if (velha[i] == 1) {
                System.out.print(" X ");
            } else if (velha[i] == -1) {
                System.out.print(" O ");
            } else {
                System.out.print(" - ");
            }
            if(i != 2 && i != 5 && i != 8){
                System.out.print("|"); }
            if(i == 2 || i == 5 || i == 8){
            System.out.println(""); }
        }
        */
        Print.MostrarTabuleiro(velha);
    }

    public static int Vencedor(int velha[]) {
        int vencedor = 0;
        if (velha[0] == velha[1] && velha[1] == velha[2] && velha[0] != 0) {
            if (velha[0] == 1) {
                vencedor = 1;
            } else {
                vencedor = -1;
            }
        }

        if (velha[3] == velha[4] && velha[4] == velha[5] && velha[3] != 0) {
            if (velha[3] == 1) {
                vencedor = 1;
            } else {
                vencedor = -1;
            }
        }

        if (velha[6] == velha[7] && velha[7] == velha[8] && velha[6] != 0) {
            if (velha[6] == 1) {
                vencedor = 1;
            } else {
                vencedor = -1;
            }
        }

        if (velha[0] == velha[3] && velha[3] == velha[6] && velha[0] != 0) {
            if (velha[0] == 1) {
                vencedor = 1;
            } else {
                vencedor = -1;
            }
        }

        if (velha[1] == velha[4] && velha[4] == velha[7] && velha[1] != 0) {
            if (velha[1] == 1) {
                vencedor = 1;
            } else {
                vencedor = -1;
            }
        }

        if (velha[2] == velha[5] && velha[5] == velha[8] && velha[2] != 0) {
            if (velha[2] == 1) {
                vencedor = 1;
            } else {
                vencedor = -1;
            }
        }

        if (velha[0] == velha[4] && velha[4] == velha[8] && velha[0] != 0) {
            if (velha[0] == 1) {
                vencedor = 1;
            } else {
                vencedor = -1;
            }
        }

        if (velha[2] == velha[4] && velha[4] == velha[6] && velha[2] != 0) {
            if (velha[2] == 1) {
                vencedor = 1;
            } else {
                vencedor = -1;
            }
        }

        return vencedor;
    }

    public static void Venceu(int vencedor) {
        if (vencedor == 1) {
            //System.out.println("X ganhou. ");
            Print.xWin();
            Placar.SetJogador(Partida.jogador1);

        } else  if (vencedor == 2) {
            System.out.println("Deu Veia. ");
            Print.deuVeia();
        } 
        else { //System.out.println("Bola ganhou. ");
        Print.oWin();
        Placar.SetJogador(Partida.jogador1);

    }
    }
}