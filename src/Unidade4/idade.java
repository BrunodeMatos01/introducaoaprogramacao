package Unidade4;

import java.util.Scanner;

public class idade {    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("sua idade");
        int idade = sc.nextInt();
        System.out.println("Doador?");
        String resposta = sc.next();
        boolean doador = false;
        if(resposta.equalsIgnoreCase("S") 
            || resposta.equalsIgnoreCase("Sim")){
            doador = true;
        }
             

        if (idade < 18 || idade > 60 || doador) { 
            System.out.println("Meia Entrada");
        }else{
            System.out.println("Entrada Cheia");
        }


    }
    
    

}
