import java.util.HashMap;

public class Slaque{

    private HashMap<String, Usuario> usuarios;
    private HashMap<String, Canal> canais;

    public Slaque(){
        this.usuarios = new HashMap<>();
        this.canais = new HashMap<>();
    }

    public void cadastraUsuario(String nome, String email){
        this.usuarios.put(email, new Usuario(nome, email));
    }

    public void criaCanal(String nome){
        this.canais.put(nome, new Canal(nome));
    }
}