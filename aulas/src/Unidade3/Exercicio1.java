package Unidade3;

import java.util.Scanner;

public class Exercicio1 {

    private int largura;
    private int comprimento;

    public Exercicio1(int largura, int comprimento){
        this.largura = largura;
        this.comprimento = comprimento;    
    }

    public int area(){
        return this.largura * this.comprimento;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Numero 1");
        int larg = sc.nextInt();
        System.out.println("Numero 2");
        int compri = sc.nextInt();

        Exercicio1 Exe1 = new Exercicio1(larg, compri);
        int area = Exe1.area();
        System.out.println(area);
        sc.close();
    }
}
