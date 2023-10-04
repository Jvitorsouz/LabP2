public class Time{

    private String idTime;
    private String nome;
    private String mascote;

    public Time(String idTime, String nome, String mascote){
        this.idTime = idTime;
        this.nome = nome;
        this.mascote = mascote;
    }

    public String toString(){
        return this.nome + " / " + this.mascote + System.lineSeparator(); 
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idTime == null) ? 0 : idTime.hashCode());
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
        Time other = (Time) obj;
        if (idTime == null) {
            if (other.idTime != null)
                return false;
        } else if (!idTime.equals(other.idTime))
            return false;
        return true;
    }

    public String getNome(){
        return this.nome;
    }
    
}