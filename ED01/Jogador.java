package ED01;

// Classe que representa o jogador no jogo
public class Jogador {
  // Atributos privados (encapsulados)
  private String nome;
  private int tentativas;
  private int pontuacao;

  // Construtor padrão 
  public Jogador(String nome) {
    this.nome = nome;
    this.tentativas = 0;  // Começa com 0 tentativas
    this.pontuacao = 0;   // Começa com 0 pontos
  }

  // Construtor alternativo — permite definir nome, tentativas e pontuação inicial
  public Jogador(String nome, int tentativas, int pontuacao) {
    this.nome = nome;
    // Usa Math.max para garantir que os valores não sejam negativos
    this.tentativas = Math.max(0, tentativas);
    this.pontuacao = Math.max(0, pontuacao);
  }

  // Getter para retornar o nome do jogador
  public String getNome() {
    return nome;
  }

  // Setter para alterar o nome do jogador
  public void setNome(String nome) {
    this.nome = nome;
  }

  // Getter para retornar o número de tentativas
  public int getTentativas() {
    return tentativas;
  }

  // Setter para definir o número de tentativas (sempre no mínimo 0)
  public void setTentativas(int tentativas) {
    this.tentativas = Math.max(0, tentativas);
  }

  // Getter para retornar a pontuação do jogador
  public int getPontuacao() {
    return pontuacao;
  }

  // Setter para definir a pontuação do jogador (sempre no mínimo 0)
  public void setPontuacao(int pontuacao) {
    this.pontuacao = Math.max(0, pontuacao);
  }

  // Incrementa a quantidade de tentativas em +1
  public void incrementarTentativas() {
    tentativas++;
  }

  // Método para atualizar a pontuação do jogador
  public void atualizarPontuacao(int valor) {
    if (valor > 0) {
      pontuacao += valor;
    }
  }
}