package ExerciciosUni5;

import java.util.Scanner;

public class Exercicio23 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String continuar = "Sim"; 

        while (continuar.equalsIgnoreCase("sim")) {
            System.out.print("Nome Vendedor: ");
            String nome = sc.next(); 

            System.out.print("Quantos produtos ele vendeu? ");
            int n = sc.nextInt();

            double totalVendas = 0;

            for (int i = 1; i <= n; i++) {
                System.out.println("\nProduto " + i + ":");
                System.out.print("Preço unitário: R$ ");
                double preco = sc.nextDouble();
                
                System.out.print("Quantidade vendida: ");
                int quantidade = sc.nextInt();

                totalVendas += (preco * quantidade);
            }

            double salario = totalVendas * 0.30;

            System.out.println("\n=== Relatório de " + nome + " ===");
            System.out.printf("Total de Vendas: R$ %.2f\n", totalVendas);
            System.out.printf("Salário (Comissão): R$ %.2f\n", salario);

            System.out.print("Deseja digitar os dados de mais um vendedor: (Sim/Não)? ");
            continuar = sc.next();

            System.out.println(); 
        }

        sc.close();
    }
}