package ExerciciosUni5;

public class Exercicio10 {
    public static void main(String[] args) {
        for (int i=0; i<10000; i++) {
            for (int j=0; j<10000; j++) {
                //System.out.println(i + "+" + j + "=" + (i+j));
                int soma = i + j;
                String termo1 = i+""+j;
                String termo2 = ""+Math.pow(soma, 2);
                if (termo1.equals(termo2)) {
                    System.out.println(termo1 + "- "+ termo2);
                }
            }
        }
    }
}
