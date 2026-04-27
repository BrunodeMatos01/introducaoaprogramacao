package ExerciciosUni4;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva qual curso voce deseja fazer");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Ciência da Computação");
                break;
            case 2:
                System.out.println("Licenciatura de Computação");
                break;
            case 3:
                System.out.println("Sistemas da Informação");
                break;
            default:
                System.out.println("Curso Invalido");
                break;
        }
    }
}
