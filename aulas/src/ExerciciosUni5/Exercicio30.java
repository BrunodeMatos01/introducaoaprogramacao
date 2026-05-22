package ExerciciosUni5;

import java.util.Scanner;

public class Exercicio30 {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor inicial (N): ");
        int n = sc.nextInt();

        System.out.print("Informe o decremento (K): ");
        int k = sc.nextInt();

        System.out.print("Informe o tamanho da mochila (M): ");
        int tamanhoMochila = sc.nextInt();

        String elementos = "";
        String dentroMochila = "";
        String foraMochila = "";

        int somaDentro = 0;
        int somaFora = 0;
        int espacoLivre = tamanhoMochila;

        int valorAtual = n;

        while (valorAtual > 0) {
            elementos += valorAtual + " ";

            if (valorAtual <= espacoLivre) {
                dentroMochila += valorAtual + " ";
                somaDentro += valorAtual;
                espacoLivre -= valorAtual;
            } else {
                foraMochila += valorAtual + " ";
                somaFora += valorAtual;
            }
            valorAtual -= k;
        }

        System.out.println("Elementos a serem colocados na mochila: " + elementos);
        System.out.println("Elementos que entraram na mochila: " + dentroMochila);
        System.out.println("Elementos que ficaram fora da mochila: " + foraMochila);
        System.out.println("Soma dos elementos que entraram na mochila: " + somaDentro);
        System.out.println("Soma dos elementos que não entraram na mochila: " + somaFora);

        sc.close();
    }
}
