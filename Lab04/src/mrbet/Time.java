package mrbet;

/**
 * A classe Time representa uma equipe esportiva com um identificador, nome e mascote.
 * @author João Vitor da Silva Souza.
 */
public class Time{
	 
	/**
     * O identificador único do time.
     */	
    private String idTime;
    
    /**
     * O nome do time.
     */
    private String nome;
    
    /**
     * O mascote do time.
     */
    private String mascote;

    /**
     * Construtor da classe Time.
     *
     * @param idTime O identificador único do time.
     * @param nome O nome do time.
     * @param mascote O mascote do time.
     */
    public Time(String idTime, String nome, String mascote){
        this.idTime = idTime;
        this.nome = nome;
        this.mascote = mascote;
    }

    /**
     * Retorna uma representação em string do time no formato "[ID] Nome / Mascote".
     *
     * @return Uma representação em string do time.
     */
    public String toString(){
        return "["+ this.idTime + "] " + this.nome + " / " + this.mascote; 
    }

    /**
     * Calcula o valor de hash para o objeto Time com base no identificador único (idTime).
     *
     * @return O valor de hash calculado para o objeto Time.
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idTime == null) ? 0 : idTime.hashCode());
        return result;
    }

    /**
     * Compara este objeto Time com outro objeto para igualdade com base no identificador único (idTime).
     *
     * @param obj O objeto a ser comparado com este Time.
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
        Time other = (Time) obj;
        if (idTime == null) {
            if (other.idTime != null)
                return false;
        } else if (!idTime.equals(other.idTime))
            return false;
        return true;
    }

    /**
     * Obtém o nome do time.
     *
     * @return O nome do time.
     */
    public String getNome(){
        return this.nome;
    }
    
}