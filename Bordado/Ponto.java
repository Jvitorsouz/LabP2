public class Ponto{

    private String tipoPonto;
    private int linhaPonto;
    private int colunaPonto;

    public Ponto(String tipoPonto, int linhaPonto, int colunaPonto){
        this.tipoPonto = tipoPonto;
        this.linhaPonto = linhaPonto;
        this.colunaPonto = colunaPonto;
    }

    public int getLinhaPonto(){
        return linhaPonto;
    }

    public int getColunaPonto(){
        return colunaPonto;
    }

    public String getTipoPonto(){
        return tipoPonto;
    }

}