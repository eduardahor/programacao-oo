package ed02;

/**
 * Classe base que representa um personagem de RPG.
 */
public abstract class Personagem {
    /** Nome do personagem. */
    protected String nome;

    /** Pontos de vida do personagem. */
    protected int hp;

    /** Ataque base do personagem. */
    protected int ataqueBase;

    /**
     * Cria um novo personagem.
     * 
     * @param nome Nome do personagem
     * @param hp Pontos de vida
     * @param ataqueBase Pontos de ataque base
     */
    public Personagem(String nome, int hp, int ataqueBase) {
        this.nome = nome;
        this.hp = hp;
        this.ataqueBase = ataqueBase;
    }

    /**
     * Realiza um ataque em um inimigo.
     * 
     * @param inimigo Personagem inimigo
     */
    public abstract void atacar(Personagem inimigo);

    /**
     * Defende-se de um ataque, recebendo dano.
     * 
     * @param dano Valor do dano recebido
     */
    public abstract void defender(int dano);

    /**
     * Usa a habilidade especial do personagem.
     */
    public abstract void usarHabilidadeEspecial();

    /**
     * Exibe o status do personagem.
     */
    public void status() {
        System.out.println(nome + " - HP: " + hp);
    }

    /**
     * Verifica se o personagem ainda está vivo.
     * 
     * @return true se o HP for maior que zero
     */
    public boolean estaVivo() {
        return hp > 0;
    }
}

