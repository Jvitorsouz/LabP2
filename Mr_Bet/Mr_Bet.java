import java.util.HashMap;

public class Mr_Bet{

    private HashMap<String, Time> times;

    public Mr_Bet(){
        times = new HashMap<>();
    }

    public String incluirTime(String codigo, String nome, String mascote){
        TratamentodeExcecoes(codigo, nome, mascote);
        if(this.times.containsKey(codigo)){
            return "TIME JÁ EXISTE!";
        }
        times.put(codigo, new Time(codigo, nome, mascote));
        return "INCLUSÃO REALIZADA!";
    }

    public Time recuperaTime(String codigo){
        if(this.times.containsKey(codigo)){
            return this.times.get(codigo);
        }
        return times.get(codigo);
    }

    private void TratamentodeExcecoes(String codigo, String nome, String mascote){
        if(codigo == null && nome == null && mascote == null){
            throw new IllegalArgumentException("ARGUMENTO INVALIDO!");
        }
    }
}