import java.util.Scanner;

public class Main{

    public static void main(String[] args){
       
        Scanner sc = new Scanner(System.in);

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

        do{
            op = leString(MENU, sc);
            switch (op){
                case CADASTRAR: break;
            }
        }while(!op.equals(SAIR));
        sc.close();


    }


	private static String leString(String msg, Scanner input){
		System.out.println(msg);
        System.out.print("Ação: ");
		String op = input.nextLine();
		input.nextLine();
		return op;
	}
}