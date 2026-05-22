package ExerciciosUni5;

import java.util.Scanner;

public class Exercicio29 {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor desejado para saque: R$ ");
        int valor = sc.nextInt();

        int notas20 = 0, notas10 = 0, notas5 = 0, notas2 = 0, notas1 = 0;

        while (valor >= 20) {
            notas20++;
            valor -= 20;
        }
        while (valor >= 10) {
            notas10++;
            valor -= 10;
        }
        while (valor >= 5) {
            notas5++;
            valor -= 5;
        }
        while (valor >= 2) {
            notas2++;
            valor -= 2;
        }
        while (valor >= 1) {
            notas1++;
            valor -= 1;
        }

        System.out.println("\n=== Cédulas Entregues ===");
        if (notas20 > 0) {
            System.out.println(notas20 + " cédula(s) de R$ 20,00");
        }
        if (notas10 > 0) {
            System.out.println(notas10 + " cédula(s) de R$ 10,00");
        }
        if (notas5 > 0) {
            System.out.println(notas5 + " cédula(s) de R$ 5,00");
        }
        if (notas2 > 0) {
            System.out.println(notas2 + " cédula(s) de R$ 2,00");
        }
        if (notas1 > 0) {
            System.out.println(notas1 + " cédula(s) de R$ 1,00");
        }

        sc.close();
    }
}
