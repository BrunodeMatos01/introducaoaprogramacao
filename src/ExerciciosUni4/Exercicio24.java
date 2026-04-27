package ExerciciosUni4;

import java.util.Scanner;

public class Exercicio24 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Numero 1");
        int num1 = sc.nextInt();
        System.out.println("Numero 1");
        int num2 = sc.nextInt();
        System.out.println("Numero 1");
        int num3 = sc.nextInt();

        System.out.println("qual ordem vc quer de 1 a 3");
        int opcao = sc.nextInt();

        int menor = num1;
        int meio = num2;
        int maior = num3;

        if (menor > meio) {
            int temp = menor;
            menor = meio;
            meio = temp;
        }

        if (menor > maior) {
            int temp = menor;
            menor = maior;
            maior = temp;
        }

        if (meio > maior) {
            int temp = meio;
            meio = maior;
            maior = temp;
        }


        switch (opcao) {
            case 1:
                System.out.println(menor +" "+meio +" "+maior);
                break;
            case 2:
                System.out.println(maior +" "+meio +" "+menor);
                break;
            case 3:
                System.out.println(menor+" "+maior+" "+meio);
                break;
            default:
                System.out.println("Inavlido");
                break;
        }
    }
}
