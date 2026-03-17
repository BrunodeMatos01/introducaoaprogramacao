package Unidade3;

import java.util.Scanner;

public class Exercicio5 {

    private double valorChip = 4.0;
    private double valorAlimento = 7.0;
    private int qtdFrango;

    public Exercicio5(int qtdFrango){
        this.qtdFrango = qtdFrango;
    }

    public double precoTotal(){
        return (qtdFrango * valorChip) + (qtdFrango * valorAlimento);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantidade de Frangos");
        int qtdFrango = sc.nextInt();

        Exercicio5 Exe5 = new Exercicio5(qtdFrango);

        Double ValorTotal = Exe5.precoTotal();
        System.out.printf("%.2f Valor = ",ValorTotal);
    }
}
