package matriz;

import java.util.Random;

public class matrizBidimensional {

    public static void main(String[] args) {

        char vetor[][] = new char[3][3];
        Random random = new Random();
        int linhaC = random.nextInt(3);
        int colunaC = random.nextInt(3);
        vetor[0][0] = 'X';
        vetor[0][1] = 'O';
        vetor[0][2] = 'O';
        vetor[1][0] = 'X';
        vetor[1][1] = 'O';
        vetor[1][2] = 'O';
        vetor[2][0] = 'X';
        vetor[2][1] = 'O';
        vetor[2][2] = 'O';

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print(vetor[linha][coluna] + " ");
            }
            System.out.println();
        }
    }
}
