package ExerciciosUni4;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Entrada
        System.out.println("Hora chegada:");
        int horaChegada = sc.nextInt();

        System.out.println("Minuto chegada:");
        int minChegada = sc.nextInt();

        System.out.println("Hora saída:");
        int horaSaida = sc.nextInt();

        System.out.println("Minuto saída:");
        int minSaida = sc.nextInt();

        int chegadaMin = horaChegada * 60 + minChegada;
        int saidaMin = horaSaida * 60 + minSaida;

        if (saidaMin <= chegadaMin) {
            System.out.println("Horário inválido!");
            return;
        }

        // Tempo total
        int tempo = saidaMin - chegadaMin;

        int horas = tempo / 60;
        int resto = tempo % 60;

        if (resto >= 30) {
            horas++;
        }

        if (horas == 0) {
            horas = 1;
        }

        double preco = 0;

        switch (horas) {
            case 1:
                preco = 5.0;
                break;

            case 2:
                preco = 10.0;
                break;

            case 3:
                preco = 10.0 + 7.5; 
                break;

            case 4:
                preco = 10.0 + 15.0; 
                break;

            default:
                
                preco = 10.0;

                preco += 15.0;


                preco += (horas - 4) * 10.0;
                break;
        }

        // Saída
        System.out.printf("Tempo estacionado: %d hora(s)\n", horas);
        System.out.printf("Preço cobrado = R$ %.2f\n", preco);

        sc.close();
    }
}