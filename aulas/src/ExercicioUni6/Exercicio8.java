package ExercicioUni6;

import java.util.Scanner;

public class Exercicio8 {
    private Scanner sc = new Scanner(System.in);
    private double[] vetor;
    private int tamanho;

    public Exercicio8() {
        System.out.println("--- Sistema de Frequência de Valores ---");

        do {
            System.out.print("Informe a quantidade de números (máximo 20): ");
            tamanho = sc.nextInt();

            if (tamanho <= 0 || tamanho > 20) {
                System.out.println("Tamanho inválido! O valor deve ser entre 1 e 20.");
            }
        } while (tamanho <= 0 || tamanho > 20);

        vetor = new double[tamanho];

        lerValores();
        imprimirFrequencias();
    }

    public static void main(String[] args) {
        new Exercicio8();
    }

    public void lerValores() {
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Informe o valor para a posição " + i + ": ");
            vetor[i] = sc.nextDouble();
        }
    }

    public void imprimirFrequencias() {
        boolean[] jaContado = new boolean[tamanho];

        System.out.println("\nVALOR \t| FREQUÊNCIA");
        System.out.println("----------------------");

        for (int i = 0; i < tamanho; i++) {
            if (!jaContado[i]) {
                int contador = 1;

                for (int j = i + 1; j < tamanho; j++) {
                    if (vetor[i] == vetor[j]) {
                        contador++;
                        jaContado[j] = true;
                    }
                }

                System.out.printf("%.2f \t| \t%d\n", vetor[i], contador);
            }
        }
    }
}
