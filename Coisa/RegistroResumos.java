public class RegistroResumos{

    private int numeroDeResumos;
    private String[] resumos;
    private String[] temas;
    private int aux = 0;

    public RegistroResumos(int numeroDeResumos){
        this.numeroDeResumos = numeroDeResumos;
        resumos = new String[numeroDeResumos];
        temas = new String[numeroDeResumos];
    }


    public void adiciona(String tema, String resumo){
        if(aux>100){
            aux = 0;
        }
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
        String texto = "- " + aux + " resumo(s) cadastrado(s)";
        texto += "\n- ";
        for(int i =0; i<aux; i++){
            texto += temas[i] + " | ";
        }
        return texto;
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