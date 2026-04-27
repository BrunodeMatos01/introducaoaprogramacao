package Unidade3;

import java.util.Scanner;

public class Exercicio11 {
    private double tempCelcius;
 
    public Exercicio11(double tempCelcius){
        this.tempCelcius = tempCelcius;
    }
 
    public double calculaF(){
        return (tempCelcius * 9) / 5 + 32;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Temperatura em C°: ");
        double celcius = sc.nextDouble();
 
        Exercicio11 calc = new Exercicio11(celcius);
        double calculaF = calc.calculaF();
        System.out.println("Temperatura em °F é igual a: " + calculaF);
    }
}