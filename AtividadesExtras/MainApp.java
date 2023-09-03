import java.util.Scanner;

public class MainApp{

    /*
     * Programa de registro de interações de alunos (200).
     * 
     * Adicionar aluno com seu nome e sobrenome em uma posicao livre.
     * A Nome Sobrenome
     * 
     * Cadastrar exercicio para o aluno a partir da posição
     * C pos
     * 
     * Listar os alunos
     * L
     * 
     * Para sair.. basta digitar linha vazia
     */

     public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();

        int totalAlunos = 0;

        AlunoApp[] alunos = new AlunoApp[200];
        
        //Enquanto a entrada não for vazia
        while(!entrada.isBlank()){
            String[] comando = entrada.split(" ");

            if(comando[0].equals("A")){
                AlunoApp aluno = new AlunoApp(comando[1], comando[2], 0);
                alunos[totalAlunos] = aluno;
                totalAlunos++;

            }else if(comando[0].equals("C")){
                alunos[Integer.parseInt(comando[1])].adicionaExercicio();;
            }else if(comando[0].equals("L")){
                for(int i=0; i<totalAlunos; i++){
                    System.out.println(alunos[i].toString());
                }

            }
            entrada = sc.nextLine();
        }
        System.out.println("SAIU");

     }
}