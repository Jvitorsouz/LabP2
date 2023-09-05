public class Bordado{
    
    private int id;
    private int linhas;
    private int colunas;
    private String bordado[][];
    private int qtdePontos;
    private double preco;
    private Avaliacao[] avaliacoes;
    private int qtdeAvaliacao;
    private double mediaGeral;

    public Bordado(int id, int linhas, int colunas){
        this.id = id;
        this.linhas = linhas;
        this.colunas = colunas;
        bordado = new String[linhas][colunas];
        avaliacoes = new Avaliacao[5];
    }

    public void adicionarPonto(String ponto, int linha, int coluna){
        //int linha = ponto.getLinhaPonto();
        //int coluna = ponto.getColunaPonto();
        this.bordado[linha][coluna] = ponto;//.getTipoPonto();
        qtdePontos++;
        preco = 1 * qtdePontos;
    }

    public String exibiBordado(){
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
        return formato;
    }

    public String toString(){
        return this.id + " - " + this.linhas + " x " + this.colunas + " - " + qtdePontos + " Pontos\n";
    }

    public void setLinhas(int linha){
        this.linhas = linha;
    }

    public void setColunas(int coluna){
        this.colunas = coluna;
    }

    public void adicionaAvaliacao(Avaliacao avaliacao){
        if(qtdeAvaliacao < 5){
            avaliacoes[qtdeAvaliacao] = avaliacao;
        }
        else{
            qtdeAvaliacao = 0;
        }
        qtdeAvaliacao++;
    }

    public double getAvaliacao(){
        for(int i = 0; i<qtdeAvaliacao; i++){
            mediaGeral += avaliacoes[i].getNota();
        }

        double media = mediaGeral / qtdeAvaliacao;
        return media;
    }

    public String getAvaliacoes(int id){
        String formatacao = "\n";
        for(int i =0; i<qtdeAvaliacao; i++){
            formatacao += avaliacoes[i].toString();
        }
        return formatacao;
    }

}