package Unidade6;

import java.util.Scanner;

public class vetorNome {
    public static void main(String[] args) {
        String[] nomes = new String[10];
        double[] nota = new double[10];
        double maiorNota = Double.MIN_VALUE;
        int posicaomaior = 0;
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<10; i++) {
            System.out.println("Digite o nome "+i);
            nomes[i] = sc.nextLine();
            if (i>0) {
                sc.nextLine();
            }
            System.out.println("Digite a nota "+i);
            nota[i] = sc.nextDouble();            
        }

        for(int i=0; i<10; i++) {
            if (nota[i]>maiorNota) {
                maiorNota = nota[i];
                posicaomaior = i;
            }
            System.out.println(nomes[posicaomaior] + nota[i]);
        }
    }
}
