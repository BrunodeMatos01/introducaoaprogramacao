package ExerciciosUni4;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char letra = s.next().toUpperCase().charAt(0);

        if (letra == 'M') {
            System.out.println("Masculino");
        } else if (letra == 'F') {
            System.out.println("Feminino");
        } else if (letra == 'I') {
            System.out.println("Não Informado");
        } else {
            System.out.println("Entrada Incorreta");
        }
        s.close();
    }
}
