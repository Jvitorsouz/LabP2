import java.util.Comparator;

public class QuestaoAberta implements Questao{

    private String enunciado;
    private double prioridade;
    private String gabarito;

    public QuestaoAberta(String enunciado, int prioriade, String gabarito){
        this.enunciado = enunciado;
        this.prioridade = prioriade * 1.2;
        this.gabarito = gabarito;
    }

    @Override
    public String exibirQuestao() {
        String formatacao = "\nEnunciado: " + this.enunciado +  " (" + this.prioridade + ")\n";
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