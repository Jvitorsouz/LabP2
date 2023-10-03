import java.util.HashMap;
import java.util.Map;

public class Mr_Bet{

    private HashMap<String, Time> times;
    private HashMap<String, Campeonato> campeonatos;

    public Mr_Bet(){
        times = new HashMap<>();
        campeonatos = new HashMap<>();
    }

    public String incluirTime(String codigo, String nome, String mascote){
        //TratamentodeExcecoes(codigo, nome, mascote);
        if(this.times.containsKey(codigo)){
            return "TIME JÁ EXISTE!";
        }
        times.put(codigo, new Time(codigo, nome, mascote));
        return "INCLUSÃO REALIZADA!";
    }

    public String recuperaTime(String codigo){
        if(this.times.containsKey(codigo)){
            return "[" + codigo + "] " + this.times.get(codigo);
        }

        return "TIME NÃO EXISTE!";  
    }

    public String adicionaCampeonato(String campeonato, int qtdeTimes){
        if(this.campeonatos.containsKey(campeonato)){
            return "CAMPEONATO JÁ EXISTE!";
        }
        campeonatos.put(campeonato, new Campeonato(campeonato, qtdeTimes));
        return "CAMPEONATO ADICIONADO!";
    }

    public String addTimeCampeonato(String campeonato, String codigoTime){
        TratamentodeExcecoes(codigoTime, campeonato);
        if(this.campeonatos.get(campeonato).getIdx() >= this.campeonatos.get(campeonato).getQtde()){
            throw new IndexOutOfBoundsException("TODOS OS TIMES DESSE CAMPEONATO JÁ FORAM INCLUÍDOS!");
        }
        this.campeonatos.get(campeonato).addTime(this.times.get(codigoTime));
        return "TIME INCLUÍDO NO CAMPEONATO!";
    }

    public String verificaTimeCampeonato(String campeonato, String codigoTime){
        TratamentodeExcecoes(codigoTime, campeonato);
        if(this.campeonatos.get(campeonato).verificaTime(codigoTime)){
            return "O TIME ESTÁ NO CAMPEONATO!";
        }
        return "O TIME NÃO ESTÁ NO CAMPEONATO!";
    }

    public String exibirTimeCampeonatos(String codigoTime){
        String formatacao = "\nCampeonatos do " + this.times.get(codigoTime).getNome() + ":";
        for(String key: campeonatos.keySet()){
            if(this.campeonatos.get(key).verificaTime(codigoTime)){
                formatacao += this.campeonatos.get(key);
            }

        }
        return formatacao;
    }



















    private void TratamentodeExcecoes(String codigoTime, String codigoCampeonato){
        if(!this.times.containsKey(codigoTime)){
            throw new IllegalArgumentException("TIME NÃO EXISTE!");
        }if(!this.campeonatos.containsKey(codigoCampeonato)){
            throw new IllegalArgumentException("CAMPEONATO NÃO EXISTE!");
        }
    }
}