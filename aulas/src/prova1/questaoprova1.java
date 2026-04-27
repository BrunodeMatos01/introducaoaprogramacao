package prova1;

import java.util.Scanner;

public class questaoprova1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a sua idade");
        int idade = sc.nextInt();
        System.out.println("Informe a fraquencia cardíaca");
        int fraquencia = sc.nextInt();

        if (idade >= 60 && fraquencia >= 140) {
            System.out.println("Alerta máximo");
        } else if (fraquencia >= 180) {
            System.out.println("Esforço crítico");
        } else if (fraquencia >= 140) {
            System.out.println("Esforço alto");
        } else {
            System.out.println("Esforço normal");
        }

        sc.close();
    }
}
