import java.util.Comparator;

public class QuestaoMultipla implements Questao{

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
    public boolean responderQuestao(String texto) {
       if(texto.equals(gabarito)){
        return true;
       }
       return false;
    }


}
