package Unidade3;

import java.util.Scanner;

public class Exercicio6 {

    private double kilo = 25.00;
    private double pesoPrato;
    
    public Exercicio6(double pesoPrato){
        this.pesoPrato = pesoPrato;
    }

    public double aPagar(){
        return (((pesoPrato * 1000) - 750) / 1000) * 25.00;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Peso do Prato");
        double pesoPrato = sc.nextDouble();

        Exercicio6 Exe6 = new Exercicio6(pesoPrato);
        
        double aPagar = Exe6.aPagar();
        
        System.out.printf("%.2f Valor a Pagar", aPagar);
    }
}
