import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o numero 1");
        double A = sc.nextInt();
        System.out.println("Informe o numero 2");
        double B = sc.nextInt();
        System.out.println("Informe o numero 3");
        double C = sc.nextInt();


        double trianguloR = (A * C)/2;
        double circuloA = (C * Math.PI);
        double trapezio = ((A + B) * C)/2;
        double quadrado = (Math.pow(B, 2));
        double retangulo = (A * B);

        System.out.println("\nRESULTADOS:");
        System.out.println("Triangulo: " + trianguloR);
        System.out.println("Circulo: " + circuloA);
        System.out.println("Trapezio: " + trapezio);
        System.out.println("Quadrado: " + quadrado);
        System.out.println("Retangulo: " + retangulo);

        sc.close();


    }
}
