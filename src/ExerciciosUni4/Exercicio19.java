package ExerciciosUni4;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("X: ");
        int x = s.nextInt();
        System.out.print("Y: ");
        int y = s.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("Quadrante 0");
        } else if (x > 0 && y > 0) {
            System.out.println("Quadrante 1");
        } else if (x < 0 && y > 0) {
            System.out.println("Quadrante 2");
        } else if (x < 0 && y < 0) {
            System.out.println("Quadrante 3");
        } else if (x > 0 && y < 0) {
            System.out.println("Quadrante 4");
        }
        s.close();
    }
}
