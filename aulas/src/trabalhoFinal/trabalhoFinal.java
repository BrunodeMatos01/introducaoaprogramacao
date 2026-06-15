import java.util.Scanner;
import java.util.Random;

public class trabalhoFinal {

    public trabalhoFinal() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        char[][] tabuleiro = new char[6][7];
        char jogarNovamente = 'S';

        System.out.println("=================================");
        System.out.println("          JOGO LIGA-4");
        System.out.println("=================================");

        do {
            iniciarTabuleiro(tabuleiro);
            jogarPartida(tabuleiro, sc, random);

            System.out.println();
            System.out.println("Deseja jogar novamente?");
            System.out.println("Digite S para sim ou N para nao");
            jogarNovamente = sc.next().toUpperCase().charAt(0);

            while (jogarNovamente != 'S' && jogarNovamente != 'N') {
                System.out.println("Opcao invalida");
                System.out.println("Digite S para sim ou N para nao");
                jogarNovamente = sc.next().toUpperCase().charAt(0);
            }
        } while (jogarNovamente == 'S');

        System.out.println("Programa encerrado");
        sc.close();
    }

    public void iniciarTabuleiro(char[][] tabuleiro) {
        for (int linha = 0; linha < 6; linha++) {
            for (int coluna = 0; coluna < 7; coluna++) {
                tabuleiro[linha][coluna] = 'B';
            }
        }
    }

    public void jogarPartida(char[][] tabuleiro, Scanner sc, Random random) {
        char corJogador = escolherCorJogador(sc);
        char corRobo = definirCorRobo(corJogador);
        boolean terminou = false;
        boolean vitoriaJogador = false;
        boolean vitoriaRobo = false;
        boolean empate = false;

        System.out.println();
        System.out.println("Voce vai jogar com a cor " + corJogador);
        System.out.println("O robo vai jogar com a cor " + corRobo);

        while (terminou == false) {
            int linhaJogador = jogarPessoa(tabuleiro, sc, corJogador);

            if (verificarVitoria(tabuleiro, corJogador) == true) {
                vitoriaJogador = true;
                terminou = true;
            } else {
                if (tabuleiroCompleto(tabuleiro) == true) {
                    empate = true;
                    terminou = true;
                }
            }

            if (terminou == false) {
                int colunaRobo = jogarRobo(tabuleiro, random, corRobo);

                System.out.println();
                System.out.println("O robo jogou na coluna " + colunaRobo);
                System.out.println("Agora e a sua vez de jogar");

                if (verificarVitoria(tabuleiro, corRobo) == true) {
                    vitoriaRobo = true;
                    terminou = true;
                } else {
                    if (tabuleiroCompleto(tabuleiro) == true) {
                        empate = true;
                        terminou = true;
                    }
                }
            }
        }

        System.out.println();
        System.out.println("=================================");
        System.out.println("            FIM DE JOGO");
        System.out.println("=================================");

        if (vitoriaJogador == true) {
            System.out.println("Voce venceu!");
        } else {
            if (vitoriaRobo == true) {
                System.out.println("O robo venceu!");
            } else {
                if (empate == true) {
                    System.out.println("EMPATE");
                }
            }
        }

        imprimirTabuleiro(tabuleiro);
    }

    public char escolherCorJogador(Scanner sc) {
        char cor = 'B';

        do {
            System.out.println();
            System.out.println("Escolha sua cor");
            System.out.println("V - Vermelho");
            System.out.println("A - Azul");
            cor = sc.next().toUpperCase().charAt(0);

            if (cor != 'V' && cor != 'A') {
                System.out.println("Cor invalida");
            }
        } while (cor != 'V' && cor != 'A');

        return cor;
    }

    public char definirCorRobo(char corJogador) {
        char corRobo = 'B';

        if (corJogador == 'V') {
            corRobo = 'A';
        } else {
            corRobo = 'V';
        }

        return corRobo;
    }

    public int jogarPessoa(char[][] tabuleiro, Scanner sc, char corJogador) {
        int opcao = 0;
        int coluna = 0;
        int linha = -1;
        boolean jogou = false;

        while (jogou == false) {
            System.out.println();
            System.out.println("Menu");
            System.out.println("1 - Jogar");
            System.out.println("2 - Imprimir tabuleiro");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe a coluna para jogar de 0 ate 6");
                    coluna = sc.nextInt();

                    while (coluna < 0 || coluna > 6) {
                        System.out.println("Coluna invalida");
                        System.out.println("Informe a coluna para jogar de 0 ate 6");
                        coluna = sc.nextInt();
                    }

                    while (colunaCheia(tabuleiro, coluna) == true) {
                        System.out.println("Essa coluna esta cheia");
                        System.out.println("Informe outra coluna para jogar de 0 ate 6");
                        coluna = sc.nextInt();

                        while (coluna < 0 || coluna > 6) {
                            System.out.println("Coluna invalida");
                            System.out.println("Informe a coluna para jogar de 0 ate 6");
                            coluna = sc.nextInt();
                        }
                    }

                    linha = colocarFicha(tabuleiro, coluna, corJogador);
                    jogou = true;
                    break;
                case 2:
                    imprimirTabuleiro(tabuleiro);
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        }

        return linha;
    }

    public int jogarRobo(char[][] tabuleiro, Random random, char corRobo) {
        int coluna = 0;
        int linha = -1;
        boolean jogou = false;

        while (jogou == false) {
            coluna = random.nextInt(7);

            if (colunaCheia(tabuleiro, coluna) == false) {
                linha = colocarFicha(tabuleiro, coluna, corRobo);
                jogou = true;
            }
        }

        return coluna;
    }

    public int colocarFicha(char[][] tabuleiro, int coluna, char cor) {
        int linhaEncontrada = -1;

        for (int linha = 5; linha >= 0; linha--) {
            if (tabuleiro[linha][coluna] == 'B' && linhaEncontrada == -1) {
                tabuleiro[linha][coluna] = cor;
                linhaEncontrada = linha;
            }
        }

        return linhaEncontrada;
    }

    public boolean colunaCheia(char[][] tabuleiro, int coluna) {
        boolean cheia = false;

        if (tabuleiro[0][coluna] != 'B') {
            cheia = true;
        }

        return cheia;
    }

    public boolean tabuleiroCompleto(char[][] tabuleiro) {
        boolean completo = true;

        for (int linha = 0; linha < 6; linha++) {
            for (int coluna = 0; coluna < 7; coluna++) {
                if (tabuleiro[linha][coluna] == 'B') {
                    completo = false;
                }
            }
        }

        return completo;
    }

    public void imprimirTabuleiro(char[][] tabuleiro) {
        System.out.println();
        System.out.println("     0   1   2   3   4   5   6");
        System.out.println("   -----------------------------");

        for (int linha = 0; linha < 6; linha++) {
            System.out.print(" " + linha + " | ");

            for (int coluna = 0; coluna < 7; coluna++) {
                System.out.print(tabuleiro[linha][coluna] + " | ");
            }

            System.out.println();
            System.out.println("   -----------------------------");
        }
    }

    public boolean verificarVitoria(char[][] tabuleiro, char cor) {
        boolean venceu = false;

        for (int linha = 0; linha < 6; linha++) {
            for (int coluna = 0; coluna < 7; coluna++) {
                if (tabuleiro[linha][coluna] == cor) {
                    if (verificarDireita(tabuleiro, linha, coluna, cor) == true) {
                        venceu = true;
                    }

                    if (verificarEsquerda(tabuleiro, linha, coluna, cor) == true) {
                        venceu = true;
                    }

                    if (verificarBaixo(tabuleiro, linha, coluna, cor) == true) {
                        venceu = true;
                    }

                    if (verificarCima(tabuleiro, linha, coluna, cor) == true) {
                        venceu = true;
                    }

                    if (verificarDiagonalSuperiorEsquerda(tabuleiro, linha, coluna, cor) == true) {
                        venceu = true;
                    }

                    if (verificarDiagonalSuperiorDireita(tabuleiro, linha, coluna, cor) == true) {
                        venceu = true;
                    }

                    if (verificarDiagonalInferiorEsquerda(tabuleiro, linha, coluna, cor) == true) {
                        venceu = true;
                    }

                    if (verificarDiagonalInferiorDireita(tabuleiro, linha, coluna, cor) == true) {
                        venceu = true;
                    }
                }
            }
        }

        return venceu;
    }

    public boolean verificarDireita(char[][] tabuleiro, int linha, int coluna, char cor) {
        boolean venceu = false;

        if (coluna <= 3) {
            if (tabuleiro[linha][coluna] == cor && tabuleiro[linha][coluna + 1] == cor && tabuleiro[linha][coluna + 2] == cor && tabuleiro[linha][coluna + 3] == cor) {
                venceu = true;
            }
        }

        return venceu;
    }

    public boolean verificarEsquerda(char[][] tabuleiro, int linha, int coluna, char cor) {
        boolean venceu = false;

        if (coluna >= 3) {
            if (tabuleiro[linha][coluna] == cor && tabuleiro[linha][coluna - 1] == cor && tabuleiro[linha][coluna - 2] == cor && tabuleiro[linha][coluna - 3] == cor) {
                venceu = true;
            }
        }

        return venceu;
    }

    public boolean verificarBaixo(char[][] tabuleiro, int linha, int coluna, char cor) {
        boolean venceu = false;

        if (linha <= 2) {
            if (tabuleiro[linha][coluna] == cor && tabuleiro[linha + 1][coluna] == cor && tabuleiro[linha + 2][coluna] == cor && tabuleiro[linha + 3][coluna] == cor) {
                venceu = true;
            }
        }

        return venceu;
    }

    public boolean verificarCima(char[][] tabuleiro, int linha, int coluna, char cor) {
        boolean venceu = false;

        if (linha >= 3) {
            if (tabuleiro[linha][coluna] == cor && tabuleiro[linha - 1][coluna] == cor && tabuleiro[linha - 2][coluna] == cor && tabuleiro[linha - 3][coluna] == cor) {
                venceu = true;
            }
        }

        return venceu;
    }

    public boolean verificarDiagonalSuperiorEsquerda(char[][] tabuleiro, int linha, int coluna, char cor) {
        boolean venceu = false;

        if (linha >= 3 && coluna >= 3) {
            if (tabuleiro[linha][coluna] == cor && tabuleiro[linha - 1][coluna - 1] == cor && tabuleiro[linha - 2][coluna - 2] == cor && tabuleiro[linha - 3][coluna - 3] == cor) {
                venceu = true;
            }
        }

        return venceu;
    }

    public boolean verificarDiagonalSuperiorDireita(char[][] tabuleiro, int linha, int coluna, char cor) {
        boolean venceu = false;

        if (linha >= 3 && coluna <= 3) {
            if (tabuleiro[linha][coluna] == cor && tabuleiro[linha - 1][coluna + 1] == cor && tabuleiro[linha - 2][coluna + 2] == cor && tabuleiro[linha - 3][coluna + 3] == cor) {
                venceu = true;
            }
        }

        return venceu;
    }

    public boolean verificarDiagonalInferiorEsquerda(char[][] tabuleiro, int linha, int coluna, char cor) {
        boolean venceu = false;

        if (linha <= 2 && coluna >= 3) {
            if (tabuleiro[linha][coluna] == cor && tabuleiro[linha + 1][coluna - 1] == cor && tabuleiro[linha + 2][coluna - 2] == cor && tabuleiro[linha + 3][coluna - 3] == cor) {
                venceu = true;
            }
        }

        return venceu;
    }

    public boolean verificarDiagonalInferiorDireita(char[][] tabuleiro, int linha, int coluna, char cor) {
        boolean venceu = false;

        if (linha <= 2 && coluna <= 3) {
            if (tabuleiro[linha][coluna] == cor && tabuleiro[linha + 1][coluna + 1] == cor && tabuleiro[linha + 2][coluna + 2] == cor && tabuleiro[linha + 3][coluna + 3] == cor) {
                venceu = true;
            }
        }

        return venceu;
    }

    public static void main(String[] args) {
        new trabalhoFinal();
    }
}
