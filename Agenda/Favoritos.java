public class Favoritos{
    private Contato[] favoritos;
    private int qtdeContatos;

    public Favoritos(){
        favoritos = new Contato[10];
    }

    public String adiciona(Contato contato, int posFavorito){
        for(int i = 0; i<10; i++){
            if(favoritos[i] != null){
                if(favoritos[i].equals(contato)){
                    return "CONTATO JA ADICIONADO";
                }
            }

        }

        if(favoritos[posFavorito-1] != null){
            favoritos[posFavorito-1].setStatus(null);
        }

        favoritos[posFavorito-1] = contato;
        qtdeContatos++;
        favoritos[posFavorito-1].setStatus("❤️");
        return "CONTATO FAVORITADO NA POSIÇÃO " + posFavorito + "!";
    }

    public String toString(){
        String formatacao = "\n";
        for(int i = 0; i<10; i++){
            if(favoritos[i] != null){
                formatacao += favoritos[i].toString() +  System.lineSeparator();
            }
        }
        return formatacao;
    }

    public void removeFavorito(int posicao){
        favoritos[posicao-1].setStatus(null);
        favoritos[posicao-1] = null;
    }




}