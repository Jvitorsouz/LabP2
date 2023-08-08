/**
* Representação de um estudante, especificamente de computação, 
matriculado da * UFCG.
* 
* @author Vitor Souza
*/

public class Aluno{

    
    private String nome;
    private int anoNascimento;
    private double cra;

    //Construtor
    public Aluno(String nome, int anoNascimento){
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.cra = 0.0;
    }

    public void setcra(double cra){
        this.cra = cra;
    }

    public int getIdade(int anoNascimento){
        return 2023 - anoNascimento;
    }

    //To String
    public String toString(){
        return "Aluno = " + this.nome + "\nIdade = " + getIdade(anoNascimento);
    }
}