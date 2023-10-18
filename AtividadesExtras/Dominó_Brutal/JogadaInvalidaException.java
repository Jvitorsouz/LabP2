/*Essa classe cria sua propria exceção a 
 * partir do herdamento da classe Exception
 */

public class JogadaInvalidaException extends Exception{

    private static final long serialVersionUID = -8117211629771860201l;

    public JogadaInvalidaException(String message){
        super(message);
    }

}