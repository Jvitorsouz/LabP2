

public class Descanso{

    private int valor;

    public Descanso(){
        this.valor = 0;
    }

    public String getStatusGeral(){
        String status = " ";
        if(valor>26){
            status = "Descansado";
        }else{
            status = "Cansado";
        }
        return status;
    }


}