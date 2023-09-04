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
        Ponto ponto = new Ponto(tipoPonto, numLinhas, numColunas);
        bordados[id].adicionarPonto(ponto);
        //bordados[id].adicionarPonto(tipoPonto, numLinhas, numColunas);
    }


    public String imprimeBordado(int id){
        return bordados[id].toString();
    }

    public int getQTD(){
        return qtdBordados;
    }
    
}