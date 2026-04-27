package Unidade3;

import java.util.Scanner;

public class Exercicio9 {
    private double raio;
    private double altura;

    public Exercicio9(double raio, double altura){
        this.raio = raio;
        this.altura = altura;
    }

    public double volume(){
        return (Math.pow(raio, 2) * Math.PI) * altura;
    } 

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("raio");
        double raio = sc.nextDouble();
        System.out.println("altura");
        double altura = sc.nextDouble();

        Exercicio9 Exe9 = new Exercicio9(raio, altura);

        double volume = Exe9.volume();
        System.out.printf("%.2f volume",volume);
    }
}
