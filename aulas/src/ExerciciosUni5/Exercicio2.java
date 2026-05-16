package ExerciciosUni5;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int somaNumeroPar = 0;
        int somaNumeroImpar = 0;
        for(int i = 1; i <= 100; i++) {
            if(i % 2 == 0) {
                somaNumeroPar += i;
            } else {
                somaNumeroImpar += i;
            }
        }
        System.out.println("Soma dos números pares: " + somaNumeroPar);
        System.out.println("Soma dos números ímpares: " + somaNumeroImpar);
    }
}

