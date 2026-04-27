import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float peso1 = 0.35f;
        float peso2 = 0.75f;

        System.out.println("Informe o numero 1");
        float nota1 = sc.nextInt();
        System.out.println("Informe o numero 2");
        float nota2 = sc.nextInt();

        float mediaFinal = (nota1 * peso1) + (nota2 * peso2)/2;
        System.out.println("Média Final é "+mediaFinal);

        sc.close();
    }
}
