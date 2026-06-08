package ExercicioUni6;

import java.util.Scanner;

public class Exercicio7 {
    private Scanner sc = new Scanner(System.in);
    private int[] vetor;
    private int tamanho;


    public Exercicio7() {
        System.out.println("--- Sistema de Ordenação de Vetor ---");


        do {
            System.out.print("Informe a quantidade de números (máximo 20): ");
            tamanho = sc.nextInt();

            if (tamanho <= 0 || tamanho > 20) {
                System.out.println("Tamanho inválido! O valor deve ser entre 1 e 20.");
            }
        } while (tamanho <= 0 || tamanho > 20);


        vetor = new int[tamanho];


        inserirValores();

        System.out.print("Vetor origem: ");
        informarVetor();

        ordenarVetor();

        System.out.print("Vetor ordenado: ");
        informarVetor();
    }


    public static void main(String[] args) {
        new Exercicio7();
    }

    public void inserirValores() {
        int quantidadeLida = 0;

        while (quantidadeLida < tamanho) {
            System.out.print("Informe um valor para a posição " + quantidadeLida + ": ");
            int valor = sc.nextInt();


            if (!pesquisarValor(valor, quantidadeLida)) {
                vetor[quantidadeLida] = valor;
                quantidadeLida++;
            } else {
                System.out.println("Este valor já existe no vetor. Por favor, digite um novo valor.");
            }
        }
    }


    private boolean pesquisarValor(int valor, int limiteAtual) {
        for (int i = 0; i < limiteAtual; i++) {
            if (vetor[i] == valor) {
                return true;
            }
        }
        return false;
    }


    public void ordenarVetor() {
        int bolha;
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    // Troca de posições
                    bolha = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = bolha;
                }
            }
        }
    }

    public void informarVetor() {
        for (int i = 0; i < tamanho; i++) {
            System.out.print("[" + vetor[i] + "]");
        }
        System.out.println(); // Quebra de linha no final
    }
}

