package ED01;

// Importa a biblioteca Scanner para ler entradas do teclado
import java.util.Scanner;

// Classe principal do programa
public class Main {
  public static void main(String[] args) {
    // Cria um objeto Scanner para ler o que o usuário digitar
    Scanner scanner = new Scanner(System.in);

    // Cria um placar que vai armazenar os jogadores e suas pontuações
    Placar placar = new Placar();

    // Variável para controlar o loop do jogo (se o jogador quer continuar jogando ou sair)
    boolean continuarJogando = true;

    // Loop principal
    while (continuarJogando) {
      // Mostra o menu com as opções pro jogador
      System.out.println("\n======= JOGO DO ADIVINHA =======");
      System.out.println("1. Novo Jogo");
      System.out.println("2. Ver ranking");
      System.out.println("3. Sair");
      System.out.println("Escolha uma opção: ");

      int opcao;
      try {
        // Lê a opção escolhida pelo usuário e converte pra número inteiro
        opcao = Integer.parseInt(scanner.nextLine());
      } catch(Exception e) {
        // Se o usuário digitar qualquer coisa que não seja número, cai aqui
        System.out.println("Opção inválida! Por favor, digite um número.");
        continue;  // Volta pro menu
      }

      // Verifica a opção escolhida pelo jogador
      switch (opcao) {
        case 1:
          // Caso o jogador escolha "Novo Jogo"
          System.out.println("Digite o nome do jogador: ");
          String nome = scanner.nextLine();  // Lê o nome digitado

          // Cria um jogador novo com 0 tentativas e 0 pontos
          Jogador jogador = new Jogador(nome, 0, 0);
          // Cria um novo jogo pra esse jogador
          Jogo jogo = new Jogo(jogador);

          // Mensagens iniciais
          System.out.println("Bem-vindo ao jogo, " + jogador.getNome() + "!");
          System.out.println("Tente adivinhar um número entre 1 a 100.");

          // Loop das tentativas do jogador até acertar ou desistir
          boolean acertou = false;
          while (!acertou) {
            System.out.println("Digite um número (ou -1 para desistir): ");
            int tentativa;
            try {
              tentativa = scanner.nextInt(); // A leitura agora acontece aqui
              scanner.nextLine(); // Limpa o buffer
            } catch (Exception e) { 
              System.out.println("Digite um número válido!");
              scanner.nextLine();
              continue;
            }
            acertou = jogo.jogar(tentativa); // Passa tentativa para o jogo
          }

          // Se o jogador fez pontos (não desistiu)
          if(jogador.getPontuacao() > 0) {
            placar.adicionarJogador(jogador);  // Adiciona no placar
            System.out.println("Sua pontuação final é: " + jogador.getPontuacao());
          }
          break;
      
        case 2:
          // Caso o jogador escolha "Ver ranking"
          System.out.println("\n========== RANKING ATUAL ==========");
          placar.mostrarRanking();  // Mostra a lista de jogadores e pontuações
          break;

        case 3:
          // Caso o jogador escolha "Sair"
          continuarJogando = false;  // Sai do loop principal
          System.out.println("Obrigada por jogar! Até a próxima!");
          break;

        default:
          // Caso o jogador digite qualquer outra coisa que não esteja no menu
          System.out.println("Opção inválida!");  
          break;
      }
    }

    // Fecha o scanner antes de encerrar o programa (bom sempre ter isso :p)
    scanner.close();
  }
}