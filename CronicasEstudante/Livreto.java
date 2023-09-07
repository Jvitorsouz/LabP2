public class Livreto{

    private Cronicas[] cronicas;
    private int pos;

    public Livreto(){
        cronicas = new Cronicas[5];
    }

    public void adicionaCronica(Cronicas cronica){
        cronicas[pos] = cronica;
        pos++;
    }

    public String toString(){
        String formatacao = "\n";
        for(int i=0; i<pos; i++){
            formatacao += cronicas[i].getTexto() + "\n";
        }
        return formatacao;
    }

    public boolean contemCronicaNoLivreto(String texto){
        for(int i =0; i<pos; i++){
            if(cronicas[i].getTitulo().equals(texto)){
                return true;
            }
        }
        return false;
    }
}