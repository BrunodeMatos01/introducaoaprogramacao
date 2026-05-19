package ExercicioUni6;

import java.util.Scanner;

public class Exercicio1 {

    private int[] numeros = new int[10];

    public Exercicio1(){
    }

    public void ler() {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<10; i++) {
            System.out.println("Digite o numero "+i);
            numeros[i] = sc.nextInt();
        }
    }

    public void escrever(){
        for (int i=10 - 1; i>=0; i--){
            System.out.println(numeros[i]);
        }
    }
    public void main(String[] args) {    
        
        Exercicio1 exe1 = new Exercicio1();
        exe1.ler();
        exe1.escrever();
        
    }
}
