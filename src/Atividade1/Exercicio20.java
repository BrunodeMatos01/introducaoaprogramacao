import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Número de dobras:");
        int dobras = sc.nextInt();

        int linhas = (int) Math.pow(2, dobras) + 1;

        int quadrados = linhas * linhas;

        System.out.println("Quantidade de quadrados: " + quadrados);

        sc.close();
    }
}