package agenda;


/**
* A classe Contato representa um contato telefônico com nome, sobrenome e número de telefone.
*/
public class Contato{

    private String nome;
    private String sobrenome;
    private String telefone;
    private String status;

    /**
    * Construtor da classe Contato.
    *
    * @param nome O nome do contato.
    * @param sobrenome O sobrenome do contato.
    * @param telefone O número de telefone do contato.
    */
    public Contato(String nome, String sobrenome, String telefone){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.status = null;
    }

    /**
    * Calcula o código de hash do contato com base no nome e sobrenome.
    *
    * @return O código de hash calculado.
    */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((sobrenome == null) ? 0 : sobrenome.hashCode());
        return result;
    }

    /**
    * Compara dois contatos para verificar se eles são iguais com base no nome e sobrenome.
    *
    * @param obj O objeto a ser comparado com o contato atual.
    * @return true se os contatos forem iguais, false caso contrário.
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Contato other = (Contato) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (sobrenome == null) {
            if (other.sobrenome != null)
                return false;
        } else if (!sobrenome.equals(other.sobrenome))
            return false;
        return true;
    }

    /**
    * Retorna uma representação em texto do contato.
    *
    * @return Uma string contendo o status (se disponível), nome, sobrenome e telefone do contato.
    */
    public String exibiContato(){
        if(this.status != null){
            return "\n" +this.status + " " + this.nome + " " + this.sobrenome + "\n" + this.telefone;
        }
        return "\n" + this.nome + " " + this.sobrenome + "\n" + this.telefone;
    }

    /**
    * Retorna uma representação em texto simplificada do contato.
    *
    * @return Uma string contendo apenas o nome e sobrenome do contato.
    */
    public String toString(){
        return " - " + this.nome + " " + this.sobrenome + "\n";
    }

    /**
    * Define o status do contato.
    *
    * @param heart O status a ser definido para o contato.
    */
    public void setStatus(String heart){
        this.status = heart;
    }

    

}