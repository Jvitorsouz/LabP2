package coisa;

/**
 * Classe responsavel por admistrar a horas de descanso feito por um aluno.
 * Classe usada no Controle Institucional da Situação Acadêmica
 * 
 * @author João Vitor da Silva Souza
 */
public class Descanso{

    /**
     * Total de horas descansados no formato inteiro
     * Responsavel por registrar o total de horas dedicado ao descanso.
     */
    private int horasDescanso;

    /**
     * Total de dias da semanas, no formato inteiro.
     * Responsavel por registrar e ajudar a verifica quantidade de horas descansadas por semana.
     */
    private int numerosSemanas;

    /**
     * Constrói os atributos todos zerados.
     * 
     * @param horasDescanso Quantidade horas descansadas no formato "00".
     * @param numerosSemanas Total de semanas dedicadas ao estudo e descanso, no formato "00".
     */
    public Descanso(){
        this.horasDescanso = 0;
        this.numerosSemanas = 0;
    }

    /**
     * Retorna o status geral do aluno.
     *
     * @return a representação do status, podendo variar entre Cansado e Descansado.
     */
    public String getStatusGeral(){
        String status = "Cansado";
        if(numerosSemanas != 0){
            int verifica = horasDescanso/numerosSemanas;
            if(verifica>=26){
                status = "Descansado";
            }
        }
        return status;
    }

    /**
     * Metodo não retornavel, responsavel por definir as horas de Descanso
     * 
     * @param horasDescanso total de horas dedicadas ao descanso
     */
    public void defineHorasDescanso(int horasDescanso){
        this.horasDescanso = horasDescanso;
    }

    /**
     * Metodo não retornavel, responsavel por definir o numero de semanas.
     * 
     * @param numerosSemanas total de semanas definido pelo usuario.
     */
    public void defineNumeroSemanas(int numerosSemanas){
        this.numerosSemanas = numerosSemanas;
    }

}