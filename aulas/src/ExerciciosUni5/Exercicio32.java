package ExerciciosUni5;

import java.util.Scanner;

public class Exercicio32 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dia da semana do 1º dia (1=Dom, 2=Seg, ..., 7=Sáb): ");
        int p = sc.nextInt();

        System.out.print("Número de dias do mês: ");
        int n = sc.nextInt();

        System.out.println();
        System.out.println("D\tS\tT\tQ\tQ\tS\tS");

        for (int i = 1; i < p; i++) {
            System.out.print("\t");
        }

        int diaSemana = p;

        for (int dia = 1; dia <= n; dia++) {
            System.out.print(dia + "\t");

            if (diaSemana == 7) {
                System.out.println();
                diaSemana = 1;
            } else {
                diaSemana++;
            }
        }
        
        System.out.println();

        sc.close();
    }
}