package ExerciciosUni5;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        int qtd = 0;
        int menorNegativo = Integer.MAX_VALUE;
        int somaPositivos = 0;
        int contPositivos = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de numeros a informar");
        qtd = sc.nextInt();

        for( int i=0; i<qtd; i++) {
            System.out.println("Informe os numeros");
            int num = sc.nextInt();

            if (num < 0) {
                if (num < menorNegativo) {
                    menorNegativo = num;
                }
            } else if (num > 0) {
                somaPositivos += num;
                contPositivos++;
            }
        }

        if (menorNegativo != Integer.MAX_VALUE) {
            System.out.println("Menor valor negativo "+ menorNegativo);
        } else {
            System.out.println("Nenhum numero negativo");
        }
        
        if (contPositivos > 0) {
            System.out.println("A média dos positivos é "+ somaPositivos/contPositivos);
        } else {
            System.out.println("Nenhum numero positivo");
        }
    }
}
