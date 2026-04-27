package prova1;

import java.util.Scanner;

public class questaoprova4 {
    public static void main(String[] args) {
        double media = 0.0;
        double mediaFinal = 0.0;
        String situacao;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a nota 1");
        double nota1 = sc.nextDouble();
        System.out.println("Informe a nota 2");
        double nota2 = sc.nextDouble();

        if (nota1 >= 9 || nota2 >= 9) {
            media = (nota1 + nota2) / 2;
            mediaFinal = media + 0.5;
        } else {
            mediaFinal = (nota1 + nota2) / 2;
        }

        if (mediaFinal >= 7) {
            situacao = "Aprovado";
        } else if (mediaFinal >= 5) {
            situacao = "Recuperação";
        } else {
            situacao = "Reprovado";
        }

        System.out.println("Situação final do aluno: " + situacao);

        sc.close();
    }
}
