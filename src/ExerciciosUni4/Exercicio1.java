package ExerciciosUni4;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com horas trabalhadas no mês: ");
        float horas = sc.nextFloat();
        System.out.println("Entre com o valor por hora: ");
        float valor = sc.nextFloat();

        float salarioTotal = horas * valor;

        if (horas > 160) {
            float salarioExtra = (horas - 160) * (valor / 2);
            salarioTotal = salarioTotal + salarioExtra;
        }

        System.out.println("O salário total é: "+ salarioTotal);
       
    }
}
