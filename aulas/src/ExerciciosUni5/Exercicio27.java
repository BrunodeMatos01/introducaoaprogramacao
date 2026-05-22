package ExerciciosUni5;

import java.util.Scanner;

public class Exercicio27 {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int novoFuncionario;
        int maxProducao = 0;
        int diaMaxProducao = 0;
        int totalManhaGeral = 0;
        int totalTardeGeral = 0;

        do {
            int dia;
            while (true) {
                System.out.print("Dia: ");
                dia = sc.nextInt();
                if (dia >= 1 && dia <= 30) {
                    break;
                }
                System.out.println("Dia inválido");
            }

            System.out.print("Manhã: ");
            int manha = sc.nextInt();

            System.out.print("Tarde: ");
            int tarde = sc.nextInt();

            int totalDia = manha + tarde;

            totalManhaGeral += manha;
            totalTardeGeral += tarde;

            if (totalDia > maxProducao) {
                maxProducao = totalDia;
                diaMaxProducao = dia;
            }

            double valorRecebido = 0;

            if (dia <= 15) {
                if (totalDia > 100 && manha >= 30 && tarde >= 30) {
                    valorRecebido = totalDia * 0.80;
                } else {
                    valorRecebido = totalDia * 0.50;
                }
            } 
            else {
                valorRecebido = (manha * 0.40) + (tarde * 0.30);
            }

            System.out.printf("R$ %.2f (valor recebido)\n", valorRecebido);

            System.out.print("Novo funcionário (1.sim 2.não)? ");
            novoFuncionario = sc.nextInt();
            System.out.println();

        } while (novoFuncionario == 1);

        System.out.println("=== Relatório Final ===");
        System.out.println("Dia com a maior produção: " + diaMaxProducao);
        
        if (totalManhaGeral > totalTardeGeral) {
            System.out.println("Período de maior produção: Manhã (" + totalManhaGeral + " peças produzidas)");
        } else {
            System.out.println("Período de maior produção: Tarde (" + totalTardeGeral + " peças produzidas)");
        }

        sc.close();
    }
}