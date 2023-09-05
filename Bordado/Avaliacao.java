public class Avaliacao{
     private double nota;
     private String comentario;

     public Avaliacao(double nota, String comentario){
        this.nota = nota;
        this.comentario = comentario;
     }

     public double getNota(){
        return nota;
     }

    public String toString(){
        return "\nNota: " + this.nota + "\nComentario: " + this.comentario;
    }

}