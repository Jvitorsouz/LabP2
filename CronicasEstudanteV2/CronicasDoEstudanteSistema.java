public class CronicasDoEstudanteSistema{

    private Cronicas[] cronicas;
    private int qtdeCronicas;
    private Livreto[] livretos;
    private int qtdeLivretos;

    public CronicasDoEstudanteSistema(){
        cronicas = new Cronicas[1000];
        livretos = new Livreto[100];
    }

    public void cadastrarCronica(String titulo, String texto, String data, String autor){
        if(qtdeCronicas > 1000){
            qtdeCronicas = 0;
        }
        Cronicas cronica = new Cronicas(titulo, texto, autor, data);
        if(verifica(cronica)){
            cronicas[qtdeCronicas++] = cronica; 
        }
    }

    public void cadastrarCronica(String titulo, String texto, String data){
        if(qtdeCronicas > 1000){
            qtdeCronicas = 0;
        }

        Cronicas cronica = new Cronicas(titulo, texto, data);
        if(verifica(cronica)){
            cronicas[qtdeCronicas++] = cronica;
        }
    }

    public boolean verifica(Cronicas cronica){
        for(int i=0; i<qtdeCronicas; i++){
            if(cronicas[i].equals(cronica)){
                return false;
            }
        }
        return true;
    }

    public String listarCronicas(){
        String formatacao = "\n";
        for(int i =0; i<qtdeCronicas; i++){
            formatacao += "\nCronica #" + (i+1) + cronicas[i].toString() + System.lineSeparator();
        }
        return formatacao;
    }

    public String lerCronica(int indice){
        return cronicas[indice].toString();
    }

    public String exibirCronicaMaisLida(){
        String formatacao = "\n";
        int maior = 0;
        int posicao = 0;

        for(int i = 0; i<qtdeCronicas; i++){
            if(cronicas[i].getQtdeLeitura() > maior){
                maior = cronicas[i].getQtdeLeitura();
                posicao = i;
            }
        }
        formatacao += cronicas[posicao].getTitulo() + " - lida " + cronicas[posicao].getQtdeLeitura() + " vezes";

        return formatacao;
    }

    public void criarLivreto(int[] posicoes){
        if(posicoes.length < 3 ){
            throw new IllegalArgumentException("Quantidade Minima de Cronicas = 3");
        } if(posicoes.length > 5){
            throw new IllegalArgumentException("Quantidade Maxima de Cronicas = 5");
        }

        if(qtdeLivretos>100){
            qtdeLivretos = 0;
        }
        livretos[qtdeLivretos] = new Livreto();
        for(int i = 0; i<posicoes.length; i++){
            livretos[qtdeLivretos].adicionaCronicaLivreto(cronicas[posicoes[i]]);
        }
        qtdeLivretos++;
    }

    public String lerLivreto(int pos){
        return livretos[pos].toString();
    }

    public boolean contemCronicaNoLivreto(String titulo, int posicao){
        return livretos[posicao].contemCronica(titulo);
    }


}