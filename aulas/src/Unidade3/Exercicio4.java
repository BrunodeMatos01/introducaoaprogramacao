package Unidade3;

import java.util.Scanner;

public class Exercicio4 {
    
    private double nota1;
    private double nota2;
    private double nota3;

    private double peso1 = 0.5;
    private double peso2 = 0.3;
    private double peso3 = 0.2;

    

    public Exercicio4 (double nota1, double nota2, double nota3){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double mediaPonderada(){
        return (nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("nota 1");
        double nota1 = sc.nextDouble();

        System.out.println("nota 2");
        double nota2 = sc.nextDouble();

        System.out.println("nota 3");
        double nota3 = sc.nextDouble();

        Exercicio4 Exe4 = new Exercicio4(nota1, nota2, nota3);

        double meidaFinal = Exe4.mediaPonderada();

        System.out.printf("%.2f Média = ", meidaFinal);
    }

}
