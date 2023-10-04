public class Aposta{

    private Time time;
    private Campeonato campeonato;
    private int colocacao;
    private double valor;

    public Aposta(Time time, Campeonato campeonato, int colocacao, double valor){
        this.time = time;
        this.campeonato = campeonato;
        this.colocacao = colocacao;
        this.valor = valor;
    }

    public String toString(){
        return this.time.toString() + "\n" + this.campeonato.getNome() + "\n" + this.colocacao + "/" + this.campeonato.getQtde() + "\nR$ " + this.valor;
    }
}