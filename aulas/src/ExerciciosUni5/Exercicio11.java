package ExerciciosUni5;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        int biscoito = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos dias");
        int dias = sc.nextInt();

        for (int i = 0; i < dias; i++) {
            biscoito = 0;
            int totalDia = 0;
            for (int j = 1; j <= 16; j++) {
                if (j == 1) {
                    biscoito = 1;
                }
                if (j == 2) {
                    biscoito = 3;
                }
                if (j > 2) {
                    biscoito *= 3;
                }
                totalDia += biscoito;
            }
            System.out.println("Quebrados no dia "+ (1 + i) + " " + totalDia);
        }
    }
}
