package agenda;

/**
 * Classe que representa uma agenda de contatos e seus favoritos.
 * @author João Vitor da Silva Souza.
 */
public class Agenda {
	
	/** Tamanho máximo da agenda. */
	private static final int TAMANHO_AGENDA = 100;
	
	/** Array para armazenar os contatos na agenda. */
	private Contato[] contatos;
	
	/** Objeto para gerenciar os contatos favoritos. */
	private Favoritos favoritos;
	
	/**
	 * Construtor da classe Agenda.
	 * Inicializa a agenda e os contatos favoritos.
	 */
	public Agenda() {
		this.contatos = new Contato[TAMANHO_AGENDA];
		this.favoritos = new Favoritos();
	}
	
	/**
	 * Cadastra um novo contato na agenda.
	 *
	 * @param pos A posição na agenda onde o contato será cadastrado.
	 * @param nome O nome do contato.
	 * @param sobrenome O sobrenome do contato.
	 * @param telefone O telefone do contato.
	 * @return Mensagem indicando o resultado do cadastro.
	 */
	public String cadastraContato(int pos, String nome, String sobrenome, String telefone) {
		nome = nome.trim();
		sobrenome = sobrenome.trim();
		telefone = telefone.trim();
		
		if(pos>100 || pos<1) {
			return "\nPOSICAO INVALIDA";
		}if(nome.equals("")) {
			return "\nCONTATO INVALIDO";
		}if(telefone.equals("")) {
			return "\nCONTATO INVALIDO";
		}
		
		Contato contato = new Contato(nome,sobrenome,telefone);
		for(int i=0; i<100; i++) {
			if(contatos[i] != null) {
				if(contatos[i].equals(contato)) {
					return "\nCONTATO JA CADASTRADO";
				}
			}
		}
		
		contatos[pos-1] = new Contato(nome,sobrenome,telefone);
		return "\nCADASTRO REALIZADO";
	}
	
	/**
	 * Exibe o contato na posição especificada.
	 *
	 * @param posicao A posição do contato na agenda.
	 * @return String representando as informações do contato.
	 */
	public String exibirContato(int posicao) {
		if(posicao<1 || posicao > 100 || contatos[posicao-1] == null) {
			return "POSICAO INVALIDA";
		}
		
		return contatos[posicao-1].exibiContato();
	}
	
	/**
	 * Lista todos os contatos cadastrados na agenda.
	 *
	 * @return String com a lista de contatos formatada.
	 */
	public String listarContatos() {
		String formatacao = "\n";
		for(int i=0; i<100; i++) {
			if(contatos[i] != null) {
				formatacao += (i+1) + contatos[i].toString();
			}
		}
		
		return formatacao;
	}
	
	/**
	 * Adiciona um contato como favorito.
	 *
	 * @param posContato A posição do contato na agenda.
	 * @param posFavorito A posição onde o contato será adicionado como favorito.
	 * @return Mensagem indicando o resultado da operação.
	 */
	public String adicionaFavorito(int posContato, int posFavorito) {
		if(posContato<1 || posContato>100) {
			return "\nPOSICAO INVALIDA!";
		} if(posFavorito<1 || posFavorito>10 || contatos[posContato-1] == null) {
			return "\nPOSICAO INVALIDA!";
		}
		
		return favoritos.adiciona(contatos[posContato-1], posFavorito);
	}
	
	/**
	 * Lista os contatos favoritos.
	 *
	 * @return String com a lista de contatos favoritos formatada.
	 */
	public String listarFavoritos() {
		return favoritos.toString();
	}
	
	/**
	 * Remove um contato da lista de favoritos.
	 *
	 * @param posicao A posição do contato a ser removido dos favoritos.
	 */
	public void removerFavorito(int posicao) {
		favoritos.removeFavorito(posicao);
	}
	
}