package ExerciciosUni4;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um valor inteiro maior do que 0: ");
        int valor = sc.nextInt();

        if (valor % 2 == 0) {
            System.out.println("Numero é par");
        }else{
            System.out.println("Numero é impar");
        }
    }   
}
