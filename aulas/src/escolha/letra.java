package escolha;

import java.util.Scanner;

public class letra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma letra");
        char letra = sc.next().toUpperCase().charAt(0);
                    
        switch (letra) {
            case 'A':
                    System.out.println("A");
                break;
            case 'B':
                    System.out.println("B");
                break;
            default:
                break;
        }
    }
}
