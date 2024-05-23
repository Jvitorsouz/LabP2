package mrbet;

import java.util.Scanner;

public class MainMr_Bet{

    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        String escolha = "";
        MrBetSistema sistema = new MrBetSistema();

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

    private static void comando(String op, MrBetSistema sistema, Scanner scanner){
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
                exbirirTimeCampeonatos(sistema, scanner);
                break;
            case "T":
                tentarSorteEStatus(sistema, scanner);
                break;
            case "!":
                System.out.println("Por hoje é só pessoal!");
                System.exit(0);
                break;
            default:
                System.out.println("OPÇÃO INVALIDA!");
        }       
    }

    private static void addTime(MrBetSistema sistema, Scanner sc){
        sc.nextLine();
        System.out.print("\nCódigo: ");
		String codigo = sc.nextLine();
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Mascote: ");
		String mascote = sc.nextLine();
		System.out.println(sistema.incluirTime(codigo, nome, mascote));       
    }

    private static void recuperaTime(MrBetSistema sistema, Scanner sc){
        sc.nextLine();
        System.out.print("\nCódigo: ");
		String codigo = sc.nextLine();
        System.out.println(sistema.recuperaTime(codigo));          
    }

    private static void adicionaCampeonato(MrBetSistema sistema, Scanner sc){
        sc.nextLine();
        System.out.print("\nCampeonato: ");
		String campeonato = sc.nextLine();
        System.out.print("Participantes: ");
		int participantes = sc.nextInt();
        System.out.println(sistema.adicionaCampeonato(campeonato, participantes));
    }

    private static void addTimeCampeonato(MrBetSistema sistema, Scanner sc){
        sc.nextLine();
        System.out.print("(I) Incluir time em campeonato ou (V) Verificar se time está em campeonato? ");
        String op = sc.nextLine();
        switch (op.toUpperCase()){
            case "I":
                try {
                    System.out.print("Código: ");
                    String codigo = sc.nextLine();
                    System.out.print("Campeonato: ");
                    String campeonato = sc.nextLine();
                    System.out.println(sistema.addTimeCampeonato(codigo, campeonato));
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
                    System.out.println(sistema.verificaTimeCampeonato(codigo, campeonato));
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
        }
    }

    private static void exbirirTimeCampeonatos(MrBetSistema sistema, Scanner sc){
        sc.nextLine();
        try {
        	System.out.print("\nCódigo: ");
        	String codigo = sc.nextLine();
        	System.out.println(sistema.exibirTimeCampeonatos(codigo));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void tentarSorteEStatus(MrBetSistema sistema, Scanner sc){
        sc.nextLine();
        System.out.print("(A)Apostar ou (S)Status das Apostas? ");
        String op = sc.nextLine();

        switch (op.toUpperCase()){
            case "A":
            	try {
	                System.out.print("\nCódigo: ");
	                String codigo = sc.nextLine();
	                System.out.print("Campeonato: ");
	                String campeonato = sc.nextLine();
	                System.out.print("Colocação: ");
	                int colocacao = sc.nextInt();
	                System.out.print("Valor da Aposta: ");
	                double valor = sc.nextDouble();
	                System.out.println(sistema.apostar(codigo, campeonato, colocacao, valor));
            	 } catch (Exception e) {
                     System.out.println(e.getMessage());
                 }
             break;
            case "S":
                System.out.println(sistema.statusAposta());
                break;
        }

    }
}