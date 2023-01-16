package JogoVelha;

import java.util.Random;

public class Computador {

    public static int ComputadoraBurro(int veia[]) {
        Random random = new Random();
        int posicao;
        int numero = random.nextInt(8);

        while (veia[numero] != 0) {
            numero = random.nextInt(8);
        }
        posicao = numero;

        return posicao;
    }

    public static int ComputadorMedio(int veia[], int rodada, int Vez) {
        Random random = new Random();
        int posicao = -1;
        int vez;
        int[][] auxiliar = new int[3][3];
        int numero = random.nextInt(8);

        auxiliar = Vetormatriz(veia);

        if (rodada == 1) {
            if (veia[4] != 0) {
                posicao = 0; // pode ser 0,2,6,8.
            }

            if (veia[0] != 0 || veia[2] != 0 || veia[6] != 0 || veia[8] != 0) {
                posicao = 4; // unica possivel
            }

            if (veia[1] != 0 || veia[3] != 0 || veia[5] != 0 || veia[7] != 0) {
                posicao = 4; // pode ser 0,2,4,6,8.
            }
        }

        if (rodada >= 2) {

            if (Vez == 1) {
                vez = 1;
            } else if (Vez == 2) {
                vez = -1;
            } else {
                vez = -1;
            }

            if (posicao == -1) {
                posicao = VerificaLinhas(auxiliar, veia, Vez);
            }
            if (posicao == -1) {
                posicao = VerificaColunas(auxiliar, veia, Vez);
            }
            if (posicao == -1) {
                posicao = VerificaDiagonais(veia, vez);
            }

        }
        if (posicao == -1) {
            while (veia[numero] != 0) {
                numero = random.nextInt(8);
            }
            posicao = numero;
        }
        return posicao;
    }

    public static int[] MatrizVetor(int matriz[][]) {
        int[] vetor = new int[9];
        int contador = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                vetor[contador] = matriz[i][j];
                contador += 1;
            }
        }

        return vetor;
    }

    public static int[][] Vetormatriz(int vetor[]) {
        int[][] matriz = new int[3][3];
        int contador = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = vetor[contador];
                contador += 1;
            }
        }

        return matriz;
    }

    public static int ComparaVetor(int vetor[], int vetor2[]) {
        int diferenca = -1;

        for (int i = 0; i < 9; i++) {
            if (vetor[i] != vetor2[i]) {
                diferenca = i;
            }
        }

        return diferenca;
    }

    public static int VerificaLinhas(int auxiliar[][], int veia[], int Vez) {
        int[] auxiliar2 = new int[9];
        int posicao = -1;
        int vez, vezComputador;
        int linha1 = 0, linha2 = 0, linha3 = 0;

        if (Vez == 1) {
            vez = 1;
            vezComputador = -1;
        } else if (Vez == 2) {
            vez = -1;
            vezComputador = 1;
        } else {
            vez = -1;
            vezComputador = 1;
        }

        for (int i = 0; i < 3; i++) {

            // ---------------------------------------LINHAS---------------------------------------
            // Olhando se na linha 1 ha chances de perder
            if (auxiliar[0][i] == vez) {
                linha1 += 1;
            }
            if (linha1 == 2) {
                for (int j = 0; j < 3; j++) {
                    if (auxiliar[0][j] == 0) {
                        auxiliar[0][j] = vezComputador;
                    }
                }
            }

            // Olhando se na linha 2 ha chances de perder
            if (auxiliar[1][i] == vez) {
                linha2 += 1;
            }
            if (linha2 == 2) {
                for (int j = 0; j < 3; j++) {
                    if (auxiliar[1][j] == 0) {
                        auxiliar[1][j] = vezComputador;
                    }
                }
            }

            // Olhando se na linha 3 ha chances de perder
            if (auxiliar[2][i] == vez) {
                linha3 += 1;
            }
            if (linha3 == 2) {
                for (int j = 0; j < 3; j++) {
                    if (auxiliar[2][j] == 0) {
                        auxiliar[2][j] = vezComputador;
                    }
                }
            }

        }

        auxiliar2 = MatrizVetor(auxiliar);
        posicao = ComparaVetor(veia, auxiliar2);
        return posicao;
    }

    public static int VerificaColunas(int auxiliar[][], int veia[], int Vez) {
        int[] auxiliar2 = new int[9];
        int posicao = -1;
        int vez, vezComputador;
        int coluna1 = 0, coluna2 = 0, coluna3 = 0;

        if (Vez == 1) {
            vez = 1;
            vezComputador = -1;
        } else if (Vez == 2) {
            vez = -1;
            vezComputador = 1;
        } else {
            vez = -1;
            vezComputador = 1;
        }

        for (int i = 0; i < 3; i++) {

            // ---------------------------------------COLUNAS---------------------------------------
            // Olhando se na coluna 1 ha chances de perder
            if (auxiliar[i][0] == vez) {
                coluna1 += 1;
            }
            if (coluna1 == 2) {
                for (int j = 0; j < 3; j++) {
                    if (auxiliar[j][0] == 0) {
                        auxiliar[j][0] = vezComputador;
                    }
                }
            }

            // Olhando se na coluna 2 ha chances de perder
            if (auxiliar[i][1] == vez) {
                coluna2 += 1;
            }
            if (coluna2 == 2) {
                for (int j = 0; j < 3; j++) {
                    if (auxiliar[j][1] == 0) {
                        auxiliar[j][1] = vezComputador;
                    }
                }
            }

            // Olhando se na coluna 3 ha chances de perder
            if (auxiliar[i][2] == vez) {
                coluna3 += 1;
            }
            if (coluna3 == 2) {
                for (int j = 0; j < 3; j++) {
                    if (auxiliar[j][2] == 0) {
                        auxiliar[j][2] = vezComputador;
                    }
                }
            }
        }

        auxiliar2 = MatrizVetor(auxiliar);
        posicao = ComparaVetor(veia, auxiliar2);
        return posicao;
    }

    public static int VerificaDiagonais(int veia[], int vez) {
        int posicao = -1;

        if (veia[0] == veia[4] || veia[4] == veia[8] || veia[0] == veia[8]) {
            if (veia[0] == vez || veia[4] == vez || veia[8] == vez) {
                if (veia[0] == 0) {
                    posicao = 0;
                } else if (veia[4] == 0) {
                    posicao = 4;
                } else if (veia[8] == 0) {
                    posicao = 8;
                }
            }
        }
        if (veia[2] == veia[4] || veia[4] == veia[6] || veia[2] == veia[6]) {
            if (veia[2] == vez || veia[4] == vez || veia[6] == vez) {
                if (veia[2] == 0) {
                    posicao = 2;
                } else if (veia[4] == 0) {
                    posicao = 4;
                } else if (veia[6] == 0) {
                    posicao = 6;
                }
            }
        }
        return posicao;
    }

}
