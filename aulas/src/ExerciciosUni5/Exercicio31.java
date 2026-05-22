package ExerciciosUni5;

import java.util.Scanner;

public class Exercicio31 {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número inteiro positivo: ");
        int numero = sc.nextInt();

        System.out.println("\nnúmero\tdecomposição");

        int fator = 2;

        while (numero > 1) {
            if (numero % fator == 0) {
                System.out.println(numero + "\t" + fator);
                numero = numero / fator;
            } else {
                fator++;
            }
        }
        
        System.out.println(numero);

        sc.close();
    }
}