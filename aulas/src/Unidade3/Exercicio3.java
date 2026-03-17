package Unidade3;

import java.util.Scanner;

public class Exercicio3 {

    private double valorGasolina = 5.75;
    private double valorPagamento;

    public Exercicio3(double valorPagamento){
        this.valorPagamento = valorPagamento;
    }

    public double Litros(){
        return valorPagamento / valorGasolina;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("valor do pagamento");
        double valorPagamento = sc.nextDouble();
        Exercicio3 Exe3 = new Exercicio3(valorPagamento);

        double valorPago = Exe3.Litros();

        System.out.printf(" Litros = %.2f",valorPago);
    }
    
}
