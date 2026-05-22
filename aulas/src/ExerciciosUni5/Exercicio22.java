package ExerciciosUni5;

public class Exercicio22 {
  public static void main(String[] args) {
        int ano = 1995;
        double salario = 2000.0;
        double aumento = 0.015;

        while (ano < 2026) {
            ano++;

            if (ano == 1996) {
                salario = salario + (salario * aumento);
            } else if (ano >= 1997) {
                aumento = aumento * 2;
                salario = salario + (salario * aumento);
            }
        }
        System.out.printf("O salário do funcionário em %d é de: R$ %.2f\n", ano, salario);
    }
}