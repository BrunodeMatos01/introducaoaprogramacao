package Unidade4;

import java.util.Scanner;

public class Idade2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Idade");
        int idade = sc.nextInt();

        if (idade > 18) {
            System.out.println("Adulto");            
        }else if (idade > 6 || idade <= 18) {
            System.out.println("criança");
        }else{
            System.out.println("Infantil");
        }        
    }
}
