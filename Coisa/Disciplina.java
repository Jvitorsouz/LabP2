import java.util.Arrays;

/**
 * Classe responsavel por calcular a media de uma disciplina, a partir de sua informações.
 * Classe usada no Controle Institucional da Situação Acadêmica.
 * 
 * @author João Vitor da Silva Souza
 */
public class Disciplina{
    
    /**
     * Nome da disciplina no formato String
     * Responsavel pela identificação da disciplina a partir de seu nome.
     * 
     */
    private String nomeString;

    /**
     * Quantidade de horas dedidacas a disciplina no formato inteiro.
     * Responsavel por definir a quantidade de horas de estudos dedicadas a disciplina associada.
     * 
     */
    private int horas;

    /**
     * Responsavel por armazenar a media do aluno no formato double.
     */
    private double media;

    /**
     * Notas da respectiva disciplina, no formato double.
     * Responsavel por armazenar as notas do aluno, em relação a disciplina fornecida em um array.
     */
    private double[] notas = {0.0, 0.0, 0.0, 0.0};

    /**
     * Constói uma disciplina a partir de seu nome.
     * 
     * @param nomeString nome da disciplina
     */
    public Disciplina(String nomeString){
        this.nomeString = nomeString;
    }

    /**
     * Metodo não retornavel.
     * Responsavel por definir a quantidade de horas dedicadas a disciplina.
     * A quantidade de horas pode ser acumulativas.
     * 
     * @param horas quantidade de horas, no formato "00".
     */
    public void cadastraHoras(int horas){
        this.horas += horas;
    }

    /**
     * Metodo não retornavel.
     * Responsavel por armazenar as notas a partir de sua posição.
     * 
     * @param nota posição da nota no formato "00"
     * @param valorNota nota associada a posição no formato "0.0"
     */
    public void cadastraNota(int nota, double valorNota){
        notas[nota-1] = valorNota;
    }
    
    /**
     * Metodo privado para calcular a media.
     *
     * @return retorna a media  
     */
    private double calculaMedia(){
        double somaNotas = 0;
        for(int i=0; i<notas.length; i++){
            somaNotas += notas[i];
        }
        media = somaNotas/4;
        return media;
    }

    /**
     * Retorna o valor boleano referido a aprovação na disciplina.
     * 
     * @return true ou false, a depender da media.
     */
    public boolean aprovado(){
        return calculaMedia() >= 7;
    }

    /**
     * Retorna a concatenação de uma string. A representação segue o formato.
     * "nomeString  horas  calculaMedia() Arrays.toString(notas)"
     * 
     * @return a representação de uma concatenação no formato String.
     */
    public String toString(){
        return nomeString + " " + horas + " " + calculaMedia() + " " + Arrays.toString(notas);
    }
}