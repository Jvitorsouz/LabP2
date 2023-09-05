public class Compra{

    private int[] bordados;
    private double valorTotal;
    private int qtdeComprado;
    private BEP sistema;
    private int indice;


    public Compra(){
        bordados = new int[10];
        sistema = new BEP();
    }

    public void adicionarCompra(int id){
        bordados[indice] = id;
    }
    



}