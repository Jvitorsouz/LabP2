public class RegistroResumos{

    private int numeroDeResumos;
    private String[] resumos;
    private String[] temas;

    public RegistroResumos(int numeroDeResumos){
        this.numeroDeResumos = numeroDeResumos;
        resumos = new String[numeroDeResumos];
        temas = new String[numeroDeResumos];
    }

    
    private int aux = 0;

    public void adiciona(String tema, String resumo){
        temas[aux] = tema;
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

    public boolean temResumo(String tema){
        boolean verifica = false;
        for(int i=0; i<aux; i++){
            if(temas[i].equals(tema)){
                verifica = true;
            }
        }
        return verifica;
    }

}