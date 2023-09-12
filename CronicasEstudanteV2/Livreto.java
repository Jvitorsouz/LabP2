public class Livreto{

    private Cronicas[] cronicas;
    private int indiceLivreto;

    public Livreto(){
        cronicas = new Cronicas[5];
    }

    public void adicionaCronicaLivreto(Cronicas cronica){
        cronicas[indiceLivreto++] = cronica;
    }

    public String toString(){
        String formatacao = "";
        for(int i=0; i<indiceLivreto; i++){
            formatacao += cronicas[i].toString() + System.lineSeparator(); 
        }
        return formatacao;
    }

    public boolean contemCronica(String titulo){
        //objeto criado para verificação
        Cronicas cronica = new Cronicas(titulo, titulo, titulo, titulo);
        for(int i = 0; i<indiceLivreto; i++){
            if(cronicas[i].equals(cronica)){
                return true;
            }
        }
        return false;
    }
}
