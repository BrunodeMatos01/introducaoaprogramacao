package ExerciciosUni5;

import java.util.Scanner;

public class Exercicio25 {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pontosD = 0;
        int pontosE = 0;

        System.out.println("Partida de Pingue-Pongue");
        System.out.println("Digite D para ponto do lado Direito ou E para o lado Esquerdo.");

        while (true) {
            System.out.print("Quem marcou o ponto? (D/E): ");
            char ponto = sc.next().toUpperCase().charAt(0);

            if (ponto == 'D') {
                pontosD++;
            } else if (ponto == 'E') {
                pontosE++;
            } else {
                System.out.println("Código inválido! Digite apenas D ou E.");
                continue;
            }

            int diferenca = Math.abs(pontosD - pontosE);

            if ((pontosD >= 21 || pontosE >= 21) && diferenca >= 2) {
                break;
            }
        }

        System.out.println("\nFim de Jogo");
        if (pontosD > pontosE) {
            System.out.println("O jogador do lado DIREITO venceu a partida!");
        } else {
            System.out.println("O jogador do lado ESQUERDO venceu a partida!");
        }
        
        System.out.printf("Placar Final -> Direito: %d x Esquerdo: %d\n", pontosD, pontosE);

        sc.close();
    }
}