import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Valor de B:");
        double B = sc.nextDouble();

        System.out.println("Valor de C:");
        double C = sc.nextDouble();

        System.out.println("Valor de D:");
        double D = sc.nextDouble();

        double A = B + (D - C);

        System.out.println("Valor de A: " + A);

        sc.close();
    }
}