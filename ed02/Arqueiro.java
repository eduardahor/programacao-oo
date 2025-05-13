package ed02;

import java.util.Random;

/**
 * Classe que representa um Arqueiro.
 */
public class Arqueiro extends Personagem {
    private Random rand = new Random();

    /**
     * Cria um arqueiro com nome, vida e ataque base.
     * 
     * @param nome Nome do arqueiro
     */
    public Arqueiro(String nome) {
        super(nome, 120, 20);
    }

    @Override
    public void atacar(Personagem inimigo) {
        boolean critico = rand.nextInt(100) < 20; // 20% de chance
        int dano = critico ? ataqueBase * 2 : ataqueBase;

        System.out.println(nome + (critico ? " acerta um CRÍTICO!" : " dispara uma flecha."));
        inimigo.defender(dano);
    }

    @Override
    public void defender(int dano) {
        hp -= dano;
        System.out.println(nome + " tenta desviar, mas recebe " + dano + " de dano.");
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " usa Chuva de Flechas!");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Flecha " + i + " atinge o inimigo causando " + ataqueBase + " de dano!");
        }
    }
}

