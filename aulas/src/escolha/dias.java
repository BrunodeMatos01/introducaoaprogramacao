package escolha;

import java.util.Scanner;

public class dias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um dia da Semana de 1 a 7");
        int dia = sc.nextInt();
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Domingo");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
            System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Numero Invalido");
                break;
        }
    }
}
