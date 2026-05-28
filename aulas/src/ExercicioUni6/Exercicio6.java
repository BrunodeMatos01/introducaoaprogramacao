package ExercicioUni6;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

import Unidade6.vetor;

public class Exercicio6 {
    private Scanner sc = new Scanner(System.in);
    private int tamanho = 0;

    public double[] ler() {
        System.out.println("Informe um valor");
        tamanho = sc.nextInt();
        double[] vetor = new double[tamanho];

        for(int i=0; i<tamanho; i++){
            System.out.println("informe o valor" + i);
            vetor[i] = sc.nextDouble();
        }

        return vetor;
    }

    public boolean verificado(double[] vetor) {
        System.out.println("Informe um valor");
        double valor = sc.nextDouble();

        for(int i=0; i<tamanho; i++) {
            if (valor == vetor[i]) {
               return true;
            }
        }
        
        return false;
        
    }

    public static void main(String[] args) {
        
        Exercicio6 exe6 = new Exercicio6();

        double[] vetor = exe6.ler();

        if (exe6.verificado(vetor)) {
            System.out.println("Verdadeiro - valor encontrado no vetor.");
        } else {
            System.out.println("Falso - valor não encontrado no vetor.");
        }
    }
}
