public class TratarExcecoes{

    public TratarExcecoes(){

    }

    public void incluirTimesExcecao(String codigo, String nome, String mascote){
        if(codigo.isEmpty()){
            throw new IllegalArgumentException("CODIGO NULO OU VAZIO");
        }if(nome.isEmpty()){
            throw new IllegalArgumentException("NOME NULO OU VAZIO");
        }if(mascote.isEmpty()){
            throw new IllegalArgumentException("MASCOTE NULO OU VAZIO");
        }
    }

    public void codigoExcecao(String codigo){
        if(codigo.isEmpty()){
            throw new IllegalArgumentException("CODIGO NULO OU VAZIO");
        }
    }

    public void codigosExcecao(String codigo1, String codigo2){
        if(codigo1.isEmpty() && codigo2.isEmpty()){
            throw new IllegalArgumentException("CODIGO NULO OU VAZIO");
        }
    }

}