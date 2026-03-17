package Unidade3;

import java.util.Scanner;

public class Exercicio8 {
    private double cotacao = 5.65;
    private double aReceber;

    public Exercicio8(double aReceber){
        this.aReceber = aReceber;
    }

    public double aDevolver(){
        return this.aReceber * this.cotacao;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quanto em dollar");
        double aReceber = sc.nextDouble();

        Exercicio8 Exe8 = new Exercicio8(aReceber);
        double resultado = Exe8.aDevolver();

        System.out.printf("%.2f Resultado: ",resultado);
    }
}
