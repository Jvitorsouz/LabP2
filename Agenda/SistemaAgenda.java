import java.util.Arrays;

public class SistemaAgenda{

    private Contato[] contatos;
    private int qtdeContatos;

    public SistemaAgenda(){
        contatos = new Contato[100];
    }

    public String exibiMenu(){
        final String MENU = "\n(C)adastrar Contato\n"+
                            "(L)istar Contatos\n"+
                            "(E)xibir Contato\n"+
                            "(S)air";
        return MENU;

    }

    public void exibiMenuExcecao(String op){
        if(!op.equals("C") && !op.equals("L") && !op.equals("E") && !op.equals("S")){
            throw new IllegalArgumentException("\nOPÇÃO INVALIDA!");
        }
    }

    public String cadastraContato(int pos, String nome, String sobrenome, String telefone){
        if(pos>100 || pos<1){
            return "\nPOSICAO INVALIDA";
        }if(nome == ""){
            return "\nCONTATO INVALIDO";
        }if(telefone == ""){
            return "\nCONTATO INVALIDO";
        }

        Contato contato = new Contato(nome, sobrenome, telefone, pos);
        for(int i = 0; i<qtdeContatos; i++){
            if(contatos[i] != null){
                if(contatos[i].equals(contato)){
                    return "\nCONTATO JA CADASTRADO";
                }
            }
        }

        contatos[pos-1] = new Contato(nome, sobrenome, telefone, pos);
        qtdeContatos++;
        return "\nCADASTRO REALIZADO";
    }

    public String exibirContato(int posicao){
        int pos = -1;
        for(int i =0; i<qtdeContatos; i++){
            if(contatos[i].getPosicao() == posicao){
                pos = i;
            }
        }
        if(pos == -1){
            return "POSICAO INVALIDA";
        }
        return contatos[pos].exibiContato(); 
    }

    public String listarContatos(){
        String formatacao = "\n";
         for(int i = 0; i<qtdeContatos; i++){
            if(contatos[i] != null){
                formatacao += contatos[i].toString();
            }
         }

        return formatacao;
    }
}
