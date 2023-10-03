import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Slaque slaque = new Slaque();

        while(!"ENCERRAR".equals(input)){
            String[] comandosSplit = input.split(" ");
            String comando = comandosSplit[0];
            if("USUARIO".equals(comando)){
                String nome = comandosSplit[1];
                String email = comandosSplit[2];
                slaque.cadastraUsuario(nome, email);

            } else if("CANAL".equals(comando)){
                String canal = comandosSplit[1];
                slaque.criaCanal(canal);
                
            } else if("ENTRAR".equals(comando)){
                String canal = comandosSplit[1];
                String email = comandosSplit[2];
            } else if("MENSAGEM".equals(comando)){
                String canal = comandosSplit[1];
                String email = comandosSplit[2];
                String msg = comandosSplit[3];   
            } else if("SAIR".equals(comando)){
                String canal = comandosSplit[1];
                String email = comandosSplit[2];
            }else if("IMPRIME".equals(comando)){
                String canal = comandosSplit[1];
            }
            input = sc.nextLine();
        }
    }
}