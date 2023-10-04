import java.util.ArrayList;
import java.util.HashMap;

public class Mr_Bet{

    private HashMap<String, Time> times;
    private HashMap<String, Campeonato> campeonatos;
    private ArrayList<Aposta> apostas;
    private TratarExcecoes tratarExecoes;

    public Mr_Bet(){
        times = new HashMap<>();
        campeonatos = new HashMap<>();
        apostas = new ArrayList<>();
        tratarExecoes = new TratarExcecoes();
    }

    public String incluirTime(String codigo, String nome, String mascote){
        tratarExecoes.incluirTimesExcecao(codigo, nome, mascote);

        if(this.times.containsKey(codigo)){
            return "TIME JÁ EXISTE!";
        }
        times.put(codigo, new Time(codigo, nome, mascote));
        return "INCLUSÃO REALIZADA!";
    }

    public String recuperaTime(String codigo){
        tratarExecoes.codigoExcecao(codigo);

        if(this.times.containsKey(codigo)){
            return "\n" + this.times.get(codigo);
        }

        return "TIME NÃO EXISTE!";  
    }

    public String adicionaCampeonato(String campeonato, int qtdeTimes){
        tratarExecoes.campeonatoExcecao(campeonato);

        if(this.campeonatos.containsKey(campeonato)){
            return "CAMPEONATO JÁ EXISTE!";
        }
        campeonatos.put(campeonato, new Campeonato(campeonato, qtdeTimes));
        return "CAMPEONATO ADICIONADO!";
    }

    
    public String addTimeCampeonato(String codigoTime, String campeonato){
        tratarExecoes.codigoExcecao(codigoTime);
        tratarExecoes.campeonatoExcecao(campeonato);
        TratamentodeExcecoes(codigoTime, campeonato);


        if(this.campeonatos.get(campeonato).getIdx() >= this.campeonatos.get(campeonato).getQtde()){
            return "TODOS OS TIMES DESSE CAMPEONATO JÁ FORAM INCLUÍDOS!";
        }
        this.campeonatos.get(campeonato).addTime(this.times.get(codigoTime));
        return "TIME INCLUÍDO NO CAMPEONATO!";
    }

    public String verificaTimeCampeonato(String codigoTime, String campeonato){
        tratarExecoes.codigoExcecao(codigoTime);
        tratarExecoes.campeonatoExcecao(campeonato);
        TratamentodeExcecoes(codigoTime, campeonato);

        if(this.campeonatos.get(campeonato).verificaTime(codigoTime)){
            return "O TIME ESTÁ NO CAMPEONATO!";
        }
        return "O TIME NÃO ESTÁ NO CAMPEONATO!";
    }

    public String exibirTimeCampeonatos(String codigoTime){
        tratarExecoes.codigoExcecao(codigoTime);

        String formatacao = "\nCampeonatos do " + this.times.get(codigoTime).getNome() + ":";
        for(String key: campeonatos.keySet()){
            if(this.campeonatos.get(key).verificaTime(codigoTime)){
                formatacao += this.campeonatos.get(key);
            }

        }
        return formatacao;
    }

    public String apostar(String codigoTime, String codigoCampeonato, int colocacao, double valor){
        tratarExecoes.codigoExcecao(codigoTime);
        tratarExecoes.campeonatoExcecao(codigoCampeonato);
        TratamentodeExcecoes(codigoTime, codigoCampeonato);
        
        if(this.campeonatos.get(codigoCampeonato).getQtde() < colocacao){
            return "APOSTA NÃO REGISTRADA!";
        }
        apostas.add(new Aposta(this.times.get(codigoTime), this.campeonatos.get(codigoCampeonato), colocacao, valor));
        return "APOSTA REGISTRADA!";
    }

    public String statusAposta(){
        String formatacao = "\n";
        for(int i =0; i<apostas.size(); i++){
            formatacao += (i+1) + ". " + apostas.get(i).toString() + System.lineSeparator();
        }
        return formatacao;
    }

    private void TratamentodeExcecoes(String codigoTime, String codigoCampeonato){
        if(!this.times.containsKey(codigoTime)){
            throw new IllegalArgumentException("TIME NÃO EXISTE!");
        }else if(!this.campeonatos.containsKey(codigoCampeonato)){
            throw new IllegalArgumentException("CAMPEONATO NÃO EXISTE!");
        }
    }
}