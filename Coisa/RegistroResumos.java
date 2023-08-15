public class RegistroResumos{

    private int numeroDeResumos;
    private String[] resumos;

    public RegistroResumos(int numeroDeResumos){
        this.numeroDeResumos = numeroDeResumos;
        resumos = new String[numeroDeResumos];
    }

    
    private int aux = 0;

    public void adiciona(String tema, String resumo){
        String texto = tema + ": " + resumo;
        resumos[aux] = texto;
        aux++;
    }

    public String[] pegaResumos(){
        return resumos;
    }

    public int conta(){
        return aux;
    }

    public String imprimeResumos(){
        return "- " + aux + " resumo(s) cadastrado(s)";
    }

}