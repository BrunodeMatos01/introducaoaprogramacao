import java.util.Scanner;

public class AreaDaSalaInformada {
    public static void main(String[] args) {
        float frente = 0;
        float lateral = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a metragem da frente");
        frente = teclado.nextFloat();
        System.out.println("Digita a metragem da lateral");
        lateral = teclado.nextFloat();

        float area = frente * lateral;
        System.out.println("A area é "+ area);
    }
}
