import java.util.Arrays;
import java.util.ArrayList;

public class CronicasDoEstudanteSistema{

    private Cronicas[] cronicas;
    private int[] qtdLeitura;
    private int totalCronicas;
    private Livreto[] livretos;
    private int totalLivretos;

    public CronicasDoEstudanteSistema(){
        cronicas = new Cronicas[1000];
        livretos = new Livreto[100];
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
            String texto = "Cronica #" + (i+1) + "\n" + cronicas[i].toString();
            cronicasAUX += "\n" + texto + "\n";
        }
        return cronicasAUX;
    }

    public String lerCronica(int pos){
        return cronicas[pos].getTexto() + "\n";
    }

    public String exibirCronicaMaisLida(){
        int maior = 0;
        int pos = 0;
        for(int i=0; i<totalCronicas; i++){
            if(cronicas[i].getQtdeLeitura() > maior){
                pos = i;
            }
        }

        return cronicas[pos].getTitulo() + " - lida " + cronicas[pos].getQtdeLeitura() + " vezes\n";
    }

    public void criarLivreto(int[] posCronicas){
        Livreto livreto = new Livreto();
        livretos[totalLivretos] = livreto;
        totalLivretos++;
        for(int i = 0; i<posCronicas.length; i++){
            livreto.adicionaCronica(cronicas[posCronicas[i]]);
        }
    }

    public String lerLivreto(int pos){
        return livretos[pos].toString();
    }

    public boolean contemCronicaNoLivreto(String texto, int pos){
        return livretos[pos].contemCronicaNoLivreto(texto);
    }

}