package Unidade3;

import java.util.Scanner;
 
public class Exercicio14 {
    private double distancia, tempo;
    private double quilometroPorLitro = 12;
 
    public Exercicio14(double distancia, double tempo){
        this.distancia = distancia;
        this.tempo = tempo;
    }
 
    public double calculaVelocidade(){
        return distancia / tempo;
    }
 
    public double calculaCombustivel(){
        return distancia / quilometroPorLitro;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Distância percorrida: ");
        double distancia = sc.nextDouble();
 
        System.out.println("Tempo do trajeto: ");
        double tempo = sc.nextDouble();
 
        Exercicio14 calc = new Exercicio14(distancia, tempo);
        double calculaVelocidade = calc.calculaVelocidade();
        double calculaCombustivel = calc.calculaCombustivel();
 
        System.out.println("A velocidade média foi de " + calculaVelocidade + "km/h e a quantidade de combustível usado foi " +
        calculaCombustivel + " litros");
 
        sc.close();
    }
}
 
 