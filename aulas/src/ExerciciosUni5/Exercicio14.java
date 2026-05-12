package ExerciciosUni5;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   
        System.out.println("Quantas mercadorias serão olhado:");
        int n = sc.nextInt();
 
        int menor10 = 0;
        int entre10e20 = 0;
        int maior20 = 0;
 
        double totalCompra = 0;
        double totalVenda = 0;
 
        for (int i = 1; i <= n; i++) {
            System.out.print("Mercadoria " + i + ": ");
            String nomeMercadoria = sc.next();
            System.out.print("Preço de compra: ");
            double precoCompra = sc.nextDouble();
            System.out.println("Preço de venda: ");
            double precoVenda = sc.nextDouble();
 
            double lucroPercentual = ((precoVenda - precoCompra) / precoCompra) * 100;if (lucroPercentual < 10) {
                menor10++;
            }
            else if (lucroPercentual <= 20) {
                entre10e20++;
            }
            else {
                maior20++;
            }
 
            totalCompra += precoCompra;
            totalVenda += precoVenda;
        }
 
        double lucroTotal = totalVenda - totalCompra;
 
        System.out.println("Lucro < 10%: " + menor10);
        System.out.println("10% <= lucro <= 20%: " + entre10e20);
        System.out.println("Lucro > 20%: " + maior20);
 
        System.out.println("Total de compra: " + totalCompra);
        System.out.println("Total de venda: " + totalVenda);
        System.out.println("Lucro total: " + lucroTotal);
 
        sc.close();
 
    }
}
