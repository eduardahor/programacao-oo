package ED01;

// Importa classes necessárias
import static java.lang.System.out;       
import java.util.ArrayList;         

// Classe que representa o placar do jogo
public class Placar {

  // Construtor da classe Placar
  public Placar() {
    // Inicializa a lista de jogadores (ranking) como um ArrayList vazio
    this.ranking = new ArrayList<>();
  }

  // Cria a lista onde vamos armazenar os jogadores e suas pontuações
  private ArrayList<Jogador> ranking = new ArrayList<>();

  // Método para adicionar um jogador ao ranking
  public void adicionarJogador(Jogador jogador) {
    ranking.add(jogador); // Adiciona o jogador recebido como parâmetro à lista
  }

  // Método para exibir o ranking atual
  public void mostrarRanking() {
    // Ordena o ranking em ordem decrescente de pontuação (maior para menor)
    ranking.sort((j1, j2) -> Integer.compare(j2.getPontuacao(), j1.getPontuacao()));
    out.println("======= RANKING =======");

    // Percorre a lista de jogadores e mostra o nome e a pontuação de cada um
    for (Jogador jogador : ranking) {
      out.println("Nome: " + jogador.getNome() + " Pontuação: " + jogador.getPontuacao());
    }
  }
}