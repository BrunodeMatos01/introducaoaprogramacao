package ExerciciosUni4;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int v1 = s.nextInt();
        int v2 = s.nextInt();

        if (v1 % v2 == 0 || v2 % v1 == 0) {
            System.out.println("Os valores são múltiplos.");
        } else {
            System.out.println("Os valores não são múltiplos.");
        }
        s.close();
    }
}
