import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o seu salario fixo");
        float salarioF= sc.nextInt();
        System.out.println("Informe o valor total de vendas efetuadas ");
        float vendas = sc.nextInt();

        float comissao = (vendas * 0.15f);

        float salarioT = (salarioF + comissao);
        System.out.printf("Seu salario total é de %.2f%n", salarioT);

        sc.close();

    }
}
