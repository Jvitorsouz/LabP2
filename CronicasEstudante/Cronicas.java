public class Cronicas{
    
    private String titulo;
    private String texto;
    private String autor;
    private String data;
    private int qtdLeitura;

    public Cronicas(String titulo, String texto, String data){
        this(titulo, texto, data, "Anonimo");
    }

    public Cronicas(String titulo, String texto, String data, String autor){
        this.titulo = titulo;
        this.texto = texto;
        this.data = data;
        this.autor = autor;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public String getTexto(){
        return this.texto;
    }

    public String getTexto(int i){
        qtdLeitura++;
        return this.texto;
    }

    public String getAutor(){
        return this.autor;
    }

    public String getData(){
        return this.data;
    }

    public void setLeitura(){
        this.qtdLeitura++;
    }



}