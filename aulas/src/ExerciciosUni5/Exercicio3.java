package ExerciciosUni5;

public class Exercicio3 {
    public static void main(String[] args) {
        double soma = 0;

        for (int i = 1; i <= 100; i++) {
            soma += 1 / i;
        }
        System.out.println("Soma: " + soma);
    }
}
