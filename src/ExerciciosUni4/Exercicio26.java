package ExerciciosUni4;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char opcao;

        System.out.println("Escolha uma opcao:");
        System.out.println("T: calcular a area de um triangulo");
        System.out.println("Q: calcular a area de um quadrado");
        System.out.println("R: calcular a area de um retangulo");
        System.out.println("C: calcular a area de um circulo");

        opcao = sc.next().charAt(0);

        switch(opcao) {
            case 'T': {
                double b, h;
                System.out.print("Digite a base e a altura do triangulo: ");
                b = sc.nextDouble();
                h = sc.nextDouble();
                System.out.println("Area do triangulo = " + (b * h / 2));
                break;
            }

            case 'Q': {
                double l;
                System.out.print("Digite o lado do quadrado: ");
                l = sc.nextDouble();
                System.out.println("Area do quadrado = " + (l * l));
                break;
            }

            case 'R': {
                double b, h;
                System.out.print("Digite a base e a altura do retangulo: ");
                b = sc.nextDouble();
                h = sc.nextDouble();
                System.out.println("Area do retangulo = " + (b * h));
                break;
            }

            case 'C': {
                double r;
                System.out.print("Digite o raio do circulo: ");
                r = sc.nextDouble();
                System.out.println("Area do circulo = " + (Math.PI * r * r));
                break;
            }

            default:
                System.out.println("Opcao invalida!");
        }

        sc.close();
    }
}