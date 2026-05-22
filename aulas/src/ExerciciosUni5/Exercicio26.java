package ExerciciosUni5;

import java.util.Scanner;

public class Exercicio26 {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor máximo de pedágio que Astolfo aceita pagar: R$ ");
        double limitePedagio = sc.nextDouble();

        int trechosNegados = 0;
        int totalTrechos = 0;
        int trechosAceitosLongos = 0;

        System.out.println("\n--- Informe os dados dos trechos (ou digite um pedágio negativo para sair) ---");

        while (true) {
            System.out.print("Custo do pedágio: R$ ");
            double pedagio = sc.nextDouble();

            if (pedagio < 0) {
                break;
            }

            System.out.print("Distância do trecho (em Km): ");
            double distancia = sc.nextDouble();

            totalTrechos++;

            if (pedagio > limitePedagio) {
                trechosNegados++;
            }

            if (distancia > 150 && pedagio <= limitePedagio) {
                trechosAceitosLongos++;
            }
            
            System.out.println("--------------------------------");
        }

        System.out.println("\nResumo da Viagem");
        System.out.println(trechosNegados + " (trechos com valor acima do qual ele nega-se a pagar);");
        System.out.println(totalTrechos + " (quantidade de trechos informados);");
        System.out.println(trechosAceitosLongos + " (trechos acima de 150km com valor aceito por ele).");

        sc.close();
    }
}