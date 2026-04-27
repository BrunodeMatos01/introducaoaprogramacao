package ExerciciosUni4;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Altura: ");
        double altura = s.nextDouble();
        System.out.print("Massa: ");
        double massa = s.nextDouble();

        double imc = massa / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Magreza");
        } else if (imc <= 24.9) {
            System.out.println("Saudável");
        } else if (imc <= 29.9) {
            System.out.println("Sobrepeso");
        } else if (imc <= 34.9) {
            System.out.println("Obesidade Grau I");
        } else if (imc <= 39.9) {
            System.out.println("Obesidade Grau II (severa)");
        } else {
            System.out.println("Obesidade Grau III (mórbida)");
        }
        s.close();
    }
}
