package ExerciciosUni4;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double n1 = s.nextDouble();
        double n2 = s.nextDouble();
        double n3 = s.nextDouble();
        double me = s.nextDouble();

        double media = (n1 + (n2 * 2) + (n3 * 3) + me) / 7;
        char conceito;
        String status;

        if (media >= 9.0) {
            conceito = 'A'; status = "Aprovado";
        } else if (media >= 7.5) {
            conceito = 'B'; status = "Aprovado";
        } else if (media >= 6.0) {
            conceito = 'C'; status = "Aprovado";
        } else if (media >= 4.0) {
            conceito = 'D'; status = "Reprovado";
        } else {
            conceito = 'E'; status = "Reprovado";
        }

        System.out.println("A média de aproveitamento foi: " + media + ". Conceito: " + conceito + ". " + status);
        s.close();
    }
}
