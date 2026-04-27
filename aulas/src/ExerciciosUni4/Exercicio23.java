package ExerciciosUni4;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Numero para o mes do ano");
        int mes = sc.nextInt();

        switch (mes) {
            case 1 :
                System.out.println("Janeiro");
                break;
            case 2 :
                System.out.println("fevereiro");
                break;
            case 3 :
                System.out.println("março");
                break;
            case 4 :
                System.out.println("abril");
                break;
            case 5 :
                System.out.println("maio");
                break;
            case 6 :
                System.out.println("junho");
                break;
            case 7 :
                System.out.println("julho");
                break;
            case 8 :
                System.out.println("agosto");
                break;
            case 9 :
                System.out.println("setembro");
                break;
            case 10 :
                System.out.println("outubro");
                break;
            case 11 :
                System.out.println("novembro");
                break;
            case 12 :
                System.out.println("Dezembro");
                break;
            default:
                System.out.println("Valor Invalido");
                break;
        }
    }
}
