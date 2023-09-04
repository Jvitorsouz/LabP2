public class Bordado{
    
    private int id;
    private int linhas;
    private int colunas;
    private String bordado[][];

    public Bordado(int id, int linhas, int colunas){
        this.id = id;
        this.linhas = linhas;
        this.colunas = colunas;
        bordado = new String[linhas][colunas];
    }

    public void adicionarPonto(Ponto ponto){
        int linha = ponto.getLinhaPonto();
        int coluna = ponto.getColunaPonto();
        this.bordado[linha][coluna] = ponto.getTipoPonto();
    }

    public String toString(){
        String formato = "|-----|\n";
        for(int i=0; i<this.linhas; i++){
            for(int j=0; j<bordado[i].length; j++){
                if(bordado[i][j] == null){
                     formato += " ";
                }else{
                    formato += bordado[i][j];
                }
            }
            formato += "\n";
        }
        formato += "|-----|\n";
        return formato ;
    }
}