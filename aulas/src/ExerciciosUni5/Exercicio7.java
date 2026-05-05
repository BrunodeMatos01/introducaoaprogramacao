package ExerciciosUni5;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a qtd de numeros");
        int qtd = sc.nextInt();
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;

        for (int i=1; i<=qtd; i++) {
            System.out.println("Digite o numero" + i);
            double numero = sc.nextDouble();
            if (numero < menor) {
                menor = numero;
            }else if (numero > maior) {
                maior = numero;
            }

        }
        System.out.println(menor);
        System.out.println(maior);
    }
}
