package Unidade3;

import java.util.Scanner;

public class Exercicio2 {

    private float valorDoCalcado;

    public Exercicio2(float valorDoCalcado){
        this.valorDoCalcado = valorDoCalcado;
    }

    public float totalDesconto(){
        return valorDoCalcado * 0.12f;
    }
    
    public float produtoComDesconto(){
        return valorDoCalcado - this.totalDesconto();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Valor do Calçado");
        float valorDoCalcado = sc.nextFloat();

        Exercicio2 Exe2 = new Exercicio2(valorDoCalcado);

        float valorDesconto =  Exe2.totalDesconto();
        float valorAPagar = Exe2.produtoComDesconto();

        System.out.println("O valor do desconto é "+valorDesconto+" e o par fica "+valorAPagar);
    }

}
