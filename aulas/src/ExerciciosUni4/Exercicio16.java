package ExerciciosUni4;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Idade dos homens: ");
        int h1 = s.nextInt();
        int h2 = s.nextInt();
        System.out.print("Idade das mulheres: ");
        int m1 = s.nextInt();
        int m2 = s.nextInt();

        int hVelho = Math.max(h1, h2);
        int hNovo = Math.min(h1, h2);
        int mVelha = Math.max(m1, m2);
        int mNova = Math.min(m1, m2);

        int soma = hVelho + mNova;
        int produto = hNovo * mVelha;

        System.out.println("Soma: " + soma + " Produto: " + produto);
        s.close();
    }
}
