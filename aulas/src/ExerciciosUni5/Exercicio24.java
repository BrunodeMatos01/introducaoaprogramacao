package ExerciciosUni5;

import java.util.Scanner;

public class Exercicio24 {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o limite diário (em Kg): ");
        double limiteKg = sc.nextDouble();
        double limiteGramas = limiteKg * 1000;
        
        double pesoTotal = 0;
        char continuar = 's';

        while (continuar == 's' || continuar == 'S') {
            System.out.print("Informe o peso do peixe (em gramas): ");
            double pesoPeixe = sc.nextDouble();

            pesoTotal += pesoPeixe;
            
            System.out.printf("Peso total da pesca até agora: %.2f gramas.\n", pesoTotal);

            if (pesoTotal > limiteGramas) {
                System.out.println("Atenção: Limite diário de pesca excedido!");
                break;
            }

            System.out.print("Deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)? ");
            continuar = sc.next().charAt(0);
            System.out.println();
        }

        sc.close();
    }
}
