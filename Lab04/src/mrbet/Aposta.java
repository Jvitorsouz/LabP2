package mrbet;

/**
 * A classe Aposta representa uma aposta feita por um usuário em um determinado campeonato.
 * @author João Vitor da Silva Souza.
 */
public class Aposta{

	/**
     * O time em que a aposta está sendo feita.
     */
    private Time time;
    
    /**
     * O campeonato no qual a aposta está sendo feita.
     */
    private Campeonato campeonato;
    
    /**
     * A colocação que o usuário está apostando.
     */
    private int colocacao;
    
    /**
     * O valor da aposta.
     */
    private double valor;

    /**
     * Construtor da classe Aposta.
     *
     * @param time O time em que a aposta está sendo feita.
     * @param campeonato O campeonato no qual a aposta está sendo feita.
     * @param colocacao A colocação que o usuário está apostando.
     * @param valor O valor da aposta.
     */
    public Aposta(Time time, Campeonato campeonato, int colocacao, double valor){
        this.time = time;
        this.campeonato = campeonato;
        this.colocacao = colocacao;
        this.valor = valor;
    }

    /**
     * Retorna uma representação em string da aposta, incluindo informações sobre o time,
     * o nome do campeonato, a colocação apostada, a quantidade total de equipes no campeonato
     * e o valor da aposta formatado com duas casas decimais.
     *
     * @return Uma representação em string da aposta.
     */
    public String toString(){
        return this.time.toString() + "\n" + this.campeonato.getNome() + "\n" + this.colocacao + "/" + this.campeonato.getQtde() + "\nR$ " + String.format("%.2f", this.valor);
    }
}