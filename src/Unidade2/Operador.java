package Unidade2;

public class Operador {
    
    public static void main(String[] args) {
        int num1 = 0;
        num1++;
        num1++;
        num1--;
        ++num1;

        int num2 = 5;
        num1 = num1 + num2;
        num1 += num2;
        num1 = num1 - num2;
        num1 -= num2;
        num1 = num1 * num2;
        num1 *= num2;

        String texto = "oiio, opa";
        texto.toUpperCase();
        System.out.println(texto);

        String texto1 = "AAAAAAAAAAAA";
        texto1.toLowerCase();
        System.out.println(texto1);

        boolean verdade = false;
        verdade = (texto1 == texto);
        System.out.println(verdade);
    }
}
