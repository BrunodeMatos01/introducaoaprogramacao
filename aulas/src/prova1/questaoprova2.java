package prova1;

import java.util.Scanner;

public class questaoprova2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o códgio do plano que deseja\nPlano 1: R$ 100\nPlano 2: R$ 200\nPlano 3: R$ 400");
        int codPlano = sc.nextInt();
        System.out.println("É cliente antigo? (S/N)");
        char cliAntigo = sc.next().toLowerCase().charAt(0);

        if (codPlano == 1 && cliAntigo == 's') {
            double desconto = 100 * 0.15;
            double valor = 100 - desconto;
            System.out.println("Valor final do plano: R$ " + valor);
        } else if (codPlano == 1 && cliAntigo == 'n') {
            System.out.println("Valor final do plano: R$ " + 100);
        } else if (codPlano == 2 && cliAntigo == 's') {
            double desconto = 200 * 0.15;
            double valor = 200 - desconto;
            System.out.println("Valor final do plano: R$ " + valor);
        } else if (codPlano == 2 && cliAntigo == 'n') {
            System.out.println("Valor final do plano: R$ " + 200);
        } else if (codPlano == 3 && cliAntigo == 's') {
            double desconto = 400 * 0.15;
            double valor = 400 - desconto;
            System.out.println("Valor final do plano: R$ " + valor);
        } else if (codPlano == 3 && cliAntigo == 'n') {
            double desconto = 400 * 0.10;
            double valor = 400 - desconto;
            System.out.println("Valor final do plano: R$ " + valor);
        } else {
            System.out.println("Valor Inválido");
        }
        sc.close();
    }
}
