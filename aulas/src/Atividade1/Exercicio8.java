import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o código da peça 1 ");
        int cod1 = sc.nextInt();
        System.out.println("Informe o valor da peça "+ cod1);
        int valorUni1 = sc.nextInt();
        System.out.println("Informe a qtd de peças "+ cod1);
        int valorpeca1 = sc.nextInt();

        System.out.println("Informe o código da peça 2 ");
        int cod2 = sc.nextInt();
        System.out.println("Informe o valor da peça "+ cod2);
        int valorUni2 = sc.nextInt();
        System.out.println("Informe a qtd de peças "+ cod2);
        int valorpeca2 = sc.nextInt();


        float produto1 = (valorUni1 * valorpeca1);
        float produto2 = (valorUni2 * valorpeca2);

        float totalAPagar = (produto1 + produto2);
        System.out.println("Total a pagar é :"+ totalAPagar); 

        sc.close();

    }
}
