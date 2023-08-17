import java.util.Arrays;

public class Disciplina{
    
    private String nomeString;
    private int horas;
    private double media;
    private double[] notas = {0.0, 0.0, 0.0, 0.0};

    public Disciplina(String nomeString){
        this.nomeString = nomeString;
    }

    public void cadastraHoras(int horas){
        this.horas += horas;
    }

    public void cadastraNota(int nota, double valorNota){
        notas[nota-1] = valorNota;
    }
    
    //Metodo para calcular a media
    private double calculaMedia(){
        double somaNotas = 0;
        for(int i=0; i<notas.length; i++){
            somaNotas += notas[i];
        }
        media = somaNotas/4;
        return media;
    }

    public boolean aprovado(){
        return calculaMedia() >= 7;
    }
    
    /* 
    public boolean aprovado(){
        double somaNotas = 0;
        for(int i=0; i<notas.length; i++){
            somaNotas += notas[i];
        }
        media = somaNotas/4;
        return media >= 7;
    } */

    public String toString(){
        return nomeString + " " + horas + " " + calculaMedia() + " " + Arrays.toString(notas);
    }
}