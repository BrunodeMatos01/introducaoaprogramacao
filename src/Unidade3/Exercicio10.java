package Unidade3;

import java.util.Scanner;
 
public class Exercicio10 {
    private double catetoOposto, catetoAdjacente;
 
    public Exercicio10 (double catetoOposto, double catetoAdjacente){
        this.catetoAdjacente = catetoAdjacente;
        this.catetoOposto = catetoOposto;
    }
 
    public double hipotenusa(){
        return Math.sqrt(Math.pow(catetoOposto, 2) + Math.pow(catetoAdjacente, 2));
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Cateto oposto: ");
        double catetoOposto = sc.nextDouble();
 
        System.out.println("Cateto adjacente: ");
        double catetoAdjacente = sc.nextDouble();
 
        Exercicio10 calc = new Exercicio10(catetoOposto, catetoAdjacente);
        double calcHipotenusa = calc.hipotenusa();
        System.out.printf("A hipotenusa é: %.2f" , calcHipotenusa);
    }
}