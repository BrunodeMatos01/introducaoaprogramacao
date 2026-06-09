package ExercicioUni6;

import java.util.Scanner;

public class Exercicio10 {

    private Scanner sc = new Scanner(System.in);
    private int[] vetor = new int[50];
    private int valor = 0;
    private int posicao = 0;

    public Exercicio10() {
        int opcao = 0;
        do {
            System.out.println("Menu");
            System.out.println("1 - Incluir Valor");
            System.out.println("2 - Pesquisar Valor");
            System.out.println("3 - Alterar Valor");
            System.out.println("4 - Excluir Valor");
            System.out.println("5 - Mostrar Valores");
            System.out.println("6 - Ordenar Valores");
            System.out.println("7 - Inverter Valor");
            System.out.println("8 - Sair do sistema");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    incluir();
                    break;
                case 2:
                    pesquisar();
                    break;
                case 3:
                    alterar();
                    break;
                case 4:
                    excluir();
                    break;
                case 5:
                    mostrar();
                    break;
                case 6:
                    ordenar();
                    break;
                case 7:
                    inverter();
                    break;
                case 8:
                    System.out.println("Programa encerrado");
                    break;
                default:
                    System.out.println("Valor invalido");
                    break;
            }

        } while (opcao != 8);
    }

    public void incluir() {
        if (posicao < 50) {
            System.out.println("Informe o valor a incluir");
            vetor[posicao] = sc.nextInt();
            posicao++;
        } else {
            System.out.println("Não é possivel incluir mais valores");
        }
    }

    public void pesquisar() {
        System.out.println("Informe o valor que deseja pesquisar");
        int valorBuscar = sc.nextInt();
        boolean encontrou = false;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valorBuscar) {
                System.out.println("Valor encontrado na posição " + i);
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Valor não encontrado");
        }
    }

    public void alterar() {
        System.out.println("Informe o valor que deseja alterar");
        int valorBuscar = sc.nextInt();
        System.out.println("Trocar por qual valor?");
        int valorTrocar = sc.nextInt();
        boolean encontrou = false;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valorBuscar) {
                vetor[i] = valorTrocar;
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Valor não encontrado");
        }
    }

    public void excluir() {
        System.out.println("Informe o valor a excluir");
        int valorAExcluir = sc.nextInt();
        boolean encontrou = false;

        for (int i = 0; i < posicao; i++) {
            if (vetor[i] == valorAExcluir) {
                for (int j = i; j < posicao - 1; j++) {
                    vetor[j] = vetor[j + 1];
                }
                posicao--;
                encontrou = true;
                break;
            }
        }
        if (!encontrou) {
            System.out.println("Valor não encontrado");
        }
    }

    public void mostrar() {
        System.out.print("vetor = [");
        for (int i = 0; i < posicao; i++) {
            System.out.print(vetor[i]);
            if (i < posicao - 1)
                System.out.print(",");
        }
        System.out.println("]");
    }

    public void ordenar() {
        for (int i = 0; i < posicao; i++) {
            for (int j = 0; j < posicao; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
        mostrar();
    }

    public void inverter() {
        for (int i = 0; i < posicao / 2; i++) {
            int temp = vetor[i];
            vetor[i] = vetor[posicao - 1 - i];
            vetor[posicao - 1 - i] = temp;
        }
        mostrar();
    }

    public static void main(String[] args) {
        new Exercicio10();
    }
}