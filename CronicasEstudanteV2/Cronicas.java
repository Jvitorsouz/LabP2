public class Cronicas{
    private String titulo;
    private String texto;
    private String autor;
    private String data;
    private int qtdeLeitura;

    public Cronicas(String titulo, String texto, String data){
        this(titulo, texto, "Anonimo", data);
    }
    public Cronicas(String titulo, String texto, String autor, String data){
        this.titulo = titulo;
        this.texto = texto;
        this.autor = autor;
        this.data = data;
    }

    public String toString(){
        this.qtdeLeitura++;
        return "\n" + this.titulo + "\nData: " + this.data + "\nAutor: " + this.autor + "\n" + this.texto;
    }

    public int getQtdeLeitura(){
        return this.qtdeLeitura;
    }

    public String getTitulo(){
        return this.titulo;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cronicas other = (Cronicas) obj;
        if (titulo == null) {
            if (other.titulo != null)
                return false;
        } else if (!titulo.equals(other.titulo))
            return false;
        return true;
    }

       


    

}