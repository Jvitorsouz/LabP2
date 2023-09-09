public class ControleTerreno{

    private Terreno[][] terrenos;

    public ControleTerreno(){
        this.terrenos = new Terreno[10][10];

    }

    public void cadastraTerreno(int linha, int coluna, String nome, int valor){
        this.terrenos[linha][coluna] = new Terreno(nome, valor);
    }

    public String exibiTerreno(int linha, int coluna){
        //Caso a posicao seja vazia
        if(this.terrenos[linha][coluna] == null){
            return "TERRENO VAZIO";
        }
        return this.terrenos[linha][coluna].toString();
    }

    public String exibiVizinhos(int linha, int coluna){
        String resultado = "";
        if(coluna > 0){
            resultado += "ESQUERDA: " + this.exibiTerreno(linha, coluna - 1) + System.lineSeparator();
        } if(coluna < 9){
            resultado += "DIREITA: " + this.exibiTerreno(linha, coluna + 1) + System.lineSeparator();           

        }
        return resultado;
    }

    /* 
    public void cadastraCasa(int linha, int coluna, int area, int andares){
        this.terrenos[linha][coluna].criaCasa(area, andares);
    } */
}