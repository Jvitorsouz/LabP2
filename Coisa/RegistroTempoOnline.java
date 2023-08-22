
/**
* Classe responsavel por administrar o registro de tempo online do aluno, atraves da quantidade de horas dedicadas a uma disciplina remota.
* Classe usada no Controle Institucional da Situação Acadêmica.
* 
* @author João Vitor da Silva Souza
*/

public class RegistroTempoOnline{
    
    /**
    * Nome da Disciplina no formato String. 
    * Responsavel pelo armazenamento para indetificação da disciplina a partir de um conjunto de caracteres.
    *
    */
    private String nomeDisciplina;

    /**
    * Tempo Online Esperado no formato inteiro, sendo representado em horas.
    * Responsavel pela definição da quantidade de horas estimadas para os estudos remotos.
    *
    */
    private int tempoOnlineEsperado;

    /**
    * Tempo Investido Online no formato inteiro, sendo representado em horas.
    * Atributo responsavel para armazenar a cada atualização o tempo gastado nos estudos remotos.
    *
    */
    private int tempoInvestidoOnline;

    /**
    * Constrói uma disciplina a partir de seu respectivo nome.
    * Toda disciplina por padrão começa com um tempo online esperado em 120 horas.
    *
    * @param nomeDisciplina nome da disciplina, no formato “Exemplo”
    */
    public RegistroTempoOnline(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = 120; 
    }

    /**
    * Constrói uma disciplina a partir de seu respectivo nome e seu tempo online esperado em horas.
    *
    * @param nomeDisciplina nome da disciplina, no formato “Exemplo”
    * @param tempoOnlineEsperado representação em horas, no formato "00"
    */
    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado){
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
    }

    
    /**
    * Metodo que não retorna nenhum valor, responsavel por a cada tempo adicionado
    * ele atualiza e acumula a quantidade de horas a variavel tempoInvestidoOnline
    *
    * @param tempo horas gastadas, no formato "00"
    */
    public void adicionaTempoOnline(int tempo){
        this.tempoInvestidoOnline += tempo;
    }

    /**
    * Retorna um valor booleano associado a condição apresentada
    *
    *
    * @return a representação em Boolean da condição.
    */
    public boolean atingiuMetaTempoOnline(){
        return tempoInvestidoOnline >= tempoOnlineEsperado;
    }

    /**
    * Retorna a String que representa as informações da disciplina. A representação segue o 
    * formato “NomeDisciplina TempoInvestidoOnline/TempoOnlineEsperado”.
    *
    * @return a representação em String da disciplina.
    */
    public String toString(){
        return nomeDisciplina + " " + tempoInvestidoOnline + "/" + tempoOnlineEsperado;

    }
    
}


