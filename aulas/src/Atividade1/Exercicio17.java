import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome");
        String nome = sc.next();
        System.out.println("Horas");
        double horas = sc.nextDouble();
        System.out.println("Dependentes");
        int dependentes = sc.nextInt();

        int valorD = (dependentes * 60);
        double salarioB = (horas * 10) + valorD;

        double salarioL = salarioB - (salarioB * 0.135);

        System.out.printf("%s %.2f %.2f",nome ,salarioB, salarioL);


    }
}
