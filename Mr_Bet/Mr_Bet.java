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
        TratamentodeExcecoes(codigo, nome, mascote);
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
        return "";
    }




















    private void TratamentodeExcecoes(String codigo, String nome, String mascote){
        if(codigo == null && nome == null && mascote == null){
            throw new IllegalArgumentException("ARGUMENTO INVALIDO!");
        }
    }
}