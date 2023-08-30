public class Cronicas{
    
    private String titulo;
    private String texto;
    private String autor;
    private String data;

    public Cronicas(String titulo, String texto, String data){
        this.titulo = titulo;
        this.texto = texto;
        this.data = data;
        this.autor = "Anonimo";
    }

    public Cronicas(String titulo, String texto, String data, String autor){
        this.titulo = titulo;
        this.texto = texto;
        this.data = data;
        this.autor = autor;
    }

}