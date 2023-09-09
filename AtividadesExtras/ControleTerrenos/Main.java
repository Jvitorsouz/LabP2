import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        ControleTerreno ct = new ControleTerreno();

        Scanner sc = new Scanner(System.in);
        String entrada = "";
       
        do{
            entrada = sc.nextLine();
            String[] comando = entrada.split(" ");

            if(comando[0].equals("CRIAR")){
                int linha = Integer.parseInt(comando[1]);
                int coluna = Integer.parseInt(comando[2]);
                String nome = comando[3];
                int valor = Integer.parseInt(comando[4]);

                //Verifica se a entrada é vazia ou valor é negativo
                if(nome.isBlank()){
                    System.out.println("NOME VAZIO! INVALIDO");
                } if(valor < 0){
                    System.out.println("VALOR NEGATIVO! INVALIDO");
                } else{
                    ct.cadastraTerreno(linha, coluna, nome, valor);
                }
            } else if(comando[0].equals("EXIBIR")){
                int linha = Integer.parseInt(comando[1]);
                int coluna = Integer.parseInt(comando[2]);
                System.out.println(ct.exibiTerreno(linha, coluna));
            }else if(comando[0].equals("VIZINHOS")){
                int linha = Integer.parseInt(comando[1]);
                int coluna = Integer.parseInt(comando[2]);
                System.out.println(ct.exibiVizinhos(linha, coluna));
            }


        } while(!entrada.equals("SAIR"));

    
    }
}