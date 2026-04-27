package Unidade3;

import java.util.Scanner;
 
public class Exercicio13 {
    private double azulejo = 12.50;
    private double altura, comprimento;
 
    public Exercicio13(double altura, double comprimento){
        this.altura = altura;
        this.comprimento = comprimento;
    }
 
    public double valorAzulejos(){
        return (comprimento * altura * 9) * azulejo;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Altura: ");
        double altura = sc.nextDouble();
 
        System.out.println("Comprimento: ");
        double comprimento = sc.nextDouble();
 
        Exercicio13 calc = new Exercicio13(altura, comprimento);
        double valorTotal = calc.valorAzulejos();
 
        System.out.println("O valor final é: " + valorTotal);
    }
}
 