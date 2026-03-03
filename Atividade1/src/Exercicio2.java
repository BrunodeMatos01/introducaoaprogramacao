import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o numero 1");
        int numero1 = sc.nextInt();
        System.out.println("Informe o numero 2");
        int numero2 = sc.nextInt();

        int mutiplicacao = (numero1 * numero2);
        System.out.println("A mutiplicacao dos dois numeros é "+mutiplicacao);


        sc.close();
    }

}
