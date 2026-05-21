package ExercicioUni6;

import java.util.Scanner;

public class Exercicio2 {
    private Scanner sc = new Scanner(System.in);
    private double[] valores = new double[12];
    private double soma = 0;
    private double media = 0;
    private String escrever;
    

    public Exercicio2() {

    }   
    
    public void ler() {
        for(int i=0; i<12; i++){
            System.out.print("Digite um numero real: ");
            valores[i] = sc.nextDouble();
        }
    }

    public void media() {
        for(int i=0; i<12; i++){
            soma += valores[i];
            media = soma / 12;
        }
    }

    public void maioresQueMedia() {
        for(int i=0; i<12; i++) {
            if (valores[i] > media) {
                escrever = "Maiores que a média: " + valores[i] + " ";
                System.out.print(escrever);
            }
        }
    }

    public static void main(String[] args) {
        
        Exercicio2 exe2 = new Exercicio2();

        exe2.ler();
        exe2.media();
        exe2.maioresQueMedia();
    }
}
