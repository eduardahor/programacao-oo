package ed02;

/**
 * Classe que representa um Guerreiro.
 */
public class Guerreiro extends Personagem {

    /**
     * Cria um guerreiro com nome, vida e ataque base.
     * 
     * @param nome Nome do guerreiro
     */
    public Guerreiro(String nome) {
        super(nome, 150, 25);
    }

    @Override
    public void atacar(Personagem inimigo) {
        System.out.println(nome + " ataca com espada!");
        inimigo.defender(ataqueBase);
    }

    @Override
    public void defender(int dano) {
        int danoReduzido = dano / 2;
        hp -= danoReduzido;
        System.out.println(nome + " defende com armadura! Dano reduzido para " + danoReduzido);
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " usa Golpe Duplo!");
        // Duas vezes o ataqueBase
        System.out.println("Primeiro golpe:");
        atacarSimples();
        System.out.println("Segundo golpe:");
        atacarSimples();
    }

    private void atacarSimples() {
        // Exemplo de uso sem inimigo real, poderia receber um inimigo real como parâmetro
        System.out.println(nome + " causa " + ataqueBase + " de dano!");
    }
}

