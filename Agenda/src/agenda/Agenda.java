package agenda;

public class Agenda {
	
	private static final int TAMANHO_AGENDA = 100;
	private Contato[] contatos; 
	private Favoritos favoritos;

	public Agenda() {
		this.contatos = new Contato[TAMANHO_AGENDA];
		this.favoritos = new Favoritos();
	}

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


    public String exibirContato(int posicao){
        if(posicao < 1 || posicao > 100 || contatos[posicao-1] == null){
            return "POSICAO INVALIDA";
        }

        return contatos[posicao-1].exibiContato(); 
    }

    public String listarContatos(){
        String formatacao = "\n";
         for(int i = 0; i<100; i++){
            if(contatos[i] != null){
                formatacao += (i+1) + contatos[i].toString();
            }
         }

        return formatacao;
    }
	
	public String adicionaFavorito(int posContato, int posFavorito){
        if(posContato < 1 || posContato > 100){
            return "\nPOSICAO INVALIDA!";
        }
         if(posFavorito < 1 || posFavorito > 10 || contatos[posContato-1] == null){
            return "\nPOSICAO INVALIDA!";
        }
        return favoritos.adiciona(contatos[posContato-1], posFavorito);
    } 

    public String listarFavoritos(){
        return favoritos.toString();
    }

    public void removerFavorito(int posicao2){
        favoritos.removeFavorito(posicao2);

    }

}
