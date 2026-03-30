package ExerciciosUni4;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Idade de Marquinhos: ");
        int marquinhos = s.nextInt();
        System.out.print("Idade de Zezinho: ");
        int zezinho = s.nextInt();
        System.out.print("Idade de Luluzinha: ");
        int luluzinha = s.nextInt();

        if (marquinhos < zezinho && marquinhos < luluzinha) {
            System.out.println("O Marquinhos é o caçula.");
        } else if (zezinho < marquinhos && zezinho < luluzinha) {
            System.out.println("O Zezinho é o caçula.");
        } else {
            System.out.println("A Luluzinha é a caçula.");
        }
        s.close();
    }
}
