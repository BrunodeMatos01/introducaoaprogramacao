package ExerciciosUni5;

import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;
        int contasEncerradas = 0;

        do {
            System.out.println("\n=== Sistema do Hotel ===");
            System.out.println("(1) Encerrar a conta de um hóspede");
            System.out.println("(2) Verificar número de contas encerradas");
            System.out.println("(3) Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do hóspede: ");
                    String nome = sc.next();

                    System.out.print("Número de diárias: ");
                    int diarias = sc.nextInt();

                    double taxaServico;
                    if (diarias < 15) {
                        taxaServico = 7.50;
                    } else if (diarias == 15) {
                        taxaServico = 6.50;
                    } else {
                        taxaServico = 5.00;
                    }

                    double totalPagar = (50.00 + taxaServico) * diarias;

                    System.out.printf("Hóspede: %s | Total a pagar: R$ %.2f\n", nome, totalPagar);
                    
                    contasEncerradas++;
                    break;

                case 2:
                    System.out.println("Número de contas encerradas até o momento: " + contasEncerradas);
                    break;

                case 3:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

        } while (opcao != 3);

        sc.close();
    }
}

