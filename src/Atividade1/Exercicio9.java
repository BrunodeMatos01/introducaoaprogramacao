import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double dollar = 5.29;

        System.out.println("Informe o valor a trocar");
        double valor1 = sc.nextInt();

        double devolver = (valor1 / dollar);
        System.out.printf("Quantidade em reais é %.2f%n",devolver);

        sc.close();
        
    }
}
