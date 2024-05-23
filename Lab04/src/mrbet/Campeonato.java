package mrbet;

import java.util.HashSet;

/**
 * A classe Campeonato representa um torneio esportivo com uma lista de times participantes.
 * @author João Vitor da Silva Souza.
 */
public class Campeonato{

	/**
     * O nome do campeonato.
     */
    private String nome;
    
    /**
     * A quantidade total de times que podem participar do campeonato.
     */
    private int qtdeTimes;
    
    /**
     * Uma coleção HashSet que contém os times participantes do campeonato.
     */
    private HashSet<Time> times;

    /**
     * Construtor da classe Campeonato.
     *
     * @param nome O nome do campeonato.
     * @param qtdeTimes A quantidade total de times que podem participar do campeonato.
     */
    public Campeonato(String nome, int qtdeTimes){
        this.nome = nome;
        this.qtdeTimes = qtdeTimes;
        times = new HashSet<>();
    }

    /**
     * Retorna um valor de hash para este objeto Campeonato.
     *
     * @return O valor de hash deste Campeonato.
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }

    /**
     * Compara este objeto Campeonato com outro objeto para igualdade.
     *
     * @param obj O objeto a ser comparado com este Campeonato.
     * @return True se os objetos forem iguais, caso contrário, False.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Campeonato other = (Campeonato) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }


    /**
     * Adiciona um time à lista de times participantes do campeonato.
     *
     * @param time O time a ser adicionado.
     * @return True se o time foi adicionado com sucesso, caso contrário, False.
     */
    public boolean addTime(Time time){
        times.add(time);
        return true;
    }

    /**
     * Obtém a quantidade total de times que podem participar do campeonato.
     *
     * @return A quantidade total de times.
     */
    public int getQtde(){
        return this.qtdeTimes;
    }

    /**
     * Obtém o índice atual (quantidade de times participantes) do campeonato.
     *
     * @return O índice atual do campeonato.
     */
    public int getIdx(){
        return this.times.size();
    }

    /**
     * Obtém o nome do campeonato.
     *
     * @return O nome do campeonato.
     */
    public String getNome(){
        return this.nome;
    }

    /**
     * Verifica se um time com o código especificado está na lista de times participantes do campeonato.
     *
     * @param codigoTime O código do time a ser verificado.
     * @return True se o time estiver na lista de times participantes, caso contrário, False.
     */
    public boolean verificaTime(String codigoTime){
        Time time = new Time(codigoTime, "", "");
        return times.contains(time);
    }

    /**
     * Retorna uma representação em string do campeonato, incluindo o nome do campeonato,
     * a quantidade atual de times participantes e a quantidade total de times permitidos.
     *
     * @return Uma representação em string do campeonato.
     */
    public String toString(){
        return "\n* " + this.nome + " - " + this.times.size() + "/" + this.qtdeTimes;      
    }

}