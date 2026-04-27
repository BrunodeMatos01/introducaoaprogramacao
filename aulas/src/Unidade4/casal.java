package Unidade4;

import java.util.Scanner;

public class casal {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    
    System.out.println("Marquinhos");
    int idadeM = sc.nextInt();
    System.out.println("Zezinho");
    int idadeZ = sc.nextInt();
    System.out.println("Luluzinha");
    int idadeL = sc.nextInt();

    if (idadeM < idadeZ && idadeM < idadeL) {
        System.out.println("Marquinhos é o caçula");

    }else if (idadeZ < idadeM && idadeZ < idadeL) {
        System.out.println("Zezinho é o caçula");
        
    }else{
        System.out.println("Luluzinha é a caçula");
    }
   } 
}
