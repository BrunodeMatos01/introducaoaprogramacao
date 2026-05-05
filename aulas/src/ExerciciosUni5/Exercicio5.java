package ExerciciosUni5;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero maior que 2");
        double n = sc.nextDouble();
        n = n/2;
        String sequencia ="";
        int numero = 8;
        for (int i=1; i<=n; i++) {
             sequencia += numero + ",";
             numero = numero+2;
             sequencia += numero + ",";
             numero = (numero-2)*2;

        }
        System.out.println(sequencia);
        
    }
}
