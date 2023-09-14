public class Contato{

    private String nome;
    private String sobrenome;
    private String telefone;
    private int posicao;

    public Contato(String nome, String sobrenome, String telefone, int posicao){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.posicao = posicao;
    }

    public int getPosicao(){
        return this.posicao;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((sobrenome == null) ? 0 : sobrenome.hashCode());
        return result;
    }

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

    public String exibiContato(){
        return "\n" + this.nome + " " + this.sobrenome + "\n" + this.telefone;
    }

    public String toString(){
        return this.posicao + " - " + this.nome + " " + this.sobrenome + "\n";
    }

    

}