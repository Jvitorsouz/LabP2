import java.util.Arrays;

public class CronicasDoEstudanteSistema{

    private Cronicas[] cronicas;
    private int id;

    public CronicasDoEstudanteSistema(){
        cronicas = new Cronicas[1000];
    }

    public void cadastrarCronica(String titulo, String texto, String data){
        if(id <= 1000){
            cronicas[id] = new Cronicas(titulo, texto, data);
            id++;
        }else{
            id = 0;
        }
    }

    public void cadastrarCronica(String titulo, String texto, String data, String autor){
        if(id <= 1000){
            cronicas[id] = new Cronicas(titulo, texto, data, autor);
            id++;
        }else{
            id = 0;
        }
    }

    public String listarCronicas(){
        return "";
    }

    public Cronicas lerCronica(int i){
        return cronicas[i];
    }
}