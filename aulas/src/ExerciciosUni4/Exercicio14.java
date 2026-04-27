package ExerciciosUni4;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Dia: ");
        int dia = s.nextInt();
        System.out.print("Mês: ");
        int mes = s.nextInt();
        System.out.print("Ano: ");
        int ano = s.nextInt();

        boolean valida = false;

        if (mes >= 1 && mes <= 12) {
            if (mes == 2) {
                boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
                if ((bissexto && dia >= 1 && dia <= 29) || (!bissexto && dia >= 1 && dia <= 28)) {
                    valida = true;
                }
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                if (dia >= 1 && dia <= 30) valida = true;
            } else {
                if (dia >= 1 && dia <= 31) valida = true;
            }
        }

        if (valida) {
            System.out.println("Válida");
        } else {
            System.out.println("Não válida");
        }
        s.close();
    }
}
