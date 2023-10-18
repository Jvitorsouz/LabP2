import java.util.Comparator;

public class QuestaoAberta implements Questao, Comparator<String>{

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
        if(compare(texto, gabarito) == 0){
            return true;
        }
        return false;
    }

    @Override
    public int compare(String texto1, String texto2) {
        return texto1.compareTo(texto2);
    }


}