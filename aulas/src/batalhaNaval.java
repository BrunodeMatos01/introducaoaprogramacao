import java.util.Random;
import java.util.Scanner;

public class batalhaNaval {
    
    // =========================
    //    IMPRIME O TABULEIRO
    // =========================

    public static void imprimirTabuleiro(char[][] tabuleiro) {
        // Imprime o cabeçalho do tabuleiro
        System.out.print("  ");
        for (int coluna = 0; coluna < tabuleiro.length; coluna++) {
            System.out.print(coluna + " "); // Imprime o número da coluna e um espaço
        }
        System.out.println(); // Pula para próxima linha
        // Imprime o índice do tabuleiro
        for (int linha = 0; linha < tabuleiro.length; linha++) {
            System.out.print(linha + " "); // Imprime o índice da linha à esquerda do tabuleiro
            // Imprime os valores de cada coordenada
            for (int coluna = 0; coluna < tabuleiro.length; coluna++) {
                System.out.print(tabuleiro[linha][coluna]);
                if (coluna < tabuleiro.length - 1) {
                    System.out.print(" "); // Adiciona um espaço entre as células, mas não depois da última da linha
                }
            }
            System.out.println(); // Pula para próxima linha
        }
    }

    // ===========================================================
    //    POSICIONA UM NAVIO ALEATORIAMENTE NO TABULEIRO OCULTO
    // ===========================================================

    public static void posicionarNavio(int[][] tabuleiro, int tamanho, int valorNavio, Random gerador) {
        // Inicialmente define o navio como não colocado
        boolean colocado = false;
        int n = tabuleiro.length;

        // Enquanto o navio não estiver colocado, ele vai rodar o "while"
        while (!colocado) {
            int orientacao = gerador.nextInt(2); // Define a orientação do navio: 0 = horizontal, 1 = vertical
            int linha = gerador.nextInt(n); // Define uma linha gerada aleatoriamente
            int coluna = gerador.nextInt(n); // Define uma coluna gerada aleatoriamente

            // Inicialmente define o intervalo em que o navio será inserido como válido
            // Em qualquer ocasião em que o navio possa estar fora do tabuleiro ou sobrepondo outro navio, ele vai definir a variável como falsa
            boolean cabe = true;

            if (orientacao == 0) { // Caso da orientação horizontal
                if (coluna + tamanho > n) { // Se a soma da coluna e do tamanho do navio for maior que 8 (lado do tabuleiro)...
                    cabe = false; // Ele indicará que o navio sai do intevalo do tabuleiro, portanto ele não cabe
                } else { // Caso ele passar pela primeira condição, será analisado se ele não sobrepõe outros navios
                    for (int i = 0; i < tamanho; i++) { // Vai executar conforme o tamanho do navio
                        if (tabuleiro[linha][coluna + i] != 0) { // Se a linha à direita da posição inicial estabelecida pelo navio estiver preenchida com algo além de 0 (outro navio)...
                            cabe = false; // Ele indicará que o navio sobrepõe outro navio, portanto ele não cabe
                            break; // Uma vez que a condição dizer que ele não cabe, ele automaticamente já finaliza o "for"
                        }
                    }
                }
            } else { // Caso da orientação vertical (funciona da mesma maneira praticamente)
                if (linha + tamanho > n) {
                    cabe = false;
                } else {
                    for (int i = 0; i < tamanho; i++) {
                        if (tabuleiro[linha + i][coluna] != 0) {
                            cabe = false;
                            break;
                        }
                    }
                }
            }

            if (cabe) { // Se anteriormente o navio ter sido inserido em um intevalo fora do tabuleiro ou ter sobreposto outro navio, ele não executa essa parte
                if (orientacao == 0) { // Se orientação for horizontal...
                    for (int i = 0; i < tamanho; i++) {
                        tabuleiro[linha][coluna + i] = valorNavio; // Define as células do navio conforme seu tamanho 
                    }
                } else { // Se orientação for vertical...
                    for (int i = 0; i < tamanho; i++) {
                        tabuleiro[linha + i][coluna] = valorNavio; // Define as células do navio conforme seu tamanho 
                    }
                }
                colocado = true; // Após definir as células do navio, ele declara o navio como posicionado e finaliza o "while"
            }
        }
    }

    // ===============================
    //    POSICIONA TODOS OS NAVIOS
    // ===============================

    public static void posicionarTodosNavios(int[][] tabuleiro, int[] tamanhos, Random gerador) {
        for (int i = 0; i < tamanhos.length; i++) {
            int valorNavio = i + 1; // cada navio recebe um número único, que depois serão atribuídos a um tipo de navio
            posicionarNavio(tabuleiro, tamanhos[i], valorNavio, gerador); // Chama o método para posicionar um navio
        }
    }

    // ==========================================
    //    RETORNA O NOME DO NAVIO PELO SÍMBOLO
    // ==========================================

    public static String nomeNavio(char simbolo) {
        switch (simbolo) {
            case 'P':
                return "Porta-aviões";
            case 'C':
                return "Cruzador";
            case 'D':
                return "Destroyer";
            default:
                return "Submarino";
        }
    }

    // ======================================
    //    CONTA CÉLULAS DE NAVIO RESTANTES
    // ======================================

    public static int contarCelulasNavioRestantes(int[][] tabuleiroOculto) {
        int contador = 0;
        // Percorre todo o tabuleiro oculto e retorna o total de células que ainda contêm partes de navios
        for (int linha = 0; linha < tabuleiroOculto.length; linha++) {
            for (int coluna = 0; coluna < tabuleiroOculto[linha].length; coluna++) {
                if (tabuleiroOculto[linha][coluna] != 0) { // se houver um navio nesta célula
                    contador++; // incrementa o contador
                }
            }
        }
        return contador; // retorna o total de células de navio restantes
    }

    // ===============================
    //    FUNÇÃO PRINCIPAL DO JOGO
    // ===============================

    public static void jogarPartida(char[][] tabuleiroVisivel, int[][] tabuleiroOculto, char[][] tabuleiroOcultoOriginal, char[] tipoNavio, int[] celulasRestantes, boolean[] navioAfundado, Scanner scanner) {
        int tentativasMaxima = 30; // Quantidade máxima de tentativas do usuário
        int tentativasValidas = 0; // Quantidade de tentativas executadas com sucesso
        int acertos = 0; // Quantidade de navios acertados
        int erros = 0; // Quantidade de erros (não acertou navio)
        double taxaAcerto = 0.0; // Taxa de acerto inicial (0,0%, pois o jogador não executou nenhuma jogada)

        // Enquanto o usuário não atingir a quantidade de tentativas máxima ou enquanto não afundou todos os navios, o jogo continua
        while (tentativasValidas < tentativasMaxima && contarCelulasNavioRestantes(tabuleiroOculto) > 0) {

            // Calcula a taxa de acerto antes de imprimir
            if (tentativasValidas > 0) {
                taxaAcerto = (acertos * 100.0) / tentativasValidas;
            }

            // Imprime Feedback (tentativas realizadas; acertos; taxa de acerto)
            System.out.println();
            System.out.printf("Tentativa %d/%d | Acertos: %d | Taxa: %.2f%%%n", tentativasValidas + 1, tentativasMaxima, acertos, taxaAcerto);

            // Imprime o tabuleiro visível
            imprimirTabuleiro(tabuleiroVisivel);

            // ====================================
            //    ENTRADA DO USUÁRIO E VALIDAÇÃO
            //    OBS.: Se o usuário inserir algo que não seja um número inteiro, o compilador trava
            // ====================================

            int linha;
            int coluna;

            while (true) { // Executa infinitamente, pois não há como torná-lo falso (só dá pra sair usando "break")
                // Pede ao usuário que insira a linha
                do { // Executa pelo menos uma vez, mesmo quando a condição do "while" não for suprida (que teoricamente só acontece uma vez na partida)
                    System.out.print("Digite a linha (0-7): ");
                    linha = scanner.nextInt();
                    if (linha < 0 || linha > 7) { // Se o usuário der uma entrada fora do intevalo estabelecido, exibe mensagem de entrada inválida
                        System.out.println("Linha inválida! Fora de intervalo");
                    }
                } while (linha < 0 || linha > 7);

                // Pede ao usuário que insira a coluna
                do { // Executa pelo menos uma vez, mesmo quando a condição do "while" não for suprida (que teoricamente só acontece uma vez na partida)
                    System.out.print("Digite a coluna (0-7): ");
                    coluna = scanner.nextInt();
                    if (coluna < 0 || coluna > 7) { // Se o usuário der uma entrada fora do intevalo estabelecido, exibe mensagem de entrada inválida
                        System.out.println("Coluna inválida! Fora de intervalo");
                    }
                } while (coluna < 0 || coluna > 7);

                // Verifica se a posição ainda não foi atacada
                if (tabuleiroVisivel[linha][coluna] == '~') { 
                    break; // posição válida, não foi verificada ainda; sai do loop
                } else { // Caso contrário, exibe mensagem e pede para inserir linha e coluna novamente
                    System.out.println("Você já atacou essa posição! Escolha outra.");
                }
            }

            // Se as entradas foram validadas, então é realizada uma tentativa
            tentativasValidas++;

            // ============================================================
            //    AÇÕES DEFINIDAS PELO ACERTO OU NÃO DA POSIÇÃO DO NAVIO
            // ============================================================

            int valorCelula = tabuleiroOculto[linha][coluna]; // Atribui o índice do navio (se tiver) da posição estabelecida pelo usuário à variável "valorCelula"
            if (valorCelula != 0) { // Se o usuário acertou a posição de um navio (não acertou água), executa o "if"
                int indiceNavio = valorCelula - 1; // Atribui o índice correto do navio (pois o vetor do tipo de navio começa no 0, logo o índice tem que ser subtraído por 1)
                tabuleiroVisivel[linha][coluna] = 'A'; // Troca o valor da posição estabelecida no tabuleiro visível para "A" (indicando acerto)
                acertos++; // Contabiliza um acerto
                celulasRestantes[indiceNavio]--; // Como acertou a posição de um navio, decrementa a quantidade de células do navio acertado
                tabuleiroOculto[linha][coluna] = 0; // Troca o valor da posição estabelecida no tabuleiro oculto para "0" (célula do navio afundou, logo virou posição de água)
                System.out.println("ACERTOU! Um navio foi atingido!"); // Mensagem de confirmação de acerto

                // Se o navio acertado (que é identificado pelo índice) não tiver mais nenhuma célula restante e identificado como não afundado ainda...
                if (celulasRestantes[indiceNavio] == 0 && !navioAfundado[indiceNavio]) { 
                    navioAfundado[indiceNavio] = true; // Declara o navio como afundado
                    // Exibe uma mensagem com o tipo de navio afundado baseado no índice dele (o método devolve o nome do tipo de navio)
                    // "tipoNavio[indiceNavio]" devolve um "char", que é utilizado no método "nomeNavio"
                    System.out.printf("AFUNDOU! Você destruiu um %s!%n", nomeNavio(tipoNavio[indiceNavio])); 
                }
            } else { // Se o usuário errou a posição de um navio (acertou água), executa o "else"
                tabuleiroVisivel[linha][coluna] = 'X'; // Troca o valor da posição estabelecida no tabuleiro visível para "X" (indicando erro)
                erros++; // Contabiliza um erro
                System.out.println("ERROU! Você atingiu água..."); // Mensagem afirmando que o usuário não atingiu nenhum navio
            }
        }

        // ===================================
        //    ANÁLISE DE VITÓRIA OU DERROTA
        // ===================================

        boolean venceu = contarCelulasNavioRestantes(tabuleiroOculto) == 0; // Se não sobrar nenhuma célula de navio (células restantes = 0), jogador venceu
        if (venceu == true) { // Se jogador ganhou, imprime mensagem de vitória
            System.out.println("PARABÉNS - TODOS OS NAVIOS FORAM DESTRUÍDOS!");
        } else { // Se jogador não ganhou, imprime mensagemm de derrota
            System.out.println("FIM DE JOGO - LIMITE DE TENTATIVAS ATINGIDO!");
        }

        // =========================
        //    TABULEIROS FINAIS
        // =========================

        System.out.println("");
        System.out.println("Seu tabuleiro final (acertos e erros):");
        imprimirTabuleiro(tabuleiroVisivel);

        System.out.println("");
        System.out.println("Posição real dos navios (original):");
        imprimirTabuleiro(tabuleiroOcultoOriginal);

        // =========================
        //    ESTATÍSTICAS FINAIS
        // =========================

        // Define a quantidade de navios afundados
        int naviosAfundados = 0; // Contabiliza quantos navios foram afundados
        for (int i = 0; i < navioAfundado.length; i++) { // Verifica o status dos dez navios (afundado ou não)
            if (navioAfundado[i]) { // Se o navio do indíce foi afundado... (não precisa colocar "== true", ele já verifica se é verdadeiro)
                naviosAfundados++; // incrementa a quantidade de navios afundados
            }
        }

        // Define a pontuação final do jogador
        int pontos = acertos * 10 + naviosAfundados * 50 - erros * 2; // Define o método de definir a pontuação do jogador
        if (venceu && tentativasValidas < 25) { // Se o usuário tiver vencido com menos de 25 tentativas...
            pontos += 100; // Ganha 100 pontos adicionais
        }

        // Define a classificação do jogador (de acordo com sua pontuação)
        String classificacao;
        if (pontos > 400) { // Se o usuário tiver obtido uma pontuação maior que 400, sua classificação é "EXCELENTE"
            classificacao = "EXCELENTE!";
        } else if (pontos >= 300) { // Se o usuário tiver obtido uma pontuação maior ou igual a 300, sua classificação é "BOM"
            classificacao = "BOM";
        } else if (pontos >= 200) { // Se o usuário tiver obtido uma pontuação maior ou igual a 200, sua classificação é "REGULAR"
            classificacao = "REGULAR";
        } else { // Se o usuário tiver obtido uma pontuação menor que 200, sua classificação é "PRECISA MELHORAR"
            classificacao = "PRECISA MELHORAR";
        }
        
        // Exibe a tabela de estatísticas finais
        System.out.println("");
        System.out.println("=======================================");
        System.out.println("          ESTATÍSTICAS FINAIS");
        System.out.println("=======================================");

        if (venceu) { // Se o jogador ganhou, exibe status como "VITÓRIA!"
            System.out.println("Status: VITÓRIA!");
        } else { // Se o jogador perdeu, exibe status como "DERROTA!"
            System.out.println("Status: DERROTA!");
        }

        // "%n" é uma quebra de linha (equivalente a dar "Enter")
        System.out.printf("Tentativas usadas: %d/%d%n", tentativasValidas, tentativasMaxima); // Exibe tentativas usadas
        System.out.printf("Total de acertos: %d%n", acertos); // Exibe quantidade de acertos
        System.out.printf("Total de erros: %d%n", erros); // Exibe quantidade de erros
        System.out.printf("Taxa de acerto: %.2f%%%n", (tentativasValidas == 0 ? 0 : acertos * 100.0 / tentativasValidas)); // Exibe a taxa de acerto
        System.out.printf("Navios afundados: %d/%d%n", naviosAfundados, navioAfundado.length); // Exibe quantidade de navios afundados
        System.out.println("");

        // Define a quantidade de navios afundados de cada tipo de navio
        int portaAvioesDerrubados = 0;
        int cruzadoresDerrubados = 0;
        int destroyersDerrubados = 0;
        int submarinosDerrubados = 0;

        for (int i = 0; i < tipoNavio.length; i++) { // Verifica os dez navios
            if (navioAfundado[i]) { // Se o navio tiver sido afundado, executa o "if" (não precisa colocar "== true", ele já verifica se é verdadeiro)
                switch (tipoNavio[i]) { // Analisa qual é o símbolo do navio afundado e adiciona à sua respectiva variável
                    case 'P':
                        portaAvioesDerrubados++;
                        break;
                    case 'C':
                        cruzadoresDerrubados++;
                        break;
                    case 'D':
                        destroyersDerrubados++;
                        break;
                    case 'S':
                        submarinosDerrubados++;
                        break;
                }
            }
        }

        System.out.printf("- Porta-aviões: %d/1%n", portaAvioesDerrubados); // Exibe a quantidade de porta-aviões afundados
        System.out.printf("- Cruzadores: %d/2%n", cruzadoresDerrubados); // Exibe a quantidade de cruzadores afundados
        System.out.printf("- Destroyers: %d/3%n", destroyersDerrubados); // Exibe a quantidade de destroyers afundados
        System.out.printf("- Submarinos: %d/4%n", submarinosDerrubados); // Exibe a quantidade de submarinos afundados
        System.out.println("");

        System.out.printf("PONTUAÇÃO FINAL: %d pontos%n", pontos); //  Exibe a quantidade de pontos finais
        System.out.printf("- Acertos: %d x 10 = %d%n", acertos, (acertos * 10)); // Exibe o cálculo de pontuação pela quantidade de acertos
        System.out.printf("- Navios afundados: %d x 50 = %d%n", naviosAfundados, (naviosAfundados * 50)); // Exibe o cálculo de pontuação pela quantidade de navios afundados
        System.out.printf("- Penalidade erros: %d x -2 = %d%n", erros, (erros * (-2))); // Exibe o cálculo de pontuação pela penalidade de erros

        if (venceu) { // Se o jogador ganhou, exibe mensagem indicando que ganhou pontos bônus
            System.out.println("- Bônus vitória rápida: +100");
        }

        System.out.println("");
        System.out.println("Classificação: " + classificacao); // Indica a classificação final do jogador
        System.out.println("=======================================");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random gerador = new Random();

        int N = 8; // Define tamanho do tabuleiro
        char[][] tabuleiroVisivel = new char[N][N]; // Tabuleiro visível para o jogador
        int[][] tabuleiroOculto = new int[N][N]; // Tabuleiro que guarda a posição dos navios

        // Inicializa tabuleiro (Preenche com água)
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                tabuleiroVisivel[i][j] = '~';
            }
        }

        // Define os tipos de navios e o tamanho respectivo de cada navio
        char[] tipoNavio = {'P','C','C','D','D','D','S','S','S','S'};
        int[] tamanhoNavio = {4,3,3,2,2,2,1,1,1,1};
        int totalNavios = tipoNavio.length;

        int[] celulasRestantes = new int[totalNavios];
        boolean[] navioAfundado = new boolean[totalNavios];
        for (int i = 0; i < totalNavios; i++) {
            celulasRestantes[i] = tamanhoNavio[i];
        }

        // Posiciona navios no tabuleiro oculto
        posicionarTodosNavios(tabuleiroOculto, tamanhoNavio, gerador);

        // Faz uma cópia do tabuleiro oculto original,
        // mas já converte os índices dos navios para símbolos
        char[][] tabuleiroOcultoOriginal = new char[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                // Ele pega o valor da posição do tabuleiro oculto e transforma os valores em caracteres que representam água ou um tipo de navio
                if (tabuleiroOculto[i][j] == 0) { // Se for 0, significa água, então vira '~'
                    tabuleiroOcultoOriginal[i][j] = '~';
                } else { // Caso contrário, valor corresponde ao índice do tipo de navio
                    tabuleiroOcultoOriginal[i][j] = tipoNavio[tabuleiroOculto[i][j] - 1]; // Como o vetor "tipoNavio" começa no índice 0, subtraímos 1 para alinhar com os valores 1...4 do tabuleiro
                    // Exemplo: Se o navio encontrado tiver o índice 1, ele precisa associar o tipo de navio com índice 0 (ao invés do tipo de navio com índice 1)
                }
            }
        }

        System.out.println("Bem-vindo ao Batalha Naval!");
        // Método para iniciar o jogo
        jogarPartida(tabuleiroVisivel, tabuleiroOculto, tabuleiroOcultoOriginal, tipoNavio, celulasRestantes, navioAfundado, scanner);
        scanner.close();
    }
}
