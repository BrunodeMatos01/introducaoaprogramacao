package ExerciciosUni4;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char letra = s.next().toLowerCase().charAt(0);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("É vogal");
        } else {
            System.out.println("NÃO é vogal");
        }
        s.close();
    }
}
