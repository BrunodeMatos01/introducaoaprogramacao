import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Fale um valor");
        double valor = sc.nextDouble();

        int centavos = (int)(valor * 100);

        int n100 = centavos / 10000;
        centavos %= 10000;

        int n50 = centavos / 5000;
        centavos %= 5000;

        int n20 = centavos / 2000;
        centavos %= 2000;

        int n10 = centavos / 1000;
        centavos %= 1000;

        int n5 = centavos / 500;
        centavos %= 500;

        int n2 = centavos / 200;
        centavos %= 200;

        int m1 = centavos / 100;
        centavos %= 100;

        int m050 = centavos / 50;
        centavos %= 50;

        int m025 = centavos / 25;
        centavos %= 25;

        int m010 = centavos / 10;
        centavos %= 10;

        int m005 = centavos / 5;
        centavos %= 5;

        int m001 = centavos;

        System.out.println("NOTAS:");
        System.out.println(n100 + " nota(s) de 100");
        System.out.println(n50 + " nota(s) de 50");
        System.out.println(n20 + " nota(s) de 20");
        System.out.println(n10 + " nota(s) de 10");
        System.out.println(n5 + " nota(s) de 5");
        System.out.println(n2 + " nota(s) de 2");

        System.out.println("MOEDAS:");
        System.out.println(m1 + " moeda(s) de 1.00");
        System.out.println(m050 + " moeda(s) de 0.50");
        System.out.println(m025 + " moeda(s) de 0.25");
        System.out.println(m010 + " moeda(s) de 0.10");
        System.out.println(m005 + " moeda(s) de 0.05");
        System.out.println(m001 + " moeda(s) de 0.01");

        sc.close();
    }
}