package Unidade3;

import java.util.Scanner;

public class Exercicio16 {

    private int valorCompra;
    private int valorPago;

    public Exercicio16(int valorCompra, int valorPago) {
        this.valorCompra = valorCompra;
        this.valorPago = valorPago;
    }

    public void calcularTroco() {
        int troco = valorPago - valorCompra;

        if (troco < 0) {
            System.out.println("Valor pago insuficiente.");
            return;
        }

        int notas100 = troco / 100;
        troco = troco % 100;

        int notas10 = troco / 10;
        troco = troco % 10;

        int notas1 = troco;

        int totalNotas = notas100 + notas10 + notas1;

        System.out.println("O número mínimo de notas de troco é: " + totalNotas);
        System.out.println("Quantidade de notas de 100 necessárias é: " + notas100);
        System.out.println("Quantidade de notas de 10 necessárias é: " + notas10);
        System.out.println("Quantidade de notas de 1 necessárias é: " + notas1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor total da compra: ");
        int compra = sc.nextInt();

        System.out.print("Valor pago pelo cliente: ");
        int pago = sc.nextInt();

        Exercicio16 exe16 = new Exercicio16(compra, pago);
        exe16.calcularTroco();

        sc.close();
    }
}