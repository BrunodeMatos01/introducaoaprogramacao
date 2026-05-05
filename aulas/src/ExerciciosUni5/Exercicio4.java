package ExerciciosUni5;

public class Exercicio4 {
    public static void main(String[] args) {
        double numerado = 3;
        double denominador = 2;
        double soma = 0;

        for (double i=1; i<=20; i++) {
            soma+= numerado / denominador;
            numerado += 2;
            denominador += numerado-1;
        }
        System.out.println(soma);
    }
}
