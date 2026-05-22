package ExerciciosUni5;

import java.util.Scanner;

public class Exercicio28 {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int votosNenhumDeNos = 0;
        int votosCpm22 = 0;
        int votosSkank = 0;
        int votosJotaQuest = 0;
        int totalVotos = 0;
        char continuar = 's';

        System.out.println("=== Eleição: Melhor Conjunto do Ano ===");
        System.out.println("1 - Nenhum de Nós");
        System.out.println("2 - CPM22");
        System.out.println("3 - Skank");
        System.out.println("4 - Jota Quest");
        System.out.println("---------------------------------------");

        while (continuar == 's' || continuar == 'S') {
            System.out.print("Informe o código do seu voto (1 a 4): ");
            int voto = sc.nextInt();

            if (voto == 1) {
                votosNenhumDeNos++;
                totalVotos++;
            } else if (voto == 2) {
                votosCpm22++;
                totalVotos++;
            } else if (voto == 3) {
                votosSkank++;
                totalVotos++;
            } else if (voto == 4) {
                votosJotaQuest++;
                totalVotos++;
            } else {
                System.out.println("Código inválido! Voto não contabilizado.");
            }

            System.out.print("mais um voto: s (SIM) / n (NÃO)? ");
            continuar = sc.next().charAt(0);
            System.out.println();
        }

        if (totalVotos > 0) {
            System.out.println("=== RESULTADO DA ELEIÇÃO ===");
            System.out.println("Total de votos registrados: " + totalVotos);
            System.out.println("---------------------------------------");

            System.out.printf("Nenhum de Nós: %d votos (%.2f%%)\n", votosNenhumDeNos, ((double) votosNenhumDeNos / totalVotos * 100));
            System.out.printf("CPM22: %d votos (%.2f%%)\n", votosCpm22, ((double) votosCpm22 / totalVotos * 100));
            System.out.printf("Skank: %d votos (%.2f%%)\n", votosSkank, ((double) votosSkank / totalVotos * 100));
            System.out.printf("Jota Quest: %d votos (%.2f%%)\n", votosJotaQuest, ((double) votosJotaQuest / totalVotos * 100));
            System.out.println("---------------------------------------");

            int maiorVoto = votosNenhumDeNos;
            String vencedor = "Nenhum de Nós";

            if (votosCpm22 > maiorVoto) {
                maiorVoto = votosCpm22;
                vencedor = "CPM22";
            }
            if (votosSkank > maiorVoto) {
                maiorVoto = votosSkank;
                vencedor = "Skank";
            }
            if (votosJotaQuest > maiorVoto) {
                maiorVoto = votosJotaQuest;
                vencedor = "Jota Quest";
            }

            System.out.println("O grupo vencedor é: " + vencedor + " com " + maiorVoto + " votos!");

        } else {
            System.out.println("Nenhum voto foi registrado na urna.");
        }

        sc.close();
    }
}
