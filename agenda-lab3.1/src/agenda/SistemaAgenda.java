package agenda;

import java.util.Arrays;

public class SistemaAgenda{

    private Contato[] contatos;
    private Favoritos favoritos;

    public SistemaAgenda(){
        contatos = new Contato[100];
        favoritos = new Favoritos();
    }

    /* 
    public String exibiMenu(){
        final String MENU = "\n(C)adastrar Contato\n"+
                            "(L)istar Contatos\n"+
                            "(E)xibir Contato\n"+
                            "(F)avoritos\n"+
                            "(A)dicionar Favorito\n"+
                            "(R)emover Favorito\n"+
                            "(S)air";
        return MENU;

    }

    public void exibiMenuExcecao(String op){
        if(!op.equals("C") && !op.equals("L") && !op.equals("E") && !op.equals("S") && !op.equals("F") && !op.equals("A") && !op.equals("R")){
            throw new IllegalArgumentException("\nOPÇÃO INVALIDA!");
        }
    } */

    public Contato[] getContatos() {
		return this.contatos.clone();
	}

    public String cadastraContato(int pos, String nome, String sobrenome, String telefone){
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
        if(contatos[posicao-1] == null){
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
        return favoritos.adiciona(contatos[posContato-1], posFavorito);
    } 

    public String listarFavoritos(){
        return favoritos.toString();
    }

    public void removerFavorito(int posicao2){
        favoritos.removeFavorito(posicao2);

    }
}
