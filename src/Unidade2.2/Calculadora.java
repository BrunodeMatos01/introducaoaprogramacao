public class Calculadora {
    int numero1, numero2, resultado;

    public Calculadora(){
        numero1 = 5;
        numero2 = 7;
        resultado = somar();

        System.out.println(resultado);
    }

    public int somar(){
       return numero1 + numero2;
    }

    public static void main(String[] args) {
        new Calculadora();
    }
}
