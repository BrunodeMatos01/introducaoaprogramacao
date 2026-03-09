import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o numero 1");
        float frente = sc.nextFloat();
        System.out.println("Informe o numero 2");
        float lateral = sc.nextFloat();

        float area = (frente * lateral);
        float raio = (area/2); 
        double potencia = Math.pow(raio, 2f);
        double pi = potencia * Math.PI;

        System.out.printf("Resultado: %.2f%n",pi);

        sc.close();
    }
}
