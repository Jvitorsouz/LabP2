package agenda;

/**
 * Classe que representa a lista de contatos favoritos.
 * @author João Vitor da Silva Souza.
 */
public class Favoritos {
	
	/** Array para armazenar os contatos favoritos. */
	private Contato[] favoritos;
	
	/**
	 * Construtor da classe Favoritos.
	 * Inicializa a lista de contatos favoritos.
	 */
	public Favoritos() {
		favoritos = new Contato[10];
	}
	
	/**
	 * Adiciona um contato à lista de favoritos na posição especificada.
	 *
	 * @param contato O contato a ser adicionado como favorito.
	 * @param posFavorito A posição onde o contato será adicionado como favorito.
	 * @return Mensagem indicando o resultado da operação.
	 */
	public String adiciona(Contato contato, int posFavorito) {
		for(int i=0; i<10; i++) {
			if(favoritos[i] != null) {
				if(favoritos[i].equals(contato)) {
					return "CONTATO JA ADICIONADO";
				}
			}
		}
		
		if(favoritos[posFavorito-1] != null) {
			favoritos[posFavorito-1].setStatus(null);
		}
		
		favoritos[posFavorito-1] = contato;
		favoritos[posFavorito-1].setStatus("❤️");
		return "CONTATO FAVORITADO NA POSIÇÃO " + posFavorito + "!";
	}
	
	/**
	 * Retorna uma representação em forma de String da lista de contatos favoritos.
	 *
	 * @return String com a lista de contatos favoritos formatada.
	 */
	public String toString() {
		String formatacao = "\n";
		for(int i=0; i<10; i++) {
			if(favoritos[i] != null) {
				formatacao += (i+1) + favoritos[i].toString();
			}
		}
		return formatacao;
	}
	
	/**
	 * Remove um contato da lista de favoritos na posição especificada.
	 *
	 * @param posicao A posição do contato a ser removido dos favoritos.
	 */
	public void removeFavorito(int posicao) {
		favoritos[posicao-1].setStatus(null);
		favoritos[posicao-1] = null;
	}
}
