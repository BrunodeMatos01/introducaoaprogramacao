package escolha;

import java.util.Scanner;

public class Selecao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero" + "de 0 a 10");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1 :
                System.out.println("Numero 1");
                break;
            case 2 : 
                System.out.println("Numero 2");
                break;
            default:
                break;
        }
    }
}
