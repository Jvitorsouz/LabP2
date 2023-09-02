public class Navio{

    private String nome;
    private int vida;
    private int poder;

    public Navio(String nome, int vida, int poder){
        this.nome = nome;
        this.vida = vida;
        this.poder = poder;
    }

    //Metodo para checar
    private boolean checagem(Navio navio){
        return (this == navio);
    }

    /*O navio invocado ataca o outro que esta sendo 
     * passado pelo parametro
     */
    public void ataca(Navio navio){
        /*Caso alguem mande o navio auto se atacar
        * Fica responsavel por analisar
        */
        if(checagem(navio)){
            return;
        }
        //o this representa o navio que invocou
        navio.vida -= this.poder;

    }

    public int getVida(){
        return this.vida;
    }
}