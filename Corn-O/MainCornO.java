public class MainCornO{

    public static void main(String[] args){
        CornOController sistema = new CornOController();

        System.out.println(sistema.cadastrarAnotacao("P2", "20/11/2019", "Revisão. Exercício sobre robôs. Cada robô pode ser estruturado por uma composição de\n" + //
                "uma classe que têm uma herança própria. Essa estrutura se deve a flexibilidade do papel do\n" + //
                "robô, definida em tempo de execução. Observar a necessidade de Equals e hashcode nas classes\n" + //
                "principais."));
        
        System.out.println(sistema.cadastrarAnotacao("P1", "21/10/2020", "Revisão. Exercício sobre robôs. Cada robô pode ser estruturado por uma composição de\n" + //
                "uma classe que têm uma herança própria. Essa estrutura se deve a flexibilidade do papel do\n" + //
                "robô, definida em tempo de execução. Observar a necessidade de Equals e hashcode nas classes\n" + //
                "principais."));

        sistema.definirSumario(2, "Exercício");
        sistema.definirSumario(2, "Herança vs Composição");
        sistema.definirSumario(2, "Equals e Hashcode");

        System.out.println(sistema.exibirAnotacao(1));
        System.out.println(sistema.exibirAnotacao(2));

        String[] enunciados = {"A: azul ", "B: Amarelo", " C: Vermelho"};
        sistema.cadastraQuestaoMultipla(1, "Digite azul", enunciados, 4, "A");

        System.out.println(sistema.exibirQuestao(1, 1));
        System.out.println(sistema.responderQuestao(1, 1, "A"));
        System.out.println(sistema.responderQuestao(1, 1, "C"));

        sistema.cadastraQuestaoAberta(1, "Digite azul", 4, "A");
        System.out.println(sistema.exibirQuestao(1, 2));
        System.out.println(sistema.responderQuestao(1, 2, "A"));
        //Deve gerar uma exceção
        //System.out.println(sistema.cadastrarAnotacao(" ", "13/12", ".."));
        //sistema.definirSumario(100, "amor");

    }
}