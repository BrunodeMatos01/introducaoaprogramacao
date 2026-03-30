package ExerciciosUni4;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int c1 = s.nextInt();
        int c2 = s.nextInt();
        int c3 = s.nextInt();
        int boas = 0;

        if (c1 == 1 || c1 == 2 || c1 == 3) boas++;
        if (c2 == 1 || c2 == 2 || c2 == 3) boas++;
        if (c3 == 1 || c3 == 2 || c3 == 3) boas++;

        if (boas == 1) {
            System.out.println("TRUCO");
        } else if (boas == 2) {
            System.out.println("SEIS");
        } else if (boas == 3) {
            System.out.println("NOVE");
        } else {
            System.out.println("-");
        }
        s.close();
    }
}
