package Unidade2;

import java.util.Scanner;

public class Calculadorav2 {
    private double num1;
    private double num2;

    public Calculadorav2(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public double somar(){
        return num1 + num2;
    }

    public double dividir(){
        return num1 / num2;
    }  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o numero 1");
        double n1 = sc.nextDouble();
        System.out.println("Digite o numero 1");
        double n2 = sc.nextDouble();

        Calculadorav2 calc = new Calculadorav2(n1, n2);
        double resultado = calc.somar();
        System.out.println("A soma é :"+ resultado);

        resultado = calc.dividir();
        System.out.println("Divisão é "+resultado);
    }
}
