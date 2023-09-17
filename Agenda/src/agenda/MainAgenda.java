package agenda;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class MainAgenda {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();

		System.out.println("Carregando agenda inicial");
		try {
			/*
			 * Essa é a maneira de lidar com possíveis erros por falta do arquivo. 
			 */
			carregaAgenda("agenda_inicial.csv", agenda);
		} catch (FileNotFoundException e) {
			System.err.println("Arquivo não encontrado: " + e.getMessage());
		} catch (IOException e) {
			System.err.println("Erro lendo arquivo: " + e.getMessage());
		}

		Scanner scanner = new Scanner(System.in);
		String escolha = "";
		while (true) {
			escolha = menu(scanner);
			comando(escolha, agenda, scanner);
		}

	}

	private static String menu(Scanner scanner) {
		System.out.println(
				"\n---\nMENU\n" + 
						"(C)adastrar Contato\n" + 
						"(L)istar Contatos\n" + 
						"(E)xibir Contato\n" + 
						"(F)avoritos\n"+
						"(A)dicionar Favorito\n"+
						"(R)emover Favorito\n"+
						"(S)air\n" + 
						"\n" + 
						"Opção> ");
		return scanner.next().toUpperCase();
	}

	private static void comando(String opcao, Agenda agenda, Scanner scanner) {
		switch (opcao) {
			case "C":
			cadastraContato(agenda, scanner);
			break;
		case "L":
			listarContatos(agenda);
			break;
		case "E":
			exibirContato(agenda, scanner);
			break;
		case "F":
			exibirFavoritos(agenda);
			break;
		case "A":
			adicionarFavorito(agenda, scanner);
			break;
		case "R":
			removerFavorito(agenda, scanner);
			break;
		case "S":
			System.exit(0);
			break;
		default:
			System.out.println("OPÇÃO INVALIDA!");
		}
	}

	private static void cadastraContato(Agenda agenda, Scanner sc){
        System.out.print("\nPosição> ");
        int posicao = sc.nextInt();
        sc.nextLine();
        System.out.print("Nome> ");
        String nome = sc.nextLine();
        System.out.print("Sobrenome> ");
        String sobrenome = sc.nextLine();
        System.out.print("Telefone> ");
        String telefone = sc.nextLine();
        System.out.println(agenda.cadastraContato(posicao, nome, sobrenome, telefone));
    }

	private static void listarContatos(Agenda agenda){
        System.out.println(agenda.listarContatos());
        
    }

    private static void exibirContato(Agenda agenda, Scanner sc){
        System.out.print("Contato> ");
        int posicao = sc.nextInt();
        System.out.println(agenda.exibirContato(posicao));
    }

	private static void exibirFavoritos(Agenda agenda){
        System.out.println(agenda.listarFavoritos());
    }

	private static void adicionarFavorito(Agenda agenda, Scanner sc){
        System.out.print("Contato> ");
        int posicaoContato = sc.nextInt();
        System.out.print("Posição> ");
        int posicaoFavorito = sc.nextInt();
        System.out.println(agenda.adicionaFavorito(posicaoContato, posicaoFavorito));
    }

    private static void removerFavorito(Agenda agenda, Scanner sc){
        System.out.print("Posição> ");
        int posicaoFavorito1 = sc.nextInt();
        agenda.removerFavorito(posicaoFavorito1);
	}
	
	/**
	 * Lê uma agenda de um arquivo csv. 
	 * 
	 * @param arquivoContatos O caminho para o arquivo.
	 * @param agenda A agenda que deve ser populada com os dados. 
	 * @throws IOException Caso o arquivo não exista ou não possa ser lido.
	 */
	private static void carregaAgenda(String arquivoContatos, Agenda agenda) throws FileNotFoundException, IOException {
		LeitorDeAgenda leitor = new LeitorDeAgenda();
		
		int carregados =  leitor.carregaContatos(arquivoContatos, agenda);
		System.out.println("Carregamos " + carregados + " registros.");
	}
}
