package Unidade5;

public class exemploWhile {
    public static void main(String[] args) {
        boolean continuar = true;
        int contador = 0;
        while (continuar) {
            System.out.println("Continuando");
            contador++;
            if (contador>=10) {
                continuar = false;
            }
        }
    }
}
