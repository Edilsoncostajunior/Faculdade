package JogoVelha;

import javax.swing.JOptionPane;

public class Print {

    public static String adicionarJogador() {
        String nome = JOptionPane.showInputDialog(null, "Infome seu nome:");
        return nome;
    }

    public static int showMenu() {
        int op =  Integer.parseInt( JOptionPane.showInputDialog(null, "---------------------------------------\n" + "Escolha uma das opções\n"
                + "1 - Jogar e passar.\n" + "2 - Jogar contra computador: Nível Fácil.\n"
                + "3 - Jogar contra computador: Nível Balanceado.\n" + "4 - Fazer logout.\n"
                + "5 - Mostrar pontuação.\n" + "0 - Sair do Jogo.\n" + "---------------------------------------\n"));
        return op;
    }

    public static void MostrarMatriz(){
        String resultado = "";
        int contador = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                resultado += contador + " ";
                contador += 1;
            }
            resultado += "\n";
        }
        JOptionPane.showMessageDialog(null , resultado);

    }

    public static void MostrarTabuleiro(int velha[]) {
        String resultado = "";
        for (int i = 0; i < 9; i++) {
            if (velha[i] == 1) {
                resultado += " X";
            } else if (velha[i] == -1) {
                resultado += " O";
            } else {
               resultado += " - ";
            }
            if(i != 2 && i != 5 && i != 8){
                resultado += "|";

             }
            if(i == 2 || i == 5 || i == 8){
                resultado += "\n";
             }
        }
        JOptionPane.showMessageDialog(null ,resultado);
    }

    public static int posiçãoJogada(){
        int posicao = Integer.parseInt(JOptionPane.showInputDialog(null, "informe a posição:"));
        return posicao;
    }

    public static int vezJogador(){
        int vezJogador = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 1 para jogar sendo X e 2 para jogar sendo O: "));
        return vezJogador;
    }
    public static void numeroInvalido(){
        JOptionPane.showMessageDialog(null, "Por favor digite um numero valido.");
    }
    public static int posicaoInvalida(){
        int posicao = Integer.parseInt(JOptionPane.showInputDialog(null, "posição inválida, digite outra:"));
        return posicao;
    }
    public static void xWin() {
        JOptionPane.showMessageDialog(null, "X ganhou!!");
    }
    public static void oWin() {
        JOptionPane.showMessageDialog(null, "O ganhou!!");
    }
    public static void deuVeia() {
        JOptionPane.showMessageDialog(null, "DEU VEIA!!!");
    }
    public static void jogCompiuter() {
        JOptionPane.showMessageDialog(null, "jogada do compiuter:");
    }
}
