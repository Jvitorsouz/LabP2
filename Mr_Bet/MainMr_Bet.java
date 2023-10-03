import java.util.Scanner;

public class MainMr_Bet{

    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        String escolha = "";
        Mr_Bet sistema = new Mr_Bet();

        do{
            escolha = menu(sc);
            comando(escolha, sistema, sc);

        }while(!escolha.equals("!"));


    }

    private static String menu(Scanner scanner) {
		System.out.println(
						"\n---\nMENU\n"+
										"(M)Minha inclusão de times\n"+
										"(R)Recuperar Time\n"+
										"(.)Adicionar campeonato\n"+
										"(B)Bora incluir time em campeonato e Verificar se time está em campeonato\n"+
										"(E)Exibir campeonatos que o time participa\n"+
										"(T)Tentar a sorte e status\n"+
										"(!)Já pode fechar o programa!\n"+
										"\nOpção> ");
		
		return scanner.next().toUpperCase();
	}

    private static void comando(String op, Mr_Bet sistema, Scanner scanner){
        switch (op){
            case "M":
                addTime(sistema, scanner);
                break;
            case "R":
                recuperaTime(sistema, scanner);
                break;
            case ".":
                adicionaCampeonato(sistema, scanner);
                break;
            case "B":
                addTimeCampeonato(sistema, scanner);
                break;
            case "E":
                break;
            case "T":
                break;
            case "!":
                System.exit(0);
                break;
            default:
                System.out.println("OPÇÃO INVALIDA!");
        }       
    }

    private static void addTime(Mr_Bet sistema, Scanner sc){
        sc.nextLine();
        System.out.print("\nCódigo: ");
		String codigo = sc.nextLine();
		System.out.print("Nome> ");
		String nome = sc.nextLine();
		System.out.print("Mascote> ");
		String mascote = sc.nextLine();
		System.out.println(sistema.incluirTime(codigo, nome, mascote));       
    }

    private static void recuperaTime(Mr_Bet sistema, Scanner sc){
        sc.nextLine();
        System.out.print("\nCódigo: ");
		String codigo = sc.nextLine();
        System.out.println(sistema.recuperaTime(codigo));          
    }

    private static void adicionaCampeonato(Mr_Bet sistema, Scanner sc){
        sc.nextLine();
        System.out.print("\nCampeonato: ");
		String campeonato = sc.nextLine();
        System.out.print("Participantes: ");
		int participantes = sc.nextInt();
        System.out.println(sistema.adicionaCampeonato(campeonato, participantes));
    }

    private static void addTimeCampeonato(Mr_Bet sistema, Scanner sc){
        sc.nextLine();
        System.out.print("(I) Incluir time em campeonato ou (V) Verificar se time está em campeonato? ");
        String op = sc.nextLine();
        switch (op.toUpperCase()){
            case "I":
                try {
                    System.out.print("\nCódigo: ");
                    String codigo = sc.nextLine();
                    System.out.print("\nCampeonato: ");
                    String campeonato = sc.nextLine();
                    System.out.println(sistema.addTimeCampeonato(campeonato, codigo));
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            case "V":
                try {
                    System.out.print("\nCódigo: ");
                    String codigo = sc.nextLine();
                    System.out.print("Campeonato: ");
                    String campeonato = sc.nextLine();
                    System.out.println(sistema.verificaTimeCampeonato(campeonato, codigo));
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
        }
    }
}