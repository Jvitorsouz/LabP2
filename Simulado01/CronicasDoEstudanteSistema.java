import java.util.Arrays;

public class CronicasDoEstudanteSistema{

    private String[] cronicas;
    //private String[] titulos = new String[1000];
    private String titulo;
    private String texto;
    private String autor;
    private String data;
    private int aux;
    


    public CronicasDoEstudanteSistema(){
        cronicas = new String[1000];
        this.autor = "Anonimo";
        /*this.titulo = titulo;
        this.texto = texto;
        this.autor = autor;
        this.data = data; */
    }

    public void cadastrarCronica(String titulo, String texto, String data){
        String cronica = " ";
        cronica += "\nCronica #" + aux+1 + " \n" + titulo + "\nData: " + data + "\nAutor: " + autor + "\n" + texto + "\n";
        aux--;
        cronicas[aux] = cronica;
        aux++;  
    }

    public void cadastrarCronica(String titulo, String texto, String data, String autor){
        String cronica = "";
        cronica += "\nCronica #" + aux+1 + " \n" + titulo + "\nData: " + data + "\nAutor: " + autor + "\n" + texto + "\n";
        aux--;
        cronicas[aux] = cronica;
        aux++;  
    }

    private String[] listar(){
        String[] lista02 = new String[aux];
        for(int i=0; i<aux; i++){
            lista02[i] = cronicas[i];
        }
        return lista02;

    }
    public String listarCronicas(){
        return Arrays.toString(listar());
    }
}