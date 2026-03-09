import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o numero p1.1");
        double x1 = sc.nextDouble();

        System.out.println("Informe o numero p1.2");
        double y1 = sc.nextDouble();

        System.out.println("Informe o numero p2.1");
        double x2 = sc.nextDouble();

        System.out.println("Informe o numero p2.2");
        double y2 = sc.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("Distancia: %.4f\n", distancia);

        sc.close();
    }
}