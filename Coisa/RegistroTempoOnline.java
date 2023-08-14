public class RegistroTempoOnline{
    
    private String nomeDisciplina;
    private int tempoOnlineEsperado;
    private int tempoInvestidoOnline;

    //primeiro construtor
    public RegistroTempoOnline(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = 120; 
    }

    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado){
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
    }

    public void adicionaTempoOnline(int tempo){
        this.tempoInvestidoOnline += tempo;
    }

    public boolean atingiuMetaTempoOnline(){
        return tempoInvestidoOnline >= tempoOnlineEsperado;
    }

    public String toString(){
        return nomeDisciplina + " " + tempoInvestidoOnline + "/" + tempoOnlineEsperado;

    }
    
}


