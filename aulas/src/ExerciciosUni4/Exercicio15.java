package ExerciciosUni4;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int meses = s.nextInt();

        if (meses <= 12) {
            System.out.println("O funcionário irá receber 5% de reajuste");
        } else if (meses <= 48) {
            System.out.println("O funcionário irá receber 7% de reajuste");
        } else {
            System.out.println("Reajuste não informado");
        }
        s.close();
    }
}
