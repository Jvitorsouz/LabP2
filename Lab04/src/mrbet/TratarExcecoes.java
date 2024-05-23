package mrbet;

/**
 * A classe TratarExcecoes contém métodos para lidar com exceções comuns no sistema MrBet.
 * @author João Vitor da Silva Souza.
 */
public class TratarExcecoes{


	 /**
     * Construtor da classe TratarExcecoes.
     */
    public TratarExcecoes(){
    }

    /**
     * Lança uma exceção se qualquer um dos argumentos (codigo, nome ou mascote) for nulo ou vazio.
     *
     * @param codigo O código a ser verificado.
     * @param nome O nome a ser verificado.
     * @param mascote O mascote a ser verificado.
     * @throws IllegalArgumentException Se qualquer um dos argumentos for nulo ou vazio.
     */
    public void incluirTimesExcecao(String codigo, String nome, String mascote){
        if(codigo.isEmpty()){
            throw new IllegalArgumentException("CODIGO NULO OU VAZIO");
        }if(nome.isEmpty()){
            throw new IllegalArgumentException("NOME NULO OU VAZIO");
        }if(mascote.isEmpty()){
            throw new IllegalArgumentException("MASCOTE NULO OU VAZIO");
        }
    }
    
    /**
     * Lança uma exceção se o código for nulo ou vazio.
     *
     * @param codigo O código a ser verificado.
     * @throws IllegalArgumentException Se o código for nulo ou vazio.
     */
    public void codigoExcecao(String codigo){
        if(codigo.isEmpty()){
            throw new IllegalArgumentException("CODIGO NULO OU VAZIO");
        }
    }

    /**
     * Lança uma exceção se o código do campeonato for nulo ou vazio.
     *
     * @param codigo O código do campeonato a ser verificado.
     * @throws IllegalArgumentException Se o código do campeonato for nulo ou vaio.
     */
    public void campeonatoExcecao(String codigo){
        if(codigo.isEmpty()){
            throw new IllegalArgumentException("CAMPEONATO NULO OU VAZIO");
        }
    }
  
}