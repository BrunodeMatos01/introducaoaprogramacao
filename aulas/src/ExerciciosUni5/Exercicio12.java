package ExerciciosUni5;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double count = 1;
 
        System.out.println("Digite o numero: ");
        int n = sc.nextInt();
 
        int numero = 1;
 
        for(int i = 1; i <= n; i++) { // Controla as linhas
 
            for(int j = 1; j <= i; j++) { // Controla quanto numeros por linha
                System.out.print(numero + " "); // imprime o número atual
                numero++; // incrementa o contador
            }
            System.out.println();
        }
        sc.close();
    }
}
