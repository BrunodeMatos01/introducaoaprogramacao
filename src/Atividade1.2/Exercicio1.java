import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Informe o numero 1");
        int numero1 = sc.nextInt();
        System.out.println("Informe o numero 2");
        int numero2 = sc.nextInt();

        int soma = (numero1 + numero2);
        System.out.println("A soma dos dois numeros é "+soma);
        
        sc.close();
    }
}
