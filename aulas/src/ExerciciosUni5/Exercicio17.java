package ExerciciosUni5;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double somaGrupo = 0;
        int qtd = 0;
        double inscricao = 0;
        double maiorAltura = Double.MIN_VALUE;
        double menorAltura = Double.MAX_VALUE;
        double altura = 0;
        int maiorInscricao = 0;
        int menorInscricao = 0;
        do {
            System.out.println("Inscrição");
            inscricao = sc.nextDouble();
            if (inscricao != 0) {
                System.out.println("Altura");
                altura = sc.nextDouble();
                somaGrupo += altura;
                qtd++;
                if (altura > maiorAltura) {
                    maiorAltura = altura;
                    maiorInscricao = (int) inscricao;
                } else if (altura < menorAltura) {
                    menorAltura = altura;
                    menorInscricao = (int) inscricao;
                }
            }
        } while (inscricao != 0);
        double somaTotal = somaGrupo / qtd;
        System.out.println("O mais baixo tem " + menorAltura + " e a inscrição é " + inscricao + "\n" + 
            "O mais alto tem " + maiorAltura + " e a inscrição é " + inscricao+ "\n" + "Altura média : " + somaTotal);

    }
}
