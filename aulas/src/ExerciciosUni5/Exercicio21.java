package ExerciciosUni5;

import java.util.Scanner;

public class Exercicio21 {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double chico = 1.50;
        double ze = 1.10;
        int ano = 0;

        while(chico > ze) {
            chico = chico + 0.02;
            ze = ze + 0.03;
            ano++;
        }

        System.out.println("Se passaram " + ano + " anos ate o ze ficar maior que o chico.");


    }
}
