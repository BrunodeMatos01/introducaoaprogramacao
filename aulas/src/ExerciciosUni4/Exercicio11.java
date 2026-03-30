package ExerciciosUni4;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i1 = s.nextInt();
        int i2 = s.nextInt();
        int i3 = s.nextInt();

        if (i1 == i2 && i2 == i3) {
            System.out.println("TRIGÊMEOS");
        } else if (i1 == i2 || i1 == i3 || i2 == i3) {
            System.out.println("GÊMEOS");
        } else {
            System.out.println("APENAS IRMÃOS");
        }
        s.close();
    }
}
