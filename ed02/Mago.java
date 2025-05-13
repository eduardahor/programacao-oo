package ed02;

/**
 * Classe que representa um Mago.
 */
public class Mago extends Personagem {

    /**
     * Cria um mago com nome, vida e ataque base.
     * 
     * @param nome Nome do mago
     */
    public Mago(String nome) {
        super(nome, 100, 30);
    }

    @Override
    public void atacar(Personagem inimigo) {
        System.out.println(nome + " lança um feitiço!");
        inimigo.defender(ataqueBase);
    }

    @Override
    public void defender(int dano) {
        hp -= dano;
        System.out.println(nome + " não tem defesa! Sofre " + dano + " de dano.");
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " usa Bola de Fogo!");
        // Poderia atingir múltiplos inimigos em um jogo completo
        System.out.println("Bola de Fogo causa " + (int)(ataqueBase * 1.5) + " de dano em área!");
    }
}

