
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MainAgenda{

    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        SistemaAgenda sistema = new SistemaAgenda();

        try{
            carregaAgenda("agenda_inicial.cvs", sistema);
        } catch(FileNotFoundException e){
            System.err.println("Arquivo não encontrado: " + e.getMessage());
        } catch(IOException e){
            System.err.println("Erro lendo arquivo: " + e.getMessage());
        }


        String op = "";

        while (true){
            op = menu(sc);
            comando(op, sistema, sc);
        }

    }

    private static String menu(Scanner scanner){
        System.out.println("\n(C)adastrar Contato\n"+
                            "(L)istar Contatos\n"+
                            "(E)xibir Contato\n"+
                            "(F)avoritos\n"+
                            "(A)dicionar Favorito\n"+
                            "(R)emover Favorito\n"+
                            "(S)air");
        System.out.print("Opção> ");                    
        return scanner.next().toUpperCase();
    }

    private static void comando(String op, SistemaAgenda sistema, Scanner scanner){

        switch (op){
            case "C":
                cadastraContato(sistema, scanner);
                break;
            case "L":
                listarContatos(sistema);
                break;
            case "E":
                exibirContato(sistema, scanner);
                break;
            case "F":
                exibirFavoritos(sistema);
                break;
            case "A":
                adicionarFavorito(sistema, scanner);
                break;
            case "R":
                removerFavorito(sistema, scanner);
                break;
            case "S":
                System.exit(0);
                break;
            default:
                System.out.println("OPÇÃO INVALIDA!");
        }
    }

    private static void cadastraContato(SistemaAgenda sistema, Scanner sc){
        System.out.print("\nPosição> ");
        int posicao = sc.nextInt();
        sc.nextLine();
        System.out.print("Nome> ");
        String nome = sc.nextLine();
        System.out.print("Sobrenome> ");
        String sobrenome = sc.nextLine();
        System.out.print("Telefone> ");
        String telefone = sc.nextLine();
        System.out.println(sistema.cadastraContato(posicao, nome, sobrenome, telefone));
    }

    private static void listarContatos(SistemaAgenda sistema){
        System.out.println(sistema.listarContatos());
        
    }

    private static void exibirContato(SistemaAgenda sistema, Scanner sc){
        System.out.print("Contato> ");
        int posicao = sc.nextInt();
        System.out.println(sistema.exibirContato(posicao));
    }

    private static void exibirFavoritos(SistemaAgenda sistema){
        System.out.println(sistema.listarFavoritos());
    }

    private static void adicionarFavorito(SistemaAgenda sistema, Scanner sc){
        System.out.print("Contato> ");
        int posicaoContato = sc.nextInt();
        System.out.print("Posição> ");
        int posicaoFavorito = sc.nextInt();
        System.out.println(sistema.adicionaFavorito(posicaoContato, posicaoFavorito));
    }

    private static void removerFavorito(SistemaAgenda sistema, Scanner sc){
        System.out.print("Posição> ");
        int posicaoFavorito1 = sc.nextInt();
        sistema.removerFavorito(posicaoFavorito1);
    }

    private static void carregaAgenda(String arquivoContatos, SistemaAgenda sistema) throws FileNotFoundException, IOException{
        LeitorDeAgenda leitor = new LeitorDeAgenda();

        int carregados = leitor.carregaContatos(arquivoContatos, sistema);

        System.out.println("Carregamos " + carregados + " registros.");
        
    }
}