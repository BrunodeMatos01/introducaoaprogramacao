package Unidade5;

public class Exemplo1 {
    public static void main(String[] args) {
        for (int numero = 1; numero <= 100; numero++) {
            System.out.println("O num é: "+ numero);
        }

        for (int i=0; i<=100; i++){
            System.out.println(i);
            i++;

            //if ((i % 2) == 0) {
                //System.out.println(i);
           //}

           if ((i % 2) != 0) {
                System.out.println(i);
           }
        }
    }
}
