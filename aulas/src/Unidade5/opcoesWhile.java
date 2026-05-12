package Unidade5;

import java.util.Scanner;

public class opcoesWhile {
    private static double num1;
    private static double num2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = 0;
        do {
            System.out.println("Menu");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - dividir");
            System.out.println("4 - Mutiplicar");
            System.out.println("9 - Sair");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    informar(sc);
                    somar(num1, num2);
                    break;
                case 2:
                    informar(sc);
                    Subtrair(num1, num2);
                    break;
                case 3:
                    informar(sc);
                    Dividir(num1, num2);
                    break;
                case 4:
                    informar(sc);
                    Mutiplicar(num1, num2);
                    break;
                default:
                    break;
            }
        }while(opcao != 9);

    }

    private static void informar(Scanner sc){
            System.out.println("Numero 1");
            num1 = sc.nextDouble();
            System.out.println("Numero 2");
            num2 = sc.nextDouble();  
    }

    private static void Mutiplicar(double num1, double num2) {
        System.out.println(num1 * num2);
    }

    private static void Dividir(double num1, double num2) {
        System.out.println(num1 / num2);
    }

    private static void Subtrair(double num1, double num2) {
        System.out.println(num1 - num2);

    }

    private static void somar(double num1, double num2) {
        System.out.println(num1 + num2);

    }
}
