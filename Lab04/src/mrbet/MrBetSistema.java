package mrbet;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * A classe MrBetSistema representa um sistema de gerenciamento de apostas em campeonatos esportivos.
 * @author João Vitor da Silva Souza.
 */
public class MrBetSistema{

	/**
     * Um mapa que armazena os times pelo seu código.
     */
    private HashMap<String, Time> times;
    
    /**
     * Um mapa que armazena os campeonatos pelo seu nome.
     */
    private HashMap<String, Campeonato> campeonatos;
    
    /**
     * Uma lista de apostas registradas no sistema.
     */
    private ArrayList<Aposta> apostas;
    
    /**
     * Uma instância da classe TratarExcecoes para tratamento de exceções personalizadas.
     */
    private TratarExcecoes tratarExecoes;

    /**
     * Construtor da classe MrBetSistema. Inicializa os mapas de times e campeonatos, a lista de apostas
     * e a instância de TratarExcecoes.
     */
    public MrBetSistema(){
        times = new HashMap<>();
        campeonatos = new HashMap<>();
        apostas = new ArrayList<>();
        tratarExecoes = new TratarExcecoes();
    }

    /**
     * Inclui um novo time no sistema.
     *
     * @param codigo O código do time.
     * @param nome O nome do time.
     * @param mascote O mascote do time.
     * @return Uma mensagem de confirmação ou erro.
     */
    public String incluirTime(String codigo, String nome, String mascote){
        tratarExecoes.incluirTimesExcecao(codigo, nome, mascote);

        if(this.times.containsKey(codigo)){
            return "TIME JÁ EXISTE!";
        }
        times.put(codigo, new Time(codigo, nome, mascote));
        return "INCLUSÃO REALIZADA!";
    }

    /**
     * Recupera informações de um time pelo seu código.
     *
     * @param codigo O código do time a ser recuperado.
     * @return Uma representação em string do time ou uma mensagem de erro.
     */
    public String recuperaTime(String codigo){
        tratarExecoes.codigoExcecao(codigo);

        if(this.times.containsKey(codigo)){
            return "\n" + this.times.get(codigo);
        }

        return "TIME NÃO EXISTE!";  
    }

    /**
     * Adiciona um novo campeonato ao sistema.
     *
     * @param campeonato O nome do campeonato.
     * @param qtdeTimes A quantidade total de times permitidos no campeonato.
     * @return Uma mensagem de confirmação ou erro.
     */
    public String adicionaCampeonato(String campeonato, int qtdeTimes){
        tratarExecoes.campeonatoExcecao(campeonato);

        if(this.campeonatos.containsKey(campeonato)){
            return "CAMPEONATO JÁ EXISTE!";
        }
        campeonatos.put(campeonato, new Campeonato(campeonato, qtdeTimes));
        return "CAMPEONATO ADICIONADO!";
    }

    /**
     * Adiciona um time a um campeonato.
     *
     * @param codigoTime O código do time a ser adicionado ao campeonato.
     * @param campeonato O nome do campeonato.
     * @return Uma mensagem de confirmação ou erro.
     */
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

    /**
     * Verifica se um time está inscrito em um campeonato.
     *
     * @param codigoTime O código do time a ser verificado.
     * @param campeonato O nome do campeonato.
     * @return Uma mensagem informando se o time está ou não no campeonato.
     */
    public String verificaTimeCampeonato(String codigoTime, String campeonato){
        tratarExecoes.codigoExcecao(codigoTime);
        tratarExecoes.campeonatoExcecao(campeonato);
        TratamentodeExcecoes(codigoTime, campeonato);

        if(this.campeonatos.get(campeonato).verificaTime(codigoTime)){
            return "O TIME ESTÁ NO CAMPEONATO!";
        }
        return "O TIME NÃO ESTÁ NO CAMPEONATO!";
    }

    /**
     * Exibe os campeonatos em que um time está inscrito.
     *
     * @param codigoTime O código do time.
     * @return Uma representação em string dos campeonatos em que o time está inscrito.
     */
    public String exibirTimeCampeonatos(String codigoTime){
        tratarExecoes.codigoExcecao(codigoTime);
        if(!this.times.containsKey(codigoTime)){
            throw new IllegalArgumentException("TIME NÃO EXISTE!");
        }

        String formatacao = "\nCampeonatos do " + this.times.get(codigoTime).getNome() + ":";
        for(String key: campeonatos.keySet()){
            if(this.campeonatos.get(key).verificaTime(codigoTime)){
                formatacao += this.campeonatos.get(key);
            }

        }
        return formatacao;
    }

    /**
     * Registra uma aposta no sistema.
     *
     * @param codigoTime O código do time pelo qual está sendo feita a aposta.
     * @param codigoCampeonato O nome do campeonato em que está sendo feita a aposta.
     * @param colocacao A colocação apostada.
     * @param valor O valor da aposta.
     * @return Uma mensagem de confirmação ou erro.
     */
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

    /**
     * Retorna uma representação em string de todas as apostas registradas no sistema.
     *
     * @return Uma representação em string das apostas.
     */
    public String statusAposta(){
        String formatacao = "\nApostas:\n";
        for(int i =0; i<apostas.size(); i++){
            formatacao += (i+1) + ". " + apostas.get(i).toString() + System.lineSeparator();
        }
        return formatacao;
    }

    /**
     * Tratamento de exceções comuns para os métodos.
     *
     * @param codigoTime O código do time.
     * @param codigoCampeonato O nome do campeonato.
     */
    private void TratamentodeExcecoes(String codigoTime, String codigoCampeonato){
        if(!this.times.containsKey(codigoTime)){
            throw new IllegalArgumentException("TIME NÃO EXISTE!");
        }else if(!this.campeonatos.containsKey(codigoCampeonato)){
            throw new IllegalArgumentException("CAMPEONATO NÃO EXISTE!");
        }
    }
}