public class TemaTCC{

    private String titulo;
    private String descricao;
    private String emailOrientador;
    private int popularidade;
    private String[] comentarios = new String[5];
    private int contador;

    public TemaTCC(String titulo, String descricao, String emailOrientador){
        this.titulo = titulo;
        this.descricao = descricao;
        this.emailOrientador =  emailOrientador;
    }

    public TemaTCC(String titulo, String emailOrientador){
        this.titulo = titulo;
        this.emailOrientador = emailOrientador;
        this.descricao = " ";
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public void adicionaPopularidade(){
        this.popularidade++;
    }

    public int getPopularidade(){
        return this.popularidade;
    }

    public void adicionaComentario(String msg){
        if(contador == 5){
            contador = 0;
        }
        comentarios[contador] = msg;
    }

    public String[] getcomentarios(){
        return comentarios;
    }

    public String toString(){
        return "";
    }
}