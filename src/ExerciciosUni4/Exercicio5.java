package ExerciciosUni4;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("A cor é azul?");
        String resposta = sc.next();

        if (resposta.equalsIgnoreCase("True")) {
            System.out.println("Sim");
        }else{
            System.out.println("Não");
        }
    }
}
