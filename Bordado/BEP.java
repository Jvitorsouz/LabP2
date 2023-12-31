public class BEP{

    private Bordado[] bordados;
    private Compra[] compras;
    private int qtdBordados = 10;

    public BEP(){
        compras = new Compra[10];
        bordados = new Bordado[10];
    }

    public void cadastrarBordado(int id, int numLinhas, int numColunas){
        bordados[id] = new Bordado(id, numLinhas, numColunas);
        qtdBordados -= 1;

    }

    public void atualizaBordado(int id, String tipoPonto, int numLinhas, int numColunas){
        //Ponto ponto = new Ponto(tipoPonto, numLinhas, numColunas);
        bordados[id].adicionarPonto(tipoPonto, numLinhas, numColunas);
    }


    public String imprimeBordado(int id){
        return bordados[id].exibiBordado();
    }

    public String listarBordados(){
        String formatacao = "";
        for(int i = 0; i<bordados.length; i++){{
            if(bordados[i] != null){
                formatacao += bordados[i].toString();
            }
        }

        }
        return formatacao;
    }

    public void alteraTamnahoBordado(int id, int numLinhas, int numColunas){
        bordados[id].setLinhas(numLinhas);
        bordados[id].setColunas(numColunas);
    }

    public int getQTD(){
        return qtdBordados;
    }
    
    public void avaliarBordado(int id, double nota, String comentario){
        Avaliacao avaliacao = new Avaliacao(nota, comentario);
        bordados[id].adicionaAvaliacao(avaliacao);
    }

    public double getAvaliacao(int id){
        return bordados[id].getAvaliacao();
    }
    
    public String getAvaliacoes(int id){
        return bordados[id].getAvaliacoes(id);
    }
}