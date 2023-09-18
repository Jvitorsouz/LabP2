package agenda;

import agenda.Contato;

/**
* A classe Favoritos representa uma lista de contatos favoritos que podem ser adicionados e removidos.
* @author Joao vitor da Silva Souza
*/
public class Favoritos{
    private Contato[] favoritos;
    
    /**
    * Construtor da classe Favoritos. Inicializa a lista de favoritos com capacidade para 10 contatos.
    */
    public Favoritos(){
        favoritos = new Contato[10];
    }

    /**
    * Adiciona um contato à lista de favoritos em uma posição específica.
    *
    * @param contato O contato a ser adicionado aos favoritos.
    * @param posFavorito A posição na lista de favoritos onde o contato será adicionado (de 1 a 10).
    * @return Uma mensagem indicando o resultado da operação.
    */
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
        favoritos[posFavorito-1].setStatus("❤️");
        return "CONTATO FAVORITADO NA POSIÇÃO " + posFavorito + "!";
    }

    /**
    * Retorna uma representação em texto da lista de contatos favoritos.
    *
    * @return Uma string contendo a lista de contatos favoritos.
    */
    public String toString(){
        String formatacao = "\n";
        for(int i = 0; i<10; i++){
            if(favoritos[i] != null){
                formatacao += (i+1) + favoritos[i].toString();
            }
        }
        return formatacao;
    }

    /**
    * Remove um contato da lista de favoritos em uma posição específica.
    *
    * @param posicao A posição na lista de favoritos do contato a ser removido (de 1 a 10).
    */
    public void removeFavorito(int posicao){
        favoritos[posicao-1].setStatus(null);
        favoritos[posicao-1] = null;
    }

}