package TCC;

public class TCC{

    private String aluno;
    private String orientador;
    private String tema;
    private String[] acompanhamentos;
    private int status;
    private double[] notas;
    private String arquivo;
    private int visualizacao;

    public TCC(String aluno){
        this(aluno, "");
    }
    public TCC(String aluno, String orientador){
        this.aluno = aluno;
        this.orientador = orientador;
        acompanhamentos = new String[3];
        notas = new double[3];
    }

    public void setTema(String tema){
        this.tema = tema;
    }

    public String toString(){
        return "\nAluno: " + this.aluno + 
        "\nOrientador: " + this.orientador + 
        "\ntema: " + this.tema + 
        "\nMedia: " + String.format("%,.2f", getmedia()) +
        "\nStatus: " + getStatus();
    }

    public void addAcompanhamento(String avaliacao, int pos){
        acompanhamentos[pos] = avaliacao;
    }

    public void setStatus(int status){
        this.status = status;
    }

    public void addNota(double nota, int pos){
        notas[pos] = nota;
    }

    public double getmedia(){
        return (notas[0]+notas[1]+notas[2])/3;
    }

    public void setArquivo(String arquivo){
        this.arquivo = arquivo;
    }

    public String leArquivo(){
        visualizacao++;
        return arquivo;
    }

    public int getVisualizacoes(){
        return visualizacao;
    }

    public String getStatus(){
        return status == 0?"PERIGO":"OKAY";
    }


}