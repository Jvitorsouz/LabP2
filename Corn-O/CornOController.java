import java.util.HashMap;
import java.util.Map;

public class CornOController{

    private Map<Integer, Anotacao> anotacoes;

    public CornOController(){
        anotacoes = new HashMap<>();
    }

    public int cadastrarAnotacao(String nomeDisciplina, String data, String texto){
        int id = anotacoes.size() + 1;
        if(nomeDisciplina.isBlank()){
            throw new IllegalArgumentException("Nome da disciplina VAZIO!");
        }
        anotacoes.put(id, new Anotacao(nomeDisciplina, data, texto));
        return id;
    }

    public void definirSumario(int idAnotacao, String texto){
        ExceptionAnotacao(anotacoes.get(idAnotacao));
        Anotacao aux = anotacoes.get(idAnotacao);
        aux.addSumario(texto);
    }

    public String exibirAnotacao(int idAnotacao){
        ExceptionAnotacao(anotacoes.get(idAnotacao));
                   
        return "\n" + anotacoes.get(idAnotacao);
    }

    public void cadastraQuestaoMultipla(int idAnotacao, String enunciado, String[] alternativas, int prioridade, String gabarito){
        ExceptionAnotacao(anotacoes.get(idAnotacao));
        anotacoes.get(idAnotacao).addQuestao(new QuestaoMultipla(enunciado, alternativas, prioridade, gabarito));
    }

    public void cadastraQuestaoAberta(int idAnotacao, String enunciado, int prioridade, String gabarito){
        ExceptionAnotacao(anotacoes.get(idAnotacao));
        anotacoes.get(idAnotacao).addQuestao(new QuestaoAberta(enunciado, prioridade, gabarito));
    }

    public String exibirQuestao(int idAnotacao, int ordemQuestao){
        ExceptionAnotacao(anotacoes.get(idAnotacao));
        return anotacoes.get(idAnotacao).exibirQuestao(ordemQuestao-1);
    }

    public boolean responderQuestao(int idAnotacao, int ordemQuestao, String resposta){
        ExceptionAnotacao(anotacoes.get(idAnotacao));
        return anotacoes.get(idAnotacao).responderQuestao(ordemQuestao-1, resposta);
    }

    private void ExceptionAnotacao(Anotacao anotacao){
        if(anotacao == null){
            throw new NullPointerException("ANOTACAO NÃO EXISTE!");
        }
    }

}