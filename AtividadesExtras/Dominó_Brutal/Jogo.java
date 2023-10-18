import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Jogo {

    private Jogador jogador1;
    private Jogador jogador2;
    private int rodadasJogadas;
    private boolean finalizado;
    private String vencedor;
    private Mesa mesa;

    public Jogo(){
        this.rodadasJogadas = 0;
        this.finalizado = false;
        this.vencedor = null;
        this.mesa = new Mesa();

    }

    protected Jogo(String nomeJogador1, EstrategiaDeJogo estrategia1, String nomeJogador2, EstrategiaDeJogo estrategia2 , int numPecasIncial, Random geradorDeNumsAleatorios){
        this();
        List<Peca> pecas = criaPecas(); 
        Collections.shuffle(pecas, geradorDeNumsAleatorios);

        List<Peca> maoJ1 = sorteiaMao(pecas, numPecasIncial);
        List<Peca> maoJ2 = sorteiaMao(pecas, numPecasIncial);

        this.jogador1 = new Jogador(nomeJogador1, estrategia1, maoJ1);
        this.jogador2 = new Jogador(nomeJogador2, estrategia2, maoJ2);
    }
    
    public Jogo(String nomeJogador1, EstrategiaDeJogo estrategia1, String nomeJogador2, EstrategiaDeJogo estrategia2 , int numPecasIncial){
        this(nomeJogador1, estrategia1, nomeJogador2, estrategia2, numPecasIncial, new Random());
    }

}
