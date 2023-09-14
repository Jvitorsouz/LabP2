import java.util.Scanner;

public class MainAgenda{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SistemaAgenda sistema = new SistemaAgenda();

        final String CADASTRAR = "C";
        final String LISTAR = "L";
        final String EXIBIR = "E";
        final String SAIR = "S";

        String op = "";
        int posicao = 0;
        String nome = "";
        String sobrenome = "";
        String telefone = "";

        do{
            try{
                op = leString(sistema.exibiMenu(), sc);
                sistema.exibiMenuExcecao(op);
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
            switch (op){
                case CADASTRAR:
                    System.out.print("Posição> ");
                    posicao = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nome> ");
                    nome = sc.nextLine();
                    System.out.print("Sobrenome> ");
                    sobrenome = sc.nextLine();
                    System.out.print("Telefone> ");
                    telefone = sc.nextLine();
                    System.out.println(sistema.cadastraContato(posicao, nome, sobrenome, telefone));
                    break;

                case EXIBIR:
                    System.out.print("Contato> ");
                    posicao = sc.nextInt();
                    System.out.println(sistema.exibirContato(posicao));
                    break;

                case LISTAR:
                    System.out.println(sistema.listarContatos());
                    break;
            }

        }while(!op.equals(SAIR));
    }

    private static String leString(String msg, Scanner input){
		System.out.println(msg);
        System.out.print("Opção> ");
		String op = input.next();
		System.out.println("\n");
		return op;
    }
}