import java.util.Scanner;

public class Main{

    public static void main(String[] args){
       
        BEP sistema = new BEP();
        Compra compras = new Compra();
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        final String MENU = "A - Cadastrar Bordado;\n"+
							"B - Atualizar Bordado;\n"+
							"C- Imprimir Bordado;\n"+
							"D - Listar Bordados;\n"+
							"E - Alterar Tamanho do Bordado\n"+
                            "F - Cadastrar Compra\n"+
                            "G - Imprimir Compra\n"+
                            "H - Avaliar Bordado\n"+
                            "I - Nota Geral Bordado\n"+
                            "J - Listar Avaliações\n"+
                            "L - Sair";

        final String CADASTRAR = "A";
        final String ATUALIZAR = "B";
        final String IMPRIMIR = "C";
        final String LISTAR = "D";
        final String ALTERAR = "E";
        final String CADASTRARCOMPRA = "F"; 
        final String IMPRIMIRCOMPRA = "G";
        final String AVALIAR = "H";
        final String NOTAGERAL = "I";
        final String LISTARAVALIACOES = "J";
        final String SAIR = "L";

        String op = "";
        int id;
        int linhas;
        int colunas;
        String tipoPonto;
        String idCompra;

        do{
            System.out.println("\nVoce pode cadastrar " + sistema.getQTD()+ " bordados. O que deseja fazer?\n");
            op = leString(MENU, sc);

            switch (op){
                case CADASTRAR: 
                    System.out.print("Numero do bordado? [0-9]: ");
                    id = sc.nextInt();
                    System.out.print("Numero de linhas? [2-100]: ");
                    linhas = sc.nextInt();
                    System.out.print("Numero de colunas [2-100]: ");
                    colunas = sc.nextInt();
                    sistema.cadastrarBordado(id, linhas, colunas);
                    break;

                case ATUALIZAR:
                    System.out.print("Numero do bordado? [0-9]: ");
                    id = sc.nextInt();
                    System.out.print("No a ser colocado no bordado? [/ \\ | - x, vazio para remover] ");
                    tipoPonto = sc.next();
                    System.out.print("Numero de linhas? [2-100]: ");
                    linhas = sc.nextInt();
                    System.out.print("Numero de colunas [2-100]: ");
                    colunas = sc.nextInt();
                    sistema.atualizaBordado(id, tipoPonto, linhas, colunas);
                    break;

                case IMPRIMIR:
                    System.out.print("Bordado a ser impresso?: ");
                    id = sc.nextInt();
                    System.out.println(sistema.imprimeBordado(id));
                    break;

                case LISTAR:
                    System.out.println(sistema.listarBordados());
                    break;

                case ALTERAR:
                    System.out.print("Numero do bordado? [0-9]: ");
                    id = sc.nextInt();
                    System.out.print("Numero de linhas? [2-100]: ");
                    linhas = sc.nextInt();
                    System.out.print("Numero de colunas [2-100]: ");
                    colunas = sc.nextInt();
                    sistema.alteraTamnahoBordado(id, linhas, colunas);
                    break;

                 case AVALIAR:
                    System.out.print("Numero do bordado a ser avaliado? [0-9] ");
                    id = sc.nextInt();
                    System.out.print("Nota? [1-5]: ");
                    Double nota = sc.nextDouble();
                    System.out.print("Comentario: ");
                    String comentario = sc1.nextLine();
                    sistema.avaliarBordado(id, nota, comentario);
                    break;

                case NOTAGERAL:
                    System.out.print("Numero do bordado para listar a nota geral? [0-9] ");
                    id = sc.nextInt();
                    System.out.println("Nota Geral: " + sistema.getAvaliacao(id));
                    break;

                case LISTARAVALIACOES:
                    System.out.print("Numero do bordado para listar a nota geral? [0-9] ");
                    id = sc.nextInt();
                    System.out.println(sistema.getAvaliacoes(id));
                    break;
                
            }
        }while(!op.equals(SAIR));
        sc.close();


    }


	private static String leString(String msg, Scanner input){
		System.out.println(msg);
        System.out.print("Ação: ");
		String op = input.next();
		System.out.println("\n");
		return op;
	}

}

