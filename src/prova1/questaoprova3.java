package prova1;

import java.util.Scanner;

public class questaoprova3 {
    public static void main(String[] args) {
        double valor = 0.0;
        double desconto = 0.0;
        double valorFinal = 0.0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o tipo de Combustível (G | E | D)");
        char combustivel = sc.next().toUpperCase().charAt(0);
        System.out.println("Informe a quantidade de Litros");
        double litros = sc.nextDouble();

        switch (combustivel) {
            case 'G':
                if (litros >= 30) {
                    valor = (litros * 5.80);
                    desconto = valor * 0.07;
                    valorFinal = valor - desconto;
                    System.out.printf("%.2f%n Valor final a pagar: R$", valorFinal);
                    break;
                }
                valor = (litros * 5.80);
                System.out.printf("%.2f%n Valor final a pagar: R$", valor);
                break;
            case 'E':
                if (litros >= 30) {
                    valor = (litros * 4.30);
                    desconto = valor * 0.07;
                    valorFinal = valor - desconto;
                    System.out.printf("%.2f%n Valor final a pagar: R$", valorFinal);
                }
                valor = (litros * 4.30);
                System.out.printf("%.2f%n Valor final a pagar: R$", valor);
                break;
            case 'D':
                if (litros >= 30) {
                    valor = (litros * 6.20);
                    desconto = valor * 0.07;
                    valorFinal = valor - desconto;
                    System.out.printf("%.2f%n Valor final a pagar: R$", valorFinal);
                }
                valor = (litros * 6.20);
                System.out.printf("%.2f%n Valor final a pagar: R$", valor);
                break;
            default:
                break;
        }

        sc.close();
    }
}
