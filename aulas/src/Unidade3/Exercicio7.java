package Unidade3;

import java.util.Scanner;

public class Exercicio7 {

    private double p350 = 0.35;
    private double m600 = 0.6;
    private double g2000 = 2;
    private int qtdP;
    private int qtdM;
    private int qtdG;

    public Exercicio7(int qtdP, int qtdM, int qtdG){
        this.qtdP = qtdP;
        this.qtdM = qtdM;
        this.qtdG = qtdG;
    }

    public double emLitros(){
         return (this.qtdP * p350) + (this.qtdM * m600) + (this.qtdG * g2000);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantidade da P");
        int qtdP = sc.nextInt();
        System.out.println("Quantidade da M");
        int qtdM = sc.nextInt();
        System.out.println("Quantidade da G");
        int qtdG = sc.nextInt();
        
        Exercicio7 Exe7 = new Exercicio7(qtdP, qtdM, qtdG);

        double p = Exe7.emLitros();

        System.out.printf("%.2f Total em Litros é ", p);
    }
}
