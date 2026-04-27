package ExerciciosUni4;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Dia do vencimento: ");
        int diaVencimento = s.nextInt();
        System.out.print("Dia do pagamento: ");
        int diaPagamento = s.nextInt();
        System.out.print("Valor da prestação: ");
        double valorPrestacao = s.nextDouble();

        if (diaPagamento <= diaVencimento) {
            valorPrestacao *= 0.90;
            System.out.printf("O pagamento está em dia. O valor da prestação = R$%.2f\n", valorPrestacao);
        } else if (diaPagamento <= diaVencimento + 5) {
            System.out.printf("O valor da prestação = R$%.2f\n", valorPrestacao);
        } else {
            int diasAtraso = diaPagamento - diaVencimento;
            valorPrestacao += valorPrestacao * (0.02 * diasAtraso);
            System.out.printf("O pagamento está atrasado. Multa de 2%% por dia de atraso. Valor da prestação = R$ %.2f.\n", valorPrestacao);
        }
        s.close();
    }
}
