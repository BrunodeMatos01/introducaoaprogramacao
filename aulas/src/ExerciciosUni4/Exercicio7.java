package ExerciciosUni4;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double peso = s.nextDouble();
        double custo = 0.45;

        if (peso > 50) {
            double excedente = peso - 50;
            int blocos = (int) Math.ceil(excedente / 20.0);
            custo += blocos * 0.45;
        }

        System.out.printf("%.2f\n", custo);
        s.close();
    }
}
