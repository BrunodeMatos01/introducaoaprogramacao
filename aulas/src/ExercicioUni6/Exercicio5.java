package ExercicioUni6;

import java.util.Scanner;

public class Exercicio5 {
    private Scanner sc = new Scanner(System.in);
    private String[] rapaz = new String[5];
    private String[] menina = new String[5];
    private int pontuacao = 0;

    public Exercicio5() {

    }

    public void ler() {
        for (int i = 0; i < 1; i++) {
            System.out.println("Gosta de música sertaneja?");
            rapaz[i] = sc.next();
            System.out.println("Gosta de futebol?");
            rapaz[i + 1] = sc.next();
            System.out.println("Gosta de seriados?");
            rapaz[i + 2] = sc.next();
            System.out.println("Gosta de redes sociais?");
            rapaz[i + 3] = sc.next();
            System.out.println("Gosta da Oktoberfest?");
            rapaz[i + 4] = sc.next();
        }
        for (int i = 0; i < 1; i++) {
            System.out.println("Gosta de música sertaneja?");
            menina[i] = sc.next();
            System.out.println("Gosta de futebol?");
            menina[i + 1] = sc.next();
            System.out.println("Gosta de seriados?");
            menina[i + 2] = sc.next();
            System.out.println("Gosta de redes sociais?");
            menina[i + 3] = sc.next();
            System.out.println("Gosta da Oktoberfest?");
            menina[i + 4] = sc.next();
        }
    }

    public void comparar() {
        for (int i=0; i < 5; i++) {
            if (rapaz[i].equalsIgnoreCase("sim") && menina[i].equalsIgnoreCase("sim")
                    || rapaz[i].equalsIgnoreCase("nao") && menina[i].equalsIgnoreCase("nao")
                    || rapaz[i].equalsIgnoreCase("ind") && menina[i].equalsIgnoreCase("ind")) {
                pontuacao += 3;
            } else if (rapaz[i].equalsIgnoreCase("ind") && menina[i].equalsIgnoreCase("sim")
                    || rapaz[i].equalsIgnoreCase("ind") && menina[i].equalsIgnoreCase("nao")
                    || rapaz[i].equalsIgnoreCase("sim") && menina[i].equalsIgnoreCase("ind")
                    || rapaz[i].equalsIgnoreCase("ind") && menina[i].equalsIgnoreCase("nao")) {
                pontuacao += 1;
            } else if (rapaz[i].equalsIgnoreCase("sim") && menina[i].equalsIgnoreCase("nao")
                    || rapaz[i].equalsIgnoreCase("nao") && menina[i].equalsIgnoreCase("sim")) {
                pontuacao -= 2;
            }
        }
    }

    public void escrever() {
        if (pontuacao >= 15) {
            System.out.println("Casem");
        } else if (pontuacao >= 10 ) {
            System.out.println("Vocês têm muita coisa em comum!");
        } else if (pontuacao >= 5 ) {
            System.out.println("Talvez não dá certo :(");
        } else if (pontuacao >= 0 ) {
            System.out.println("Vale um encontro");
        } else if (pontuacao >= -9 ) {
            System.out.println("Melhor não perder tempo");
        } else if (pontuacao <= -10 ) {
            System.out.println("Melhor não perder tempo");
        }
        
    }

    public static void main(String[] args) {
        Exercicio5 exe5 = new Exercicio5();

        exe5.ler();
        exe5.comparar();
        exe5.escrever();
    }

}
