package ED01;

// Importa as bibliotecas necessárias
import java.util.Random;
import java.util.Scanner;

// Classe responsável pela lógica do jogo
public class Jogo {
  // Atributos do jogo
  private Jogador jogador;       // Guarda o jogador que está jogando
  private int numeroSecreto;     // Número que o jogador tem que adivinhar
  private Scanner scanner;       // Scanner para ler as tentativas do jogador

  // Construtor — inicializa o jogo para um jogador específico
  public Jogo(Jogador jogador) {
    this.jogador = jogador;
    // Gera um número aleatório entre 1 e 100
    this.numeroSecreto = new Random().nextInt(100) + 1;
    // Inicializa o scanner para ler a entrada
    this.scanner = new Scanner(System.in);
  }
  
  // Método que recebe a tentativa e verifica se acertou, errou ou desistiu
  public boolean jogar(int tentativa) {
    // Se o jogador digitar -1, ele desistiu
    if (tentativa == -1) {
      System.out.println("Você desistiu. O número era: " + numeroSecreto);
      jogador.setPontuacao(0);  // Pontuação zero porque desistiu
      return true;              // Encerra o jogo
    }

    // Incrementa a quantidade de tentativas do jogador
    jogador.incrementarTentativas();

    // Verifica se a tentativa foi maior que o número
    if (tentativa > numeroSecreto) {
      System.out.println("Número alto, tente novamente.");
      return false;  // Continua o jogo
    } 
    // Verifica se foi menor
    else if (tentativa < numeroSecreto) {
      System.out.println("Número baixo, tente novamente.");
      return false;  // Continua o jogo
    } 
    // Se não foi maior nem menor, acertou
    else {
      // Calcula a pontuação: começa com 100 e perde 10 por tentativa
      // Garante que a pontuação não fique negativa
      if(jogador.getTentativas() > 10) {
        jogador.atualizarPontuacao(0);
        System.out.println("Você ultrapassou de 10 tentativas então não ganhou nenhum ponto :(");
      } else {
        int pontuacao = 100 - jogador.getTentativas() * 10;
        jogador.atualizarPontuacao(Math.max(pontuacao, 0));
          System.out.println("Boaa " + jogador.getNome() + "!! Você acertou em " + jogador.getTentativas() + " tentativas!");  
        }
        return true;  // Encerra o jogo

    }
  }

  // Método opcional pra fechar o Scanner e liberar o recurso
  public void encerrar() {
    scanner.close();
  }
}