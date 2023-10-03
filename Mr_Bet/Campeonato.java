public class Campeonato{

    private String nome;
    private int qtdeTimes;
    private Time[] times;
    private int idx;

    public Campeonato(String nome, int qtdeTimes){
        this.nome = nome;
        this.qtdeTimes = qtdeTimes;
        times = new Time[qtdeTimes];
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
        Campeonato other = (Campeonato) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

    public boolean addTime(Time time){
        times[idx++] = time;
        return true;
    }

}