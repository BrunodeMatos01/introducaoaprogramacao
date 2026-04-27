package Unidade4;

import java.util.Scanner;

public class calculadora {

    private float numero1 = 0;
    private float numero2 = 0;

    public calculadora(float numero1, float numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public float Somar(){
        return numero1 + numero2;
    }

    public float diminuir(){
        return numero1 - numero2;
    }

    public float dividir(){
        return numero1 / numero2;
    }

    public float mutiplicar(){
        return numero1 * numero2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o operador");
        String operador = sc.next();
        System.out.println("Numero 1");
        float numero1 = sc.nextFloat();
        System.out.println("Numero 2");
        float numero2 = sc.nextFloat();

        calculadora calc = new calculadora(numero1, numero2);

        if (operador.equals("+")) {
            System.out.println(calc.Somar()); 
        }else if(operador.equals("-")){
            System.out.println(calc.diminuir());
        }else if(operador.equals("/")){
            System.out.println(calc.dividir());
        }else{
            System.out.println(calc.mutiplicar());
        }
    }
}
