package ExercicioUni6;

import java.util.Scanner;

public class Exercicio9 {
    private Scanner sc = new Scanner(System.in);

    private int[] sexos;
    private int[] notas;
    private int[] idades;

    private final int QUANTIDADE_CLIENTES = 30;

    public Exercicio9() {
        sexos = new int[QUANTIDADE_CLIENTES];
        notas = new int[QUANTIDADE_CLIENTES];
        idades = new int[QUANTIDADE_CLIENTES];

        System.out.println("--- Pesquisa de Satisfação do Cinema ---");

        lerDados();

        double mediaGeral = calcularMediaGeral();
        double mediaHomens = calcularMediaHomens();
        int notaMulherMaisJovem = descobrirNotaMulherMaisJovem();
        int mulheresMais50AcimaMedia = contarMulheresAcima50(mediaGeral);

        imprimirRelatorio(mediaGeral, mediaHomens, notaMulherMaisJovem, mulheresMais50AcimaMedia);
    }

    public static void main(String[] args) {
        new Exercicio9();
    }

    public void lerDados() {
        for (int i = 0; i < QUANTIDADE_CLIENTES; i++) {
            System.out.println("\nCliente " + (i + 1) + ":");

            do {
                System.out.print("Sexo (1=Feminino, 2=Masculino): ");
                sexos[i] = sc.nextInt();
            } while (sexos[i] != 1 && sexos[i] != 2);

            System.out.print("Nota para o cinema (0 a 10): ");
            notas[i] = sc.nextInt();

            // Leitura da Idade
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
        }
    }

    public double calcularMediaGeral() {
        double somaNotas = 0;
        for (int i = 0; i < QUANTIDADE_CLIENTES; i++) {
            somaNotas += notas[i];
        }
        return somaNotas / QUANTIDADE_CLIENTES;
    }

    public double calcularMediaHomens() {
        double somaNotasHomens = 0;
        int contHomens = 0;

        for (int i = 0; i < QUANTIDADE_CLIENTES; i++) {
            if (sexos[i] == 2) { // 2 = Masculino
                somaNotasHomens += notas[i];
                contHomens++;
            }
        }

        if (contHomens == 0) return 0;
        return somaNotasHomens / contHomens;
    }

    public int descobrirNotaMulherMaisJovem() {
        int menorIdade = Integer.MAX_VALUE;
        int notaDaMaisJovem = -1;

        for (int i = 0; i < QUANTIDADE_CLIENTES; i++) {
            if (sexos[i] == 1) { // 1 = Feminino
                if (idades[i] < menorIdade) {
                    menorIdade = idades[i];
                    notaDaMaisJovem = notas[i];
                }
            }
        }
        return notaDaMaisJovem;
    }

    public int contarMulheresAcima50(double mediaGeral) {
        int contador = 0;

        for (int i = 0; i < QUANTIDADE_CLIENTES; i++) {
            boolean isMulher = sexos[i] == 1;
            boolean isMais50Anos = idades[i] > 50;
            boolean isNotaAcimaMedia = notas[i] > mediaGeral;

            if (isMulher && isMais50Anos && isNotaAcimaMedia) {
                contador++;
            }
        }
        return contador;
    }

    public void imprimirRelatorio(double mediaGeral, double mediaHomens, int notaJovem, int qtdeMulheres50) {
        System.out.println("\n=== RELATÓRIO FINAL ===");
        System.out.printf("Nota média do cinema: %.2f\n", mediaGeral);
        System.out.printf("Nota média dos homens: %.2f\n", mediaHomens);

        if (notaJovem != -1) {
            System.out.println("Nota atribuída pela mulher mais jovem: " + notaJovem);
        } else {
            System.out.println("Nenhuma mulher participou da pesquisa.");
        }

        System.out.println("Mulheres > 50 anos com nota acima da média geral: " + qtdeMulheres50);
    }
}
