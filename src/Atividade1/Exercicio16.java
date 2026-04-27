import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float litro = 1000;

        System.out.println("Qual a quantidade de lata 350");
        int lata350 = sc.nextInt();
        System.out.println("Qual a quantidade de lata 600");
        int lata600 = sc.nextInt();
        System.out.println("Qual a quantidade de garrafa 2L");
        int grf2L = sc.nextInt();

        float valor350 = (lata350 * 350);
        float valor600 = (lata600 * 600);
        float valor2L = (grf2L * 2000);

        float total = (valor350 + valor600 + valor2L) / litro;

        System.out.println(total);

        sc.close();
    }
}
