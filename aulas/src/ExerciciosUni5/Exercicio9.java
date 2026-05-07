package ExerciciosUni5;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtd = 0;
        String tem18 = "";
        int cont20 = 0;
        String nomes = "";

        System.out.println("Informe a quantidade de alunos");
        qtd = sc.nextInt();

        for (int i=0; i<qtd; i++) {
            System.out.println("Informe o nome");
            nomes = sc.next();
            System.out.println("Informe a idade");
            int idades = sc.nextInt();
            if (idades == 18) {
                tem18 += nomes + " ";
            } else if (idades >= 20){
                cont20++;
            }
        }
        System.out.println("Alunos com 18 " + tem18);
        System.out.println("Quantidade de alunos de 20 para cima "+ cont20);

    }
}
