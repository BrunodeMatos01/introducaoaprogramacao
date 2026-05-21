package ExercicioUni6;

import java.util.Scanner;

public class Exercicio3 {
    Scanner sc = new Scanner(System.in);
    private double[] valores = new double[12];
    private String escrever;
    private double zero2 = 0.02;
    private double zero5 = 0.05;
    private double pares = 0;
    private double impares = 0;

    public Exercicio3() {

    }

    public void ler() {
        for(int i=0; i<12; i++) {
            System.out.println("Informe 12 numeros");
            valores[i] = sc.nextDouble();
        }
    }

    public void ajustar() {
        for(int i=0; i<12; i++) {
            if (i % 2 == 0) {
                pares = valores[i] * zero2;     
                valores[i] = valores[i] + pares;
            } else {
                impares = valores[i] * zero5;
                valores[i] = valores[i] + impares;
            }
        }
    }

    public void escrever() {
        for(int i=0; i<12; i++) {
            System.out.println("Valor " +i + ": " + valores[i]);
        }
    }

    public static void main(String[] args) {
        Exercicio3 exe3 = new Exercicio3();

        exe3.ler();
        exe3.ajustar();
        exe3.escrever();
    }
}
