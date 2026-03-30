package ExerciciosUni4;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Renda anual: ");
        double rendaAnual = s.nextDouble();
        System.out.print("Qtde de dependentes: ");
        int dependentes = s.nextInt();

        double desconto = dependentes * 0.02;
        double rendaLiquida = rendaAnual - (rendaAnual * desconto);
        double imposto = 0;

        if (rendaLiquida > 10000) {
            imposto = rendaLiquida * 0.15;
            System.out.println("O imposto é de 15%: R$ " + imposto);
        } else if (rendaLiquida >= 5000) {
            imposto = rendaLiquida * 0.10;
            System.out.println("O imposto é de 10%: R$ " + imposto);
        } else if (rendaLiquida >= 2000) {
            imposto = rendaLiquida * 0.05;
            System.out.println("O imposto é de 5%: R$ " + imposto);
        } else {
            System.out.println("Não paga imposto.");
        }
        s.close();
    }
}
