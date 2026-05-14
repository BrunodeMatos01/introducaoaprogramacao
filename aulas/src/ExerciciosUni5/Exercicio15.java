package ExerciciosUni5;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resultado = "";
        String nome = "";

        do{
            System.out.println("Nome do aluno");
            nome = sc.next();
            if (!nome.equals("fim")) {
                System.out.println("Informe a nota 1");
                double nota1 = sc.nextDouble();
                System.out.println("Informe a nota 2");
                double nota2 = sc.nextDouble();
                double media = (nota1 + nota2) / 2;
                resultado = resultado + "Nome " + nome + " Média : " + media + "\n";
            }
        } while (!nome.equals("fim"));
            System.out.println("--- Resultados ---");
            System.out.print(resultado);

    }
}
