import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor em segundos");
        int valor = sc.nextInt();

        int horas = valor / 3600;
        int minutos = (valor % 3600) / 60;
        int segundos = valor % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);

        sc.close();
    }
}
