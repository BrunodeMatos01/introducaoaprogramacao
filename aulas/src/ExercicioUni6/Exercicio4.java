package ExercicioUni6;

import java.util.Scanner;

public class Exercicio4 {

    private Scanner sc = new Scanner(System.in);
    private int[] vetor1 = new int[10];
    private int[] vetor2 = new int[10];
    private int[] vetor3 = new int[10];
    private int soma = 0;

    public Exercicio4(){

    }

    public void ler() {
        for(int i=0; i<10; i++) {
            System.out.println("Informe 10 numeros");
            vetor1[i] = sc.nextInt();
        }
        for(int i=0; i<10; i++) {
            System.out.println("Informe 10 numeros");
            vetor2[i] = sc.nextInt();
        }
    }

    public void soma() {
        for(int i=0; i<10; i++) {
            soma = vetor1[i] + vetor2[i];
            vetor3[i] = soma;
        }
    }

    public void escrever() {
    System.out.print("vetor1 = [");
    for(int i=0; i<10; i++) {
        System.out.print(vetor1[i]);
        if(i < 9) System.out.print(",");
    }
    System.out.println("]");

    System.out.print("vetor2 = [");
    for(int i=0; i<10; i++) {
        System.out.print(vetor2[i]);
        if(i < 9) System.out.print(",");
    }
    System.out.println("]");

    System.out.print("vetor3 = [");
    for(int i=0; i<10; i++) {
        System.out.print(vetor3[i]);
        if(i < 9) System.out.print(",");
    }
    System.out.println("]");
}

    public static void main(String[] args) {
        
        Exercicio4 exe4 = new Exercicio4();

        exe4.ler();
        exe4.soma();
        exe4.escrever();
    }

}
