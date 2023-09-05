public class Compra{

    private Bordado[] bordados;
    private double valorTotal;
    private int qtdeComprado;
    private BEP sistema;


    public Compra(){
        bordados = new Bordado[10];
        sistema = new BEP();
    }


    public void adicionaCompra(String compra){
        String[] compras =  compra.split(" ");
        /* 
        if(qtdeComprado < 10){
            for(int i=0; i<compras.length; i++){
                bordados[qtdeComprado] =  sistema.getBordado(Integer.parseInt(compras[i]));
                qtdeComprado++;

                valorTotal += bordados[qtdeComprado].getPreco();
            }
        }else{
            qtdeComprado = 0;
        }*/
    }

    public String imprimiCompra(){
        String formatacao = " ";
        for(int i = 0; i < qtdeComprado; i++){
            formatacao += "Bordado " + (i+1) + "\n";
            formatacao += bordados[i].exibiBordado();
        }
        formatacao += "\nTotal da Compra: " + valorTotal + "R$";
        return formatacao;
    }


}