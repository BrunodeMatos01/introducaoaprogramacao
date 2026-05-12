package ExerciciosUni5;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Número total de reabastecimentos:");
        int reabastecimentos = sc.nextInt();
 
        double somaKm = 0;
        double somaLitros = 0;
 
        for (int i = 0; i < reabastecimentos; i++) {
 
            System.out.print("Parada " + (i + 1) + " - Quilometragem: ");
            double km = sc.nextDouble();
 
            System.out.print("Combustível: ");
            double litros = sc.nextDouble();
 
            double consumo = km / litros;
 
            System.out.println("Parada " + (i + 1) + ": " + consumo + " km por litro");
 
            somaKm += km;
            somaLitros += litros;
        }
 
        double media = somaKm / somaLitros;
 
        System.out.println("Quilometragem média obtida por litro: " + media);
 
        sc.close();
    }
}
