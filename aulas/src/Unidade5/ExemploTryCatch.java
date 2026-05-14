package Unidade5;

import java.util.Scanner;

public class ExemploTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        System.out.println("Digite um numero");
        try {
            numero = sc.nextInt();
        }catch (Exception ex) {
            System.out.println("Numero invalido");
            numero = 0;
            ex.getMessage();
        }
    }
}
