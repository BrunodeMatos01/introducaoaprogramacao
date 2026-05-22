package ExerciciosUni5;

import java.util.Scanner;

public class Exercicio18 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma4 = 0;
        int soma5 = 0;
        int soma9 = 0;
        int soma12 = 0;
        int totalGeral = 0;

        while(true) {
            System.out.println("Qual canal: ");
            int canal = sc.nextInt();

            if(canal == 0) {
                break;
            }
            System.out.println("Quantas pessoas assitindo: ");
            int pessoasAssistindo = sc.nextInt();

            totalGeral += pessoasAssistindo;

            if (canal == 4) {
                soma4 += pessoasAssistindo;
            } else if (canal == 5) {
                soma5 += pessoasAssistindo;
            } else if (canal == 9) {
                soma9 += pessoasAssistindo;
            } else if (canal == 12) {
                soma12 += pessoasAssistindo;
            }
        }
        System.out.printf("Percentual de audiência do canal 4: %.2f%%\n", (double) soma4 / totalGeral * 100);
        System.out.printf("Percentual de audiência do canal 5: %.2f%%\n", (double) soma5 / totalGeral * 100);
        System.out.printf("Percentual de audiência do canal 9: %.2f%%\n", (double) soma9 / totalGeral * 100);
        System.out.printf("Percentual de audiência do canal 12: %.2f%%\n", (double) soma12 / totalGeral * 100);
    }
}