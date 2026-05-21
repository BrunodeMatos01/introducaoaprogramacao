package ExerciciosUni5;

import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cand1 = 0, cand2 = 0, cand3 = 0, cand4 = 0;
        int nulos = 0, brancos = 0;
        int totalVotos = 0;
        int voto;

        System.out.println("=== Urna Eletrônica ===");
        System.out.println("1 a 4 - Voto para os respectivos candidatos");
        System.out.println("5 - Voto Nulo");
        System.out.println("6 - Voto em Branco");
        System.out.println("0 - Encerrar Votação");
        System.out.println("-------------------------------------------");

        do {
            System.out.print("Informe o código do seu voto: ");
            voto = sc.nextInt();
            if (voto == 0) {
                continue;
            }
            if (voto < 1 || voto > 6) {
                System.out.println("Opção incorreta");
            } else {
                totalVotos++;

                switch (voto) {
                    case 1:
                        cand1++;
                        break;
                    case 2:
                        cand2++;
                        break;
                    case 3:
                        cand3++;
                        break;
                    case 4:
                        cand4++;
                        break;
                    case 5:
                        nulos++;
                        break;
                    case 6:
                        brancos++;
                        break;
                }
            }
        } while (voto != 0);

        System.out.println("\n=== RESULTADO DA ELEIÇÃO ===");
        if (totalVotos > 0) {
            System.out.println("Candidato 1: " + cand1 + " voto(s)");
            System.out.println("Candidato 2: " + cand2 + " voto(s)");
            System.out.println("Candidato 3: " + cand3 + " voto(s)");
            System.out.println("Candidato 4: " + cand4 + " voto(s)");
            System.out.println("Votos Nulos: " + nulos);
            System.out.println("Votos em Branco: " + brancos);
            System.out.println("-------------------------------------------");

            double percNulos = ((double) nulos / totalVotos) * 100;
            double percBrancos = ((double) brancos / totalVotos) * 100;

            System.out.printf("Percentual de Nulos sobre o total: %.2f%%\n", percNulos);
            System.out.printf("Percentual de Brancos sobre o total: %.2f%%\n", percBrancos);
            System.out.printf("Percentual somado de Brancos e Nulos: %.2f%%\n", (percNulos + percBrancos));
        } else {
            System.out.println("Nenhum voto foi registrado.");
        }

        sc.close();
    }
}