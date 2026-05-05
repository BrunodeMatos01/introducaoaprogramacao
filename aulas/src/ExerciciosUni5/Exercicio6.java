package ExerciciosUni5;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        double media = 0;
        double altura = 0;

        for (int i=1; i<=20; i++) {
            System.out.println("Informe a altrua");
            altura = sc.nextDouble();
            soma += altura;
        }
        media = soma/20;
        System.out.println(media);
    }
}
