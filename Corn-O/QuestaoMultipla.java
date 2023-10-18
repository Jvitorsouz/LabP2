import java.util.Comparator;

public class QuestaoMultipla implements Questao, Comparator<String>{

    private String enunciado;
    private String[] alternativas;
    private int prioridade;
    private float peso;
    private String gabarito;

    public QuestaoMultipla(String enunciado, String[] alternativas, int prioridade, String gabarito){
        this.enunciado = enunciado;
        this.alternativas = alternativas;
        this.prioridade = prioridade;
        this.peso = ((float) (alternativas.length) / 5) * prioridade;
        this.gabarito = gabarito;
    }

    @Override
    public String exibirQuestao(){
        String formatacao = "\nEnunciado: " + this.enunciado +  " (" +  peso + ")\n\nAlternativas: \n";
        for(int i=0; i<alternativas.length; i++){
            formatacao += alternativas[i];
        }
        return formatacao;
    }

    @Override
    public boolean responderQuestao(String texto1) {
       if(compare(texto1, gabarito) == 0){
        return true;
       }
       return false;
    }

    @Override
    public int compare(String resposta1 ,String resposta2){
        /*if(resposta1.equals(resposta2)){
            return 0;
        } else{
            return -1;
        }*/
        return resposta1.compareTo(resposta2);
       
    }

}
