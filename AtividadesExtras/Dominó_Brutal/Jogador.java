import java.util.LinkedList;
import java.util.List;

public class Jogador{

    private EstrategiaDeJogo estrategia;
    private List<Peca> mao;
    private String nome;
    private Jogada ultimaJogada;

    public Jogador(String nome, EstrategiaDeJogo estrategia, List<Peca> maoJogador){
        this.nome = nome;
        this.estrategia = estrategia;
        this.mao = new LinkedList<>(maoJogador);
        this.ultimaJogada = null;
    }

}