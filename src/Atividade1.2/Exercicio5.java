import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o numero 1");
        int numero1 = sc.nextInt();
        System.out.println("Informe o numero 2");
        int numero2 = sc.nextInt();
        System.out.println("Informe o numero 3");
        int numero3 = sc.nextInt();
        System.out.println("Informe o numero 4");
        int numero4 = sc.nextInt();

        int diferenca = (numero1 * numero2 - numero3 * numero4);
        System.out.println("diferenca é "+diferenca);

        sc.close();
    }
}
