public class Terreno{

    private String nome;
    private int valor;

    public Terreno(String nome, int valor){
        //Lançar exceções
        if(nome == null && nome.isBlank()){
            throw new IllegalArgumentException("Nome não pode ser vazio ou nulo");
        } if(valor < 0){
            throw new IllegalArgumentException("Valor não pode ser negativo");
        }
        this.nome = nome;
        this.valor = valor;
    }

    /* 
    public void criaCasa(int area, int andares){

    } */

    public String toString(){
        return this.nome + " " + (this.valor / 100.0) + " reais";
    }
}