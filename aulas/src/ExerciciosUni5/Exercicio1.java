package ExerciciosUni5;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i<=20; i++){
            System.out.println("Digite o numero " +i);
            int numero = sc.nextInt();
            if (numero % 2 == 0) {
                System.out.println("Par");
            } else {
                System.out.println("Impar");
            }
            
        }
    }
}
