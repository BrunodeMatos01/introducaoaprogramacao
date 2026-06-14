// Import serve para trazer uma classe pronta do Java para dentro do nosso programa.
// Random e usado para sortear numeros. Aqui ele sorteia a coluna do robo.
import java.util.Random;

// Scanner e usado para ler aquilo que o usuario digita no console.
import java.util.Scanner;

// Toda classe em Java comeca com public class e depois vem o nome da classe.
// O nome da classe precisa ser igual ao nome do arquivo: documentacaoTrabalho.java.
public class documentacaoTrabalho {

    // Este e o construtor da classe.
    // O construtor tem o mesmo nome da classe e executa quando fazemos new documentacaoTrabalho().
    public documentacaoTrabalho() {

        // Aqui criamos o unico objeto Scanner do programa.
        // O nome dele e sc, como foi pedido.
        // System.in significa que a leitura vem do teclado.
        Scanner sc = new Scanner(System.in);

        // Aqui criamos um objeto Random.
        // Ele sera usado para o robo escolher uma coluna aleatoria.
        Random random = new Random();

        // Aqui criamos a matriz do tabuleiro.
        // char significa que cada casa guarda uma letra.
        // 6 e a quantidade de linhas e 7 e a quantidade de colunas.
        char[][] tabuleiro = new char[6][7];

        // Esta variavel controla se o usuario quer jogar outra partida.
        // Comeca com S para entrar pelo menos uma vez no do while.
        char jogarNovamente = 'S';

        // Estas tres linhas so mostram o titulo do jogo na tela.
        System.out.println("=================================");
        System.out.println("          JOGO LIGA-4");
        System.out.println("=================================");

        // O do while faz a partida acontecer pelo menos uma vez.
        // Depois da partida ele pergunta se quer jogar novamente.
        do {

            // Antes de cada partida, preenche o tabuleiro todo com B.
            // B significa branco/vazio.
            iniciarTabuleiro(tabuleiro);

            // Chama o metodo principal da partida.
            // Passamos o tabuleiro, o Scanner e o Random para o metodo usar.
            jogarPartida(tabuleiro, sc, random);

            // Linha em branco para organizar a tela.
            System.out.println();

            // Pergunta se o jogador quer jogar de novo.
            System.out.println("Deseja jogar novamente?");
            System.out.println("Digite S para sim ou N para nao");

            // sc.next() le uma palavra digitada.
            // toUpperCase() transforma em maiusculo.
            // charAt(0) pega a primeira letra.
            jogarNovamente = sc.next().toUpperCase().charAt(0);

            // Enquanto a resposta nao for S nem N, fica pedindo de novo.
            while (jogarNovamente != 'S' && jogarNovamente != 'N') {

                // Mensagem para avisar que a opcao nao existe.
                System.out.println("Opcao invalida");

                // Pede novamente uma resposta correta.
                System.out.println("Digite S para sim ou N para nao");

                // Le novamente a resposta do usuario.
                jogarNovamente = sc.next().toUpperCase().charAt(0);
            }

            // Se jogarNovamente for S, o do while repete e reinicia a partida.
        } while (jogarNovamente == 'S');

        // Quando o usuario escolhe N, aparece essa mensagem.
        System.out.println("Programa encerrado");

        // Fecha o Scanner no final do programa.
        sc.close();
    }

    // Este metodo recebe a matriz tabuleiro.
    // Ele nao retorna nada, por isso e void.
    public void iniciarTabuleiro(char[][] tabuleiro) {

        // Este for percorre as linhas da matriz, da linha 0 ate a linha 5.
        for (int linha = 0; linha < 6; linha++) {

            // Este for percorre as colunas da matriz, da coluna 0 ate a coluna 6.
            for (int coluna = 0; coluna < 7; coluna++) {

                // Cada posicao do tabuleiro recebe B.
                // B representa casa em branco, como foi pedido no RF01.
                tabuleiro[linha][coluna] = 'B';
            }
        }
    }

    // Este metodo controla uma partida completa.
    // Ele recebe o tabuleiro, o Scanner e o Random criados no construtor.
    public void jogarPartida(char[][] tabuleiro, Scanner sc, Random random) {

        // Chama o metodo que pergunta se o jogador quer V ou A.
        // O retorno e guardado na variavel corJogador.
        char corJogador = escolherCorJogador(sc);

        // Define automaticamente a cor do robo.
        // Se o jogador escolher V, o robo fica A. Se escolher A, o robo fica V.
        char corRobo = definirCorRobo(corJogador);

        // Esta variavel controla quando o while da partida deve parar.
        boolean terminou = false;

        // Esta variavel fica true se o jogador vencer.
        boolean vitoriaJogador = false;

        // Esta variavel fica true se o robo vencer.
        boolean vitoriaRobo = false;

        // Esta variavel fica true se o tabuleiro encher sem vencedor.
        boolean empate = false;

        // Pula uma linha para organizar a tela.
        System.out.println();

        // Mostra qual cor o jogador escolheu.
        System.out.println("Voce vai jogar com a cor " + corJogador);

        // Mostra qual cor ficou para o robo.
        System.out.println("O robo vai jogar com a cor " + corRobo);

        // Enquanto terminou for false, a partida continua.
        while (terminou == false) {

            // Chama a jogada da pessoa.
            // O metodo pergunta a coluna e coloca a ficha no tabuleiro.
            jogarPessoa(tabuleiro, sc, corJogador);

            // Depois da pessoa jogar, verifica se a cor dela formou 4 fichas.
            if (verificarVitoria(tabuleiro, corJogador) == true) {

                // Marca que o jogador venceu.
                vitoriaJogador = true;

                // Marca que a partida terminou.
                terminou = true;
            } else {

                // Se nao venceu, verifica se o tabuleiro ficou completo.
                if (tabuleiroCompleto(tabuleiro) == true) {

                    // Se esta completo e ninguem venceu, e empate.
                    empate = true;

                    // A partida termina por empate.
                    terminou = true;
                }
            }

            // O robo so joga se a partida ainda nao terminou.
            if (terminou == false) {

                // Chama o metodo do robo.
                // Ele sorteia uma coluna e retorna a coluna em que jogou.
                int colunaRobo = jogarRobo(tabuleiro, random, corRobo);

                // Pula uma linha para organizar.
                System.out.println();

                // Informa em qual coluna o robo jogou.
                System.out.println("O robo jogou na coluna " + colunaRobo);

                // Avisa que a vez volta para a pessoa.
                System.out.println("Agora e a sua vez de jogar");

                // Depois do robo jogar, verifica se ele venceu.
                if (verificarVitoria(tabuleiro, corRobo) == true) {

                    // Marca que o robo venceu.
                    vitoriaRobo = true;

                    // Marca que a partida terminou.
                    terminou = true;
                } else {

                    // Se o robo nao venceu, verifica se o tabuleiro encheu.
                    if (tabuleiroCompleto(tabuleiro) == true) {

                        // Se encheu sem vencedor, marca empate.
                        empate = true;

                        // Encerra a partida.
                        terminou = true;
                    }
                }
            }
        }

        // Quando sai do while, a partida terminou.
        // Estas linhas mostram o fim do jogo.
        System.out.println();
        System.out.println("=================================");
        System.out.println("            FIM DE JOGO");
        System.out.println("=================================");

        // Se a vitoria foi do jogador, imprime a mensagem do jogador.
        if (vitoriaJogador == true) {
            System.out.println("Voce venceu!");
        } else {

            // Se nao foi o jogador, verifica se foi o robo.
            if (vitoriaRobo == true) {
                System.out.println("O robo venceu!");
            } else {

                // Se nao foi jogador nem robo, verifica empate.
                if (empate == true) {
                    System.out.println("EMPATE");
                }
            }
        }

        // No final da partida, mostra como o tabuleiro ficou.
        imprimirTabuleiro(tabuleiro);
    }

    // Este metodo pergunta a cor do jogador.
    // Ele retorna um char, que sera V ou A.
    public char escolherCorJogador(Scanner sc) {

        // Comeca com B apenas para ter um valor inicial.
        // Depois sera trocado pela escolha do usuario.
        char cor = 'B';

        // do while e usado porque precisamos perguntar pelo menos uma vez.
        do {

            // Pula linha e mostra as opcoes.
            System.out.println();
            System.out.println("Escolha sua cor");
            System.out.println("V - Vermelho");
            System.out.println("A - Azul");

            // Le a primeira letra digitada pelo usuario.
            // Se digitar v minusculo, toUpperCase transforma em V.
            cor = sc.next().toUpperCase().charAt(0);

            // Se a cor nao for V nem A, mostra erro.
            if (cor != 'V' && cor != 'A') {
                System.out.println("Cor invalida");
            }

            // Repete enquanto a cor for diferente de V e diferente de A.
        } while (cor != 'V' && cor != 'A');

        // Devolve a cor escolhida para quem chamou o metodo.
        return cor;
    }

    // Este metodo recebe a cor do jogador e devolve a cor do robo.
    public char definirCorRobo(char corJogador) {

        // Valor inicial da cor do robo.
        char corRobo = 'B';

        // Se o jogador escolheu vermelho, o robo fica azul.
        if (corJogador == 'V') {
            corRobo = 'A';
        } else {

            // Se o jogador nao escolheu V, entao ele escolheu A.
            // Por isso o robo fica V.
            corRobo = 'V';
        }

        // Retorna a cor definida para o robo.
        return corRobo;
    }

    // Este metodo faz a jogada da pessoa.
    // Ele retorna a linha onde a ficha caiu.
    public int jogarPessoa(char[][] tabuleiro, Scanner sc, char corJogador) {

        // Guarda a opcao escolhida no menu.
        int opcao = 0;

        // Guarda a coluna escolhida para jogar.
        int coluna = 0;

        // Guarda a linha onde a ficha caiu.
        // Comeca em -1 porque nenhuma linha foi escolhida ainda.
        int linha = -1;

        // Controla se o jogador ja fez uma jogada valida.
        boolean jogou = false;

        // Enquanto o jogador nao jogar, o menu continua aparecendo.
        while (jogou == false) {

            // Mostra o menu da vez do jogador.
            System.out.println();
            System.out.println("Menu");
            System.out.println("1 - Jogar");
            System.out.println("2 - Imprimir tabuleiro");

            // Le a opcao digitada.
            opcao = sc.nextInt();

            // switch escolhe o que fazer de acordo com a opcao.
            switch (opcao) {

                // Caso a pessoa digite 1, ela quer jogar.
                case 1:

                    // Pede uma coluna de 0 ate 6.
                    System.out.println("Informe a coluna para jogar de 0 ate 6");

                    // Le a coluna.
                    coluna = sc.nextInt();

                    // Enquanto a coluna estiver fora do intervalo, pede novamente.
                    while (coluna < 0 || coluna > 6) {
                        System.out.println("Coluna invalida");
                        System.out.println("Informe a coluna para jogar de 0 ate 6");
                        coluna = sc.nextInt();
                    }

                    // Se a coluna estiver cheia, tambem precisa pedir outra.
                    while (colunaCheia(tabuleiro, coluna) == true) {
                        System.out.println("Essa coluna esta cheia");
                        System.out.println("Informe outra coluna para jogar de 0 ate 6");
                        coluna = sc.nextInt();

                        // Valida de novo para garantir que a nova coluna esta entre 0 e 6.
                        while (coluna < 0 || coluna > 6) {
                            System.out.println("Coluna invalida");
                            System.out.println("Informe a coluna para jogar de 0 ate 6");
                            coluna = sc.nextInt();
                        }
                    }

                    // Coloca a ficha do jogador na coluna escolhida.
                    // O metodo devolve a linha onde a ficha ficou.
                    linha = colocarFicha(tabuleiro, coluna, corJogador);

                    // Marca que a jogada foi feita, para sair do while.
                    jogou = true;

                    // break encerra este case do switch.
                    break;

                // Caso a pessoa digite 2, imprime o tabuleiro.
                case 2:
                    imprimirTabuleiro(tabuleiro);
                    break;

                // default acontece se digitar qualquer opcao diferente de 1 e 2.
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        }

        // Retorna a linha onde a ficha caiu.
        return linha;
    }

    // Este metodo faz a jogada do robo.
    // Ele retorna a coluna escolhida pelo robo.
    public int jogarRobo(char[][] tabuleiro, Random random, char corRobo) {

        // Guarda a coluna sorteada.
        int coluna = 0;

        // Guarda a linha em que a ficha do robo caiu.
        int linha = -1;

        // Controla se o robo conseguiu jogar.
        boolean jogou = false;

        // Enquanto o robo nao conseguir jogar, ele sorteia uma coluna.
        while (jogou == false) {

            // Sorteia um numero de 0 ate 6.
            // nextInt(7) sorteia 0, 1, 2, 3, 4, 5 ou 6.
            coluna = random.nextInt(7);

            // Se a coluna sorteada nao estiver cheia, o robo joga nela.
            if (colunaCheia(tabuleiro, coluna) == false) {

                // Coloca a ficha do robo na coluna sorteada.
                linha = colocarFicha(tabuleiro, coluna, corRobo);

                // Marca que o robo ja jogou.
                jogou = true;
            }
        }

        // Retorna a coluna para mostrar na tela onde o robo jogou.
        return coluna;
    }

    // Este metodo coloca uma ficha na coluna escolhida.
    // A ficha sempre cai na linha mais baixa disponivel.
    public int colocarFicha(char[][] tabuleiro, int coluna, char cor) {

        // Comeca com -1 porque ainda nao encontrou lugar.
        int linhaEncontrada = -1;

        // Comeca na linha 5 porque ela e a linha mais baixa do tabuleiro.
        // Vai subindo ate a linha 0.
        for (int linha = 5; linha >= 0; linha--) {

            // Se a casa esta em branco e ainda nao colocou a ficha...
            if (tabuleiro[linha][coluna] == 'B' && linhaEncontrada == -1) {

                // Coloca a cor na posicao encontrada.
                tabuleiro[linha][coluna] = cor;

                // Guarda a linha em que a ficha foi colocada.
                linhaEncontrada = linha;
            }
        }

        // Retorna a linha onde a ficha caiu.
        return linhaEncontrada;
    }

    // Este metodo verifica se uma coluna esta cheia.
    // Retorna true se estiver cheia e false se ainda tiver espaco.
    public boolean colunaCheia(char[][] tabuleiro, int coluna) {

        // Comeca achando que nao esta cheia.
        boolean cheia = false;

        // Se a primeira linha da coluna nao for B, entao a coluna esta cheia.
        // Isso funciona porque as fichas caem de baixo para cima.
        if (tabuleiro[0][coluna] != 'B') {
            cheia = true;
        }

        // Retorna o resultado.
        return cheia;
    }

    // Este metodo verifica se o tabuleiro inteiro esta preenchido.
    // Retorna true se nao tiver mais nenhuma casa B.
    public boolean tabuleiroCompleto(char[][] tabuleiro) {

        // Comeca supondo que o tabuleiro esta completo.
        boolean completo = true;

        // Percorre todas as linhas.
        for (int linha = 0; linha < 6; linha++) {

            // Percorre todas as colunas.
            for (int coluna = 0; coluna < 7; coluna++) {

                // Se encontrar B, ainda existe espaco livre.
                if (tabuleiro[linha][coluna] == 'B') {
                    completo = false;
                }
            }
        }

        // Retorna true se estiver completo ou false se ainda tiver espaco.
        return completo;
    }

    // Este metodo imprime o tabuleiro na tela.
    // Ele so mostra o tabuleiro quando o usuario escolher imprimir ou no fim do jogo.
    public void imprimirTabuleiro(char[][] tabuleiro) {

        // Pula uma linha antes do tabuleiro.
        System.out.println();

        // Mostra os numeros das colunas.
        System.out.println("       0   1   2   3   4   5   6");

        // Linha de separacao para desenhar o tabuleiro.
        System.out.println("     -----------------------------");

        // Percorre as linhas do tabuleiro.
        for (int linha = 0; linha < 6; linha++) {

            // Imprime o numero da linha no lado esquerdo.
            System.out.print(" " + linha + " | ");

            // Percorre as colunas da linha atual.
            for (int coluna = 0; coluna < 7; coluna++) {

                // Imprime o valor da posicao.
                // Pode ser B, V ou A.
                System.out.print(tabuleiro[linha][coluna] + " | ");
            }

            // Quebra linha depois de imprimir todas as colunas.
            System.out.println();

            // Imprime outra linha de separacao.
            System.out.println("     -----------------------------");
        }
    }

    // Este metodo verifica se uma cor venceu.
    // Ele chama todos os metodos de direcao.
    public boolean verificarVitoria(char[][] tabuleiro, char cor) {

        // Comeca como false porque ainda nao achou vitoria.
        boolean venceu = false;

        // Percorre todas as linhas.
        for (int linha = 0; linha < 6; linha++) {

            // Percorre todas as colunas.
            for (int coluna = 0; coluna < 7; coluna++) {

                // So tenta verificar a partir de casas que tenham a cor analisada.
                if (tabuleiro[linha][coluna] == cor) {

                    // Verifica 4 fichas para a direita.
                    if (verificarDireita(tabuleiro, linha, coluna, cor) == true) {
                        venceu = true;
                    }

                    // Verifica 4 fichas para a esquerda.
                    if (verificarEsquerda(tabuleiro, linha, coluna, cor) == true) {
                        venceu = true;
                    }

                    // Verifica 4 fichas para baixo.
                    if (verificarBaixo(tabuleiro, linha, coluna, cor) == true) {
                        venceu = true;
                    }

                    // Verifica 4 fichas para cima.
                    if (verificarCima(tabuleiro, linha, coluna, cor) == true) {
                        venceu = true;
                    }

                    // Verifica diagonal para cima e para a esquerda.
                    if (verificarDiagonalSuperiorEsquerda(tabuleiro, linha, coluna, cor) == true) {
                        venceu = true;
                    }

                    // Verifica diagonal para cima e para a direita.
                    if (verificarDiagonalSuperiorDireita(tabuleiro, linha, coluna, cor) == true) {
                        venceu = true;
                    }

                    // Verifica diagonal para baixo e para a esquerda.
                    if (verificarDiagonalInferiorEsquerda(tabuleiro, linha, coluna, cor) == true) {
                        venceu = true;
                    }

                    // Verifica diagonal para baixo e para a direita.
                    if (verificarDiagonalInferiorDireita(tabuleiro, linha, coluna, cor) == true) {
                        venceu = true;
                    }
                }
            }
        }

        // Retorna true se alguma direcao encontrou vitoria.
        return venceu;
    }

    // Verifica se existem 4 fichas iguais para a direita.
    public boolean verificarDireita(char[][] tabuleiro, int linha, int coluna, char cor) {

        // Comeca como false.
        boolean venceu = false;

        // Para verificar direita, a coluna precisa ser no maximo 3.
        // Se for 4, 5 ou 6, nao existem 3 casas a direita.
        if (coluna <= 3) {

            // Compara a casa atual e as tres casas da direita.
            if (tabuleiro[linha][coluna] == cor && tabuleiro[linha][coluna + 1] == cor && tabuleiro[linha][coluna + 2] == cor && tabuleiro[linha][coluna + 3] == cor) {
                venceu = true;
            }
        }

        // Retorna se venceu ou nao nesta direcao.
        return venceu;
    }

    // Verifica se existem 4 fichas iguais para a esquerda.
    public boolean verificarEsquerda(char[][] tabuleiro, int linha, int coluna, char cor) {

        // Comeca como false.
        boolean venceu = false;

        // Para verificar esquerda, a coluna precisa ser pelo menos 3.
        // Se for 0, 1 ou 2, nao existem 3 casas a esquerda.
        if (coluna >= 3) {

            // Compara a casa atual e as tres casas da esquerda.
            if (tabuleiro[linha][coluna] == cor && tabuleiro[linha][coluna - 1] == cor && tabuleiro[linha][coluna - 2] == cor && tabuleiro[linha][coluna - 3] == cor) {
                venceu = true;
            }
        }

        // Retorna se venceu ou nao nesta direcao.
        return venceu;
    }

    // Verifica se existem 4 fichas iguais para baixo.
    public boolean verificarBaixo(char[][] tabuleiro, int linha, int coluna, char cor) {

        // Comeca como false.
        boolean venceu = false;

        // Para verificar para baixo, a linha precisa ser no maximo 2.
        // Se for 3, 4 ou 5, nao existem 3 casas abaixo.
        if (linha <= 2) {

            // Compara a casa atual e as tres casas abaixo.
            if (tabuleiro[linha][coluna] == cor && tabuleiro[linha + 1][coluna] == cor && tabuleiro[linha + 2][coluna] == cor && tabuleiro[linha + 3][coluna] == cor) {
                venceu = true;
            }
        }

        // Retorna se venceu ou nao nesta direcao.
        return venceu;
    }

    // Verifica se existem 4 fichas iguais para cima.
    public boolean verificarCima(char[][] tabuleiro, int linha, int coluna, char cor) {

        // Comeca como false.
        boolean venceu = false;

        // Para verificar para cima, a linha precisa ser pelo menos 3.
        // Se for 0, 1 ou 2, nao existem 3 casas acima.
        if (linha >= 3) {

            // Compara a casa atual e as tres casas acima.
            if (tabuleiro[linha][coluna] == cor && tabuleiro[linha - 1][coluna] == cor && tabuleiro[linha - 2][coluna] == cor && tabuleiro[linha - 3][coluna] == cor) {
                venceu = true;
            }
        }

        // Retorna se venceu ou nao nesta direcao.
        return venceu;
    }

    // Verifica diagonal para cima e para a esquerda.
    public boolean verificarDiagonalSuperiorEsquerda(char[][] tabuleiro, int linha, int coluna, char cor) {

        // Comeca como false.
        boolean venceu = false;

        // Para subir e ir para a esquerda, precisa ter espaco acima e a esquerda.
        if (linha >= 3 && coluna >= 3) {

            // Compara a casa atual e as tres casas na diagonal superior esquerda.
            if (tabuleiro[linha][coluna] == cor && tabuleiro[linha - 1][coluna - 1] == cor && tabuleiro[linha - 2][coluna - 2] == cor && tabuleiro[linha - 3][coluna - 3] == cor) {
                venceu = true;
            }
        }

        // Retorna se venceu ou nao nesta direcao.
        return venceu;
    }

    // Verifica diagonal para cima e para a direita.
    public boolean verificarDiagonalSuperiorDireita(char[][] tabuleiro, int linha, int coluna, char cor) {

        // Comeca como false.
        boolean venceu = false;

        // Para subir e ir para a direita, precisa ter espaco acima e a direita.
        if (linha >= 3 && coluna <= 3) {

            // Compara a casa atual e as tres casas na diagonal superior direita.
            if (tabuleiro[linha][coluna] == cor && tabuleiro[linha - 1][coluna + 1] == cor && tabuleiro[linha - 2][coluna + 2] == cor && tabuleiro[linha - 3][coluna + 3] == cor) {
                venceu = true;
            }
        }

        // Retorna se venceu ou nao nesta direcao.
        return venceu;
    }

    // Verifica diagonal para baixo e para a esquerda.
    public boolean verificarDiagonalInferiorEsquerda(char[][] tabuleiro, int linha, int coluna, char cor) {

        // Comeca como false.
        boolean venceu = false;

        // Para descer e ir para a esquerda, precisa ter espaco abaixo e a esquerda.
        if (linha <= 2 && coluna >= 3) {

            // Compara a casa atual e as tres casas na diagonal inferior esquerda.
            if (tabuleiro[linha][coluna] == cor && tabuleiro[linha + 1][coluna - 1] == cor && tabuleiro[linha + 2][coluna - 2] == cor && tabuleiro[linha + 3][coluna - 3] == cor) {
                venceu = true;
            }
        }

        // Retorna se venceu ou nao nesta direcao.
        return venceu;
    }

    // Verifica diagonal para baixo e para a direita.
    public boolean verificarDiagonalInferiorDireita(char[][] tabuleiro, int linha, int coluna, char cor) {

        // Comeca como false.
        boolean venceu = false;

        // Para descer e ir para a direita, precisa ter espaco abaixo e a direita.
        if (linha <= 2 && coluna <= 3) {

            // Compara a casa atual e as tres casas na diagonal inferior direita.
            if (tabuleiro[linha][coluna] == cor && tabuleiro[linha + 1][coluna + 1] == cor && tabuleiro[linha + 2][coluna + 2] == cor && tabuleiro[linha + 3][coluna + 3] == cor) {
                venceu = true;
            }
        }

        // Retorna se venceu ou nao nesta direcao.
        return venceu;
    }

    // O metodo main e o ponto inicial do programa.
    // Como foi pedido, ele so instancia o construtor desta classe.
    public static void main(String[] args) {

        // new cria um objeto da classe.
        // Ao criar o objeto, o construtor documentacaoTrabalho() executa.
        new documentacaoTrabalho();
    }
}
