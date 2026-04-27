package Unidade2;
 
public class Calculadora {
       
    int numero1, numero2, resultado;
 
    public Calculadora(){
        this.numero1 = 5;
        this.numero2 = 7;
        resultado = somar();
        System.out.println(resultado);
 
        this.numero1 = 4;
        this.numero2 = 5;
        resultado = somar();
        System.out.println(resultado);
 
        resultado = somaDoisValores(numero2, numero1);
        System.out.println(resultado);
 
        somaValores();
        System.out.println(resultado);
    }
 
    public int somar(){
        return numero1 + numero2;
    }
 
    public int somaDoisValores(int num1, int num2){
        return num1 + num2;
    }
 
    public void somaValores(){
        resultado = numero1 + numero2;
    }
 
    public static void main(String[] args) {
        new Calculadora();
       
    }
}
 