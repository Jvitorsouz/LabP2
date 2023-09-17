package agenda;

/**
 * A classe Agenda representa uma agenda telefônica que pode armazenar até 100 contatos.
 * Além disso, ela permite a adição e remoção de contatos favoritos.
 */
public class Agenda {
	
	private static final int TAMANHO_AGENDA = 100;
	private Contato[] contatos; 
	private Favoritos favoritos;

    /**
	 * Construtor da classe Agenda. Inicializa a lista de contatos e a lista de favoritos.
	 */
	public Agenda() {
		this.contatos = new Contato[TAMANHO_AGENDA];
		this.favoritos = new Favoritos();
	}

    /**
	 * Cadastra um novo contato na agenda.
	 *
	 * @param pos A posição na agenda onde o contato será cadastrado (de 1 a 100).
	 * @param nome O nome do contato.
	 * @param sobrenome O sobrenome do contato.
	 * @param telefone O telefone do contato.
	 * @return Uma mensagem indicando o resultado da operação.
	 */
	public String cadastraContato(int pos, String nome, String sobrenome, String telefone){
        nome = nome.trim();
        sobrenome = sobrenome.trim();
        telefone = telefone.trim();
        if(pos>100 || pos<1){
            return "\nPOSICAO INVALIDA";
        }if(nome == ""){
            return "\nCONTATO INVALIDO";
        }if(telefone == ""){
            return "\nCONTATO INVALIDO";
        }

        Contato contato = new Contato(nome, sobrenome, telefone);
        for(int i = 0; i<100; i++){
            if(contatos[i] != null){
                if(contatos[i].equals(contato)){
                    return "\nCONTATO JA CADASTRADO";
                }
            }
        }

        contatos[pos-1] = new Contato(nome, sobrenome, telefone);
        return "\nCADASTRO REALIZADO";
    }


     /**
	 * Exibe as informações de um contato na posição especificada.
	 *
	 * @param posicao A posição do contato a ser exibido (de 1 a 100).
	 * @return Uma representação em texto do contato ou uma mensagem de erro se a posição for inválida.
	 */
    public String exibirContato(int posicao){
        if(posicao < 1 || posicao > 100 || contatos[posicao-1] == null){
            return "POSICAO INVALIDA";
        }

        return contatos[posicao-1].exibiContato(); 
    }

    /**
	 * Lista todos os contatos cadastrados na agenda.
	 *
	 * @return Uma string com a lista de contatos cadastrados.
	 */
    public String listarContatos(){
        String formatacao = "\n";
         for(int i = 0; i<100; i++){
            if(contatos[i] != null){
                formatacao += (i+1) + contatos[i].toString();
            }
         }

        return formatacao;
    }
	
    /**
	 * Adiciona um contato à lista de favoritos.
	 *
	 * @param posContato A posição do contato na agenda a ser adicionado aos favoritos (de 1 a 100).
	 * @param posFavorito A posição na lista de favoritos onde o contato será adicionado (de 1 a 10).
	 * @return Uma mensagem indicando o resultado da operação.
	 */
	public String adicionaFavorito(int posContato, int posFavorito){
        if(posContato < 1 || posContato > 100){
            return "\nPOSICAO INVALIDA!";
        }
         if(posFavorito < 1 || posFavorito > 10 || contatos[posContato-1] == null){
            return "\nPOSICAO INVALIDA!";
        }
        return favoritos.adiciona(contatos[posContato-1], posFavorito);
    } 

    /**
	 * Lista todos os contatos favoritos.
	 *
	 * @return Uma string com a lista de contatos favoritos.
	 */
    public String listarFavoritos(){
        return favoritos.toString();
    }

     /**
	 * Remove um contato da lista de favoritos.
	 *
	 * @param posicao2 A posição do contato na lista de favoritos a ser removido (de 1 a 10).
	 */
    public void removerFavorito(int posicao2){
        favoritos.removeFavorito(posicao2);

    }

}
