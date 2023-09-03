import java.util.Arrays;
import java.util.ArrayList;

public class CronicasDoEstudanteSistema{

    private Cronicas[] cronicas;
    private int totalCronicas;

    public CronicasDoEstudanteSistema(){
        cronicas = new Cronicas[1000];
    }

    public void cadastrarCronica(String titulo, String texto,  String data, String autor){
        Cronicas cronica = new Cronicas(titulo, texto, data, autor);
        cronicas[totalCronicas] = cronica;
        totalCronicas++;
    }

    public void cadastrarCronica(String titulo, String texto,  String data){
        Cronicas cronica = new Cronicas(titulo, texto, data);
        cronicas[totalCronicas] = cronica;
        totalCronicas++;
    }

    public String listarCronicas(){
        String cronicasAUX = " ";
        for(int i=0; i<totalCronicas;  i++){
            String texto = "Cronica #" + (i+1) + "\n" + cronicas[i].getTitulo() +
            "\nData: " + cronicas[i].getData() + "\nAutor: " + cronicas[i].getAutor() +
            "\n" + cronicas[i].getTexto();
            cronicasAUX += "\n" + texto + "\n";
        }
        return cronicasAUX;
    }

    public String lerCronica(int pos){
        return cronicas[pos].getTexto(pos);
    }






}