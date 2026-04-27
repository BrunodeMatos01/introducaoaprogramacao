package Unidade3;

import java.util.Scanner;
 
public class Exercicio12 {
    private String nome;
    private double horasTrabalhadasMes;
    private double salarioHora = 10.00;
    private int dependente;
 
    public Exercicio12(String nome, double horasTrabalhadasMes, int dependente){
        this.nome = nome;
        this.horasTrabalhadasMes = horasTrabalhadasMes;
        this.dependente = dependente;
    }
 
    public double salarioBruto(){
        return (horasTrabalhadasMes * salarioHora);
    }
 
    public double salarioFamilia(){
        return (dependente * 60);
    }
 
    public double desconto(){
        return salarioBruto() * 0.135;
    }
 
    public double salarioLiquido(){
        return (salarioBruto() - desconto()) + salarioFamilia();
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Nome do funcionário: ");
        String nome = sc.nextLine();
       
        System.out.println("Quantidade de horas trabalhadas no mês: ");
        double horasTrabalhadasMes = sc.nextDouble();
 
        System.out.println("Número de dependentes: ");
        int dependente = sc.nextInt();
 
        Exercicio12 calc = new Exercicio12(nome, horasTrabalhadasMes, dependente);
        double salarioBruto = calc.salarioBruto();
        double salarioLiquido = calc.salarioLiquido();
 
        System.out.println("O funcionário João possui um salário bruto de" + salarioBruto + "e um salário líquido de " +  salarioLiquido);
    }
 
   
}