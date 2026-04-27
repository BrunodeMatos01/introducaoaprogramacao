package ExerciciosUni4;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor 1");
        int valor1 = sc.nextInt();
        System.out.println("Informe o valor 2");
        int valor2 = sc.nextInt();

        if (valor1 > valor2) {
            System.out.println("Valor 1 é maior");
        }else if(valor1 == valor2){
            System.out.println("Os numeros são igauis");
        }else{
            System.out.println("Valor 2 é maior");
        }
    }
}
