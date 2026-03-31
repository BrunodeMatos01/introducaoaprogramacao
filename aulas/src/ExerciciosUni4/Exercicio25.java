package ExerciciosUni4;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Numero 1");
        double num1 = sc.nextDouble();
        System.out.println("Numero 2");
        double num2 = sc.nextDouble();

        System.out.println("Qual o metodo de 1 a 4");
        int opcao = sc.nextInt();



        switch (opcao) {
            case 1:
                double soma = num1 + num2;
                System.out.println(soma);
                break;
            case 2:
                double diferenca = num1 - num2;
                System.out.println(diferenca);
                break;
            case 3:
                double produto = num1 * num2;
                System.out.println(produto);
                break;
            case 4:
                if (num1 == 0 || num2 == 0) {
                    System.out.println("Denominador não pode ser 0");
                    break;
                }
                double Divisao = num1 / num2;
                System.out.println(Divisao);
                break;
            default:
                System.out.println("invalido");
                break;
        }

    }

}
