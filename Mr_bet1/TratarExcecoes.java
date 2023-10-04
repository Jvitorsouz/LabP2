import org.junit.platform.commons.util.StringUtils;

public class TratarExcecoes{

    public TratarExcecoes(){

    }

    public void incluirTimesExcecao(String codigo, String nome, String mascote){
        if(StringUtils.isBlank(codigo)){
            throw new IllegalArgumentException("CODIGO NULO OU VAZIO");
        }if(StringUtils.isBlank(nome)){
            throw new IllegalArgumentException("NOME NULO OU VAZIO");
        }if(StringUtils.isBlank(mascote)){
            throw new IllegalArgumentException("MASCOTE NULO OU VAZIO");
        }
    }
    
    public void codigoExcecao(String codigo){
        if(StringUtils.isBlank(codigo)){
            throw new IllegalArgumentException("CODIGO NULO OU VAZIO");
        }
    }

    public void campeonatoExcecao(String codigo){
        if(StringUtils.isBlank(codigo)){
            throw new IllegalArgumentException("CAMPEONATO NULO OU VAZIO");
        }
    }
  
}