import java.util.ArrayList;
//import java.util.Comparator;
import java.util.List;

public class Anotacao{
    
    private String nomeDisciplina;
    private String data;
    private String texto;
    private List<String> sumario;
    private List<Questao> questoes;


    public Anotacao(String nomeDisciplina, String data, String texto){
        this.nomeDisciplina = nomeDisciplina;
        this.data = data;
        this.texto = texto;
        sumario = new ArrayList<>();
        questoes = new ArrayList<>();
    }

    public void addSumario(String texto){
        sumario.add(texto);
    }

    public String toString(){
        return "Disciplina: " + nomeDisciplina + "\nData: " + data + "\nTexto: " + texto + "\n" + formatarSumario();
    }

    public void addQuestao(Questao questao){
        questoes.add(questao);
    }

    public String exibirQuestao(int idQuestao){
        return questoes.get(idQuestao).exibirQuestao();
    }

    public boolean responderQuestao(int idQuestao, String resposta){
        return questoes.get(idQuestao).responderQuestao(resposta);
    }

    public String getDisciplina(){
        return this.nomeDisciplina;
    }

    private String formatarSumario(){
        if(sumario.size() == 0){
            return "";
        }
        String formatacao = "Sumário: ";
        for(int i=0; i<sumario.size(); i++){
            formatacao += sumario.get(i) + ". ";
        }
        return formatacao;
    }

    /* 
    @Override
    public int compareTo(Anotacao arg0) {
        int comparacao = this.getDisciplina().compareTo(arg0.getDisciplina());
        if(comparacao>0){
            return 1;
        }if(comparacao<0){
            return 0-1;
        }else{
            return 0;
        }
    }*/

}