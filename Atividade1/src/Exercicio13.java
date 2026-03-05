import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int carro1 = 60;
        int carro2 = 90;

        System.out.println("Quantos Km foi andado");
        float km = sc.nextFloat();

        float tempo = km * 2;
        System.out.println(tempo + "miunutos");

        sc.close();
    }
}
