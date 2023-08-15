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
        this.horas = horas;
    }

    public void cadastraNota(int nota, double valorNota){
        notas[nota-1] = valorNota;
    }

    public boolean aprovado(){
        double mediaAux = 0;
        for(int i=0; i<4; i++){
            mediaAux += notas[i];
        }
        media = mediaAux / 4;
        return media >= 7;
    }

    public String toString(){
        return nomeString + " " + horas + " " + media + " " + Arrays.toString(notas);
    }
}