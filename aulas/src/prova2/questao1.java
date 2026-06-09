package prova2;

import java.util.Scanner;

public class questao1 {
    private Scanner sc = new Scanner(System.in);
    private int posicao = 0;
    private int tamanho = 0;
    private int pesoTotal = 0;
    private int pesoAtual = 0;

    public questao1() {
        int opcao = 0;
        System.out.println("Informe a capacidade da mochila");
        tamanho = sc.nextInt();
        System.out.println("Informe o peso maximo da mochila");
        pesoTotal = sc.nextInt();
        String[] mochila = new String[tamanho];
        int[] pesoItem = new int[tamanho];

        do {
            System.out.println("Menu Mochila");
            System.out.println("1 - Inserir item");
            System.out.println("2 - Imprimir mochila");
            System.out.println("3 - Item mais pesado");
            System.out.println("4 - Ordenar mochila");
            System.out.println("5 - Excluir item mochila");
            System.out.println("6 - Sair do programa");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    inserir(mochila, pesoItem);
                    break;
                case 2:
                    imprimirMochila(mochila, pesoItem);
                    break;
                case 3:
                    valorItemMaisPesado(mochila, pesoItem);
                    break;
                case 4:
                    ordenarMochila(mochila, pesoItem);
                    break;
                case 5:
                    excluirItemMochila(mochila, pesoItem);
                    break;
                case 6:
                    System.out.println("Programa encerrado");
                    break;
                default:
                    System.out.println("Valor invalido");
                    break;
            }

        } while (opcao != 6);
    }

    public void inserir(String[] mochila, int[] pesoItem) {
        if (posicao < tamanho) {
            System.out.println("Informe o peso");
            int peso = sc.nextInt();
            int sobraPeso = pesoTotal - pesoAtual;
            if (peso <= sobraPeso) {
                System.out.println("Informe o nome");
                mochila[posicao] = sc.next();
                pesoItem[posicao] = peso;
                posicao++;
                pesoAtual = pesoAtual + peso;
            } else {
                System.out.println("Peso maior que o limite");
            }
        } else {
            System.out.println("Sem espaço para incluir valores");
        }
    }

    public void imprimirMochila(String[] mochila, int[] pesoItem) {
        System.out.print("Mochila atual= [");
        for (int i = posicao - 1; i >= 0; i--) {
            System.out.print(mochila[i]);
            if (i > 0) {
                System.out.print(",");
            }
        }
        System.out.println("]");

        System.out.print("Pesos = [");
        for (int i = posicao - 1; i >= 0; i--) {
            System.out.print(pesoItem[i]);
            if (i > 0) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

    public void valorItemMaisPesado(String[] mochila, int[] pesoItem) {
        if (posicao > 0) {
            int maiorPeso = pesoItem[0];
            String itemMaisPesado = mochila[0];

            for (int i = 1; i < posicao; i++) {
                if (pesoItem[i] > maiorPeso) {
                    maiorPeso = pesoItem[i];
                    itemMaisPesado = mochila[i];
                }
            }
            System.out.println("Item mais pesado: " + itemMaisPesado + " Peso: " + maiorPeso);
        } else {
            System.out.println("Mochila vazia");
        }
    }

    public void ordenarMochila(String[] mochila, int[] pesoItem) {
        for (int i = 0; i < posicao; i++) {
            for (int j = 0; j < posicao - 1; j++) {
                if (pesoItem[j] > pesoItem[j + 1]) {
                    int tempPeso = pesoItem[j];
                    pesoItem[j] = pesoItem[j + 1];
                    pesoItem[j + 1] = tempPeso;

                    String tempNome = mochila[j];
                    mochila[j] = mochila[j + 1];
                    mochila[j + 1] = tempNome;
                }
            }
        }

        System.out.print("mochila = [");
        for (int i = 0; i < posicao; i++) {
            System.out.print(mochila[i]);
            if (i < posicao - 1)
                System.out.print(",");
        }
        System.out.println("]");

        System.out.print("pesoItem = [");
        for (int i = 0; i < posicao; i++) {
            System.out.print(pesoItem[i]);
            if (i < posicao - 1)
                System.out.print(",");
        }
        System.out.println("]");
    }

    public void excluirItemMochila(String[] mochila, int[] pesoItem) {
        System.out.println("Informe o nome do item a excluir");
        String valorAExcluir = sc.next();
        boolean encontrou = false;

        for (int i = 0; i < posicao; i++) {
            if (valorAExcluir.equalsIgnoreCase(mochila[i])) {
                pesoAtual = pesoAtual - pesoItem[i];

                for (int j = i; j < posicao - 1; j++) {
                    mochila[j] = mochila[j + 1];
                    pesoItem[j] = pesoItem[j + 1];
                }
                posicao--;
                encontrou = true;
                break;
            }
        }

        if (encontrou == false) {
            System.out.println("Valor não encontrado");
        }
    }

    public static void main(String[] args) {
        new questao1();
    }
}