package coisa;

/**
* Classe responsavel por registrar os resumos dos estudados realizados durante o período.
* Classe usada no Controle Institucional da Situação Acadêmica.
* 
* @author João Vitor da Silva Souza
*/
public class RegistroResumos{

    /**
    * Quantidade limite de resumos no formato inteiro. 
    * Responsavel por definir a quantidade limite de resumos que podem ser registrados.
    *
    */
    private int numeroDeResumos;

    /**
    * Uma lista no formato String. 
    * Responsavel pelo armazenamento dos resumos.
    *
    */
    private String[] resumos;

    /**
    * Uma lista no formato String. 
    * Responsavel pelo armazenamento dos temas dos resumos.
    *
    */
    private String[] temas;

    /**
    * Atributo auxiliar para ajudar na indexação dos resumos. 
    * Atributo também responsavel por contar a quantidade de resumos registrados.
    *
    */
    private int aux = 0;

    /**
    * Constrói a lista de String a partir da quantidade definida pelo usuario.
    *
    * @param numeroDeResumos Quantidade limite de resumos, no formato “000”
    */
    public RegistroResumos(int numeroDeResumos){
        this.numeroDeResumos = numeroDeResumos;
        resumos = new String[numeroDeResumos];
        temas = new String[numeroDeResumos];
    }

    /**
    * Metodo que não retorna nenhum valor, responsavel por adicionar a lista resumos,
    * os respectivos temas e resumos fornecido pelo usuario. O metodo também verifica se
    * excedeu ou não a quantidade limite dos resumos.
    *
    * @param tema tema do resumo, no formato "Exemplo"
    * @param resumo breve resumo do tema abordado, no formato "Esse pode ser um resumo"
    */
    public void adiciona(String tema, String resumo){
        if(aux>100){
            aux = 0;
        }
        temas[aux] = tema;
        String texto = tema + ": " + resumo;
        resumos[aux] = texto;
        aux++;
    }

    /**
    * Retorna a lista com os resumos
    *
    *
    * @return a representação da lista no formato String.
    */
    public String[] pegaResumos(){
        return resumos;
    }

    /**
    * Retorna um valor inteiro, associado a quantidade de resumos registrados.
    *
    *
    * @return a representação em inteiro da quantidade de resumos feitos.
    */
    public int conta(){
        return aux;
    }

    /**
    * Retorna um concatenação de string. A representação segue o formato 
    * "Resumos: 
    * - AUX resumo(s) cadastrado(s)"
    * "- Tema1 | Tema2 | Tema3"
    *
    * @return a representação de uma concatenação no formato String.
    */
    public String imprimeResumos(){
        String texto = "- " + aux + " resumo(s) cadastrado(s)";
        texto += "\n- ";
        int i = 0;
        while (true){
            texto += temas[i];
            i++;
            if(i==aux){
                break;
            }
            texto += " | ";

        }
        return texto;
    }

    /**
    * Retorna um valor booleano associado a condição apresentada.
    * Metodo responsavel por verificar se o tema informado contem ou não na lista de temas.
    *
    * @param tema tema a ser procurado, no formato "tema1"
    *
    * @return a representação em Boolean.
    */
    public boolean temResumo(String tema){
        boolean verifica = false;
        for(int i=0; i<aux; i++){
            if(temas[i].equals(tema)){
                verifica = true;
            }
        }
        return verifica;
    }
}