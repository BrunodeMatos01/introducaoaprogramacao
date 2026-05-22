package ExerciciosUni5;

import java.util.Scanner;

public class Exercicio20 {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Massa inicial em Kg: ");
        double massaKg = sc.nextDouble();

        double massaInicialGramas = massaKg * 1000; 
        double massaAtual = massaInicialGramas;
        double tempo = 0;

        while (massaAtual >= 0.5) {
            massaAtual = massaAtual * 0.5;
            tempo = tempo + 50;
        }

        System.out.printf("Massa Inicial: %.2f Kg (%s gramas)\n", massaKg, massaInicialGramas);
        System.out.printf("Massa Final: %.4f gramas\n", massaAtual);
        System.out.println("Tempo Total: " + tempo + " segundos");

        sc.close();
    }
}
