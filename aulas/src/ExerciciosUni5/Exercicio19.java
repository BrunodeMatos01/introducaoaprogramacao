package ExerciciosUni5;

import java.util.Scanner;

public class Exercicio19 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valorAPagar = 0;

        while(true) {
            System.out.print("Valor da compra: ");
            double valorCompra = sc.nextDouble();

            if (valorCompra == 0) {
                break;
            }

            if(valorCompra > 500.00) {
                valorAPagar = valorCompra - (valorCompra * 0.20);
            }
            if(valorCompra <= 500.00) {
                valorAPagar = valorCompra - (valorCompra * 0.15);
            }

            System.out.println("Valor a pagar: " + valorAPagar);
        }
    }
}
