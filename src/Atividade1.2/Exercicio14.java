import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nota1 = 1;
        int nota2 = 2;
        int nota3 = 5;
        int nota4 = 10;
        int nota5 = 20;
        int nota6 = 50;
        int nota7 = 100;

        System.out.println("Fale um valor");
        int valor = sc.nextInt();

        nota7 = valor / 100;
        valor = valor % 100;

        nota6 = valor / 50;
        valor = valor % 50;

        nota5 = valor / 20;
        valor = valor % 20;

        nota4 = valor / 10;
        valor = valor % 10;

        nota3 = valor / 5;
        valor = valor % 5;

        nota2 = valor / 2;
        valor = valor % 2;

        nota1 = valor;

        System.out.println("Quantas notas de 1 precisou? "+ nota1);
        System.out.println("Quantas notas de 2 precisou? "+ nota2);
        System.out.println("Quantas notas de 5 precisou? "+ nota3);
        System.out.println("Quantas notas de 10 precisou? "+ nota4);
        System.out.println("Quantas notas de 20 precisou? "+ nota5);
        System.out.println("Quantas notas de 50 precisou? "+ nota6);
        System.out.println("Quantas notas de 100 precisou? "+ nota7);

        sc.close();
    }   
}
