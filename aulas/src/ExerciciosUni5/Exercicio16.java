package ExerciciosUni5;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double somaGrupo = 0;
        double soma = 0;
        double altura = 0;
        int qtdMulheres = 0;
        int qtdH = 0;
        do {
            System.out.println("Altura");
            altura = sc.nextDouble();
            if (altura != 0) {
                System.out.println("Genero");
                char genero = sc.next().toLowerCase().charAt(0);
                if (genero == 'f') {
                    soma += altura;
                    qtdMulheres++;
                } else {
                    somaGrupo += altura;
                    qtdH++;
                }
            }


        } while (altura != 0);

        double mediaMulheres = soma / qtdMulheres;
        double mediaGrupo = somaGrupo / qtdH;   
        System.out.println("Média das mulheres " + soma + "\n" + "Média do grupo " + somaGrupo);
    }
}
