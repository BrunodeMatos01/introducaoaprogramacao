import java.util.Scanner;

public class Exercicio6 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe o seu ID");
        float ID = sc.nextInt();
        System.out.println("Informe quantas horas você trabalhou ");
        float horas = sc.nextInt();
        System.out.println("Informe seu salario/H");
        float salario = sc.nextInt();

    float salarioH = (horas * salario);    
    System.out.printf("Seu salario é de %.2f%n", ID, salarioH);

    sc.close();
 }
}
