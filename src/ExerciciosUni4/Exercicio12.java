package ExerciciosUni4;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int l1 = s.nextInt();
        int l2 = s.nextInt();
        int l3 = s.nextInt();

        if (l1 < (l2 + l3) && l2 < (l1 + l3) && l3 < (l1 + l2)) {
            if (l1 == l2 && l2 == l3) {
                System.out.println("É equilátero.");
            } else if (l1 == l2 || l1 == l3 || l2 == l3) {
                System.out.println("É isósceles.");
            } else {
                System.out.println("É escaleno.");
            }
        } else {
            System.out.println("Não formam um triangulo.");
        }
        s.close();
    }
}
