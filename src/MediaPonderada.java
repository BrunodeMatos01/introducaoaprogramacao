import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {
        float prova1 = 0;
        float prova2 = 0;
        float projetoFinal = 0;
        float exercicioUnidade1 = 0;
        float exercicioUnidade2 = 0;
        float exercicioUnidade3 = 0;
        float exercicioUnidade4 = 0;
        float exercicioUnidade5 = 0;
        float exercicioUnidade6 = 0;
        float exercicioUnidade7 = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digita a nota da prova1 ");
        prova1 = sc.nextFloat();
        System.out.println("Digita a nota da prova2 ");
        prova2 = sc.nextFloat();
        System.out.println("Digita a nota do Projeto Final ");
        projetoFinal = sc.nextFloat();
        System.out.println("Digita a nota da exercicioUnidade1 ");
        exercicioUnidade1 = sc.nextFloat();
        System.out.println("Digita a nota da exercicioUnidade2 ");
        exercicioUnidade2 = sc.nextFloat();
        System.out.println("Digita a nota da exercicioUnidade3 ");
        exercicioUnidade3 = sc.nextFloat();
        System.out.println("Digita a nota da exercicioUnidade4 ");
        exercicioUnidade4 = sc.nextFloat();
        System.out.println("Digita a nota da exercicioUnidade5 ");
        exercicioUnidade5 = sc.nextFloat();
        System.out.println("Digita a nota da exercicioUnidade6 ");
        exercicioUnidade6 = sc.nextFloat();
        System.out.println("Digita a nota da exercicioUnidade7 ");
        exercicioUnidade7 = sc.nextFloat();

        float MediaAritmetrica = ((exercicioUnidade1 + exercicioUnidade2 + exercicioUnidade3 + exercicioUnidade4 + exercicioUnidade5 + exercicioUnidade6 + exercicioUnidade7)/7) * 0.2f;
        float mediaPonderada = (prova1 * 0.2f + prova2 * 0.3f + projetoFinal * 0.3f);
        float mediaFinal = (MediaAritmetrica + mediaPonderada);

        System.out.println("Média é "+ mediaFinal);

        
        sc.close();
    }

}
