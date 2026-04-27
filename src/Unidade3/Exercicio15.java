package Unidade3;

import java.util.Scanner;

public class Exercicio15 {
    private int numero;
    private int centena;
    private int dezena;
    private int unidade;


    public Exercicio15(int numero){
        this.numero = numero;
    }

    public void divisao(){
        centena = numero / 100;
        dezena = (numero % 100) / 10;
        unidade = (numero % 10) / 1;

        System.out.println(centena + " centena(s) " + dezena + " dezena(s) " + unidade + " unidade(s)");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Numero");
        int numero = sc.nextInt();

        Exercicio15 Exe15 = new Exercicio15(numero);

        Exe15.divisao();

        
    }

}
