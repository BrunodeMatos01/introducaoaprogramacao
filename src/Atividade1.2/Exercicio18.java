import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Comprimento da parede (m):");
        double comprimento = sc.nextDouble();

        System.out.println("Altura da parede (m):");
        double altura = sc.nextDouble();

        double area = comprimento * altura;

        double azulejos = area * 9;

        double valor = azulejos * 12.50;

        System.out.printf("Valor gasto: R$ %.2f", valor);

        sc.close();
    }
}