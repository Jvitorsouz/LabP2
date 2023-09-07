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

    public String toString(){
        return this.titulo +
        "\nData: " + this.data + "\nAutor: " + this.autor +
        "\n" + this.texto;
    }

    public String getTexto(){
        qtdLeitura++;
        return texto;
    }

    public int getQtdeLeitura(){
        return qtdLeitura;
    }

    public String getTitulo(){
        qtdLeitura++;
        return titulo;
    }
}