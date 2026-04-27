package ExerciciosUni4;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um valor maior que 0");
        float valor = sc.nextFloat();

        if (valor % 1 != 0) {
            System.out.println("Tem decimal");
        }else{
            System.out.println("Não tem Decimal");
        }
    }
}
