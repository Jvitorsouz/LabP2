

public class Descanso{

    private int horasDescanso;
    private int numerosSemanas;

    public Descanso(){
        this.horasDescanso = 0;
        this.numerosSemanas = 0;
    }

    public String getStatusGeral(){
        String status = "Cansado";
        if(horasDescanso>26){
            status = "Descansado";
        }
        return status;
    }

    public void defineHorasDescanso(int horasDescanso){
        this.horasDescanso = horasDescanso;
    }

    public void defineNumeroSemanas(int numerosSemanas){
        this.numerosSemanas = numerosSemanas;
    }

}